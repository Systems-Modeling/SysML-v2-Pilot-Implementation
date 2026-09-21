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
import org.omg.sysml.adapter.TypeAdapter;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.IfActionUsage;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Behavior-contract regression tests for the structural, non-subtype-selection
 * defaults ({@code addBoundValueSubsetting}, {@code addParticipantSubsetting},
 * and several small ownership-conditioned mapped defaults). Checks the raw
 * candidate through {@link TypeUtil#getImplicitGeneralTypesFor(Type)} (or, for
 * the kind-tagged first test, the underlying {@link TypeAdapter}) before
 * transformation, then transforms and checks the same expectation against the
 * materialized {@code getOwnedSpecialization()}.
 */
public class StructuralFeatureImplicitSpecializationTest extends AbstractImplicitSpecializationTest{

	/**
	 * A directionless, non-default-valued Feature with no explicit
	 * specialization must subset the result parameter of its value Expression
	 * (KerML &sect;8.4.4.11 "Feature Values Semantics"). The target is a
	 * synthesized feature chain (value expression -&gt; its result parameter),
	 * not a named library type, so this test asserts the Subsetting's general
	 * is a Feature distinct from the ordinary "attribute values" default
	 * rather than comparing qualified names.
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
				""");
		Feature x = findByName(resource, "x", Feature.class);

		// The old adapter mechanism doesn't expose a kind-tagged candidate
		// list through the public TypeUtil facade, but TypeAdapter itself
		// keeps its raw candidates in a Map<EClass, List<Type>> keyed by
		// specialization kind: triggering computation through the no-arg
		// getImplicitGeneralTypes() first, then reading the SUBSETTING
		// bucket directly, reproduces the same kind-filtered check.
		TypeAdapter adapter = (TypeAdapter) ElementUtil.getElementAdapter(x);
		adapter.getImplicitGeneralTypes();
		boolean hasChainSubsetting = adapter.getImplicitGeneralTypes(SysMLPackage.Literals.SUBSETTING).stream()
				.anyMatch(general -> general instanceof Feature feature && !feature.getOwnedFeatureChaining().isEmpty());
		assertTrue("Expected a feature-chain Subsetting", hasChainSubsetting);

		ElementUtil.transformAll(resource, true);
		boolean materializedChainSubsetting = x.getOwnedSpecialization().stream()
				.anyMatch(specialization -> specialization.eClass() == SysMLPackage.Literals.SUBSETTING
						&& specialization.getGeneral() instanceof Feature general
						&& !general.getOwnedFeatureChaining().isEmpty());
		assertTrue("Expected a materialized feature-chain Subsetting among " + x.getOwnedSpecialization(),
				materializedChainSubsetting);
	}

	/**
	 * A Feature with {@code isEnd = true} owned by a Connector (or Association)
	 * without an explicit redefinition must subset {@code Links::Link::participant}
	 * (KerML &sect;8.3.3.3.4 "Feature"; semantics &sect;8.4.4.5 "Associations
	 * Semantics"). Uses three ends (not two): a 2-end connector's ends
	 * implicitly redefine {@code Connections::BinaryConnection::source}/
	 * {@code target} (a distinct, higher-priority rule), which suppresses this
	 * one — confirmed empirically while writing this test.
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
				""");
		Feature a = findByName(resource, "a", Feature.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(a), "Links::Link::participant");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(a, "Links::Link::participant");
	}

	/**
	 * A composite {@code ConstraintUsage} nested under an {@code ItemDefinition}
	 * subsets {@code Items::Item::checkedConstraints} (SysML Table 32,
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
				""");
		ConstraintUsage c = findByName(resource, "c", ConstraintUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(c), "Items::Item::checkedConstraints");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c, "Items::Item::checkedConstraints");
	}

	/**
	 * A composite {@code ConnectionUsage} owned by an {@code ItemDefinition}
	 * counts as a "subitem", giving it the "subpart" default (reused for
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
				""");
		ConnectionUsage c = findByName(resource, "c", ConnectionUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(c), "Items::Item::subparts");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c, "Items::Item::subparts");
	}

	/**
	 * An {@code IfActionUsage} with an {@code else} branch gets the "has an
	 * else clause" outcome, subsetting {@code Actions::ifThenElseActions}
	 * (SysML Table 32, &sect;8.4.1; narrated &sect;8.4.13 "Actions Semantics").
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
				""");
		IfActionUsage ifAction = findSingle(resource, IfActionUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(ifAction), "Actions::ifThenElseActions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(ifAction, "Actions::ifThenElseActions");
	}

	/**
	 * A {@code PerformActionUsage} owned by a {@code PartDefinition} gets the
	 * "performedAction" default, {@code Parts::Part::performedActions}
	 * (SysML Table 32, &sect;8.4.1).
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
				""");
		PerformActionUsage perform = findSingle(resource, PerformActionUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(perform), "Parts::Part::performedActions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(perform, "Parts::Part::performedActions");
	}

	/**
	 * A composite {@code ConcernUsage} nested directly under a
	 * {@code RequirementDefinition} (not via a {@code require}/{@code assume}
	 * constraint membership) counts as a subrequirement, resolving to
	 * {@code Requirements::RequirementCheck::subrequirements} (SysML Table 32,
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
				""");
		ConcernUsage c = findByName(resource, "c", ConcernUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(c), "Requirements::RequirementCheck::subrequirements");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c, "Requirements::RequirementCheck::subrequirements");
	}


	
}
