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
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Behavior-contract regression tests for the "relationship-shaped" default
 * key selection: Association/Connector/ConnectionDefinition/FlowDefinition/
 * Multiplicity/TransitionUsage/EventOccurrenceUsage/Flow. Checks the raw
 * candidate through {@link TypeUtil#getImplicitGeneralTypesFor(Type)} before
 * transformation, then transforms and checks the same expectation against
 * the materialized {@code getOwnedSpecialization()}.
 */
public class DefaultKeyRelationshipImplicitSpecializationTest extends AbstractImplicitSpecializationTest{


	/**
	 * An Association with exactly two owned end features picks "binary"
	 * ({@code checkAssociationBinarySpecialization}, KerML Table 10
	 * &sect;8.4.4.1), else "base" ({@code checkAssociationSpecialization}).
	 */
	@Test
	public void associationBinaryVsBase() throws Exception {
		Resource resource = parse("association.kerml", """
				assoc Unary { end feature a; }
				assoc Binary { end feature a; end feature b; }
				""");
		Association unary = findByName(resource, "Unary", Association.class);
		Association binary = findByName(resource, "Binary", Association.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(unary), "Links::Link");
		assertContains(TypeUtil.getImplicitGeneralTypesFor(binary), "Links::BinaryLink");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(unary, "Links::Link");
		assertOwnedSpecializationContains(binary, "Links::BinaryLink");
	}

	/**
	 * A plain KerML Connector combines "2 ends" with structural typing to pick
	 * "binary"/"object"/"binaryObject"/"base" ({@code checkConnectorSpecialization}
	 * and its binary/object/binaryObject variants, KerML Table 10 &sect;8.4.4.1).
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
				""");
		Connector base3 = findByName(resource, "base3", Connector.class);
		Connector binary = findByName(resource, "binary", Connector.class);
		Connector object = findByName(resource, "object", Connector.class);
		Connector binaryObject = findByName(resource, "binaryObject", Connector.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(base3), "Links::links");
		assertContains(TypeUtil.getImplicitGeneralTypesFor(binary), "Links::binaryLinks");
		assertContains(TypeUtil.getImplicitGeneralTypesFor(object), "Objects::linkObjects");
		assertContains(TypeUtil.getImplicitGeneralTypesFor(binaryObject), "Objects::binaryLinkObjects");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(base3, "Links::links");
		assertOwnedSpecializationContains(binary, "Links::binaryLinks");
		assertOwnedSpecializationContains(object, "Objects::linkObjects");
		assertOwnedSpecializationContains(binaryObject, "Objects::binaryLinkObjects");
	}

	/**
	 * Both ConnectionDefinition and FlowDefinition pick "binary" with exactly
	 * two owned end features ({@code checkConnectionDefinitionBinarySpecialization},
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
				""");
		Type unary = findByName(resource, "Unary", Type.class);
		Type binary = findByName(resource, "Binary", Type.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(unary), "Connections::Connection");
		assertContains(TypeUtil.getImplicitGeneralTypesFor(binary), "Connections::BinaryConnection");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(unary, "Connections::Connection");
		assertOwnedSpecializationContains(binary, "Connections::BinaryConnection");
	}

	/**
	 * Textual multiplicities are always parsed as a {@code MultiplicityRange}
	 * (a {@code Multiplicity} subtype); this test asserts the "feature" key
	 * target for a multiplicity owned by a Feature ({@code part p[1..3];}).
	 */
	@Test
	public void multiplicityOwnedByFeature() throws Exception {
		// part p[1..3];
		Resource resource = parse("multiplicity.sysml", """
				part p[1..3];
				""");
		Multiplicity featureOwned = findSingleWhere(resource, Multiplicity.class,
				m -> m.getOwner() instanceof org.omg.sysml.lang.sysml.Feature);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(featureOwned), "Base::naturals");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(featureOwned, "Base::naturals");
	}

	/**
	 * A composite transition under a {@code StateDefinition}/{@code StateUsage}
	 * whose source is a {@code StateUsage} picks "stateTransition"
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
				""");
		TransitionUsage transition = findByName(resource, "t1", TransitionUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(transition), "States::StateAction::stateTransitions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(transition, "States::StateAction::stateTransitions");
	}

	/**
	 * An {@code event} usage owned by an {@code OccurrenceDefinition}/
	 * {@code OccurrenceUsage} (here a {@code part def}, itself an Occurrence)
	 * picks "suboccurrence" ({@code checkEventOccurrenceUsageSpecialization},
	 * SysML Table 32 &sect;8.4.1).
	 */
	@Test
	public void eventOccurrenceOwnedByOccurrenceDefinitionGetsSuboccurrence() throws Exception {
		// part def P { event occurrence e; }
		Resource resource = parse("event.sysml", """
				part def P {
					event occurrence e;
				}
				""");
		EventOccurrenceUsage event = findByName(resource, "e", EventOccurrenceUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(event), "Occurrences::Occurrence::timeEnclosedOccurrences");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(event, "Occurrences::Occurrence::timeEnclosedOccurrences");
	}

	/**
	 * A plain KerML {@code Flow} (distinct from {@code FlowUsage}) with owned
	 * end features picks "flow" ({@code checkFlowWithEndsSpecialization},
	 * KerML Table 10 &sect;8.4.4.1), else "base" ({@code checkFlowSpecialization}).
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
				""");
		Flow noEnds = findByName(resource, "noEnds", Flow.class);
		Flow withEnds = findByName(resource, "withEnds", Flow.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(noEnds), "Transfers::transfers");
		assertContains(TypeUtil.getImplicitGeneralTypesFor(withEnds), "Transfers::flowTransfers");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(noEnds, "Transfers::transfers");
		assertOwnedSpecializationContains(withEnds, "Transfers::flowTransfers");
	}

}
