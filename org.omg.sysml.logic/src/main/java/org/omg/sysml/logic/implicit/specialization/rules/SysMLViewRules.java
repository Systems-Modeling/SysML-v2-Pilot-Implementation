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

import java.util.List;

import org.omg.sysml.lang.sysml.RenderingDefinition;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.ViewDefinition;
import org.omg.sysml.lang.sysml.ViewRenderingMembership;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.ViewpointUsage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;
import org.omg.sysml.util.UsageUtil;

/**
 * Rules of the constraints of SysML &sect;8.3.26, Views.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLViewRules {

	private SysMLViewRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				self("checkViewpointUsageViewpointSatisfactionSpecialization", ImplicitSpecializationRuleFamily.PRIORITY,
						SatisfyRequirementUsage.class, SysMLViewRules::viewpointSatisfactionSpecialization),
				self("checkRenderingUsageRedefinition", ImplicitSpecializationRuleFamily.REDEFINITION, RenderingUsage.class,
						SysMLViewRules::renderingRedefinition),
				defaultKey("checkViewpointUsageSpecialization", ViewpointUsage.class, SysMLViewRules::viewpointKey),
				defaultKey("checkRenderingUsageSpecialization", RenderingUsage.class, SysMLViewRules::renderingKey),
				defaultKey("checkViewUsageSpecialization", ViewUsage.class, SysMLViewRules::viewKey),
				self("viewUsageSubpartSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, ViewUsage.class,
						(view, result, context) -> SysMLItemRules.subpartSpecialization(view, result)),
				self("renderingUsageSubpartSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, RenderingUsage.class,
						(rendering, result, context) -> SysMLItemRules.subpartSpecialization(rendering, result)));
	}

	/**
	 * SysML §8.3.26.6, {@code checkRenderingUsageRedefinition}: "A RenderingUsage whose
	 * owningFeatureMembership is a ViewRenderingMembership must redefine the RenderingUsage
	 * Views::View::viewRendering."
	 */
	private static Outcome renderingRedefinition(RenderingUsage rendering, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!(rendering.getOwningFeatureMembership() instanceof ViewRenderingMembership)) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMapped(result, rendering, SysMLPackage.Literals.REDEFINITION, "viewRendering");
		return Outcome.APPLIED;
	}

	/**
	 * Subsets the satisfaction of a Viewpoint owned by a view by the library viewpoint
	 * satisfactions.
	 * <p>
	 * SysML §8.3.26.9, {@code checkViewpointUsageViewpointSatisfactionSpecialization}: "A composite
	 * ViewpointUsage whose owningType is a ViewDefinition or ViewUsage must directly or indirectly
	 * specialize the ViewpointUsage Views::View::viewpointSatisfactions from the Systems Model
	 * Library."
	 */
	private static Outcome viewpointSatisfactionSpecialization(SatisfyRequirementUsage satisfy,
			ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		Type owner = satisfy.getOwningType();
		if ((owner instanceof ViewDefinition || owner instanceof ViewUsage)
				&& UsageUtil.getSatisfyingFeatureValueOf(satisfy) == null
				&& satisfy.getSatisfiedRequirement() instanceof ViewpointUsage viewpoint) {
			SpecializationHelper.addLibrary(result, satisfy, SysMLPackage.Literals.SUBSETTING,
					SpecializationHelper.mapped(viewpoint, "satisfied"));
			return Outcome.APPLIED;
		}
		return Outcome.NOT_APPLICABLE;
	}

	/**
	 * Selects the satisfied default of a viewpoint owned by a view and the base default otherwise
	 * ({@code checkViewpointUsageViewpointSatisfactionSpecialization}, {@code checkViewpointUsageSpecialization},
	 * SysML &sect;8.4.22).
	 * <p>
	 * SysML §8.3.26.9, {@code checkViewpointUsageSpecialization}: "A ViewpointUsage must directly or
	 * indirectly specialize the base ViewpointUsage Views::viewpointChecks from the Systems Model
	 * Library."
	 */
	private static String viewpointKey(ViewpointUsage viewpoint,
			ImplicitSpecializationEvaluationContext context) {
		Type owner = viewpoint.getOwningType();
		if (owner instanceof ViewDefinition || owner instanceof ViewUsage) {
			return "satisfied";
		}
		return "base";
	}

	/**
	 * Selects {@code checkRenderingUsageSubrenderingSpecialization} for a rendering owned by a
	 * rendering and {@code checkRenderingUsageSpecialization} otherwise (SysML &sect;8.4.22).
	 * <p>
	 * SysML §8.3.26.6, {@code checkRenderingUsageSpecialization}: "A RenderingUsage must directly or
	 * indirectly specialize the base RenderingUsage Views::renderings from the Systems Model Library."
	 */
	private static String renderingKey(RenderingUsage rendering,
			ImplicitSpecializationEvaluationContext context) {
		Type owner = rendering.getOwningType();
		if (owner instanceof RenderingDefinition || owner instanceof RenderingUsage) {
			return "subrendering";
		}
		return "base";
	}

	/**
	 * Selects {@code checkViewUsageSubviewSpecialization} for a view owned by a view and
	 * {@code checkViewUsageSpecialization} otherwise (SysML &sect;8.4.22).
	 * <p>
	 * SysML §8.3.26.11, {@code checkViewUsageSpecialization}: "A ViewUsage must directly or indirectly
	 * specialize the base ViewUsage Views::views from the Systems Model Library."
	 */
	private static String viewKey(ViewUsage view, ImplicitSpecializationEvaluationContext context) {
		Type owner = view.getOwningType();
		if (owner instanceof ViewDefinition || owner instanceof ViewUsage) {
			return "subview";
		}
		return "base";
	}
}
