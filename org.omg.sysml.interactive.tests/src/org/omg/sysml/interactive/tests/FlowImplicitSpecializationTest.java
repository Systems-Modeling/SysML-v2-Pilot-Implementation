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
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Behavior-contract regression tests for the implicit-specialization defaults
 * applied to {@link FlowUsage} (SysML Table 32 &sect;8.4.1, per-branch
 * citations in &sect;8.4.12 "Flows Semantics"), plus the {@code defaultKey}
 * switch's {@code caseFlowUsage} (message vs. base). Checks the raw candidate
 * through {@link TypeUtil#getImplicitGeneralTypesFor(Type)} before
 * transformation, then transforms and checks the same expectation against
 * the materialized {@code getOwnedSpecialization()}.
 *
 * <p>Not covered here: the {@code defaultKey} switch's {@code caseFlow} case
 * (a plain KerML {@code Flow}, distinct from {@code FlowUsage}) — no textual
 * SysML construct was found that produces a bare {@code Flow} rather than a
 * {@code FlowUsage} (which, since {@code FlowUsage extends ... Flow}, always
 * dispatches to the more specific {@code caseFlowUsage} case first); skipped
 * rather than force a synthetic, non-representative model.</p>
 */
public class FlowImplicitSpecializationTest extends AbstractImplicitSpecializationTest {

	/**
	 * A {@code flow} nested directly inside an {@link org.omg.sysml.lang.sysml.ActionUsage}
	 * (an {@code OccurrenceUsage} subtype, not a {@code Definition}) gets both
	 * the "suboccurrence" default (owner is an {@code OccurrenceUsage}) and the
	 * generic "subaction" fallback (owner is also an {@code ActionUsage}) as
	 * raw candidates — these are independent, cumulative rules, not an
	 * else-if chain.
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
				""");
		FlowUsage flow = findSingle(resource, FlowUsage.class);
		var candidates = TypeUtil.getImplicitGeneralTypesFor(flow);
		assertContains(candidates, "Occurrences::Occurrence::suboccurrences");
		assertContains(candidates, "Actions::Action::subactions");

		// After reduction, "suboccurrences" stays a raw candidate but is not
		// materialized: Actions::Action::subactions subsets
		// Performances::Performance::subperformances, which itself subsets
		// (via "intersects", Performances.kerml) Occurrences::Occurrence::
		// suboccurrences, so the more specific subactions edge alone is
		// inserted (KerML &sect;8.4.2 — a more specific implied relationship
		// subsumes a less specific one, which is then not inserted). This
		// reduction is identical on the pre-refactoring adapter mechanism,
		// since it is driven entirely by the standard library's own
		// subsetting/intersecting chain, not by which engine computes the
		// candidates.
		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(flow, "Actions::Action::subactions");
	}

	/**
	 * A {@code flow} nested directly inside a {@code part def} (a
	 * {@code PartDefinition}, satisfying {@code isPartOwnedComposite} but not
	 * {@code isActionOwnedComposite} since a {@code Definition} is not an
	 * {@code OccurrenceUsage}/{@code ActionUsage}) gets the "owned action"
	 * fallback (SysML Table 32, &sect;8.4.13), subsetting
	 * {@code Parts::Part::ownedActions}.
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
				""");
		FlowUsage flow = findSingle(resource, FlowUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(flow), "Parts::Part::ownedActions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(flow, "Parts::Part::ownedActions");
	}

	/**
	 * A {@code message} declaration is a {@link FlowUsage} for which
	 * {@code UsageUtil.isMessageConnection} holds, giving it the "message"
	 * key (SysML Table 32 &sect;8.4.1), subsetting {@code Flows::messages} —
	 * as opposed to a plain {@code flow} declaration between two ports, which
	 * stays on the "base" key, subsetting {@code Flows::flows}.
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
				""");
		FlowUsage flow = findSingle(plainFlow, FlowUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(flow), "Flows::flows");
		ElementUtil.transformAll(plainFlow, true);
		assertOwnedSpecializationContains(flow, "Flows::flows");

		Resource messageFlow = parse("flow-message.sysml", """
				item def Signal;
				part def Sender {
					action a { out o : Signal; }
					action b { in i : Signal; }
					message m of Signal from a.o to b.i;
				}
				""");
		FlowUsage message = findByName(messageFlow, "m", FlowUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(message), "Flows::messages");
		ElementUtil.transformAll(messageFlow, true);
		assertOwnedSpecializationContains(message, "Flows::messages");
	}

}
