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
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.EventOccurrenceUsage;
import org.omg.sysml.lang.sysml.Flow;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.util.ElementUtil;

/**
 * Tests the default-key selection of the {@code DEFAULT_KEY} rules for relationship-like types.
 * <p>
 * Each test checks the raw candidates of the public {@link ImplicitSpecializationService}
 * before transformation, then the materialized {@code getOwnedSpecialization()} after it.
 */
public class DefaultKeyRelationshipImplicitSpecializationTest extends AbstractImplicitSpecializationTest{

	/**
	 * {@code caseAssociation}: an Association with exactly two owned end
	 * features picks "binary" ({@code checkAssociationBinarySpecialization},
	 * KerML Table 10 &sect;8.4.4.1), else "base"
	 * ({@code checkAssociationSpecialization}).
	 */
	@Test
	public void associationBinaryVsBase() throws Exception {
		Resource resource = parse("association.kerml", """
				assoc Unary { end feature a; }
				assoc Binary { end feature a; end feature b; }
				""", true);
		Association unary = findByName(resource, "Unary", Association.class);
		Association binary = findByName(resource, "Binary", Association.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(unary), "Links::Link");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(binary), "Links::BinaryLink");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(unary, "Links::Link");
		assertOwnedSpecializationContains(binary, "Links::BinaryLink");
	}

	/**
	 * {@code caseConnector}: a plain KerML Connector combines "2 ends" with
	 * {@code hasStructureType} to pick "binary"/"object"/"binaryObject"/"base"
	 * ({@code checkConnectorSpecialization} and its binary/object/binaryObject
	 * variants, KerML Table 10 &sect;8.4.4.1).
	 */
	@Test
	public void connectorCombinesEndCountAndStructureType() throws Exception {
		// struct S;
		// struct P {
		//     feature a; feature b; feature e;
		//     connector base3 (a, b, e);
		//     connector binary from a to b;
		//     connector object : S (a, b, e);
		//     connector binaryObject : S from a to b;
		// }
		Resource resource = parse("connector.kerml", """
				struct S;
				struct P {
					feature a; feature b; feature e;
					connector base3 (a, b, e);
					connector binary from a to b;
					connector object : S (a, b, e);
					connector binaryObject : S from a to b;
				}
				""", true);
		Connector base3 = findByName(resource, "base3", Connector.class);
		Connector binary = findByName(resource, "binary", Connector.class);
		Connector object = findByName(resource, "object", Connector.class);
		Connector binaryObject = findByName(resource, "binaryObject", Connector.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(base3), "Links::links");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(binary), "Links::binaryLinks");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(object), "Objects::linkObjects");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(binaryObject), "Objects::binaryLinkObjects");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(base3, "Links::links");
		assertOwnedSpecializationContains(binary, "Links::binaryLinks");
		assertOwnedSpecializationContains(object, "Objects::linkObjects");
		assertOwnedSpecializationContains(binaryObject, "Objects::binaryLinkObjects");
	}

	/**
	 * {@code caseConnectionDefinition} and {@code caseFlowDefinition}: both
	 * pick "binary" with exactly two owned end features
	 * ({@code checkConnectionDefinitionBinarySpecialization},
	 * {@code checkFlowDefinitionBinarySpecialization}, SysML Table 31
	 * &sect;8.4.1), else "base".
	 */
	@Test
	public void connectionAndFlowDefinitionBinaryVsBase() throws Exception {
		// connection def Unary { end item a; }
		// connection def Binary { end item a; end item b; }
		Resource resource = parse("connectiondef.sysml", """
				connection def Unary { end item a; }
				connection def Binary { end item a; end item b; }
				""", true);
		Type unary = findByName(resource, "Unary", Type.class);
		Type binary = findByName(resource, "Binary", Type.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(unary), "Connections::Connection");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(binary), "Connections::BinaryConnection");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(unary, "Connections::Connection");
		assertOwnedSpecializationContains(binary, "Connections::BinaryConnection");
	}

	/**
	 * {@code caseMultiplicity}: a textual multiplicity is a {@code MultiplicityRange}; one owned
	 * by a Feature ({@code part p[1..3];}) specializes {@code Base::naturals}.
	 * <p>
	 * TODO: cover a multiplicity owned by a Classifier (the "classifier" key); no textual form
	 * was found for it ({@code part def P[2..5];} does not parse).
	 */
	@Test
	public void multiplicityOwnedByFeature() throws Exception {
		// part p[1..3];
		Resource resource = parse("multiplicity.sysml", """
				part p[1..3];
				""", true);
		Multiplicity featureOwned = findSingleWhere(resource, Multiplicity.class,
				m -> m.getOwner() instanceof org.omg.sysml.lang.sysml.Feature);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(featureOwned), "Base::naturals");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(featureOwned, "Base::naturals");
	}

	/**
	 * {@code caseTransitionUsage}: a composite transition under a
	 * {@code StateDefinition}/{@code StateUsage} whose source is a
	 * {@code StateUsage} picks "stateTransition"
	 * ({@code checkTransitionUsageStateSpecialization}, SysML Table 31
	 * &sect;8.4.1, narrated at &sect;8.4.14.3 Transition Usages).
	 */
	@Test
	public void stateOwnedTransitionPicksStateTransition() throws Exception {
		// attribute def Signal;
		// state def Machine {
		//     state off;
		//     state starting;
		//     transition t1 first off accept Signal then starting;
		// }
		Resource resource = parse("statetransition.sysml", """
				attribute def Signal;
				state def Machine {
					state off;
					state starting;
					transition t1 first off accept Signal then starting;
				}
				""", true);
		TransitionUsage transition = findByName(resource, "t1", TransitionUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(transition), "States::StateAction::stateTransitions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(transition, "States::StateAction::stateTransitions");
	}

	/**
	 * {@code caseEventOccurrenceUsage}: an {@code event} usage owned by an
	 * {@code OccurrenceDefinition}/{@code OccurrenceUsage} (here a
	 * {@code part def}, itself an Occurrence) picks "suboccurrence"
	 * ({@code checkEventOccurrenceUsageSpecialization}, SysML Table 32
	 * &sect;8.4.1).
	 */
	@Test
	public void eventOccurrenceOwnedByOccurrenceDefinitionGetsSuboccurrence() throws Exception {
		// part def P { event occurrence e; }
		Resource resource = parse("event.sysml", """
				part def P {
					event occurrence e;
				}
				""", true);
		EventOccurrenceUsage event = findByName(resource, "e", EventOccurrenceUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(event), "Occurrences::Occurrence::timeEnclosedOccurrences");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(event, "Occurrences::Occurrence::timeEnclosedOccurrences");
	}

	/**
	 * {@code caseFlow}: a plain KerML {@code Flow} (distinct from
	 * {@code FlowUsage}) with owned end features picks "flow"
	 * ({@code checkFlowWithEndsSpecialization}, KerML Table 10 &sect;8.4.4.1),
	 * else "base" ({@code checkFlowSpecialization}).
	 */
	@Test
	public void flowWithEndsVsWithoutEnds() throws Exception {
		// struct S {
		//     end feature a; end feature b;
		//     flow noEnds;
		//     flow withEnds from a to b;
		// }
		Resource resource = parse("flow.kerml", """
				struct S {
					end feature a; end feature b;
					flow noEnds;
					flow withEnds from a to b;
				}
				""", true);
		Flow noEnds = findByName(resource, "noEnds", Flow.class);
		Flow withEnds = findByName(resource, "withEnds", Flow.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(noEnds), "Transfers::transfers");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(withEnds), "Transfers::flowTransfers");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(noEnds, "Transfers::transfers");
		assertOwnedSpecializationContains(withEnds, "Transfers::flowTransfers");
	}

}
