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
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.util.ElementUtil;

/**
 * Tests the implicit-specialization defaults of {@link OccurrenceUsage} and
 * {@link OccurrenceDefinition} (KerML Table 10, SysML Tables 31 and 32, &sect;8.4.5).
 * <p>
 * Each test checks the raw candidates of the public {@link ImplicitSpecializationService}
 * before transformation, then the materialized {@code getOwnedSpecialization()} after it.
 */
public class OccurrenceUsageImplicitSpecializationTest extends AbstractImplicitSpecializationTest {

	/**
	 * A composite {@link OccurrenceUsage} typed by a DataType gets
	 * {@code checkFeatureDataValueSpecialization} (KerML Table 10), subsetting
	 * {@code Base::dataValues}. The test uses a {@code part} typed by an {@code attribute def}:
	 * a plain {@code attribute} is not an OccurrenceUsage.
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
				""", true);
		OccurrenceUsage x = findByName(resource, "x", OccurrenceUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(x), "Base::dataValues");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(x, "Base::dataValues");
	}

	/**
	 * A composite feature explicitly typed by a Structure-implementing
	 * classifier (here a {@code part def}, which is an {@code ItemDefinition}
	 * and therefore a KerML {@code Structure}), nested directly inside another
	 * Structure, gets {@code checkFeatureSubobjectSpecialization} (KerML Table
	 * 10 &sect;8.4.4.1), subsetting {@code Objects::Object::subobjects}.
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
				""", true);
		OccurrenceUsage box1 = findByName(resource, "box1", OccurrenceUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(box1), "Objects::Object::subobjects");

		// After reduction, "Objects::Object::subobjects" stays a raw candidate
		// but is not materialized: box1's own type (part def Box, an
		// ItemDefinition) makes Items::Item::subparts the actual implicit
		// general — subparts :> subitems, parts (Items.sysml) and
		// subitems :> items, subobjects (Items.sysml), so subparts
		// transitively subsets subobjects and the more specific edge alone is
		// inserted (KerML &sect;8.4.2).
		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(box1, "Items::Item::subparts");
	}

	/**
	 * The same Structure-typed feature, but declared {@code ref} (non-composite),
	 * fails the composite guard in {@code isSubobject} and instead gets the more
	 * general {@code checkFeatureObjectSpecialization} default (KerML Table 10
	 * &sect;8.4.4.1), subsetting {@code Objects::objects}.
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
				""", true);
		OccurrenceUsage box2 = findByName(resource, "box2", OccurrenceUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(box2), "Objects::objects");

		// After reduction, "Objects::objects" stays a raw candidate but is
		// not materialized: box2's own type (part def Box) makes
		// Parts::parts the actual implicit general — parts :> items
		// (Parts.sysml) and items :> objects (Items.sysml), so parts
		// transitively subsets objects and the more specific edge alone is
		// inserted (KerML &sect;8.4.2).
		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(box2, "Parts::parts");
	}

	/**
	 * A composite feature typed by an {@code occurrence def} (a Class that is not a Structure),
	 * nested in another such occurrence, gets {@code checkFeatureSuboccurrenceSpecialization}
	 * (KerML Table 10), subsetting {@code Occurrences::Occurrence::suboccurrences}.
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
				""", true);
		OccurrenceUsage occ2 = findByName(resource, "occ2", OccurrenceUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(occ2), "Occurrences::Occurrence::suboccurrences");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(occ2, "Occurrences::Occurrence::suboccurrences");
	}

	/**
	 * A {@code snapshot} usage subsets {@code Occurrences::Occurrence::snapshots}
	 * ({@code checkOccurrenceUsageSnapshotSpecialization}) and a {@code timeslice} usage subsets
	 * {@code Occurrences::Occurrence::timeSlices}
	 * ({@code checkOccurrenceUsageTimeSliceSpecialization}); SysML Table 32, &sect;8.4.5.
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
				""", true);
		OccurrenceUsage assembly = findByName(resource, "assembly", OccurrenceUsage.class);
		OccurrenceUsage delivery = findByName(resource, "delivery", OccurrenceUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(assembly), "Occurrences::Occurrence::timeSlices");
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(delivery), "Occurrences::Occurrence::snapshots");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(assembly, "Occurrences::Occurrence::timeSlices");
		assertOwnedSpecializationContains(delivery, "Occurrences::Occurrence::snapshots");
	}

	/**
	 * An {@code individual occurrence def} subclassifies {@code Occurrences::Life} in addition to
	 * {@code Occurrences::Occurrence} ({@code checkOccurrenceDefinitionIndividualSpecialization},
	 * SysML Table 31).
	 */
	@Test
	public void individualOccurrenceDefinitionGetsTheLifeDefault() throws Exception {
		// individual occurrence def Ind;
		Resource resource = parse("individual.sysml", "individual occurrence def Ind;", true);
		OccurrenceDefinition ind = findByName(resource, "Ind", OccurrenceDefinition.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(ind), "Occurrences::Life");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(ind, "Occurrences::Life");
	}

}
