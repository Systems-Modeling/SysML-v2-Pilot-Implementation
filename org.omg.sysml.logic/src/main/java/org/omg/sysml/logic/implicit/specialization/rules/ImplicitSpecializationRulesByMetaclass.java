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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * Finds, by an array access, the rules of one family that apply to a Type. A rule is declared on a
 * metaclass and applies to the instances of that metaclass and of all its subclasses; this index
 * resolves that inheritance once, when it is built: for every metaclass of {@code SysMLPackage},
 * it stores the rules declared on the metaclass itself or on one of its supertypes, in the order
 * in which they must run. Looking up a Type is then an access by the classifier ID of its
 * metaclass, like the generated {@code SysMLSwitch}, without traversing the supertypes.
 * <p>
 * The order is the one in which the generated {@code SysMLSwitch} tries its cases (see
 * {@link #switchOrder(EClass)}): the rules declared on the most specific metaclass first; rules
 * declared on the same metaclass keep their registration order.
 * <p>
 * For example, with rules {@code S} declared on StateUsage, {@code A} on ActionUsage, then
 * {@code F1} and {@code F2} on Feature, the index holds:
 * <ul>
 * <li>for StateUsage: {@code S, A, F1, F2};</li>
 * <li>for ActionUsage: {@code A, F1, F2};</li>
 * <li>for PartUsage, a Feature that is not an ActionUsage: {@code F1, F2};</li>
 * <li>for PartDefinition, which is not a Feature: no rule.</li>
 * </ul>
 */
final class ImplicitSpecializationRulesByMetaclass {

	/**
     * For each classifier ID of {@code SysMLPackage}, the rules that apply to the instances of that
     * metaclass, in execution order; an immutable list, empty when no rule applies.
     */
	private final List<List<ImplicitSpecializationRule>> rulesByClassifierId;

	/**
     * Builds the index of the rules of one family.
     *
     * @param rules the rules of one family, in registration order
     */
	ImplicitSpecializationRulesByMetaclass(List<ImplicitSpecializationRule> rules) {
		Map<EClass, List<ImplicitSpecializationRule>> bySubjectClass = new HashMap<>();
		for (ImplicitSpecializationRule rule : rules) {
			bySubjectClass.computeIfAbsent(rule.subjectClass(), key -> new ArrayList<>()).add(rule);
		}
		List<EClassifier> classifiers = SysMLPackage.eINSTANCE.getEClassifiers();
		rulesByClassifierId = new ArrayList<>(classifiers.size());
		for (int classifierId = 0; classifierId < classifiers.size(); classifierId++) {
			rulesByClassifierId.add(List.of());
		}
		if (bySubjectClass.isEmpty()) {
			return;
		}
		for (EClassifier classifier : classifiers) {
			if (classifier instanceof EClass eClass) {
				List<ImplicitSpecializationRule> applicable = new ArrayList<>();
				for (EClass subjectClass : switchOrder(eClass)) {
					applicable.addAll(bySubjectClass.getOrDefault(subjectClass, List.of()));
				}
				rulesByClassifierId.set(classifier.getClassifierID(), List.copyOf(applicable));
			}
		}
	}

	/**
     * Returns the rules that apply to a Type, in execution order.
     *
     * @param type the Type being computed, or {@code null}
     * @return the precomputed immutable list for the metaclass of {@code type}; empty when
     *         {@code type} is {@code null} or is not an instance of a metaclass of
     *         {@code SysMLPackage}
     */
	List<ImplicitSpecializationRule> rulesFor(Type type) {
		if (type == null) {
			return List.of();
		}
		EClass eClass = type.eClass();
		if (eClass.getEPackage() != SysMLPackage.eINSTANCE) {
			return List.of();
		}
		return rulesByClassifierId.get(eClass.getClassifierID());
	}

	 /**
     * Finds a metaclass for which {@code later} would run before {@code earlier}, which happens when
     * {@code later} is declared on a more specific metaclass. Used to refuse an exclusion that could
     * not take effect.
     *
     * @param earlier a rule expected to run first
     * @param later a rule expected to run after {@code earlier}
     * @return a metaclass whose rules contain both, {@code later} first, or {@code null} when there
     *         is none
     */
	EClass findMetaclassRunningBefore(ImplicitSpecializationRule earlier, ImplicitSpecializationRule later) {
		List<EClassifier> classifiers = SysMLPackage.eINSTANCE.getEClassifiers();
		for (int classifierId = 0; classifierId < rulesByClassifierId.size(); classifierId++) {
			List<ImplicitSpecializationRule> rules = rulesByClassifierId.get(classifierId);
			int earlierIndex = rules.indexOf(earlier);
			int laterIndex = rules.indexOf(later);
			if (earlierIndex >= 0 && laterIndex >= 0 && laterIndex < earlierIndex) {
				return (EClass)classifiers.get(classifierId);
			}
		}
		return null;
	}

	/**
	 * Returns the metaclasses whose cases the generated {@code SysMLSwitch} tries for an instance
	 * of {@code eClass}, in the same order: {@code eClass} itself, then its supertypes by increasing
	 * maximum depth and, at equal depth, in order of first discovery. This is the order of the EMF
	 * generator ({@code GenClassImpl.getSwitchGenClasses}), which records the depth of a supertype
	 * found again deeper without revisiting its own supertypes.
	 *
	 * @param eClass a metaclass
	 * @return {@code eClass} followed by its supertypes, in switch order
	 */
	static List<EClass> switchOrder(EClass eClass) {
		Map<EClass, Integer> maxDepths = new LinkedHashMap<>();
		findMaxSuperTypeDepths(maxDepths, eClass, 0);
		maxDepths.remove(eClass);
		List<List<EClass>> byDepth = new ArrayList<>();
		for (Map.Entry<EClass, Integer> entry : maxDepths.entrySet()) {
			while (byDepth.size() <= entry.getValue()) {
				byDepth.add(new ArrayList<>());
			}
			byDepth.get(entry.getValue()).add(entry.getKey());
		}
		List<EClass> order = new ArrayList<>();
		order.add(eClass);
		for (List<EClass> classes : byDepth) {
			order.addAll(classes);
		}
		return order;
	}

	private static void findMaxSuperTypeDepths(Map<EClass, Integer> maxDepths, EClass eClass, int depth) {
		Integer existing = maxDepths.get(eClass);
		if (existing != null) {
			if (depth > existing) {
				maxDepths.put(eClass, depth);
			}
			return;
		}
		maxDepths.put(eClass, depth);
		for (EClass superType : eClass.getESuperTypes()) {
			findMaxSuperTypeDepths(maxDepths, superType, depth + 1);
		}
	}
}
