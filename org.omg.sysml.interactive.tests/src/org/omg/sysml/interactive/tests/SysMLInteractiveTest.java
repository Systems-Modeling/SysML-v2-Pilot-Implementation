/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022, 2026 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 * Contributors:
 *  Ed Seidewitz
 * 
*******************************************************************************/

package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertTrue;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Type;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.After;
import org.junit.BeforeClass;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;

public abstract class SysMLInteractiveTest {

	private final static String SYSML_LIBRARY_PATH_KEY = "libraryPath";
	
	/** Loads and resolves the standard library once for the textual test scenarios. */
	@BeforeClass
	public static void loadLibraries() {
		createSysMLInteractiveInstance();
	}
	
	/** Removes each test model while retaining the shared resolved libraries. */
	@After
	public void removeResource() {
		SysMLInteractive.getInstance().removeResource();
	}

	public static String getLibraryPath() {
		return System.getProperty(SYSML_LIBRARY_PATH_KEY);
	}
	
	public static SysMLInteractive createSysMLInteractiveInstance() {
		SysMLInteractive instance = SysMLInteractive.createInstance();
		instance.setVerbose(false);
		instance.loadLibrary(Path.of(getLibraryPath()).toAbsolutePath().toString());
		return instance;
	}
	
	public static SysMLInteractive getSysMLInteractiveInstance() {
		SysMLInteractive instance = SysMLInteractive.getInstance();
		instance.setVerbose(false);
		instance.loadLibrary(getLibraryPath());
		return instance;
	}
	
	public List<Element> process(SysMLInteractive instance, String input) {
		if (instance == null) {
			instance = getSysMLInteractiveInstance();
		}
		SysMLInteractiveResult result = instance.process(input);
		assertTrue("'" + input + "':\n" + result.formatIssues(), result.getIssues().isEmpty());
		Element root = result.getRootElement();
		assertTrue(root instanceof Namespace);
		return ((Namespace)root).getOwnedMember();
	}
	
	public List<Element> process(String input) {
		return process(null, input);
	}

	protected Resource parse(String name, String text) throws Exception {
		SysMLInteractive interactive = SysMLInteractive.getInstance();
		interactive.setResource(name);
		interactive.parse(text);
		Element rootElement = interactive.getRootElement();
		SysMLInteractiveResult result = new SysMLInteractiveResult(rootElement, Collections.emptyList());
		assertTrue("'" + text + "':\n" + result.formatIssues(), result.getIssues().isEmpty());
		return interactive.getResource();
	}

	protected static <T extends Type> T findByName(Resource resource, String name, Class<T> kind) {
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			EObject object = contents.next();
			if (kind.isInstance(object) && name.equals(kind.cast(object).getDeclaredName())) {
				return kind.cast(object);
			}
		}
		throw new AssertionError("Missing " + name);
	}

}
