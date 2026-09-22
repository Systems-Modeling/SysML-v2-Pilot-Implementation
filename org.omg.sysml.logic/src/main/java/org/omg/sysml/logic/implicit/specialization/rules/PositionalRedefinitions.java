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

import java.util.List;
import java.util.function.Function;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationReducer;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.SysMLLibraryUtil;

/**
 * Stateless helpers shared by the rules that redefine the feature at the same position in the
 * general types of the owning type.
 */
final class PositionalRedefinitions {

	private PositionalRedefinitions() {
	}

	/**
	 * Redefines, in each direct general type of the owning type of {@code feature}, the feature at
	 * the position of {@code feature} among the features that {@code relevantFeatures} selects in
	 * the owning type. Nothing is added when {@code feature} has no owning type or when the owning
	 * type does not select it.
	 *
	 * @param feature the specific feature
	 * @param relevantFeatures the ordered features comparable with {@code feature} in a type
	 * @param result the candidates to update
	 * @param context the request-scoped traversal context
	 */
	static void add(Feature feature, Function<Type, List<? extends Feature>> relevantFeatures,
			ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		Type owner = feature.getOwningType();
		if (owner == null) {
			return;
		}
		int index = relevantFeatures.apply(owner).indexOf(feature);
		if (index < 0) {
			return;
		}
		for (Type general : generalTypes(owner, feature, context)) {
			List<? extends Feature> candidates = relevantFeatures.apply(general);
			if (index < candidates.size() && candidates.get(index) != null && candidates.get(index) != feature) {
				result.add(SysMLPackage.Literals.REDEFINITION, candidates.get(index));
			}
		}
	}

	/**
	 * Selects the direct general types used for positional matching. Transitive generals are not
	 * needed: the relevant features of a general already include inherited features. A transition
	 * guard uses the library base type of its owner instead of the owner's generals (SysML
	 * &sect;8.4.14.3).
	 *
	 * @param owner the feature's owning type
	 * @param feature the specific feature
	 * @param context the request-scoped traversal context
	 * @return direct generals in stable model order
	 */
	private static List<Type> generalTypes(Type owner, Feature feature,
			ImplicitSpecializationEvaluationContext context) {
		if (feature instanceof Expression expression && ExpressionUtil.isTransitionGuard(expression)) {
			Type general = SysMLLibraryUtil.getLibraryType(owner,
					ImplicitGeneralizationMap.getDefaultSupertypeFor(owner.getClass(), "base"));
			if (general == null) {
				return List.of();
			}
			return List.of(general);
		}
		return ImplicitSpecializationReducer.directGeneralTypes(owner, context);
	}

	/**
	 * Returns the relevant features of a rule whose specific feature is matched with one library
	 * feature: the feature itself in its owning type, the library feature in a general type.
	 *
	 * @param feature the specific feature
	 * @param qualifiedName the qualified name of the library feature
	 * @param context the request context, whose current result becomes incomplete when the library
	 *        feature cannot be resolved
	 * @return the relevant features
	 */
	static Function<Type, List<? extends Feature>> itselfOrLibraryFeature(Feature feature, String qualifiedName,
			ImplicitSpecializationEvaluationContext context) {
		return type -> {
			if (type == feature.getOwningType()) {
				return List.of(feature);
			}
			return libraryFeature(feature, qualifiedName, context);
		};
	}

	/**
	 * Resolves one standard feature as a singleton positional list.
	 *
	 * @param feature the feature providing library lookup context
	 * @param qualifiedName the constant qualified library name
	 * @param context the request context, whose current result becomes incomplete when the feature
	 *        cannot be resolved
	 * @return a singleton feature list, or an empty list when unresolved
	 */
	private static List<Feature> libraryFeature(Feature feature, String qualifiedName,
			ImplicitSpecializationEvaluationContext context) {
		Type libraryType = SysMLLibraryUtil.getLibraryType(feature, qualifiedName);
		if (!(libraryType instanceof Feature libraryFeature) || libraryType.eIsProxy()) {
			context.markRequestingResultIncomplete();
			return List.of();
		}
		return List.of(libraryFeature);
	}
}
