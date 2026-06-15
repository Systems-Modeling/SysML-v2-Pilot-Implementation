/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of theEclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *
 *******************************************************************************/
package org.omg.sysml.logic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.ecore.EClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Package;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.util.TypeUtil;

public class UsagePostProcessTest {

	@BeforeClass
	public static void setUp() {
		SysMLLogicStandaloneSetup.doSetup();
	}

	/**
	 * Test that Usage.postProcess sets the property "composite" to false in appropriate cases.
	 * @throws InvocationTargetException
	 */
	@Test
	public void settingCompositeToFalse() throws InvocationTargetException {
		/*
		 * package Test {\n"
		 *     part p {
		 *         attribute a;
		 *	       part x;
		 *	       in part y
		 *		   variation part z {
		 *	           variant part w;
		 *		    }
		 *     }
		 *	   variation part q {
		 *	       variant part r;
		 *     }
		 * }
		 */
		Package test = (Package) createElement(SysMLPackage.Literals.PACKAGE, "test", null);
		Usage p = (Usage) createElement(SysMLPackage.Literals.PART_USAGE, "p", test);
		Usage a = (Usage) createElement(SysMLPackage.Literals.ATTRIBUTE_USAGE, "a", p);
		Usage x = (Usage) createElement(SysMLPackage.Literals.PART_USAGE, "x", p);
		Usage y = (Usage) createElement(SysMLPackage.Literals.PART_USAGE, "y", p);
		y.setDirection(FeatureDirectionKind.IN);
		Usage z = (Usage) createElement(SysMLPackage.Literals.PART_USAGE, "z", p);
		z.setIsVariation(true);
		Usage u = (Usage) createElement(SysMLPackage.Literals.PART_USAGE, "w", z);
		u.setIsVariation(true);
		Usage v = (Usage) createElement(SysMLPackage.Literals.PART_USAGE, "w", u);
		Usage q = (Usage) createElement(SysMLPackage.Literals.PART_USAGE, "q", test);
		q.setIsVariation(true);
		Usage r = (Usage) createElement(SysMLPackage.Literals.PART_USAGE, "r", q);
		
		// Post-process after creating the entire model.
		postProcess(p, a, x, y, z, u, v, q, r);
		
		assertTrue(p.isReference());
		assertTrue(a.isReference());
		assertFalse(x.isReference());
		assertTrue(y.isReference());
		assertFalse(z.isReference());
		assertFalse(u.isReference());
		assertFalse(v.isReference());
		assertTrue(q.isReference());
		assertTrue(r.isReference());
	}
	
	/**
	 * Create an Element with the given eClass, name and parent. If the created Element and the parent
	 * are both Usages, then the Element is added to the parent as a variant, if the parent is a variation,
	 * or as an ownedFeature, if the parent is not a variation. Otherwise, the Element is added as an
	 * ownedMember of the parent. (Adding ownedFeatures of Definitions is not currently needed.)
	 */
	protected static Element createElement(EClass eClass, String name, Namespace parent) {
		Element element = (Element)SysMLFactory.eINSTANCE.create(eClass);
		element.setDeclaredName(name);
		if (element instanceof Usage usage && parent instanceof Usage parentUsage) {
			if (parentUsage.isVariation()) {
				VariantMembership membership = SysMLFactory.eINSTANCE.createVariantMembership();
				membership.setOwnedVariantUsage(usage);
				parentUsage.getOwnedRelationship().add(membership);
			} else {
				TypeUtil.addOwnedFeatureTo(parentUsage, usage);
			}
		} else if (parent != null) {
			NamespaceUtil.addOwnedMemberTo(parent, element);
		}
		return element;
	}
	
	/**
	 * Call the postProcess method of the ElementAdapter of the given array of elements.
	 */
	protected static void postProcess(Element... elements) {
		for (Element element: elements) {
			ElementUtil.getElementAdapter(element).postProcess();
		}
	}
		
}
