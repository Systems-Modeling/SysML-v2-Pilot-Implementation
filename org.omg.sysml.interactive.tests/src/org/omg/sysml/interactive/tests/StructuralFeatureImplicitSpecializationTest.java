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
package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.IfActionUsage;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.logic.implicit.specialization.api.ImplicitSpecialization;
import org.omg.sysml.util.ElementUtil;

/**
 * Tests the additional structural defaults of Features: bound-value and participant
 * subsettings, and ownership-conditioned library defaults.
 * <p>
 * Each test checks the raw candidates of the public {@link ImplicitSpecializationService}
 * before transformation, then the materialized {@code getOwnedSpecialization()} after it.
 */
public class StructuralFeatureImplicitSpecializationTest extends AbstractImplicitSpecializationTest{

	/**
	 * A directionless, non-default valued Feature with no explicit specialization subsets the
	 * result of its value Expression ({@code checkFeatureValuationSpecialization}, KerML
	 * &sect;8.4.4.11). The general is a synthesized chain, so the test checks for a Feature
	 * general distinct from the attribute default rather than a qualified name.
	 */
	@Test
	public void nonDefaultValuedFeatureSubsetsItsValueExpressionResult() throws Exception {
		// attribute def A;
		// part def P {
		//     attribute x = 1;
		// }
		Resource resource = parse("boundvalue.sysml", """
				part def P {
					attribute x = 1;
				}
				""", true);
		Feature x = findByName(resource, "x", Feature.class);
		var candidates =  getImplicitSpecializationService().getImplicitSpecializationCandidates(x);
		boolean hasChainSubsetting = candidates.stream()
				.anyMatch(candidate -> candidate.specializationKind() == SysMLPackage.Literals.SUBSETTING
						&& candidate.generalType() instanceof Feature general
						&& !general.getOwnedFeatureChaining().isEmpty());
		assertTrue("Expected a feature-chain Subsetting among " + describe(candidates), hasChainSubsetting);

		ElementUtil.transformAll(resource, true);
		boolean materializedChainSubsetting = x.getOwnedSpecialization().stream()
				.anyMatch(specialization -> specialization.eClass() == SysMLPackage.Literals.SUBSETTING
						&& specialization.getGeneral() instanceof Feature general
						&& !general.getOwnedFeatureChaining().isEmpty());
		assertTrue("Expected a materialized feature-chain Subsetting among " + x.getOwnedSpecialization(),
				materializedChainSubsetting);
	}

	/**
	 * An end Feature of a Connector without redefinition subsets {@code Links::Link::participant}
	 * ({@code checkFeatureEndSpecialization}, KerML &sect;8.3.3.3.4). The connector has three
	 * ends: the ends of a binary connector redefine {@code source} and {@code target}, which
	 * suppresses this rule.
	 */
	@Test
	public void connectorEndSubsetsTheStandardParticipant() throws Exception {
		// connection def Link { end item a; end item b; end item c; }
		Resource resource = parse("participant.sysml", """
				connection def Link {
					end item a;
					end item b;
					end item c;
				}
				""", true);
		Feature a = findByName(resource, "a", Feature.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(a), "Links::Link::participant");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(a, "Links::Link::participant");
	}

