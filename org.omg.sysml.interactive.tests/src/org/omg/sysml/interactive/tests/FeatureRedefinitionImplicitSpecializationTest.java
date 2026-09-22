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

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AssignmentActionUsage;
import org.omg.sysml.lang.sysml.ConnectionDefinition;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.util.ElementUtil;

/**
 * Tests the implied redefinitions computed by the rules of the {@code REDEFINITION} family.
 * <p>
 * Each test checks the raw candidates of the public {@link ImplicitSpecializationService}
 * before transformation, then the materialized {@code getOwnedRedefinition()} after it.
 */
public class FeatureRedefinitionImplicitSpecializationTest extends AbstractImplicitSpecializationTest {

	/**
	 * SysML §8.4.13.7 Assignment Action Usages: the assignment's target
	 * parameter (first owned parameter) must redefine
	 * {@code Actions::AssignmentAction::target::startingAt}
	 * (checkAssignmentActionUsageStartingAtRedefinition), its nested feature
	 * must redefine {@code ...::startingAt::accessedFeature}
	 * (checkAssignmentActionUsageAccessedFeatureRedefinition), and that same
	 * accessed feature must also redefine the assignment's own referent
	 * (checkAssignmentActionReferentRedefinition).
	 */
	@Test
	public void assignmentActionRedefinesStartingAtAndAccessedFeature() throws Exception {
		// attribute def Counter;
		// part def C {
		//     attribute count : Counter;
		//     action incr {
		//         assign count := count;
		//     }
		// }
		Resource resource = parse("assignment.sysml", """
				attribute def Counter;
				part def C {
					attribute count : Counter;
					action incr {
						assign count := count;
					}
				}
				""", true);
		AssignmentActionUsage assignment = findSingle(resource, AssignmentActionUsage.class);
		Feature target = assignment.getParameter().get(0);
		Feature startingAt = target.getOwnedFeature().get(0);
		Feature accessedFeature = startingAt.getOwnedFeature().get(0);

		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(startingAt),
				"FeatureReferencingPerformances::FeatureAccessPerformance::onOccurrence::startingAt");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(accessedFeature),
				"FeatureReferencingPerformances::FeatureAccessPerformance::onOccurrence::startingAt::accessedFeature");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(accessedFeature),
				assignment.getReferent().getQualifiedName());

		ElementUtil.transformAll(resource, true);
		assertOwnedRedefinitionContains(startingAt,
				"FeatureReferencingPerformances::FeatureAccessPerformance::onOccurrence::startingAt");
		assertOwnedRedefinitionContains(accessedFeature,
				"FeatureReferencingPerformances::FeatureAccessPerformance::onOccurrence::startingAt::accessedFeature");
		assertOwnedRedefinitionContains(accessedFeature, assignment.getReferent().getQualifiedName());
	}

	/**
	 * SysML §8.4.14 States Semantics, checkActionUsageStateActionRedefinition:
	 * a state's entry/do/exit action must redefine
	 * {@code States::StateAction::entryAction}/{@code doAction}/{@code exitAction}.
	 */
	@Test
	public void stateEntryDoExitActionsRedefineTheStandardStateActions() throws Exception {
		// state def S {
		//     entry action a;
		//     do action b;
		//     exit action c;
		// }
		Resource resource = parse("stateactions.sysml", """
				state def S {
					entry action a;
					do action b;
					exit action c;
				}
				""", true);
		ActionUsage entry = findByName(resource, "a", ActionUsage.class);
		ActionUsage doAction = findByName(resource, "b", ActionUsage.class);
		ActionUsage exit = findByName(resource, "c", ActionUsage.class);

		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(entry), "States::StateAction::entryAction");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(doAction), "States::StateAction::doAction");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(exit), "States::StateAction::exitAction");

		ElementUtil.transformAll(resource, true);
		assertOwnedRedefinitionContains(entry, "States::StateAction::entryAction");
		assertOwnedRedefinitionContains(doAction, "States::StateAction::doAction");
		assertOwnedRedefinitionContains(exit, "States::StateAction::exitAction");
	}

	/**
	 * SysML §8.4.14.3 Transition Usages, checkTransitionUsageTransitionFeatureSpecialization:
	 * a transition's trigger/guard/effect must specialize the accepter/guard/
	 * effect features of {@code Actions::TransitionAction}.
	 */
	@Test
	public void transitionTriggerGuardAndEffectRedefineTheStandardTransitionFeatures() throws Exception {
		// attribute def Sig;
		// part p;
		// state def S {
		//     state s1;
		//     state s2;
		//     transition t1 first s1 accept sig : Sig if true do send sig to p then s2;
		// }
		Resource resource = parse("transitionfeatures.sysml", """
				attribute def Sig;
				part p;
				state def S {
					state s1;
					state s2;
					transition t1 first s1 accept sig : Sig if true do send sig to p then s2;
				}
				""", true);
		TransitionUsage transition = findByName(resource, "t1", TransitionUsage.class);

		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(transition.getTriggerAction().get(0)),
				"Actions::TransitionAction::accepter");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(transition.getGuardExpression().get(0)),
				"TransitionPerformances::TransitionPerformance::guard");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(transition.getEffectAction().get(0)),
				"Actions::TransitionAction::effect");

		ElementUtil.transformAll(resource, true);
		assertOwnedRedefinitionContains(transition.getTriggerAction().get(0), "Actions::TransitionAction::accepter");
		assertOwnedRedefinitionContains(transition.getGuardExpression().get(0),
				"TransitionPerformances::TransitionPerformance::guard");
		assertOwnedRedefinitionContains(transition.getEffectAction().get(0), "Actions::TransitionAction::effect");
	}

	/**
	 * KerML §7.4.7.2 Behavior Declaration / SysML §7.17.2 Action Definitions
	 * and Usages: an owned parameter must, in order, redefine the parameter at
	 * the same position of each direct general. No explicit {@code redefines}
	 * is written here — the redefinition must be inferred purely from position.
	 */
	@Test
	public void subtypeParameterImplicitlyRedefinesSamePositionGeneralParameter() throws Exception {
		// action def A {
		//     in x;
		// }
		// action b : A {
		//     in y;
		// }
		Resource resource = parse("positionalparam.sysml", """
				action def A {
					in x;
				}
				action b : A {
					in y;
				}
				""", true);
		Feature x = findByName(resource, "x", Feature.class);
		Feature y = findByName(resource, "y", Feature.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(y), x.getQualifiedName());

		ElementUtil.transformAll(resource, true);
		assertOwnedRedefinitionContains(y, x.getQualifiedName());
	}

	/**
	 * KerML §8.4.4.5 Associations Semantics / §8.4.4.6 Connectors Semantics,
	 * checkFeatureEndRedefinition: an end feature must, in order, redefine the
	 * end feature at the same position of each direct general.
	 */
	@Test
	public void subtypeEndFeatureImplicitlyRedefinesSamePositionGeneralEndFeature() throws Exception {
		// connection def Link {
		//     end item a;
		//     end item b;
		// }
		// connection def Link2 :> Link {
		//     end item a2;
		//     end item b2;
		// }
		Resource resource = parse("positionalend.sysml", """
				connection def Link {
					end item a;
					end item b;
				}
				connection def Link2 :> Link {
					end item a2;
					end item b2;
				}
				""", true);
		ConnectionDefinition link2 = findByName(resource, "Link2", ConnectionDefinition.class);
		assertTrue(link2.getOwnedEndFeature().size() >= 2);
		Feature a = findByName(resource, "a", Feature.class);
		Feature b = findByName(resource, "b", Feature.class);
		Feature a2 = findByName(resource, "a2", Feature.class);
		Feature b2 = findByName(resource, "b2", Feature.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(a2), a.getQualifiedName());
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(b2), b.getQualifiedName());

		ElementUtil.transformAll(resource, true);
		assertOwnedRedefinitionContains(a2, a.getQualifiedName());
		assertOwnedRedefinitionContains(b2, b.getQualifiedName());
	}

	/**
	 * SysML §8.4.18 Cases Semantics, checkRequirementUsageObjectiveRedefinition:
	 * a case's objective requirement must redefine the objective requirement of
	 * each direct general case.
	 */
	@Test
	public void subtypeObjectiveImplicitlyRedefinesGeneralObjective() throws Exception {
		// case def C1 {
		//     objective obj1;
		// }
		// case def C2 :> C1 {
		//     objective obj2;
		// }
		Resource resource = parse("objective.sysml", """
				case def C1 {
					objective obj1;
				}
				case def C2 :> C1 {
					objective obj2;
				}
				""", true);
		RequirementUsage obj1 = findByName(resource, "obj1", RequirementUsage.class);
		RequirementUsage obj2 = findByName(resource, "obj2", RequirementUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(obj2), obj1.getQualifiedName());

		ElementUtil.transformAll(resource, true);
		assertOwnedRedefinitionContains(obj2, obj1.getQualifiedName());
	}
}
