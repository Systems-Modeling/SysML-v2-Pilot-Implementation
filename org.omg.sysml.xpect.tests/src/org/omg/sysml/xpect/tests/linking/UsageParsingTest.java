/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.sysml.xpect.tests.linking;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.kerml.xpect.KerMLXtextTests;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

import com.google.inject.Injector;

public class UsageParsingTest {

	private static Injector injector;

	@BeforeClass
	public static void setUp() {
		KerMLXtextTests.setup();
		injector = new SysMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		SysMLPackage.eINSTANCE.eClass();
	}

	@Test
	public void parserUsesSyntaxNodesToApplyCompositeDefaults() throws IOException {
		XtextResource resource = parse("""
				part def P {
					part implicitComposite;
					ref part explicitReference;
					in part directed;
					attribute nonCompositeType;
				}
				action def A {
					merge explicitComposite;
				}
				""");

		Usage implicitComposite = findUsage(resource, "implicitComposite");
		assertTrue(NodeModelUtils.findNodesForFeature(
				implicitComposite, SysMLPackage.Literals.FEATURE__IS_COMPOSITE).isEmpty());
		assertTrue(NodeModelUtils.findNodesForFeature(
				implicitComposite, SysMLPackage.Literals.USAGE__IS_REFERENCE).isEmpty());
		assertTrue(implicitComposite.isComposite());

		Usage explicitReference = findUsage(resource, "explicitReference");
		assertFalse(NodeModelUtils.findNodesForFeature(
				explicitReference, SysMLPackage.Literals.USAGE__IS_REFERENCE).isEmpty());
		assertTrue(explicitReference.isReference());

		Usage explicitComposite = findUsage(resource, "explicitComposite");
		assertFalse(NodeModelUtils.findNodesForFeature(
				explicitComposite, SysMLPackage.Literals.FEATURE__IS_COMPOSITE).isEmpty());
		assertTrue(explicitComposite.isComposite());

		assertTrue(findUsage(resource, "directed").isReference());
		assertTrue(findUsage(resource, "nonCompositeType").isReference());
	}

	@Test
	public void compositeValuesSurviveXmiRoundTrips() throws IOException {
		assertXmiRoundTrip(false);
		assertXmiRoundTrip(true);

		Usage usage = SysMLFactory.eINSTANCE.createUsage();
		usage.setIsComposite(true);
		usage.eUnset(SysMLPackage.Literals.FEATURE__IS_COMPOSITE);
		Usage loaded = xmiRoundTrip(usage);
		assertFalse(loaded.isComposite());
		assertTrue(loaded.isReference());
	}

	private static XtextResource parse(String text) throws IOException {
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		XtextResource resource = (XtextResource)resourceSet.createResource(URI.createURI("memory:/usage.sysml"));
		resource.load(new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)), Map.of());
		EcoreUtil.resolveAll(resource);
		assertTrue(resource.getErrors().toString(), resource.getErrors().isEmpty());
		return resource;
	}

	private static Usage findUsage(Resource resource, String name) {
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof Usage usage && name.equals(usage.getDeclaredName())) {
				return usage;
			}
		}
		fail("Usage not found: " + name);
		return null;
	}

	private static void assertXmiRoundTrip(boolean isComposite) throws IOException {
		Usage usage = SysMLFactory.eINSTANCE.createUsage();
		usage.setIsComposite(isComposite);
		Usage loaded = xmiRoundTrip(usage);
		if (isComposite) {
			assertTrue(loaded.isComposite());
			assertFalse(loaded.isReference());
		} else {
			assertFalse(loaded.isComposite());
			assertTrue(loaded.isReference());
		}
	}

	private static Usage xmiRoundTrip(Usage usage) throws IOException {
		URI uri = URI.createURI("memory:/usage.xmi");
		Resource savedResource = new XMIResourceImpl(uri);
		savedResource.getContents().add(usage);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		savedResource.save(output, Map.of());

		Resource loadedResource = new XMIResourceImpl(uri);
		loadedResource.load(new ByteArrayInputStream(output.toByteArray()), Map.of());
		return (Usage)loadedResource.getContents().get(0);
	}
}
