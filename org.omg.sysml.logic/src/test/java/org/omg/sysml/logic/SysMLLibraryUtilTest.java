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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.junit.Test;
import org.omg.sysml.util.SysMLLibraryUtil;

/**
 * Verifies classification of EMF resources as SysML/KerML model-library
 * resources.
 */
public class SysMLLibraryUtilTest {

	@Test
	public void nullResourceIsNotLibraryResource() {
		assertFalse(SysMLLibraryUtil.isLibraryResource(null));
	}

	@Test
	public void resourceWithoutUriIsNotLibraryResource() {
		assertFalse(SysMLLibraryUtil.isLibraryResource(new ResourceImpl()));
	}

	@Test
	public void configuredModelLibraryDirectoryIsLibraryResource() {
		SysMLLibraryUtil.setModelLibraryDirectory("/tmp/sysml.library");

		ResourceImpl resource = new ResourceImpl(URI.createFileURI("/tmp/sysml.library/Base.sysml"));

		assertTrue(SysMLLibraryUtil.isLibraryResource(resource));
	}

	@Test
	public void conventionalModelLibraryFolderIsLibraryResource() {
		SysMLLibraryUtil.setModelLibraryDirectory("/tmp/other-library");

		ResourceImpl resource = new ResourceImpl(URI.createURI("platform:/resource/sysml.library/Base.sysml"));

		assertTrue(SysMLLibraryUtil.isLibraryResource(resource));
	}

	@Test
	public void ordinaryModelResourceIsNotLibraryResource() {
		SysMLLibraryUtil.setModelLibraryDirectory("/tmp/sysml.library");

		ResourceImpl resource = new ResourceImpl(URI.createFileURI("/tmp/model/Test.sysml"));

		assertFalse(SysMLLibraryUtil.isLibraryResource(resource));
	}
}
