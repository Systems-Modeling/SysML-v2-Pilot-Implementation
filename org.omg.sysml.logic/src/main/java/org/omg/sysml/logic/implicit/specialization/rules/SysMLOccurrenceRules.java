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
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.hasDataType;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.hasStructureType;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isSubobject;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isSuboccurrence;

import java.util.List;

import org.omg.sysml.lang.sysml.EventOccurrenceUsage;
import org.omg.sysml.lang.sysml.OccurrenceDefinition;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PortionKind;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;

/**
 * Rules of the constraints of SysML &sect;8.3.9, Occurrences.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLOccurrenceRules {

	private SysMLOccurrenceRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				defaultKey("checkOccurrenceUsageSpecialization", OccurrenceUsage.class, SysMLOccurrenceRules::occurrenceUsageKey),
				defaultKey("checkEventOccurrenceUsageSpecialization", EventOccurrenceUsage.class, SysMLOccurrenceRules::eventOccurrenceKey),
				self("occurrenceUsageSpecializations", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, OccurrenceUsage.class,
						SysMLOccurrenceRules::occurrenceUsageSpecializations),
				self("checkOccurrenceDefinitionIndividualSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, OccurrenceDefinition.class,
						SysMLOccurrenceRules::individualSpecialization));
	}

	/**
	 * Selects the suboccurrence default of an EventOccurrenceUsage owned by an occurrence
	 * ({@code checkEventOccurrenceUsageSpecialization}, SysML Table 32, &sect;8.4.5).
	 * <p>
	 * SysML §8.3.9.2, {@code checkEventOccurrenceUsageSpecialization}: "If an EventOccurrenceUsage has
	 * an owningType that is an OccurrenceDefinition or OccurrenceUsage, then it must directly or
	 * indirectly specialize the Feature Occurrences::Occurrence::timeEnclosedOccurrences."
	 */
	private static String eventOccurrenceKey(EventOccurrenceUsage event,
			ImplicitSpecializationEvaluationContext context) {
		Type owner = event.getOwningType();
		if (owner instanceof OccurrenceDefinition || owner instanceof OccurrenceUsage) {
			return "suboccurrence";
		}
		return "base";
	}

	/**
	 * Adds the data value, object, subobject, suboccurrence and portion defaults of an
	 * OccurrenceUsage (KerML Table 10, &sect;8.4.4.1; {@code checkOccurrenceUsageSuboccurrenceSpecialization},
	 * {@code checkOccurrenceUsageSnapshotSpecialization}, {@code checkOccurrenceUsageTimeSliceSpecialization},
	 * SysML &sect;8.4.5).
	 */
	private static Outcome occurrenceUsageSpecializations(OccurrenceUsage occurrence, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (hasDataType(occurrence, context)) {
			SpecializationHelper.addMappedSubsetting(result, occurrence, "dataValue");
		}
		if (hasStructureType(occurrence, context)) {
			if (isSubobject(occurrence, context)) {
				SpecializationHelper.addMappedSubsetting(result, occurrence, "subobject");
			} else {
				SpecializationHelper.addMappedSubsetting(result, occurrence, "object");
			}
		} else if (isSuboccurrence(occurrence, context)) {
			SpecializationHelper.addMappedSubsetting(result, occurrence, "suboccurrence");
		}
		if (occurrence.getPortionKind() == PortionKind.SNAPSHOT) {
			SpecializationHelper.addMappedSubsetting(result, occurrence, "snapshot");
		} else if (occurrence.getPortionKind() == PortionKind.TIMESLICE) {
			SpecializationHelper.addMappedSubsetting(result, occurrence, "timeslice");
		}
		return Outcome.APPLIED;
	}

	/**
	 * Specializes the life of an individual OccurrenceDefinition
	 * ({@code checkOccurrenceDefinitionIndividualSpecialization}, SysML &sect;8.3.9).
	 * <p>
	 * SysML §8.3.9.3, {@code checkOccurrenceDefinitionIndividualSpecialization}: "An
	 * OccurrenceDefinition with isIndividual = true must directly or indirectly specialize
	 * Occurrences::Life from the Kernel Semantic Library."
	 */
	private static Outcome individualSpecialization(OccurrenceDefinition occurrence, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!occurrence.isIndividual()) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMapped(result, occurrence, SpecializationHelper.defaultKind(occurrence), "life");
		return Outcome.APPLIED;
	}

	/**
	 * SysML §8.3.9.4, {@code checkOccurrenceUsageSpecialization}: "An OccurrenceUsage must directly or
	 * indirectly specialize Occurrences::occurrences from the Kernel Semantic Library."
	 */
	private static String occurrenceUsageKey(OccurrenceUsage occurrence,
			ImplicitSpecializationEvaluationContext context) {
		return "base";
	}
}
