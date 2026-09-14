/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
 *******************************************************************************/

package org.omg.sysml.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Disjoining;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.util.NamespaceUtil;

public class ST6RI_964_Type_getOwnedDisjoining_Test {

	@BeforeClass
	public static void setUp() {
		SysMLLogicStandaloneSetup.doSetup();
	}

	@Test
	public void testType_getOwnedDisjoining_size() {
		/*
		 * package DisjoiningTest {
    	 * 	   classifier A;
    	 *     classifier B disjoint from A;
         *     classifier C disjoint from A, B;
         * }
		 */
		
		org.omg.sysml.lang.sysml.Package pkg = SysMLFactory.eINSTANCE.createPackage();
		pkg.setDeclaredName("DisjoiningTest");
		
		Classifier A = SysMLFactory.eINSTANCE.createClassifier();
		A.setDeclaredName("A");
		NamespaceUtil.addOwnedMemberTo(pkg, A);
		
		Classifier B = SysMLFactory.eINSTANCE.createClassifier();
		B.setDeclaredName("B");
		NamespaceUtil.addOwnedMemberTo(pkg, B);
		Disjoining D = SysMLFactory.eINSTANCE.createDisjoining();
		D.setDisjoiningType(A);
		D.setTypeDisjoined(B);
		B.getOwnedRelationship().add(D);
		
		Classifier C = SysMLFactory.eINSTANCE.createClassifier();
		C.setDeclaredName("C");
		NamespaceUtil.addOwnedMemberTo(pkg, C);
		D = SysMLFactory.eINSTANCE.createDisjoining();
		D.setDisjoiningType(A);
		D.setTypeDisjoined(C);
		C.getOwnedRelationship().add(D);
		D = SysMLFactory.eINSTANCE.createDisjoining();
		D.setDisjoiningType(B);
		D.setTypeDisjoined(C);
		C.getOwnedRelationship().add(D);
		
		List<Disjoining> B_ownedDisjoining = B.getOwnedDisjoining();
		assertNotNull("B.ownedDisjoining not null", B_ownedDisjoining);
		assertEquals("B.ownedDisjoining.size == 1", 1, B_ownedDisjoining.size());
		
		List<Disjoining> C_ownedDisjoining = C.getOwnedDisjoining();
		assertNotNull("C.ownedDisjoining not null", C_ownedDisjoining);
		assertEquals("C.ownedDisjoining.size == 2", 2, C_ownedDisjoining.size());
	}
}
