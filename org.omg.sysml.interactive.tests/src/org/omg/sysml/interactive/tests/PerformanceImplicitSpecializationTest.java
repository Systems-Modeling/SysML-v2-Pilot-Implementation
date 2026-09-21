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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Behavior-contract regression tests for the shared "ownedPerformance"/
 * "subperformance"/"enclosedPerformance" defaults (KerML Table 10,
 * &sect;8.4.4.1, &sect;8.4.4.7 "Behaviors Semantics") applied to Step-like
 * features, exercised here through {@link ConstraintUsage} (whose call site
 * always passes {@code independent = true}).
 *
 * <p>Each test checks the raw implicit-general-type candidates through
 * {@link TypeUtil#getImplicitGeneralTypesFor(Type)} before transformation,
 * then transforms and checks the same expectation against the materialized
 * {@link Type#getOwnedSpecialization()} — a plain EMF read, independent of
 * whichever engine computed the candidates. Both {@code TypeUtil} and
 * {@code getOwnedSpecialization()} are public, stable contracts, so this
 * test stays valid across internal reorganizations of the rule engine.</p>
 */
public class PerformanceImplicitSpecializationTest extends AbstractImplicitSpecializationTest {

	/**
	 * A {@link ConstraintUsage} composite directly under a {@code part def}
	 * (an {@code ItemDefinition}, which is a KerML {@code Structure} —
	 * confirmed via {@code ItemDefinition extends OccurrenceDefinition,
	 * Structure}) gets {@code checkStepOwnedPerformanceSpecialization}
	 * (KerML Table 10, &sect;8.4.4.1): it must subset
	 * {@code Objects::Object::ownedPerformances}.
	 */
	@Test
	public void structureOwnedConstraintGetsOwnedPerformance() throws Exception {
		// part def P {
		//     constraint c1;
		// }
		Resource resource = parse("owned-performance.sysml", """
				part def P {
					constraint c1;
				}
				""");
		ConstraintUsage c1 = findByName(resource, "c1", ConstraintUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(c1), "Objects::Object::ownedPerformances");

		// checkStepOwnedPerformanceSpecialization's candidate ("ownedPerformances")
		// stays raw here: ConstraintUsage's own checkedConstraint default (P is
		// implicitly an ItemDefinition, via Parts::Part) also applies, and
		// Items::Item::checkedConstraints already subsets ownedPerformances in
		// the standard library, so reduction keeps only the more specific one
		// (KerML &sect;8.4.2 — a more specific implied relationship subsumes a
		// less specific one, which is then not inserted).
		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c1, "Items::Item::checkedConstraints");
	}

	/**
	 * A {@link ConstraintUsage} composite directly under an {@code action def}
	 * (a Behavior) gets {@code checkStepSubperformanceSpecialization} (KerML
	 * Table 10, &sect;8.4.4.1): it must subset
	 * {@code Performances::Performance::subperformances}. Its owner
	 * (ActionDefinition) is not itself a Structure, so the sibling
	 * "ownedPerformance" default must not also apply here.
	 */
	@Test
	public void behaviorOwnedCompositeConstraintGetsSubperformance() throws Exception {
		// action def A {
		//     constraint c1;
		// }
		Resource resource = parse("subperformance.sysml", """
				action def A {
					constraint c1;
				}
				""");
		ConstraintUsage c1 = findByName(resource, "c1", ConstraintUsage.class);
		assertTrue("Expected a composite constraint for this case", c1.isComposite());
		List<Type> candidates = TypeUtil.getImplicitGeneralTypesFor(c1);
		assertContains(candidates, "Performances::Performance::subperformances");
		assertNotContains(candidates, "Objects::Object::ownedPerformances");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c1, "Performances::Performance::subperformances");
		assertOwnedSpecializationDoesNotContain(c1, "Objects::Object::ownedPerformances");
	}

	/**
	 * A {@link ConstraintUsage} non-composite ({@code ref}) directly under an
	 * {@code action def} gets {@code checkStepEnclosedPerformanceSpecialization}
	 * (KerML Table 10, &sect;8.4.4.1): it must subset
	 * {@code Performances::Performance::enclosedPerformances} instead of
	 * "subperformance", since it is behavior-owned but not composite.
	 */
	@Test
	public void behaviorOwnedNonCompositeConstraintGetsEnclosedPerformance() throws Exception {
		// action def A {
		//     ref constraint c1;
		// }
		Resource resource = parse("enclosed-performance.sysml", """
				action def A {
					ref constraint c1;
				}
				""");
		ConstraintUsage c1 = findByName(resource, "c1", ConstraintUsage.class);
		assertFalse("Expected a non-composite (ref) constraint for this case", c1.isComposite());
		List<Type> candidates = TypeUtil.getImplicitGeneralTypesFor(c1);
		assertContains(candidates, "Performances::Performance::enclosedPerformances");
		assertNotContains(candidates, "Performances::Performance::subperformances");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c1, "Performances::Performance::enclosedPerformances");
		assertOwnedSpecializationDoesNotContain(c1, "Performances::Performance::subperformances");
	}

}
