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
import static org.junit.Assert.assertSame;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.SysMLLibraryUtil;

/**
 * Verifies the plain-EMF standalone bootstrap for {@link SysMLLogicStandaloneSetup}.
 */
public class SysMLLogicStandaloneSetupTest {

	/**
	 * Checks that the standalone setup installs library lookup and delegate
	 * support without requiring any Xtext runtime bootstrap, and that invoking
	 * the setup multiple times remains safe for subsequent lookups.
	 */
	@Test
	public void standaloneSetupResolvesLibraryElementsWithoutXtext() {
		SysMLLibraryUtil.setProviderLookup(null);
		SysMLLibraryUtil.setModelLibraryDirectory("/tmp/sysml.library");
		SysMLLogicStandaloneSetup.doSetup();
		SysMLPackage.eINSTANCE.eClass();

		ResourceSetImpl resourceSet = new ResourceSetImpl();
		ResourceImpl libraryResource = new ResourceImpl(URI.createFileURI("/tmp/sysml.library/Base.sysml"));
		ResourceImpl modelResource = new ResourceImpl(URI.createFileURI("/tmp/model/Test.sysml"));
		resourceSet.getResources().add(libraryResource);
		resourceSet.getResources().add(modelResource);

		SysMLFactory factory = SysMLFactory.eINSTANCE;

		Namespace library = factory.createNamespace();
		library.setDeclaredName("Base");
		libraryResource.getContents().add(library);

		Type anything = factory.createType();
		anything.setDeclaredName("Anything");
		OwningMembership anythingMembership = factory.createOwningMembership();
		anythingMembership.setOwnedMemberElement(anything);
		library.getOwnedRelationship().add(anythingMembership);

		Namespace context = factory.createNamespace();
		context.setDeclaredName("UserModel");
		modelResource.getContents().add(context);

		assertEquals("Anything", anything.effectiveName());
		assertEquals("Anything", anything.getName());
		assertNotNull(SysMLLibraryUtil.getLibraryElement(context, "Base::Anything"));
		assertSame(anything, SysMLLibraryUtil.getLibraryType(context, "Base::Anything"));

		SysMLLogicStandaloneSetup.doSetup();
		assertSame(anything, SysMLLibraryUtil.getLibraryType(context, "Base::Anything"));
	}
}
