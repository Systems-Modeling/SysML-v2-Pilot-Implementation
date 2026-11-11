/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2026 Budapest University of Technology and Economics
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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.nio.file.Path;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Issue;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.util.ElementUtil;

/** Tests names that fail to resolve during the resolution of another name, and resolve later. */
public class NestedResolutionTest {

	protected static SysMLInteractive interactive;

	/** Loads and resolves the standard library once for the textual test scenarios. */
	@BeforeClass
	public static void loadLibraries() {
		interactive = SysMLInteractive.createInstance();
		interactive.setVerbose(false);
		interactive.loadLibrary(Path.of(System.getProperty("libraryPath")).toAbsolutePath().toString());
	}

	/** Removes each test model while retaining the shared resolved libraries. */
	@After
	public void removeResource() {
		interactive.removeResource();
	}

	/**
	 * VerificationMethodKind is found only through the first import and test only through the second,
	 * so a metadata value naming test must be bound to the literal, not to an unresolved proxy.
	 */
	@Test
	public void metadataValueThroughDependentImport() throws Exception {
		Resource resource = parse("dependentImport.sysml", """
				package P {
					private import VerificationCases::*;
					private import VerificationMethodKind::*;
					verification def MassTest;
					verification massTests : MassTest {
						@VerificationMethod { kind = test; }
					}
				}
				""");
		assertNoIssues();
		ElementUtil.transformAll(resource, true);
		for (var contents = EcoreUtil.getAllContents(resource, false); contents.hasNext();) {
			assertFalse(((EObject) contents.next()).eIsProxy());
		}
	}

	/**
	 * Service gets Interface as an implicit supertype from semantic metadata, so Endpoint inherits
	 * protocol from Interface only as redefined by Service.
	 */
	@Test
	public void redefinitionThroughSemanticMetadata() throws Exception {
		Resource resource = parse("semanticMetadata.sysml", """
				package P {
					private import Metaobjects::SemanticMetadata;
					private import ScalarValues::*;
					port def Interface {
						attribute url : String;
						attribute protocol : String;
					}
					port interfaces : Interface;
					metadata def <service> ServiceMetadata :> SemanticMetadata {
						:>> baseType default interfaces meta SysML::PortUsage;
					}
					#service def Service {
						attribute :>> url = "pull";
						attribute :>> protocol = "JSON";
					}
					port def Endpoint :> Service, Interface;
				}
				""");
		EcoreUtil.resolveAll(resource);
		assertNoIssues();
	}

	private Resource parse(String name, String text) throws Exception {
		interactive.setResource(name);
		interactive.parse(text);
		return interactive.getResource();
	}

	private void assertNoIssues() {
		List<Issue> issues = interactive.validate();
		assertTrue(issues.toString(), issues.isEmpty());
	}

}
