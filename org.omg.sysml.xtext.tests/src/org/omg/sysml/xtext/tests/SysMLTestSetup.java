/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
 *  Vince Molnár
 *
*******************************************************************************/

package org.omg.sysml.xtext.tests;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

import com.google.inject.Injector;

/**
 * Standalone (non-OSGi) initialization of the KerML and SysML Xtext languages, shared by all
 * tests in this bundle. The setup is performed once per JVM, on first use.
 */
public final class SysMLTestSetup {

	private static Injector injector;

	private SysMLTestSetup() {
	}

	/**
	 * Returns the SysML injector, registering both the KerML and the SysML languages (file
	 * extensions {@code .kerml} and {@code .sysml}) with EMF on first call.
	 */
	public static synchronized Injector getInjector() {
		if (injector == null) {
			// An EPackage must be registered to be sure the correctly configured
			// CompositeEValidator is used (see SysMLInteractive.createInstance).
			EPackage.Registry.INSTANCE.put(SysMLPackage.eNS_URI, SysMLPackage.eINSTANCE);
			KerMLStandaloneSetup.doSetup();
			injector = new SysMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		return injector;
	}

	/**
	 * Creates a fresh, empty resource set configured to read UTF-8 encoded files.
	 * Each test case should use its own resource set so that test models cannot see each other.
	 */
	public static XtextResourceSet createResourceSet() {
		XtextResourceSet resourceSet = getInjector().getInstance(XtextResourceSet.class);
		resourceSet.getLoadOptions().put(XtextResource.OPTION_ENCODING, "UTF-8");
		return resourceSet;
	}

}
