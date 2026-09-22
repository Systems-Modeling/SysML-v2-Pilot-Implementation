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

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.FlowUsage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.util.ElementUtil;

/**
 * Tests the implicit-specialization defaults of {@link FlowUsage} (SysML Table 32,
 * &sect;8.4.12).
 * <p>
 * Each test checks the raw candidates of the public {@link ImplicitSpecializationService}
 * before transformation, then the materialized {@code getOwnedSpecialization()} after it.
 * <p>
 * Not covered: the default key of a plain KerML {@code Flow}; every textual SysML flow is a
 * {@code FlowUsage}.
 */
public class FlowImplicitSpecializationTest extends AbstractImplicitSpecializationTest {

	/**
	 * A {@code flow} nested in an {@link org.omg.sysml.lang.sysml.ActionUsage} gets both the
	 * "suboccurrence" default and the {@code checkActionUsageSubactionSpecialization} default:
	 * these rules are cumulative.
	 */
	@Test
	public void flowOwnedByAnActionUsageGetsBothSuboccurrenceAndSubaction() throws Exception {
		// item def Image;
		// action def A {
		//     action focus { out image : Image; }
		//     action shoot { in image : Image; }
		// }
		// action a : A {
		//     flow from focus.image to shoot.image;
		// }
		Resource resource = parse("flow-suboccurrence.sysml", """
				item def Image;
				action def A {
					action focus { out image : Image; }
					action shoot { in image : Image; }
				}
				action a : A {
					flow from focus.image to shoot.image;
				}
				""", true);
		FlowUsage flow = findSingle(resource, FlowUsage.class);
		var candidates =  getImplicitSpecializationService().getImplicitSpecializationCandidates(flow);
		assertContains(candidates, "Occurrences::Occurrence::suboccurrences");
		assertContains(candidates, "Actions::Action::subactions");

		// After reduction, "suboccurrences" stays a raw candidate but is not
		// materialized: Actions::Action::subactions subsets
		// Performances::Performance::subperformances, which itself subsets
		// (via "intersects", Performances.kerml) Occurrences::Occurrence::
		// suboccurrences, so the more specific subactions edge alone is
		// inserted (KerML &sect;8.4.2 — a more specific implied relationship
		// subsumes a less specific one, which is then not inserted).
		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(flow, "Actions::Action::subactions");
	}

	/**
	 * A {@code flow} nested in a {@code part def} gets the
	 * {@code checkActionUsageOwnedActionSpecialization} default (SysML Table 32, &sect;8.4.13),
	 * subsetting {@code Parts::Part::ownedActions}.
	 */
	@Test
	public void flowOwnedByAPartDefinitionGetsTheOwnedActionDefault() throws Exception {
		// item def Image;
		// action def Focus { out image : Image; }
		// action def Shoot { in image : Image; }
		// part def Camera {
		//     action focus : Focus;
		//     action shoot : Shoot;
		//     flow from focus.image to shoot.image;
		// }
		Resource resource = parse("flow-ownedaction.sysml", """
				item def Image;
				action def Focus { out image : Image; }
				action def Shoot { in image : Image; }
				part def Camera {
					action focus : Focus;
					action shoot : Shoot;
					flow from focus.image to shoot.image;
				}
				""", true);
		FlowUsage flow = findSingle(resource, FlowUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(flow), "Parts::Part::ownedActions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(flow, "Parts::Part::ownedActions");
	}

	/**
	 * A {@code message} declaration is a {@link FlowUsage} for which
	 * {@code UsageUtil.isMessageConnection} holds, giving it
	 * {@code checkFlowUsageSpecialization}'s "message" key (SysML Table 32
	 * &sect;8.4.1), subsetting {@code Flows::messages} — as opposed to a plain
	 * {@code flow} declaration between two ports, which stays on the "base"
	 * key, subsetting {@code Flows::flows}.
	 */
	@Test
	public void messageDeclarationGetsTheMessageDefaultAndPlainFlowGetsBase() throws Exception {
		// item def Image;
		// part def Camera {
		//     port p1;
		//     port p2;
		//     flow p1 to p2;
		// }
		// item def Signal;
		// part def Sender {
		//     action a { out o : Signal; }
		//     action b { in i : Signal; }
		//     message m of Signal from a.o to b.i;
		// }
		Resource plainFlow = parse("flow-base.sysml", """
				item def Image;
				part def Camera {
					port p1;
					port p2;
					flow p1 to p2;
				}
				""", true);
		FlowUsage flow = findSingle(plainFlow, FlowUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(flow), "Flows::flows");
		ElementUtil.transformAll(plainFlow, true);
		assertOwnedSpecializationContains(flow, "Flows::flows");

		Resource messageFlow = parse("flow-message.sysml", """
				item def Signal;
				part def Sender {
					action a { out o : Signal; }
					action b { in i : Signal; }
					message m of Signal from a.o to b.i;
				}
				""", true);
		FlowUsage message = findByName(messageFlow, "m", FlowUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(message), "Flows::messages");
		ElementUtil.transformAll(messageFlow, true);
		assertOwnedSpecializationContains(message, "Flows::messages");
	}

}
