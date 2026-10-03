/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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

import static org.junit.Assert.assertNull;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.SendActionUsage;
import org.omg.sysml.lang.sysml.SysMLFactory;

public class ResourceSetModelLibraryProviderTest {

	private final SysMLFactory factory = SysMLFactory.eINSTANCE;

	/**
	 * An owning membership derives its member name from the effective name of its
	 * owned element. Computing that name for an anonymous action can itself request
	 * a default library type, so library traversal must only inspect declared names.
	 */
	@Test
	public void lookupDoesNotComputeEffectiveNamesOfOwnedMembers() {
		SysMLLogicStandaloneSetup.doSetup();

		Namespace library = this.factory.createNamespace();
		library.setDeclaredName("Library");
		SendActionUsage anonymousAction = this.factory.createSendActionUsage();
		OwningMembership membership = this.factory.createOwningMembership();
		membership.setOwnedMemberElement(anonymousAction);
		library.getOwnedRelationship().add(membership);

		Resource resource = new ResourceImpl(URI.createURI("memory:/sysml.library/Library.sysmlx"));
		new ResourceSetImpl().getResources().add(resource);
		resource.getContents().add(library);

		assertNull(new ResourceSetModelLibraryProvider().getElement(anonymousAction, "Missing"));
	}
}
