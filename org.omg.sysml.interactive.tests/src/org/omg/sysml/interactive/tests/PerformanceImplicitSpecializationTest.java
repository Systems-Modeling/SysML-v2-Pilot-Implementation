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

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.util.ElementUtil;

/**
 * Tests the owned, sub- and enclosed performance defaults of Step-like features (KerML
 * Table 10, &sect;8.4.4.7), through {@link ConstraintUsage}.
 * <p>
 * Each test checks the raw candidates of the public {@link ImplicitSpecializationService}
 * before transformation, then the materialized {@link Type#getOwnedSpecialization()} after it.
 * <p>
 * Not covered: the "incomingTransfer" default key of a plain {@code Step}; every textual
 * Step-like construct has a more specific metaclass.
 */
public class PerformanceImplicitSpecializationTest extends AbstractImplicitSpecializationTest {

	/**
	 * A composite {@link ConstraintUsage} under a {@code part def}, which is a KerML
	 * {@code Structure}, subsets {@code Objects::Object::ownedPerformances}
	 * ({@code checkStepOwnedPerformanceSpecialization}, KerML Table 10).
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
				""", true);
		ConstraintUsage c1 = findByName(resource, "c1", ConstraintUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(c1), "Objects::Object::ownedPerformances");

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

	@Test
	public void behaviorOwnedCompositeConstraintGetsSubperformance() throws Exception {
		// action def A {
		//     constraint c1;
		// }
		Resource resource = parse("subperformance.sysml", """
				action def A {
					constraint c1;
				}
				""", true);
		ConstraintUsage c1 = findByName(resource, "c1", ConstraintUsage.class);
		assertTrue("Expected a composite constraint for this case", c1.isComposite());
		var candidates =  getImplicitSpecializationService().getImplicitSpecializationCandidates(c1);
		assertContains(candidates, "Performances::Performance::subperformances");
		assertNotContains(candidates, "Objects::Object::ownedPerformances");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c1, "Performances::Performance::subperformances");
		assertOwnedSpecializationDoesNotContain(c1, "Objects::Object::ownedPerformances");
	}

	@Test
	public void behaviorOwnedNonCompositeConstraintGetsEnclosedPerformance() throws Exception {
		// action def A {
		//     ref constraint c1;
		// }
		Resource resource = parse("enclosed-performance.sysml", """
				action def A {
					ref constraint c1;
				}
				""", true);
		ConstraintUsage c1 = findByName(resource, "c1", ConstraintUsage.class);
		assertFalse("Expected a non-composite (ref) constraint for this case", c1.isComposite());
		var candidates =  getImplicitSpecializationService().getImplicitSpecializationCandidates(c1);
		assertContains(candidates, "Performances::Performance::enclosedPerformances");
		assertNotContains(candidates, "Performances::Performance::subperformances");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c1, "Performances::Performance::enclosedPerformances");
		assertOwnedSpecializationDoesNotContain(c1, "Performances::Performance::subperformances");
	}

}
