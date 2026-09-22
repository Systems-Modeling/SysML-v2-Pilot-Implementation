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

import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.ItemDefinition;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.api.ImplicitSpecialization;
import org.omg.sysml.util.FeatureUtil;

/**
 * Stateless typing and ownership predicates shared by the default rules.
 */
final class ImplicitTypingPredicate {
	private ImplicitTypingPredicate() {
	}

	/**
	 * Tests whether a feature has a Structure type.
	 *
	 * @param feature the feature to inspect
	 * @param context the request-scoped conformance context
	 * @return {@code true} for structural typing
	 */
	static boolean hasStructureType(Feature feature, ImplicitSpecializationEvaluationContext context) {
		return hasType(feature, Structure.class, context);
	}

	/**
	 * Tests whether a feature has a Class type.
	 *
	 * @param feature the feature to inspect
	 * @param context the request-scoped conformance context
	 * @return {@code true} for occurrence-class typing
	 */
	static boolean hasClassType(Feature feature, ImplicitSpecializationEvaluationContext context) {
		return hasType(feature, org.omg.sysml.lang.sysml.Class.class, context);
	}

	/**
	 * Tests whether a feature has a DataType.
	 *
	 * @param feature the feature to inspect
	 * @param context the request-scoped conformance context
	 * @return {@code true} for data-value typing
	 */
	static boolean hasDataType(Feature feature, ImplicitSpecializationEvaluationContext context) {
		return hasType(feature, DataType.class, context);
	}

	/**
	 * Tests explicit typing first, then request-local implicit FeatureTyping.
	 * Attempts to resolve explicit types; remaining proxies make the request uncacheable.
	 *
	 * @param feature the feature to inspect
	 * @param kind the required Java metaclass
	 * @param context the request-scoped evaluation context
	 * @return {@code true} when a matching type exists
	 */
	private static boolean hasType(Feature feature, java.lang.Class<?> kind,
			ImplicitSpecializationEvaluationContext context) {
		for (FeatureTyping typing : feature.getOwnedTyping()) {
			Type type = typing.getType();
			if (type != null && type.eIsProxy()) {
				context.markRequestingResultIncomplete();
			} else if (kind.isInstance(type)) {
				return true;
			}
		}
		return context.typingCandidates(feature).stream()
				.filter(specialization -> SysMLPackage.Literals.FEATURE_TYPING
						.isSuperTypeOf(specialization.specializationKind()))
				.map(ImplicitSpecialization::generalType).anyMatch(kind::isInstance);
	}

	/**
	 * Tests composite ItemUsage ownership by an item definition or usage.
	 *
	 * @param usage the item usage to inspect
	 * @return {@code true} for a subitem
	 */
	static boolean isSubitem(ItemUsage usage) {
		return usage.isComposite()
				&& (usage.getOwningType() instanceof ItemDefinition || usage.getOwningType() instanceof ItemUsage);
	}

	/**
	 * Tests whether a structural feature is a composite subobject.
	 *
	 * @param feature the feature to inspect
	 * @param context the request-scoped typing context
	 * @return {@code true} for a subobject
	 */
	static boolean isSubobject(Feature feature, ImplicitSpecializationEvaluationContext context) {
		return feature.isComposite() && (feature.getOwningType() instanceof Structure
				|| feature.getOwningType() instanceof Feature owner && hasStructureType(owner, context));
	}

	/**
	 * Tests the ownership and composition conditions for suboccurrences.
	 *
	 * @param feature the feature to inspect
	 * @param context the request-scoped typing context
	 * @return {@code true} for a suboccurrence
	 */
	static boolean isSuboccurrence(Feature feature, ImplicitSpecializationEvaluationContext context) {
		boolean result = feature.isComposite()
				&& (feature.getOwningType() instanceof org.omg.sysml.lang.sysml.Class
						|| feature.getOwningType() instanceof Feature owner && hasClassType(owner, context));
		if (feature instanceof OccurrenceUsage occurrence) {
			result |= occurrence.isComposite() && occurrence.getOwningType() instanceof OccurrenceUsage;
		}
		if (feature instanceof ItemUsage item && isSubitem(item)) {
			return false;
		}
		if (feature instanceof ActionUsage action && isActionOwnedComposite(action)) {
			return false;
		}
		return result;
	}

	/**
	 * Tests composite ownership by a structurally typed feature.
	 *
	 * @param feature the feature to inspect
	 * @param context the request-scoped typing context
	 * @return {@code true} for structure-owned composition
	 */
	static boolean isStructureOwnedComposite(Feature feature,
			ImplicitSpecializationEvaluationContext context) {
		return feature.isComposite() && (feature.getOwningType() instanceof Structure
				|| feature.getOwningType() instanceof Feature owner && hasStructureType(owner, context));
	}

	/**
	 * Tests direct or feature-mediated ownership by a Behavior.
	 *
	 * @param feature the feature to inspect
	 * @return {@code true} for behavioral ownership
	 */
	static boolean isBehaviorOwned(Feature feature) {
		if (feature instanceof org.omg.sysml.lang.sysml.AssertConstraintUsage) {
			return feature.getOwningType() instanceof ActionDefinition
					|| feature.getOwningType() instanceof ActionUsage;
		}
		return FeatureUtil.isPerformanceFeature(feature);
	}

	/**
	 * Tests composite ownership by an ActionDefinition or ActionUsage.
	 *
	 * @param usage the usage to inspect
	 * @return {@code true} for an action-owned composite
	 */
	static boolean isActionOwnedComposite(Usage usage) {
		return usage.isComposite()
				&& (usage.getOwningType() instanceof ActionDefinition || usage.getOwningType() instanceof ActionUsage);
	}

	/**
	 * Tests composite ownership by a Part definition or usage.
	 *
	 * @param usage the usage to inspect
	 * @return {@code true} for a part-owned composite
	 */
	static boolean isPartOwnedComposite(Usage usage) {
		return usage.isComposite()
				&& (usage.getOwningType() instanceof PartDefinition || usage.getOwningType() instanceof PartUsage);
	}

	/**
	 * Tests whether a usage is performed by a part: its owning type is a Part definition or usage.
	 *
	 * @param usage the usage to inspect
	 * @return {@code true} when the performedAction default applies
	 */
	static boolean isPerformedAction(Usage usage) {
		return usage.getOwningType() instanceof PartDefinition || usage.getOwningType() instanceof PartUsage;
	}
}
