/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2024-2025 Model Driven Solutions, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *   Laszlo Gati, MDS
 *   Ed Seidewitz, MDS
 */
package org.omg.sysml.semantics.tests;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Ignore;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ItemDefinition;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Semantic constraint tests for "Implied Definition Subclassification Relationships" and
 * "Implied Usage Subsetting Relationships" (SysML v2 Specification, Tables 30 and 31)
 * 
 * Cases that cannot be covered by the parameterized test class {@link SysMLSpecializationTest}
 */
public class SysMLSpecializationSpecialTest extends SysMLSemanticTest {
	
	protected void checkTransitionUsageStateSpecialization(String owningTypeName) {
		//create and add root package
		org.omg.sysml.lang.sysml.Package root = SysMLFactory.eINSTANCE.createPackage();
		getResource().getContents().add(root);
		
		//check if library element exists
		Element libraryElement = SysMLLibraryUtil.getLibraryElement(root, "States::StateAction::stateTransitions");
		assertTrue(libraryElement instanceof Type);

		//create owning type
		EClassifier ownerEClass = SysMLPackage.eINSTANCE.getEClassifier(owningTypeName);
		Type owner = (Type) SysMLFactory.eINSTANCE.create((EClass) ownerEClass);
		NamespaceUtil.addOwnedMemberTo(root, owner);
		
		//create source state usage
		StateUsage state = SysMLFactory.eINSTANCE.createStateUsage();
		state.setIsReference(false);
		TypeUtil.addOwnedFeatureTo(owner, state);
		
		//create transition usage
		TransitionUsage transition = SysMLFactory.eINSTANCE.createTransitionUsage();
		transition.setIsReference(false);
		TypeUtil.addOwnedFeatureTo(owner, transition);
		
		//add source state usage to transition usage
		NamespaceUtil.addMemberTo(transition, state);
		
		//run transformation, add implicit elements
		ElementUtil.transformAll(root, true);
		
		assertTrue(String.format("TransitionUsage specializes stateTransitions instead of %s", getSpecifics(transition)), transition.specializes((Type)libraryElement));
	}
	
	@Test
	public void checkTransitionUsageStateSpecialization_StateDefinition() {
		checkTransitionUsageStateSpecialization("StateDefinition");
	}
	
	@Test
	public void checkTransitionUsageStateSpecialization_StateUsage() {
		checkTransitionUsageStateSpecialization("StateUsage");
	}
	
	@Test
	public void checkFeatureObjectSpecialization_OccurrenceUsage() {
		//create and add root package
		org.omg.sysml.lang.sysml.Package root = SysMLFactory.eINSTANCE.createPackage();
		getResource().getContents().add(root);
		
		//check if library element exists
		Element libraryElement = SysMLLibraryUtil.getLibraryElement(root, "Objects::objects");
		assertTrue(libraryElement instanceof Type);

		//create owning package
		org.omg.sysml.lang.sysml.Package owner = SysMLFactory.eINSTANCE.createPackage();
		NamespaceUtil.addOwnedMemberTo(root, owner);
		
		//create occurrence usage
		OccurrenceUsage occurrence = SysMLFactory.eINSTANCE.createOccurrenceUsage();
		occurrence.setIsReference(false);
		NamespaceUtil.addOwnedMemberTo(owner, occurrence);
		
		//create structure type
		ItemDefinition type = SysMLFactory.eINSTANCE.createItemDefinition();
		FeatureUtil.addFeatureTypingTo(occurrence).setType(type);
		
		//run transformation, add implicit elements
		ElementUtil.transformAll(root, true);
		
		assertTrue(String.format("OccurrenceUsage specializes subobjects instead of %s", getSpecifics(occurrence)), occurrence.specializes((Type)libraryElement));
	}
	
	@Test
	public void checkFeatureSubobjectSpecialization_OccurrenceUsage() {
		//create and add root package
		org.omg.sysml.lang.sysml.Package root = SysMLFactory.eINSTANCE.createPackage();
		getResource().getContents().add(root);
		
		//check if library element exists
		Element libraryElement = SysMLLibraryUtil.getLibraryElement(root, "Objects::Object::subobjects");
		assertTrue(libraryElement instanceof Type);

		//create owning type
		Type owner = (Type) SysMLFactory.eINSTANCE.createItemDefinition();
		NamespaceUtil.addOwnedMemberTo(root, owner);	
		
		//create occurrence usage
		OccurrenceUsage occurrence = SysMLFactory.eINSTANCE.createOccurrenceUsage();
		occurrence.setIsReference(false);
		TypeUtil.addOwnedFeatureTo(owner, occurrence);
		
		//create structure type
		ItemDefinition type = SysMLFactory.eINSTANCE.createItemDefinition();
		FeatureUtil.addFeatureTypingTo(occurrence).setType(type);
		
		//run transformation, add implicit elements
		ElementUtil.transformAll(root, true);
		
		assertTrue(String.format("OccurrenceUsage specializes subobjects instead of %s", getSpecifics(occurrence)), occurrence.specializes((Type)libraryElement));
	}
	
	@Test
	public void checkFeatureSubobjectSpecialization_PortUsage() {
		//create and add root package
		org.omg.sysml.lang.sysml.Package root = SysMLFactory.eINSTANCE.createPackage();
		getResource().getContents().add(root);
		
		//check if library element exists
		Element libraryElement = SysMLLibraryUtil.getLibraryElement(root, "Objects::Object::subobjects");
		assertTrue(libraryElement instanceof Type);

		//create owning type
		Type owner = (Type) SysMLFactory.eINSTANCE.createPortDefinition();
		NamespaceUtil.addOwnedMemberTo(root, owner);	
		
		//create occurrence usage
		PortUsage occurrence = SysMLFactory.eINSTANCE.createPortUsage();
		occurrence.setIsReference(false);
		TypeUtil.addOwnedFeatureTo(owner, occurrence);
		
		//create structure type
		PortDefinition type = SysMLFactory.eINSTANCE.createPortDefinition();
		FeatureUtil.addFeatureTypingTo(occurrence).setType(type);
		
		//run transformation, add implicit elements
		ElementUtil.transformAll(root, true);
		
		assertTrue(String.format("OccurrenceUsage specializes subobjects instead of %s", getSpecifics(occurrence)), occurrence.specializes((Type)libraryElement));
	}
	
	@Test
	@Ignore("TBD")
	public void checkUsageVariationUsageSpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkLifeClassMultiplicitySpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkFlowUsageSpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkMergeNodeIncomingSuccessionSpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkDecisionNodeOutgoingSuccessionSpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkSendActionUsageSpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkIfActionUsageSpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkWhileLoopActionUsageSpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkForLoopActionUsageSpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkStateUsageSubstateSpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkTransitionUsagePayloadSpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkTransitionUsageTransitionFeatureSpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkConstraintUsageRequirementConstraintSpecialization() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkAssertConstraintUsageSpecialization() {
	}
}
