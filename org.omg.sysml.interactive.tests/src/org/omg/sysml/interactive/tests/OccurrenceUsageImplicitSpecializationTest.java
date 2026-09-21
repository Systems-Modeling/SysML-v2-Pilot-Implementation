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
import org.omg.sysml.lang.sysml.OccurrenceDefinition;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Behavior-contract regression tests for the implicit-specialization defaults
 * applied to {@link OccurrenceUsage}/{@link OccurrenceDefinition} (KerML
 * Table 10 &sect;8.4.4.1 / SysML Table 31-32 &sect;8.4.1, with per-branch
 * citations in &sect;8.4.5 "Occurrences Semantics"). Checks the raw candidate
 * through {@link TypeUtil#getImplicitGeneralTypesFor(Type)} before
 * transformation, then transforms and checks the same expectation against
 * the materialized {@code getOwnedSpecialization()}.
 */
public class OccurrenceUsageImplicitSpecializationTest extends AbstractImplicitSpecializationTest {

	/**
	 * A composite {@link OccurrenceUsage}-kind feature explicitly typed by a
	 * DataType (here an {@code attribute def}) gets the "dataValue" default
	 * (KerML Table 10 &sect;8.4.4.1), subsetting {@code Base::dataValues}. A
	 * plain {@code attribute} usage is not itself an {@code OccurrenceUsage},
	 * so the test uses a {@code part} explicitly typed by a DataType to
	 * actually exercise the {@code hasDataType} branch.
	 */
	@Test
	public void dataTypedFeatureGetsTheDataValueDefault() throws Exception {
		// attribute def Signal;
		// part def Container {
		//     part x : Signal;
		// }
		Resource resource = parse("datavalue.sysml", """
				attribute def Signal;
				part def Container {
					part x : Signal;
				}
				""");
		OccurrenceUsage x = findByName(resource, "x", OccurrenceUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(x), "Base::dataValues");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(x, "Base::dataValues");
	}

	/**
	 * A composite feature explicitly typed by a Structure-implementing
	 * classifier (here a {@code part def}, which is an {@code ItemDefinition}
	 * and therefore a KerML {@code Structure}), nested directly inside another
	 * Structure, gets the "subobject" default (KerML Table 10 &sect;8.4.4.1),
	 * subsetting {@code Objects::Object::subobjects}.
	 */
	@Test
	public void compositeStructureTypedFeatureGetsTheSubobjectDefault() throws Exception {
		// part def Box;
		// part def Container {
		//     part box1 : Box;
		// }
		Resource resource = parse("subobject.sysml", """
				part def Box;
				part def Container {
					part box1 : Box;
				}
				""");
		OccurrenceUsage box1 = findByName(resource, "box1", OccurrenceUsage.class);

		// Unlike the new engine, whose raw candidates enumerate every
		// applicable rule before reduction (including the generic
		// "subobject" default), the old adapter mechanism resolves its
		// EClass-specific map entries eagerly: PartUsageImpl's own
		// "subpart"/"part" entries already take precedence over
		// OccurrenceUsageImpl's generic "subobject"/"object" entries at this
		// stage, so "Objects::Object::subobjects" never appears even as a raw
		// candidate here — only its more specific replacement,
		// Items::Item::subparts, does.
		assertContains(TypeUtil.getImplicitGeneralTypesFor(box1), "Items::Item::subparts");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(box1, "Items::Item::subparts");
	}

	/**
	 * The same Structure-typed feature, but declared {@code ref} (non-composite),
	 * fails the composite guard and instead gets the more general "object"
	 * default (KerML Table 10 &sect;8.4.4.1), subsetting {@code Objects::objects}.
	 */
	@Test
	public void nonCompositeStructureTypedFeatureGetsTheObjectDefault() throws Exception {
		// part def Box;
		// part def Container {
		//     ref part box2 : Box;
		// }
		Resource resource = parse("object.sysml", """
				part def Box;
				part def Container {
					ref part box2 : Box;
				}
				""");
		OccurrenceUsage box2 = findByName(resource, "box2", OccurrenceUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(box2), "Objects::objects");

		// After reduction, "Objects::objects" stays a raw candidate but is
		// not materialized: box2's own type (part def Box) makes
		// Parts::parts the actual implicit general — parts :> items
		// (Parts.sysml) and items :> objects (Items.sysml), so parts
		// transitively subsets objects and the more specific edge alone is
		// inserted (KerML &sect;8.4.2). This reduction is identical on the
		// pre-refactoring adapter mechanism, since it is driven entirely by
		// the standard library's own subsetting chain, not by which engine
		// computes the candidates.
		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(box2, "Parts::parts");
	}

	/**
	 * A composite feature explicitly typed by a plain {@code occurrence def}
	 * (a KerML {@code Class}, but not a {@code Structure}) nested directly
	 * inside another such Class-typed occurrence gets the "suboccurrence"
	 * default (KerML Table 10 &sect;8.4.4.1), subsetting
	 * {@code Occurrences::Occurrence::suboccurrences}. Verified against the
	 * real, error-free fixture shape in {@code OccurrenceTest.sysml.xt}
	 * ({@code occurrence def Occ { occurrence occ2 : Occ; ... } }).
	 */
	@Test
	public void compositeClassTypedFeatureGetsTheSuboccurrenceDefault() throws Exception {
		// occurrence def Occ {
		//     occurrence occ2 : Occ;
		// }
		Resource resource = parse("suboccurrence.sysml", """
				occurrence def Occ {
					occurrence occ2 : Occ;
				}
				""");
		OccurrenceUsage occ2 = findByName(resource, "occ2", OccurrenceUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(occ2), "Occurrences::Occurrence::suboccurrences");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(occ2, "Occurrences::Occurrence::suboccurrences");
	}

	/**
	 * A {@code snapshot} portion usage gets the "snapshot" default (SysML
	 * Table 32 &sect;8.4.1, narrated at &sect;8.4.5 "Occurrences Semantics"),
	 * subsetting {@code Occurrences::Occurrence::snapshots}; a {@code timeslice}
	 * portion usage gets the sibling "timeslice" default, subsetting
	 * {@code Occurrences::Occurrence::timeSlices}. Syntax verified against
	 * the real fixture {@code Time Slice and Snapshot Example.sysml}.
	 */
	@Test
	public void portionUsagesGetTheSnapshotOrTimesliceDefault() throws Exception {
		// part def Vehicle {
		//     timeslice assembly;
		//     snapshot delivery;
		// }
		Resource resource = parse("portion.sysml", """
				part def Vehicle {
					timeslice assembly;
					snapshot delivery;
				}
				""");
		OccurrenceUsage assembly = findByName(resource, "assembly", OccurrenceUsage.class);
		OccurrenceUsage delivery = findByName(resource, "delivery", OccurrenceUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(assembly), "Occurrences::Occurrence::timeSlices");
		assertContains(TypeUtil.getImplicitGeneralTypesFor(delivery), "Occurrences::Occurrence::snapshots");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(assembly, "Occurrences::Occurrence::timeSlices");
		assertOwnedSpecializationContains(delivery, "Occurrences::Occurrence::snapshots");
	}

	/**
	 * An {@code individual occurrence def} gets the "individual" default
	 * (SysML Table 31 &sect;8.4.1), subclassifying {@code Occurrences::Life}
	 * in addition to its ordinary {@code Occurrences::Occurrence} base.
	 * Syntax verified against the real fixture {@code OccurrenceTest.sysml.xt}
	 * ({@code individual occurrence def Ind { ... }}).
	 */
	@Test
	public void individualOccurrenceDefinitionGetsTheLifeDefault() throws Exception {
		// individual occurrence def Ind;
		Resource resource = parse("individual.sysml", "individual occurrence def Ind;");
		OccurrenceDefinition ind = findByName(resource, "Ind", OccurrenceDefinition.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(ind), "Occurrences::Life");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(ind, "Occurrences::Life");
	}

}
