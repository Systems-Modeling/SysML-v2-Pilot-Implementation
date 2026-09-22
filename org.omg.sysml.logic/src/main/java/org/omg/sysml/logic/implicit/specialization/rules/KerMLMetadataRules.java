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
import static org.omg.sysml.logic.implicit.specialization.rules.SpecializationHelper.defaultKind;
import static org.omg.sysml.logic.implicit.specialization.rules.SpecializationHelper.library;
import static org.omg.sysml.logic.implicit.specialization.rules.SpecializationHelper.mapped;

import java.util.List;

import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationReducer;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.EvaluationUtil;
import org.omg.sysml.util.FeatureUtil;

/**
 * Rules of the constraints of KerML &sect;8.3.4.12, Metadata.
 * <p>
 * Specification quotations are from KerML 1.1 Beta 2.
 */
final class KerMLMetadataRules {

	private KerMLMetadataRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				self("checkMetadataFeatureSemanticSpecialization", ImplicitSpecializationRuleFamily.METADATA, Type.class,
						KerMLMetadataRules::semanticSpecialization),
				defaultKey("checkMetadataFeatureSpecialization", MetadataFeature.class, KerMLMetadataRules::metadataFeatureKey));
	}

	/**
	 * Specializes an annotated Type by the evaluated {@code baseType} of each applicable semantic
	 * metadata. A MetadataFeature is not an annotated Type for this rule.
	 * <p>
	 * KerML §8.3.4.12.3, {@code checkMetadataFeatureSemanticSpecialization}: "If this
	 * MetadataFeature is an application of SemanticMetadata, then its annotatingElement must be a
	 * Type. The annotated Type must then directly or indirectly specialize the specified value of the
	 * baseType, unless the Type is a Classifier and the baseType represents a kind of Feature, in
	 * which case the Classifier must directly or indirectly specialize each of the types of the
	 * Feature."
	 */
	private static Outcome semanticSpecialization(Type type, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (type instanceof MetadataFeature) {
			return Outcome.NOT_APPLICABLE;
		}
		for (MetadataFeature metadata : ElementUtil.getAllMetadataFeaturesOf(type)) {
			metadata.getMetaclass();
			Feature baseTypeFeature = (Feature)library(result, metadata, mapped(metadata, "baseType"));
			// Not TypeUtil.getFeatureOf: Type.getFeature clears the adapter caches first, whereas the
			// cached feature memberships of the metadata can be stale here and miss its baseType.
			metadata.getFeature().stream()
					.filter(feature -> ImplicitSpecializationReducer.specializes(feature, baseTypeFeature, context))
					.map(FeatureUtil::getValueExpressionFor)
					.filter(expression -> expression != null)
					.map(expression -> expression.evaluate(metadata))
					.filter(values -> values != null && !values.isEmpty())
					.map(values -> values.get(0))
					.map(EvaluationUtil::getMetaclassReferenceOf)
					.filter(Type.class::isInstance)
					.map(Type.class::cast)
					.forEach(base -> addBaseType(type, base, result));
		}
		return Outcome.APPLIED;
	}

	/** Converts one evaluated metadata base into the kind valid for the annotated type. */
	private static void addBaseType(Type type, Type base, ImplicitSpecializationResult result) {
		if (type instanceof Feature) {
			if (base instanceof Feature) {
				result.add(defaultKind(type), base);
			}
		} else if (type instanceof Classifier) {
			if (base instanceof Feature feature) {
				feature.getType().stream()
						.filter(Classifier.class::isInstance)
						.forEach(general -> result.add(defaultKind(type), general));
			} else if (base instanceof Classifier) {
				result.add(defaultKind(type), base);
			}
		} else {
			result.add(defaultKind(type), base);
		}
	}

	/**
	 * KerML §8.3.4.12.3, {@code checkMetadataFeatureSpecialization}: "A MetadataFeature must directly
	 * or indirectly specialize the base MetadataFeature Metaobjects::metaobjects from the Kernel
	 * Semantic Library."
	 */
	private static String metadataFeatureKey(MetadataFeature metadata,
			ImplicitSpecializationEvaluationContext context) {
		return "base";
	}
}
