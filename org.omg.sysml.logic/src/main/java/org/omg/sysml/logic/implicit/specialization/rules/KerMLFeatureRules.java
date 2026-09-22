/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License, version 2, as published by
 * the Eclipse Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 */
package org.omg.sysml.logic.implicit.specialization.rules;

import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.defaultKey;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.self;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.hasClassType;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.hasDataType;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.hasStructureType;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isSubobject;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isSuboccurrence;

import java.util.Collections;
import java.util.List;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConstructorExpression;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.FlowEnd;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;
import org.omg.sysml.logic.implicit.specialization.api.ImplicitSpecialization;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.TypeUtil;

/**
 * Rules of the constraints of KerML &sect;8.3.3.3.4, Feature.
 * <p>
 * Specification quotations are from KerML 1.1 Beta 2.
 */
final class KerMLFeatureRules {

	/**
	 * The identifier of the rule matching end features, parameters and constructor result features
	 * by position; the rules redefining other kinds of features exclude it.
	 */
	static final String POSITIONAL_REDEFINITION = "positionalFeatureRedefinition";

	private KerMLFeatureRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				self("checkFeatureFlowFeatureRedefinition", ImplicitSpecializationRuleFamily.CONTEXT, Feature.class,
						KerMLFeatureRules::flowFeatureRedefinition),
				self("connectorEndValuationSpecialization", ImplicitSpecializationRuleFamily.CONTEXT, Feature.class,
						KerMLFeatureRules::connectorEndValuationSpecialization),
				self("flowEndSubsetting", ImplicitSpecializationRuleFamily.PRIORITY_EXCLUSIVE, FlowEnd.class,
						KerMLFeatureRules::flowEndSubsetting),
				self("checkFeatureOwnedCrossFeatureSpecialization", ImplicitSpecializationRuleFamily.PRIORITY,
						Feature.class, KerMLFeatureRules::ownedCrossFeatureSpecialization),
				self(POSITIONAL_REDEFINITION, ImplicitSpecializationRuleFamily.REDEFINITION, Feature.class,
						KerMLFeatureRules::positionalRedefinition),
				defaultKey("checkFeatureSpecialization", Feature.class, KerMLFeatureRules::featureKey),
				self("checkFeatureValuationSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION,
						Feature.class, KerMLFeatureRules::valuationSpecialization),
				self("checkFeatureEndSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, Feature.class,
						KerMLFeatureRules::endSpecialization),
				self("checkFeatureCrossingSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION,
						Feature.class, KerMLFeatureRules::crossingSpecialization));
	}

	/**
	 * Redefines the first feature of a FlowEnd according to its source or target position; this
	 * redefinition fully determines the Feature.
	 * <p>
	 * KerML §8.3.3.3.4, {@code checkFeatureFlowFeatureRedefinition}: "If a Feature is the first
	 * ownedFeature of a first or second FlowEnd, then it must directly or indirectly specialize
	 * either Transfers::Transfer::source::sourceOutput or Transfers::Transfer::target::targetInput,
	 * respectively, from the Kernel Semantic Library."
	 */
	private static Outcome flowFeatureRedefinition(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(feature.getOwningType() instanceof FlowEnd flowEnd)) {
			return Outcome.NOT_APPLICABLE;
		}
		if (flowEnd.getOwnedFeature().stream().findFirst().orElse(null) != feature) {
			return Outcome.NOT_APPLICABLE;
		}
		Element owner = flowEnd.getOwner();
		if (owner instanceof Feature ownerFeature) {
			int endIndex = ownerFeature.getOwnedEndFeature().indexOf(flowEnd);
			if (endIndex == 0 || endIndex == 1) {
				String kind = "targetInput";
				if (endIndex == 0) {
					kind = "sourceOutput";
				}
				result.add(SysMLPackage.Literals.REDEFINITION, SpecializationHelper.library(result, flowEnd,
						ImplicitGeneralizationMap.getDefaultSupertypeFor(flowEnd.getClass(), kind)));
				return Outcome.APPLIED_DETERMINES;
			}
		}
		return Outcome.NOT_APPLICABLE;
	}

	/**
	 * Subsets a connector end by the result of its owned value Expression. The rule also applies to
	 * the ends of a Flow or FlowUsage, which are connector ends.
	 * <p>
	 * KerML §8.4.4.6 names no dedicated constraint; this follows, for an end that owns its
	 * Expression directly, KerML §8.3.3.3.4, {@code checkFeatureValuationSpecialization}: "If
	 * a Feature has a FeatureValue, no ownedSpecializations that are not implied, and is not
	 * directed, then it must specialize the result of the value Expression of the
	 * FeatureValue." TODO: confirm the specification reference.
	 */
	private static Outcome connectorEndValuationSpecialization(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(feature.getOwningType() instanceof Connector connector)) {
			return Outcome.NOT_APPLICABLE;
		}
		if (!connector.getOwnedEndFeature().contains(feature)) {
			return Outcome.NOT_APPLICABLE;
		}
		feature.getOwnedFeature().stream().filter(Expression.class::isInstance).map(Expression.class::cast)
				.map(Expression::getResult).filter(general -> general != null).findFirst()
				.ifPresent(general -> result.add(SysMLPackage.Literals.SUBSETTING, general));
		return Outcome.APPLIED;
	}

	/**
	 * Subsets a FlowEnd by the owner of its first redefined feature, complementing
	 * {@code checkFeatureFlowFeatureRedefinition}. Every FlowEnd is fully determined by its flow
	 * feature: the rule always applies and suppresses the fallbacks.
	 */
	private static Outcome flowEndSubsetting(FlowEnd flowEnd, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (flowEnd.getOwnedSubsetting().isEmpty() && !flowEnd.getOwnedFeature().isEmpty()) {
			FeatureUtil.getRedefinedFeaturesOf(flowEnd.getOwnedFeature().get(0)).stream()
					.findFirst().map(Feature::getOwningType).filter(Feature.class::isInstance)
					.ifPresent(owner -> result.add(SysMLPackage.Literals.SUBSETTING, owner));
		}
		return Outcome.APPLIED_SUPPRESSES_FALLBACKS;
	}

	/**
	 * Types an owned cross feature by the types of its owning end feature, and subsets it by the
	 * cross feature of each end feature redefined by that end feature.
	 * <p>
	 * KerML §8.3.3.3.4, {@code checkFeatureOwnedCrossFeatureSpecialization}: "If this Feature is
	 * the ownedCrossFeature of an end Feature, then it must directly or indirectly specialize the
	 * types of its owning end Feature."
	 * <p>
	 * KerML §8.3.3.3.4, {@code checkFeatureOwnedCrossFeatureRedefinitionSpecialization}: "If this
	 * Feature is the ownedCrossFeature of an end Feature, then, for any end Feature that is
	 * redefined by the owning end Feature of this Feature, this Feature must subset the
	 * crossFeature of the redefined end Feature, if this exists."
	 */
	private static Outcome ownedCrossFeatureSpecialization(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!FeatureUtil.isOwnedCrossFeature(feature) || !(feature.getOwningNamespace() instanceof Feature owner)) {
			return Outcome.NOT_APPLICABLE;
		}
		owner.getType().forEach(type -> result.add(SysMLPackage.Literals.FEATURE_TYPING, type));
		for (Feature redefined : FeatureUtil.getRedefinedFeaturesWithComputedOf(owner)) {
			if (redefined.isEnd()) {
				Feature cross = crossFeatureOf(redefined, context);
				if (cross != null) {
					result.add(SysMLPackage.Literals.SUBSETTING, cross);
				}
			}
		}
		return Outcome.APPLIED;
	}

	/** Finds the cross feature of an end feature, including its implicit cross subsetting. */
	private static Feature crossFeatureOf(Feature feature, ImplicitSpecializationEvaluationContext context) {
		if (feature.getCrossFeature() != null) {
			return feature.getCrossFeature();
		}
		return context.evaluate(feature).stream()
				.filter(specialization -> specialization.specializationKind() == SysMLPackage.Literals.CROSS_SUBSETTING)
				.map(ImplicitSpecialization::generalType)
				.filter(Feature.class::isInstance)
				.map(Feature.class::cast)
				.map(FeatureUtil::getBasicFeatureOf)
				.findFirst().orElse(null);
	}

	/**
	 * Redefines the end feature, the constructor result feature or the parameter at the same position
	 * in each direct general type of the owning type, trying these kinds of features in this order.
	 * The rule implements the following constraints, which share this positional matching.
	 * <p>
	 * KerML §8.3.3.3.4, {@code checkFeatureEndRedefinition}: "If a Feature has isEnd = true and an
	 * owningType that is not empty, then, for each direct supertype of its owningType, it must
	 * redefine the endFeature at the same position, if any."
	 * <p>
	 * KerML §8.3.4.8.3, {@code checkConstructorExpressionResultFeatureRedefinition}: "Each
	 * ownedFeature of the result of a ConstructionExpression must redefine exactly one public feature
	 * of the instantiatedType of the ConstructorExpression."
	 * <p>
	 * KerML §8.3.3.3.4, {@code checkFeatureResultRedefinition}: "If a Feature is a result parameter
	 * of an owningType that is a Function or Expression, then, for each direct supertype of its
	 * owningType that is also a Function or Expression, it must redefine the result parameter."
	 * <p>
	 * KerML §8.3.3.3.4, {@code checkFeatureParameterRedefinition}: "If a Feature is a parameter of
	 * an owningType that is a Behavior or Step, but not
	 * <ul>
	 * <li>A result parameter</li>
	 * <li>A parameter of an InvocationExpression, with at least one non-implied ownedRedefinition</li>
	 * </ul>
	 * then, for each direct supertype of its owningType that is also a Behavior or Step, it must
	 * redefine the parameter at the same position, if any."
	 * <p>
	 * A Feature of an InvocationExpression or of a constructor result that already owns a
	 * redefinition, which parsing sets, is not matched.
	 */
	private static Outcome positionalRedefinition(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		Type owner = feature.getOwningType();
		if (owner == null || feature instanceof Multiplicity
				|| (owner instanceof InvocationExpression || ExpressionUtil.isConstructorResult(owner))
						&& !feature.getOwnedRedefinition().isEmpty()) {
			return Outcome.NOT_APPLICABLE;
		}
		if (feature.isEnd()) {
			PositionalRedefinitions.add(feature, type -> endFeatures(feature, type), result, context);
		} else if (ExpressionUtil.isConstructorResult(owner)) {
			PositionalRedefinitions.add(feature, type -> constructorFeatures(feature, type), result, context);
		} else if (FeatureUtil.isParameter(feature)) {
			PositionalRedefinitions.add(feature, type -> parameterFeatures(feature, type), result, context);
		} else {
			return Outcome.NOT_APPLICABLE;
		}
		return Outcome.APPLIED;
	}

	/** Returns the owned end features of the owning type, or the end features of a general type. */
	private static List<Feature> endFeatures(Feature feature, Type type) {
		if (type == feature.getOwningType()) {
			return type.getOwnedEndFeature();
		}
		return TypeUtil.getEndFeatureOf(type);
	}

	/**
	 * Matches the features of a constructor result with the public features of the instantiated
	 * type at the same position.
	 * <p>
	 * KerML §8.4.4.1, Table 11, note 6: "For the
	 * checkConstructorExpressionResultFeatureRedefinition constraint, the target of the
	 * Redefinition shall be the feature of the instantiatedType at the same position in order
	 * in the instantiatingType that as the position of the redefining ownedFeature in the
	 * ConstructorExpression result parameter."
	 *
	 * @param feature the constructor result feature
	 * @param type the constructor result or a general type
	 * @return ordered features participating in constructor matching
	 */
	private static List<? extends Feature> constructorFeatures(Feature feature, Type type) {
		Type owner = feature.getOwningType();
		if (type == owner) {
			return type.getOwnedFeature();
		}
		if (owner.getOwningNamespace() instanceof ConstructorExpression constructor
				&& type == constructor.getInstantiatedType()) {
			return TypeUtil.getFeatureOf(type).stream()
					.filter(candidate -> candidate.getOwningFeatureMembership() != null
							&& candidate.getOwningFeatureMembership().getVisibility() == VisibilityKind.PUBLIC)
					.toList();
		}
		return List.of();
	}

	/**
	 * Selects the result parameter separately and filters ignored ordinary parameters.
	 *
	 * @param feature the specific parameter
	 * @param type the owning type or a general type
	 * @return ordered comparable parameters
	 */
	private static List<Feature> parameterFeatures(Feature feature, Type type) {
		if (FeatureUtil.isResultParameter(feature)) {
			Feature resultParameter = TypeUtil.getResultParameterOf(type);
			if (resultParameter == null) {
				return List.of();
			}
			return List.of(resultParameter);
		}
		List<Feature> parameters;
		if (type == feature.getOwningType()) {
			parameters = TypeUtil.getOwnedParametersOf(type);
		} else {
			parameters = TypeUtil.getAllParametersOf(type);
		}
		return parameters.stream().filter(parameter -> !FeatureUtil.isIgnoredParameter(parameter)).toList();
	}

	/**
	 * Selects the object, subobject, occurrence, suboccurrence, portion, data value or base default of
	 * a Feature from its types ({@code checkFeatureObjectSpecialization},
	 * {@code checkFeatureSubobjectSpecialization}, {@code checkFeatureOccurrenceSpecialization},
	 * {@code checkFeatureSuboccurrenceSpecialization}, {@code checkFeaturePortionSpecialization},
	 * {@code checkFeatureDataValueSpecialization}, {@code checkFeatureSpecialization}; KerML Table 10,
	 * &sect;8.4.4.1).
	 * <p>
	 * KerML §8.3.3.3.4, {@code checkFeatureSpecialization}: "A Feature must directly or indirectly
	 * specialize Base::things from the Kernel Semantic Library."
	 */
	private static String featureKey(Feature feature, ImplicitSpecializationEvaluationContext context) {
		if (hasStructureType(feature, context)) {
			if (isSubobject(feature, context)) {
				return "subobject";
			}
			return "object";
		}
		if (hasClassType(feature, context)) {
			if (isSuboccurrence(feature, context)) {
				return "suboccurrence";
			}
			if (feature.isPortion()) {
				return "portion";
			}
			return "occurrence";
		}
		if (hasDataType(feature, context)) {
			return "dataValue";
		}
		return "base";
	}

	/**
	 * Subsets a directionless, non-default valued Feature by the chain of its value Expression and
	 * its result.
	 * <p>
	 * KerML §8.3.3.3.4, {@code checkFeatureValuationSpecialization}: "If a Feature has a
	 * FeatureValue, no ownedSpecializations that are not implied, and is not directed, then it must
	 * specialize the result of the value Expression of the FeatureValue."
	 */
	private static Outcome valuationSpecialization(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		FeatureValue valuation = FeatureUtil.getValuationFor(feature);
		if (valuation == null || valuation.isDefault() || valuation.getValue() == null
				|| !feature.getOwnedSpecialization().isEmpty() || feature.getDirection() != null) {
			return Outcome.NOT_APPLICABLE;
		}
		Expression value = valuation.getValue();
		if (value.getResult() != null) {
			result.add(SysMLPackage.Literals.SUBSETTING,
					FeatureUtil.chainFeatures(value, value.getResult()));
		} else {
			result.markIncomplete();
		}
		return Outcome.APPLIED;
	}

	/**
	 * Subsets an end of an Association or Connector by the standard participant feature, unless the
	 * end already has a redefinition ({@code checkFeatureEndSpecialization}, KerML §8.3.3.3.4).
	 * <p>
	 * KerML §8.3.3.3.4, {@code checkFeatureEndSpecialization}: "If a Feature has isEnd = true and an
	 * owningType that is an Association or a Connector, then it must directly or indirectly specialize
	 * Links::Link::participant from the Kernel Semantic Library."
	 */
	private static Outcome endSpecialization(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		Type endOwner = feature.getEndOwningType();
		if ((endOwner instanceof Association || endOwner instanceof Connector)
				&& !result.containsKind(SysMLPackage.Literals.REDEFINITION)) {
			SpecializationHelper.addMappedSubsetting(result, feature, "participant");
			return Outcome.APPLIED;
		}
		return Outcome.NOT_APPLICABLE;
	}

	/**
	 * Adds the CrossSubsetting of an end Feature that owns a cross feature, built as a chain from the
	 * other end when there are two ends, and from a Feature featured by the owning type otherwise
	 * ({@code checkFeatureCrossingSpecialization}, KerML §8.3.3.3.4).
	 * <p>
	 * KerML §8.3.3.3.4, {@code checkFeatureCrossingSpecialization}: "If this Feature has isEnd = true
	 * and ownedCrossFeature returns a non-null value, then the crossFeature of the Feature must be the
	 * Feature returned from ownedCrossFeature (which implies that this Feature has an appropriate
	 * ownedCrossSubsetting to realize this)."
	 */
	private static Outcome crossingSpecialization(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		Feature cross = FeatureUtil.getOwnedCrossFeatureOf(feature);
		if (cross == null || feature.getOwnedCrossSubsetting() != null
				|| !result.getOnly(SysMLPackage.Literals.CROSS_SUBSETTING).isEmpty()) {
			return Outcome.NOT_APPLICABLE;
		}
		Type owner = feature.getOwningType();
		if (owner == null) {
			return Outcome.NOT_APPLICABLE;
		}
		List<Feature> ends = owner.getOwnedEndFeature();
		if (ends.size() == 2) {
			int otherIndex = 0;
			if (ends.indexOf(feature) == 0) {
				otherIndex = 1;
			}
			Feature other = ends.get(otherIndex);
			result.add(SysMLPackage.Literals.CROSS_SUBSETTING,
					FeatureUtil.chainFeatures(other, cross));
		} else {
			Feature first = SysMLFactory.eINSTANCE.createFeature();
			FeatureUtil.addFeaturingTypesTo(first, Collections.singleton(owner));
			Feature chain = FeatureUtil.chainFeatures(first, cross);
			chain.getOwnedFeatureChaining().get(0).getOwnedRelatedElement().add(first);
			result.add(SysMLPackage.Literals.CROSS_SUBSETTING, chain);
			for (Type type : cross.getFeaturingType()) {
				FeatureTyping typing = SysMLFactory.eINSTANCE.createFeatureTyping();
				typing.setType(type);
				first.getOwnedRelationship().add(typing);
			}
		}
		return Outcome.APPLIED;
	}
}