	/**
	 * A composite {@code ConstraintUsage} nested under an {@code ItemDefinition}
	 * subsets {@code Items::Item::checkedConstraints}.
	 * {@code checkConstraintUsageCheckedConstraintSpecialization} (SysML Table 32,
	 * &sect;8.4.1; narrated &sect;8.4.6 "Items Semantics").
	 */
	@Test
	public void checkedConstraintUnderAnItemGetsTheCheckedConstraintDefault() throws Exception {
		// item def I {
		//     constraint c { 1 == 1 }
		// }
		Resource resource = parse("checkedconstraint.sysml", """
				item def I {
					constraint c { 1 == 1 }
				}
				""", true);
		ConstraintUsage c = findByName(resource, "c", ConstraintUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(c), "Items::Item::checkedConstraints");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c, "Items::Item::checkedConstraints");
	}

	// TODO: cover the "subobject" default of a PortUsage (isStructureOwnedComposite). A "port p;"
	// nested in a "part def" is not composite, and no textual form of a composite port was found.

	/**
	 * A composite {@code ConnectionUsage} owned by an {@code ItemDefinition}
	 * counts as a "subitem" ({@code isSubitem}), giving it the "subpart" default
	 * ({@code checkPartUsageSubpartSpecialization}, reused for
	 * {@code ConnectionUsage} because it is also a {@code PartUsage}; SysML
	 * Table 32 &sect;8.4.1).
	 */
	@Test
	public void connectionOwnedByAnItemGetsTheSubpartDefault() throws Exception {
		// item def I {
		//     connection c;
		// }
		Resource resource = parse("subpart.sysml", """
				item def I {
					connection c;
				}
				""", true);
		ConnectionUsage c = findByName(resource, "c", ConnectionUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(c), "Items::Item::subparts");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c, "Items::Item::subparts");
	}

	/**
	 * An {@code IfActionUsage} with an {@code else} branch gets
	 * {@code checkIfActionUsageSpecialization}'s "has an else clause" outcome,
	 * subsetting {@code Actions::ifThenElseActions} (SysML Table 32, &sect;8.4.1;
	 * narrated &sect;8.4.13 "Actions Semantics").
	 */
	@Test
	public void ifActionWithElseGetsTheIfThenElseDefault() throws Exception {
		// action def A {
		//     attribute x : ScalarValues::Integer = 1;
		//     if x == 1 {
		//         action B1;
		//     } else {
		//         action B2;
		//     }
		// }
		Resource resource = parse("ifthenelse.sysml", """
				action def A {
					attribute x : ScalarValues::Integer = 1;
					if x == 1 {
						action B1;
					} else {
						action B2;
					}
				}
				""", true);
		IfActionUsage ifAction = findSingle(resource, IfActionUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(ifAction), "Actions::ifThenElseActions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(ifAction, "Actions::ifThenElseActions");
	}

	/**
	 * A {@code PerformActionUsage} owned by a {@code PartDefinition} gets the
	 * "performedAction" default, {@code Parts::Part::performedActions}
	 * ({@code checkPerformActionUsageSpecialization}, SysML Table 32, &sect;8.4.1).
	 */
	@Test
	public void performActionOwnedByAPartGetsThePerformedActionDefault() throws Exception {
		// action def A;
		// part def P {
		//     action a : A;
		//     perform a;
		// }
		Resource resource = parse("performedaction.sysml", """
				action def A;
				part def P {
					action a : A;
					perform a;
				}
				""", true);
		PerformActionUsage perform = findSingle(resource, PerformActionUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(perform), "Parts::Part::performedActions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(perform, "Parts::Part::performedActions");
	}

	/**
	 * A composite {@code ConcernUsage} nested directly under a
	 * {@code RequirementDefinition} (not via a {@code require}/{@code assume}
	 * constraint membership) counts as a subrequirement
	 * ({@code UsageUtil.isSubrequirement}), resolving through
	 * {@code RequirementUsageImpl}'s "subrequirement" map entry to
	 * {@code Requirements::RequirementCheck::subrequirements}
	 * ({@code checkRequirementUsageSubrequirementSpecialization}, SysML Table 32,
	 * &sect;8.4.1).
	 */
	@Test
	public void concernNestedUnderARequirementGetsTheSubrequirementDefault() throws Exception {
		// requirement def R {
		//     concern c;
		// }
		Resource resource = parse("subrequirement.sysml", """
				requirement def R {
					concern c;
				}
				""", true);
		ConcernUsage c = findByName(resource, "c", ConcernUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(c), "Requirements::RequirementCheck::subrequirements");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c, "Requirements::RequirementCheck::subrequirements");
	}

	private static String describe(List<ImplicitSpecialization> candidates) {
		return candidates.stream()
				.map(candidate -> candidate.specializationKind().getName() + " -> " + candidate.generalType())
				.toList().toString();
	}
}
