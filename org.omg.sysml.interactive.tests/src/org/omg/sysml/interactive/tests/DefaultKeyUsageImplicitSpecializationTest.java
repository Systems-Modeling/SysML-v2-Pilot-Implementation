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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.AssertConstraintUsage;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.FlowUsage;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.ViewpointUsage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.util.ElementUtil;

/**
 * Tests the default-key selection of the {@code DEFAULT_KEY} rules for usages.
 * <p>
 * Each test checks the raw candidates of the public {@link ImplicitSpecializationService}
 * before transformation, then the materialized {@code getOwnedSpecialization()} after it.
 * <p>
 * TODO: cover {@code caseInvariant}; the KerML {@code inv} construct does not parse in a
 * {@code .sysml} resource.
 */
public class DefaultKeyUsageImplicitSpecializationTest extends AbstractImplicitSpecializationTest{

	/**
	 * {@code caseSatisfyRequirementUsage}: a bare {@code not satisfy} usage
	 * picks "negated" ({@code checkSatisfyRequirementUsageSpecialization},
	 * SysML Table 32 &sect;8.4.1), else "base".
	 */
	@Test
	public void satisfyRequirementNegatedVsBase() throws Exception {
		// requirement def R1;
		// requirement r1 : R1;
		// requirement r2 : R1;
		// part p;
		// satisfy r1 by p;
		// not satisfy r2 by p;
		Resource resource = parse("satisfy.sysml", """
				requirement def R1;
				requirement r1 : R1;
				requirement r2 : R1;
				part p;
				satisfy r1 by p;
				not satisfy r2 by p;
				""", true);
		List<SatisfyRequirementUsage> satisfies = new ArrayList<>();
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			var object = contents.next();
			if (object instanceof SatisfyRequirementUsage satisfy) {
				satisfies.add(satisfy);
			}
		}
		assertTrue("Expected exactly two SatisfyRequirementUsage, found " + satisfies.size(), satisfies.size() == 2);
		SatisfyRequirementUsage base = satisfies.get(0).isNegated() ? satisfies.get(1) : satisfies.get(0);
		SatisfyRequirementUsage negated = satisfies.get(0).isNegated() ? satisfies.get(0) : satisfies.get(1);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(base), "Requirements::satisfiedRequirementChecks");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(negated), "Requirements::notSatisfiedRequirementChecks");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(base, "Requirements::satisfiedRequirementChecks");
		assertOwnedSpecializationContains(negated, "Requirements::notSatisfiedRequirementChecks");
	}

	/**
	 * {@code caseAssertConstraintUsage}: {@code assert not} picks "negated"
	 * ({@code checkAssertConstraintUsageSpecialization}, SysML Table 32
	 * &sect;8.4.1), else "base".
	 */
	@Test
	public void assertConstraintNegatedVsBase() throws Exception {
		// constraint def C1;
		// assert C1;
		// assert not C1;
		Resource resource = parse("assert.sysml", """
				constraint def C1;
				assert C1;
				assert not C1;
				""", true);
		List<AssertConstraintUsage> asserts = new ArrayList<>();
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			var object = contents.next();
			if (object instanceof AssertConstraintUsage assertUsage) {
				asserts.add(assertUsage);
			}
		}
		assertTrue("Expected exactly two AssertConstraintUsage, found " + asserts.size(), asserts.size() == 2);
		AssertConstraintUsage base = asserts.get(0).isNegated() ? asserts.get(1) : asserts.get(0);
		AssertConstraintUsage negated = asserts.get(0).isNegated() ? asserts.get(0) : asserts.get(1);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(base), "Constraints::assertedConstraintChecks");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(negated), "Constraints::negatedConstraintChecks");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(base, "Constraints::assertedConstraintChecks");
		assertOwnedSpecializationContains(negated, "Constraints::negatedConstraintChecks");
	}

	/**
	 * {@code caseViewpointUsage}: a viewpoint owned by a
	 * {@code ViewDefinition}/{@code ViewUsage} picks "satisfied"
	 * ({@code checkViewpointUsageViewpointSatisfactionSpecialization}, SysML
	 * Table 32 &sect;8.4.1, &sect;8.3.26.9), else "base".
	 */
	@Test
	public void viewpointOwnedByViewGetsSatisfied() throws Exception {
		// viewpoint def VP;
		// viewpoint topVp : VP;
		// view def V {
		//     viewpoint vp : VP;
		// }
		Resource resource = parse("viewpoint.sysml", """
				viewpoint def VP;
				viewpoint topVp : VP;
				view def V {
					viewpoint vp : VP;
				}
				""", true);
		ViewpointUsage topVp = findByName(resource, "topVp", ViewpointUsage.class);
		ViewpointUsage vp = findByName(resource, "vp", ViewpointUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(topVp), "Views::viewpointChecks");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(vp), "Views::View::viewpointSatisfactions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(topVp, "Views::viewpointChecks");
		assertOwnedSpecializationContains(vp, "Views::View::viewpointSatisfactions");
	}

	/**
	 * {@code caseRequirementUsage}: a composite requirement nested under a
	 * {@code RequirementDefinition}/{@code RequirementUsage} (and not a
	 * requirement/assumption constraint membership) picks "subrequirement"
	 * ({@code checkRequirementUsageSubrequirementSpecialization}, SysML Table
	 * 32 &sect;8.4.1), else "base".
	 */
	@Test
	public void requirementSubrequirementVsBase() throws Exception {
		// requirement def R {
		//     requirement sub;
		// }
		// requirement topReq;
		Resource resource = parse("requirement.sysml", """
				requirement def R {
					requirement sub;
				}
				requirement topReq;
				""", true);
		RequirementUsage sub = findByName(resource, "sub", RequirementUsage.class);
		RequirementUsage topReq = findByName(resource, "topReq", RequirementUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(sub), "Requirements::RequirementCheck::subrequirements");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(topReq), "Requirements::requirementChecks");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(sub, "Requirements::RequirementCheck::subrequirements");
		assertOwnedSpecializationContains(topReq, "Requirements::requirementChecks");
	}

	/**
	 * {@code caseRenderingUsage}: a rendering nested under a
	 * {@code RenderingDefinition}/{@code RenderingUsage} picks "subrendering"
	 * ({@code checkRenderingUsageSubrenderingSpecialization}, SysML Table 32
	 * &sect;8.4.1), else "base".
	 */
	@Test
	public void renderingSubrenderingVsBase() throws Exception {
		// rendering def R {
		//     rendering sub;
		// }
		// rendering topRendering : R;
		Resource resource = parse("rendering.sysml", """
				rendering def R {
					rendering sub;
				}
				rendering topRendering : R;
				""", true);
		RenderingUsage sub = findByName(resource, "sub", RenderingUsage.class);
		RenderingUsage topRendering = findByName(resource, "topRendering", RenderingUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(sub), "Views::Rendering::subrenderings");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(topRendering), "Views::renderings");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(sub, "Views::Rendering::subrenderings");
		assertOwnedSpecializationContains(topRendering, "Views::renderings");
	}

	/**
	 * {@code caseViewUsage}: a view nested under a
	 * {@code ViewDefinition}/{@code ViewUsage} picks "subview"
	 * ({@code checkViewUsageSubviewSpecialization}, SysML Table 32 &sect;8.4.1),
	 * else "base".
	 */
	@Test
	public void viewSubviewVsBase() throws Exception {
		// view def V {
		//     view sub : V;
		// }
		Resource resource = parse("view.sysml", """
				view def V {
					view sub : V;
				}
				""", true);
		ViewUsage sub = findByName(resource, "sub", ViewUsage.class);
		Type v = findByName(resource, "V", Type.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(sub), "Views::View::subviews");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(v), "Views::View");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(sub, "Views::View::subviews");
		assertOwnedSpecializationContains(v, "Views::View");
	}

	/**
	 * {@code casePortUsage}: a port owned by a
	 * {@code PartDefinition}/{@code PartUsage} picks "ownedPort"
	 * ({@code checkPortUsageOwnedPortSpecialization}, SysML Table 32
	 * &sect;8.4.1); a composite port owned by a
	 * {@code PortDefinition}/{@code PortUsage} picks "subport"
	 * ({@code checkPortUsageSubportSpecialization}).
	 */
	@Test
	public void portOwnedPortVsSubport() throws Exception {
		// port def PD {
		//     port sub;
		// }
		// part def P {
		//     port p : PD;
		// }
		Resource resource = parse("port.sysml", """
				port def PD {
					port sub;
				}
				part def P {
					port p : PD;
				}
				""", true);
		PortUsage sub = findByName(resource, "sub", PortUsage.class);
		PortUsage p = findByName(resource, "p", PortUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(sub), "Ports::Port::subports");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(p), "Parts::Part::ownedPorts");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(sub, "Ports::Port::subports");
		assertOwnedSpecializationContains(p, "Parts::Part::ownedPorts");
	}

	/**
	 * {@code casePartUsage}: an {@code actor}/{@code stakeholder} parameter
	 * owned by a {@code RequirementDefinition}/{@code RequirementUsage} picks
	 * "requirementActor"/"requirementStakeholder"
	 * ({@code checkPartUsageActorSpecialization},
	 * {@code checkPartUsageStakeholderSpecialization}, SysML Table 32
	 * &sect;8.4.1); an {@code actor} owned by a
	 * {@code CaseDefinition}/{@code CaseUsage} picks "caseActor".
	 */
	@Test
	public void partUsageActorAndStakeholderRoles() throws Exception {
		// part def Person;
		// requirement def R {
		//     actor driver : Person;
		//     stakeholder owner : Person;
		// }
		// case def Case1 {
		//     actor user : Person;
		// }
		Resource resource = parse("actor.sysml", """
				part def Person;
				requirement def R {
					actor driver : Person;
					stakeholder owner : Person;
				}
				case def Case1 {
					actor user : Person;
				}
				""", true);
		PartUsage driver = findByName(resource, "driver", PartUsage.class);
		PartUsage owner = findByName(resource, "owner", PartUsage.class);
		PartUsage user = findByName(resource, "user", PartUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(driver), "Requirements::RequirementCheck::actors");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(owner), "Requirements::RequirementCheck::stakeholders");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(user), "Cases::Case::actors");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(driver, "Requirements::RequirementCheck::actors");
		assertOwnedSpecializationContains(owner, "Requirements::RequirementCheck::stakeholders");
		assertOwnedSpecializationContains(user, "Cases::Case::actors");
	}

	/**
	 * {@code caseConnectionUsage}: a connection with exactly two owned end
	 * features picks "binary" ({@code checkConnectionUsageBinarySpecialization},
	 * SysML Table 32 &sect;8.4.1), else "base".
	 */
	@Test
	public void connectionUsageBinaryVsBase() throws Exception {
		// connection unary { end item a; }
		// connection binary1 { end item a; end item b; }
		Resource resource = parse("connectionusage.sysml", """
				connection unary { end item a; }
				connection binary1 { end item a; end item b; }
				""", true);
		ConnectionUsage unary = findByName(resource, "unary", ConnectionUsage.class);
		ConnectionUsage binary1 = findByName(resource, "binary1", ConnectionUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(unary), "Connections::connections");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(binary1), "Connections::binaryConnections");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(unary, "Connections::connections");
		assertOwnedSpecializationContains(binary1, "Connections::binaryConnections");
	}

	/**
	 * {@code caseItemUsage}: a composite item owned by an
	 * {@code ItemDefinition}/{@code ItemUsage} picks "subitem"
	 * ({@code checkItemUsageSubitemSpecialization}, SysML Table 32
	 * &sect;8.4.1), else "base".
	 */
	@Test
	public void itemUsageSubitemVsBase() throws Exception {
		// item def ID {
		//     item sub;
		// }
		// item topItem;
		Resource resource = parse("item.sysml", """
				item def ID {
					item sub;
				}
				item topItem;
				""", true);
		ItemUsage sub = findByName(resource, "sub", ItemUsage.class);
		ItemUsage topItem = findByName(resource, "topItem", ItemUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(sub), "Items::Item::subitems");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(topItem), "Items::items");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(sub, "Items::Item::subitems");
		assertOwnedSpecializationContains(topItem, "Items::items");
	}

	/**
	 * {@code caseFlowUsage}: a flow with no owned end features
	 * ({@code UsageUtil.isMessageConnection}) picks "message"
	 * ({@code checkFlowUsageFlowSpecialization} variant, SysML Table 32
	 * &sect;8.4.1), else "base".
	 */
	@Test
	public void flowUsageMessageVsBase() throws Exception {
		// part def P { port a; port b; }
		// part x : P; part y : P;
		// flow messageFlow;
		// flow endedFlow from x.a to y.b;
		Resource resource = parse("flowusage.sysml", """
				part def P { port a; port b; }
				part x : P; part y : P;
				flow messageFlow;
				flow endedFlow from x.a to y.b;
				""", true);
		FlowUsage messageFlow = findByName(resource, "messageFlow", FlowUsage.class);
		FlowUsage endedFlow = findByName(resource, "endedFlow", FlowUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(messageFlow), "Flows::messages");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(endedFlow), "Flows::flows");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(messageFlow, "Flows::messages");
		assertOwnedSpecializationContains(endedFlow, "Flows::flows");
	}

}
