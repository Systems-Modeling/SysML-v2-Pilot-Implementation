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

import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.self;

import java.util.List;

import org.omg.sysml.lang.sysml.ConstructorExpression;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.IndexExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.SelectExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationReducer;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;

/**
 * Rules of the constraints of KerML &sect;8.3.4.8, Expressions.
 * <p>
 * Specification quotations are from KerML 1.1 Beta 2.
 */
final class KerMLExpressionRules {

	private KerMLExpressionRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				self("checkFeatureChainExpressionTargetRedefinition", ImplicitSpecializationRuleFamily.CONTEXT,
						Feature.class, KerMLExpressionRules::featureChainExpressionTargetRedefinition),
				self("operatorExpressionInstantiatedType", ImplicitSpecializationRuleFamily.PRIORITY,
						OperatorExpression.class, KerMLExpressionRules::operatorExpressionInstantiatedType),
				self("checkFeatureReferenceExpressionResultSpecialization", ImplicitSpecializationRuleFamily.EXPRESSION_RESULT, Feature.class,
						KerMLExpressionRules::featureReferenceExpressionResultSpecialization),
				self("checkFeatureChainExpressionResultSpecialization", ImplicitSpecializationRuleFamily.EXPRESSION_RESULT, Feature.class,
						KerMLExpressionRules::featureChainExpressionResultSpecialization),
				self("checkIndexExpressionResultSpecialization", ImplicitSpecializationRuleFamily.EXPRESSION_RESULT, Feature.class,
						KerMLExpressionRules::indexExpressionResultSpecialization),
				self("checkSelectExpressionResultSpecialization", ImplicitSpecializationRuleFamily.EXPRESSION_RESULT, Feature.class,
						KerMLExpressionRules::selectExpressionResultSpecialization),
				self("checkConstructorExpressionResultSpecialization", ImplicitSpecializationRuleFamily.EXPRESSION_RESULT, Feature.class,
						KerMLExpressionRules::constructorExpressionResultSpecialization),
				self("checkInvocationExpressionBehaviorResultSpecialization", ImplicitSpecializationRuleFamily.EXPRESSION_RESULT, Feature.class,
						KerMLExpressionRules::invocationExpressionBehaviorResultSpecialization),
				self("checkInvocationExpressionSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION,
						InvocationExpression.class, KerMLExpressionRules::invocationExpressionSpecialization));
	}

	/**
	 * Redefines the nested target of a feature-chain source parameter, which fully determines it.
	 * <p>
	 * KerML §8.3.4.8.4, {@code checkFeatureChainExpressionTargetRedefinition}: "The first
	 * ownedFeature of the first owned input parameter of a FeatureChainExpression must
	 * redefine the Feature ControlFunctions::'.'::source::target from the Kernel Functions
	 * Library."
	 * <p>
	 * KerML §8.3.4.8.4, {@code checkFeatureChainExpressionSourceTargetRedefinition}: "The
	 * first ownedFeature of the first owned input parameter of a FeatureChainExpression must
	 * redefine its targetFeature."
	 * <p>
	 * KerML §8.4.4.1, Table 11, note 5: "For the checkFeatureChainExpressionTargetRedefinition
	 * and checkFeatureChainExpressionSourceTargetRedefinition constraints, the
	 * redefiningFeature of the implied Redefinition is a nested Feature of the first owned
	 * input parameter of the FeatureChainExpression (corresponding to the source parameter of
	 * the '.' Function)."
	 * <p>
	 * The discriminating type is the owner of the owning type, so the subject is the Feature itself.
	 */
	private static Outcome featureChainExpressionTargetRedefinition(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (feature.getOwningType() instanceof Feature sourceParameter
				&& sourceParameter.getOwningType() instanceof FeatureChainExpression expression
				&& expression.sourceTargetFeature() == feature) {
			result.add(SysMLPackage.Literals.REDEFINITION, SpecializationHelper.library(result, expression,
					ImplicitGeneralizationMap.getDefaultSupertypeFor(expression.getClass(), "target")));
			result.add(SysMLPackage.Literals.REDEFINITION, expression.getTargetFeature());
			return Outcome.APPLIED_DETERMINES;
		}
		return Outcome.NOT_APPLICABLE;
	}

	/**
	 * Types an OperatorExpression by the function of its operator in the Kernel Function Library,
	 * following the {@code instantiatedType()} operation of KerML §8.3.4.8.17, OperatorExpression.
	 */
	private static Outcome operatorExpressionInstantiatedType(OperatorExpression operator,
			ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		if (operator.getOperator() == null) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addLibrary(result, operator, SysMLPackage.Literals.FEATURE_TYPING,
				ExpressionUtil.getOperatorQualifiedNames(operator.getOperator()));
		return Outcome.APPLIED;
	}

	/**
	 * Subsets a FeatureReferenceExpression's result by its referent (KerML §8.4.4.9.3,
	 * {@code checkFeatureReferenceExpressionResultSpecialization}).
	 * <p>
	 * KerML §8.3.4.8.5, {@code checkFeatureReferenceExpressionResultSpecialization}: "The result
	 * parameter of a FeatureReferenceExpression must specialize the referent of the
	 * FeatureReferenceExpression."
	 */
	private static Outcome featureReferenceExpressionResultSpecialization(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(feature.getOwningType() instanceof FeatureReferenceExpression referenceExpression)) {
			return Outcome.NOT_APPLICABLE;
		}
		if (referenceExpression.getResult() != feature) {
			return Outcome.NOT_APPLICABLE;
		}
		Element referent = ExpressionUtil.getReferentFor(referenceExpression);
		if (referent instanceof Feature referentFeature) {
			result.add(SysMLPackage.Literals.SUBSETTING, referentFeature);
		}
		return Outcome.APPLIED;
	}

	/**
	 * Subsets a FeatureChainExpression's result by the chain of its source parameter and source
	 * target.
	 * <p>
	 * KerML §8.3.4.8.4, {@code checkFeatureChainExpressionResultSpecialization}: "The result
	 * parameter of a FeatureChainExpression must specialize the feature chain of the
	 * FeatureChainExpression."
	 */
	private static Outcome featureChainExpressionResultSpecialization(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(feature.getOwningType() instanceof FeatureChainExpression chainExpression)) {
			return Outcome.NOT_APPLICABLE;
		}
		if (chainExpression.getResult() != feature) {
			return Outcome.NOT_APPLICABLE;
		}
		Feature sourceTarget = chainExpression.sourceTargetFeature();
		Feature sourceParameter = chainExpression.getOwnedFeature().stream()
				.filter(parameter -> parameter.getDirection() == FeatureDirectionKind.IN).findFirst().orElse(null);
		if (sourceParameter != null && sourceTarget != null) {
			result.add(SysMLPackage.Literals.SUBSETTING,
					FeatureUtil.chainFeatures(sourceParameter, sourceTarget));
		}
		return Outcome.APPLIED;
	}

	/**
	 * Subsets an IndexExpression's result by the result of its first argument, unless that
	 * result specializes {@code Collections::Collection}.
	 * <p>
	 * KerML §8.3.4.8.6, {@code checkIndexExpressionResultSpecialization}: "The result of an
	 * IndexExpression must specialize the result parameter of the first argument of the
	 * IndexExpression, unless that result already directly or indirectly specializes the
	 * DataType Collections::Collection from the Kernel Data Type Library."
	 */
	private static Outcome indexExpressionResultSpecialization(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(feature.getOwningType() instanceof IndexExpression indexExpression)) {
			return Outcome.NOT_APPLICABLE;
		}
		if (indexExpression.getResult() != feature || indexExpression.getArgument().isEmpty()) {
			return Outcome.NOT_APPLICABLE;
		}
		Expression sequenceExpression = indexExpression.getArgument().get(0);
		Feature sequenceResult = sequenceExpression.getResult();
		if (sequenceResult == null) {
			result.markIncomplete();
			return Outcome.APPLIED;
		}
		Type collectionType = SpecializationHelper.library(result, indexExpression, "Collections::Collection");
		boolean isCollection = collectionType != null
				&& ImplicitSpecializationReducer.specializes(sequenceResult, collectionType, context);
		if (!isCollection) {
			result.add(SysMLPackage.Literals.SUBSETTING, sequenceResult);
		}
		return Outcome.APPLIED;
	}

	/**
	 * Subsets a SelectExpression's result by the result of its first argument.
	 * <p>
	 * KerML §8.3.4.8.18, {@code checkSelectExpressionResultSpecialization}: "The result of a
	 * SelectExpression must specialize the result parameter of the first argument of the
	 * SelectExpression."
	 */
	private static Outcome selectExpressionResultSpecialization(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(feature.getOwningType() instanceof SelectExpression selectExpression)) {
			return Outcome.NOT_APPLICABLE;
		}
		if (selectExpression.getResult() != feature || selectExpression.getArgument().isEmpty()) {
			return Outcome.NOT_APPLICABLE;
		}
		result.add(SysMLPackage.Literals.SUBSETTING, selectExpression.getArgument().get(0).getResult());
		return Outcome.APPLIED;
	}

	/**
	 * Types or subsets a ConstructorExpression's result by its instantiated type (KerML
	 * §8.4.4.9.4, {@code checkConstructorExpressionResultSpecialization}).
	 * <p>
	 * KerML §8.3.4.8.3, {@code checkConstructorExpressionResultSpecialization}: "The result of a
	 * ConstructorExpression must specialize the instantiatedType of the ConstructorExpression."
	 */
	private static Outcome constructorExpressionResultSpecialization(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(feature.getOwningType() instanceof ConstructorExpression constructorExpression)) {
			return Outcome.NOT_APPLICABLE;
		}
		if (constructorExpression.getResult() != feature) {
			return Outcome.NOT_APPLICABLE;
		}
		addInstantiationResult(constructorExpression.getInstantiatedType(), result);
		return Outcome.APPLIED;
	}

	/**
	 * Types or subsets an InvocationExpression's result by its instantiated type. A Function result
	 * is not handled here: it redefines the Function's result parameter. The rule also runs for the
	 * IndexExpression, SelectExpression and FeatureChainExpression owners, whose instantiated type is
	 * a Function.
	 * <p>
	 * KerML §8.3.4.8.8, {@code checkInvocationExpressionBehaviorResultSpecialization}: "If the
	 * instantiatedType of an InvocationExpression is neither a Function nor a Feature whose type is a
	 * Function, then the result of the InvocationExpression must specialize the instantiatedType."
	 */
	private static Outcome invocationExpressionBehaviorResultSpecialization(Feature feature, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(feature.getOwningType() instanceof InvocationExpression invocationExpression)) {
			return Outcome.NOT_APPLICABLE;
		}
		if (invocationExpression.getResult() != feature || isFunctionType(invocationExpression.getInstantiatedType())) {
			return Outcome.NOT_APPLICABLE;
		}
		addInstantiationResult(invocationExpression.getInstantiatedType(), result);
		return Outcome.APPLIED;
	}

	/**
	 * Subsets an InvocationExpression by its instantiated type when it is a Feature, and types it by
	 * its instantiated type otherwise.
	 * <p>
	 * KerML §8.3.4.8.8, {@code checkInvocationExpressionSpecialization}: "An InvocationExpression
	 * must specialize its instantiatedType."
	 */
	private static Outcome invocationExpressionSpecialization(InvocationExpression invocation,
			ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		if (invocation.getInstantiatedType() == null) {
			return Outcome.NOT_APPLICABLE;
		}
		addInstantiationResult(invocation.getInstantiatedType(), result);
		return Outcome.APPLIED;
	}

	/**
	 * Adds a Subsetting when the instantiated type is a Feature and a FeatureTyping otherwise.
	 * <p>
	 * KerML §8.4.4.9.5: "If the instantiatedType is a Feature, the semantics are similar,
	 * except that the InvocationExpression has a Subsetting relationship with the
	 * instantiatedType, instead of a FeatureTyping relationship."
	 */
	private static void addInstantiationResult(Type instantiatedType, ImplicitSpecializationResult result) {
		if (instantiatedType instanceof Feature) {
			result.add(SysMLPackage.Literals.SUBSETTING, instantiatedType);
		} else {
			result.add(SysMLPackage.Literals.FEATURE_TYPING, instantiatedType);
		}
	}

	/** Tests whether invocation typing already denotes a function: a Function or a Feature typed by one. */
	private static boolean isFunctionType(Type type) {
		return type instanceof org.omg.sysml.lang.sysml.Function || type instanceof Feature feature
				&& feature.getType().stream().anyMatch(org.omg.sysml.lang.sysml.Function.class::isInstance);
	}
}
