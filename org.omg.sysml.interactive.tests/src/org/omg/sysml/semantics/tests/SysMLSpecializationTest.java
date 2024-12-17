/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2024 Model Driven Solutions, Inc.
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
 */
package org.omg.sysml.semantics.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.NamespaceUtil;

/**
 * Semantic constraint tests for Table 31. Implied Usage Subsetting Relationships
 */
@RunWith(Parameterized.class)
public class SysMLSpecializationTest extends SysMLSemanticTest {
	/**
	 * Test cases for the Parameterized tests<br>
	 * Columns in order: 
	 * <ol>
	 * <li>Semantic constraint name: (for debugging purposes)</li>
	 * <li>EClass of the element: test creates the element of this type, element is tested for specializations</li>
	 * <li>Library type: expected specialized library type after the transformation</li>
	 * <li>EClass of owning namespace: type of the owning namespace for the element which is tested</li>
	 * <li>EClass of membership: controls which membership type to use when adding the element to the owning namespace</li>
	 * </ol>
	 * 
	 */
	private static final String TEST_CASES_CSV = "sysml-simple-specializations.csv";
	
	//parameters for the parameterized test
	
	@Parameter(0)
	public String semanticConstraint;
	
	@Parameter(1)
	public String eClassName;
	
	@Parameter(2)
	public String expectedLibraryType;
	
	@Parameter(3)
	public String owningNamespaceType;
	
	@Parameter(4)
	public String membershipType;
	
	//reading the parameters from the .csv and binding them to Parameter fields
	
	@Parameters(name = "Semantic constraint: {0}, Owner: {3}, EClass: {1}, Expected library type: {2}")
	public static Collection<Object[]> getParameters() throws IOException{
		List<Object[]> parametersForTestCases = new LinkedList<>();
		
		InputStream csvStream = SysMLSpecializationTest.class.getResourceAsStream(TEST_CASES_CSV);
		
		try (Scanner scanner = new Scanner(csvStream)){
			scanner.forEachRemaining(line -> {
				Object[] parameters = line.split(",");
				parametersForTestCases.add(parameters);
			});
		}
		
		return parametersForTestCases;
	}
	
	
	
	@Test
	public void checkSpecialization() {
		//create and add root package
		org.omg.sysml.lang.sysml.Package root = SysMLFactory.eINSTANCE.createPackage();
		getResource().getContents().add(root);
		
		//check if library element exists
		Element libraryElement = SysMLLibraryUtil.getLibraryElement(root, expectedLibraryType);
		assertNotNull(libraryElement);
		
		//create owning namespace
		EClassifier ownerEClass = SysMLPackage.eINSTANCE.getEClassifier(owningNamespaceType);
		Namespace owner = (Namespace) SysMLFactory.eINSTANCE.create((EClass) ownerEClass);
		NamespaceUtil.addOwnedMemberTo(root, owner);
		
		//create element
		EClassifier eClass = SysMLPackage.eINSTANCE.getEClassifier(eClassName);
		Type element = (Type) SysMLFactory.eINSTANCE.create((EClass) eClass);
		
		//set usages to non-referential
		if (element instanceof Usage usage) {
			usage.setIsReference(false);
		}
		
		//use a specific membership to add the element to the owning namespace
		EClassifier memberhipEClass = SysMLPackage.eINSTANCE.getEClassifier(membershipType);
		Membership membership = (Membership) SysMLFactory.eINSTANCE.create((EClass) memberhipEClass);
		owner.getOwnedRelationship().add(membership);
		membership.setMemberElement(element);
		
		//run transformation, add implicit elements
		ElementUtil.transformAll(root, true);
		
		assertTrue("Speacializes instead: " + getSpecifics(element), specializes(element, expectedLibraryType));
	}
}
