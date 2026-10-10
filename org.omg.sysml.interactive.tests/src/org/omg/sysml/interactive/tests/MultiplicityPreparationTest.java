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
package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.MultiplicityRange;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.xtext.postprocessing.SysMLParserPostProcessorFactory;

/** Tests the boundary between parser preparation of multiplicities and derived consultation. */
public class MultiplicityPreparationTest {

	private static ResourceSet resourceSet;
	private final List<Resource> models = new ArrayList<>();

	/** Loads and resolves the standard library once for the textual test scenarios. */
	@BeforeClass
	public static void loadLibraries() {
		SysMLInteractive interactive = SysMLInteractive.createInstance();
		interactive.setVerbose(false);
		interactive.getLibraryIndexCache().setIndexDisabled(true);
		interactive.loadLibrary(Path.of(System.getProperty("libraryPath")).toAbsolutePath().toString());
		resourceSet = interactive.getResourceSet();
		for (int i = 0; i < resourceSet.getResources().size(); i++) {
			EcoreUtil2.resolveLazyCrossReferences(resourceSet.getResources().get(i), null);
		}
	}

	/** Removes each test model while retaining the shared resolved libraries. */
	@After
	public void removeModels() {
		for (Resource resource : models) {
			resource.unload();
			resourceSet.getResources().remove(resource);
		}
	}

	/**
	 * Parsing end usages prepares one multiplicity before any feature consultation;
	 * subsequent reads must preserve that multiplicity and its owning relationships.
	 */
	@Test
	public void parserPreparesEndMultiplicitiesBeforeConsultation() throws Exception {
		// Each end has an implicit multiplicity, supplied by parser post-processing.
		Resource resource = parse("endMultiplicities.sysml", """
				part def Holder {
					end attribute attributeEnd;
					end item itemEnd;
					end port portEnd;
					end ref referenceEnd;
					end connection connectionEnd;
				}
				""");
		for (String name : List.of("attributeEnd", "itemEnd", "portEnd", "referenceEnd", "connectionEnd")) {
			Usage usage = findByName(resource, name, Usage.class);
			List<Multiplicity> multiplicities = ownedMultiplicities(usage);
			assertEquals(name, 1, multiplicities.size());
			List<Relationship> relationships = new ArrayList<>(usage.getOwnedRelationship());

			usage.getFeature();
			usage.getFeature();
			assertEquals(name, relationships, usage.getOwnedRelationship());
			assertSame(name, multiplicities.get(0), ownedMultiplicities(usage).get(0));
		}
	}

	/**
	 * Explicit multiplicities are retained by repeated parser preparation, without
	 * creating a second multiplicity or replacing the existing model element.
	 */
	@Test
	public void repeatedPreparationPreservesExplicitMultiplicity() throws Exception {
		// The explicit range must remain the sole owned multiplicity.
		Resource resource = parse("explicitMultiplicity.sysml", """
				part def Holder { end item endpoint[2..4]; }
				""");
		Usage usage = findByName(resource, "endpoint", Usage.class);
		assertEquals(1, ownedMultiplicities(usage).size());
		Multiplicity multiplicity = ownedMultiplicities(usage).get(0);
		assertTrue(multiplicity instanceof MultiplicityRange);
		List<Relationship> relationships = new ArrayList<>(usage.getOwnedRelationship());

		// Re-entering preparation must not duplicate or replace the explicit range.
		SysMLParserPostProcessorFactory.getPostProcessor(usage).postProcess();
		SysMLParserPostProcessorFactory.getPostProcessor(usage).postProcess();
		assertEquals(relationships, usage.getOwnedRelationship());
		assertEquals(1, ownedMultiplicities(usage).size());
		assertSame(multiplicity, ownedMultiplicities(usage).get(0));
	}

	/**
	 * Removing a prepared multiplicity simulates an edited model without that owned
	 * element; feature consultation must not recreate it, even after clearing caches.
	 */
	@Test
	public void consultationDoesNotRecreateRemovedMultiplicity() throws Exception {
		Resource resource = parse("removedMultiplicity.sysml", """
				part def Holder { end item endpoint; }
				""");
		Usage usage = findByName(resource, "endpoint", Usage.class);
		assertEquals(1, ownedMultiplicities(usage).size());

		// This intermediate edited state cannot be obtained by parsing alone: remove
		// the multiplicity created by the parser, while retaining the end usage.
		usage.getOwnedRelationship().removeIf(relationship -> relationship instanceof OwningMembership
				&& ((OwningMembership) relationship).getOwnedMemberElement() instanceof Multiplicity);
		ElementUtil.clearCachesOf(usage);
		List<Relationship> relationships = new ArrayList<>(usage.getOwnedRelationship());

		// A cold feature query must leave zero owned multiplicities, not materialize one.
		usage.getFeature();
		usage.getFeatureMembership();
		assertTrue(ownedMultiplicities(usage).isEmpty());
		assertEquals(relationships, usage.getOwnedRelationship());
	}

	/**
	 * Eligible type-owned usages receive a plain default multiplicity even with
	 * explicit subsettings or redefinitions, including chain and package targets.
	 */
	@Test
	public void explicitSpecializationsReceiveDefaultMultiplicity() throws Exception {
		Resource resource = parse("specializedMultiplicities.sysml", """
				attribute globalValues[0..*];
				part def Base { attribute values[0..*]; }
				part def Derived :> Base {
					attribute redefinedValues redefines values;
					attribute subsetValues subsets values;
					part nested : Base;
					attribute chainValues subsets nested.values;
					attribute packageValues subsets globalValues;
					attribute plainValues;
				}
				""");
		for (String name : List.of("redefinedValues", "subsetValues", "chainValues", "packageValues")) {
			Usage usage = findByName(resource, name, Usage.class);
			// ST6RI-774 allows the default even when the target has [0..*].
			assertEquals(name, 1, ownedMultiplicities(usage).size());
			Multiplicity multiplicity = ownedMultiplicities(usage).get(0);
			assertEquals(SysMLPackage.Literals.MULTIPLICITY, multiplicity.eClass());
			usage.getFeature();
			SysMLParserPostProcessorFactory.getPostProcessor(usage).postProcess();
			assertEquals(name, 1, ownedMultiplicities(usage).size());
		}
		assertEquals(1, ownedMultiplicities(findByName(resource, "plainValues", Usage.class)).size());

		// Explicit transformation must retain the same multiplicity choices.
		ElementUtil.transformAll(resource, true);
		for (String name : List.of("redefinedValues", "subsetValues", "chainValues", "packageValues")) {
			assertEquals(name, 1, ownedMultiplicities(findByName(resource, name, Usage.class)).size());
		}
	}

	/**
	 * Cyclic explicit subsettings still receive default multiplicities; repeated parser
	 * preparation must terminate without resolving either target.
	 */
	@Test
	public void cyclicSubsettingsDoNotResolveTargets() throws Exception {
		Resource resource = parse("cyclicMultiplicities.sysml", """
				part def Holder {
					attribute left subsets right;
					attribute right subsets left;
				}
				""");
		for (String name : List.of("left", "right")) {
			Usage usage = findByName(resource, name, Usage.class);
			Subsetting subsetting = usage.getOwnedRelationship().stream()
					.filter(Subsetting.class::isInstance).map(Subsetting.class::cast).findFirst().orElseThrow();
			// Non-resolving reads verify that multiplicity preparation leaves the proxy intact.
			Object target = subsetting.eGet(SysMLPackage.Literals.SUBSETTING__SUBSETTED_FEATURE, false);
			assertTrue(target instanceof EObject);
			assertTrue(((EObject) target).eIsProxy());
			SysMLParserPostProcessorFactory.getPostProcessor(usage).postProcess();
			assertSame(target, subsetting.eGet(SysMLPackage.Literals.SUBSETTING__SUBSETTED_FEATURE, false));
			assertTrue(((EObject) target).eIsProxy());
			assertEquals(name, 1, ownedMultiplicities(usage).size());
		}
	}

	/**
	 * Only eligible type-owned usages receive a default; package-owned usages,
	 * ordinary references and non-end connections retain no owned multiplicity.
	 */
	@Test
	public void defaultMultiplicityDependsOnKindAndOwner() throws Exception {
		Resource resource = parse("multiplicityKinds.sysml", """
				attribute packageAttribute;
				item packageItem;
				part packagePart;
				port packagePort;
				part def Holder {
					attribute ownedAttribute;
					item ownedItem;
					part ownedPart;
					port ownedPort;
					ref reference;
					connection link;
				}
				""");
		// Eligible usages receive Multiplicity, never a synthetic MultiplicityRange.
		for (String name : List.of("ownedAttribute", "ownedItem", "ownedPart", "ownedPort")) {
			List<Multiplicity> multiplicities = ownedMultiplicities(findByName(resource, name, Usage.class));
			assertEquals(name, 1, multiplicities.size());
			assertEquals(name, SysMLPackage.Literals.MULTIPLICITY, multiplicities.get(0).eClass());
		}
		// Neither package ownership nor an ineligible kind may introduce a default.
		for (String name : List.of("packageAttribute", "packageItem", "packagePart", "packagePort", "reference", "link")) {
			assertTrue(name, ownedMultiplicities(findByName(resource, name, Usage.class)).isEmpty());
		}
	}

	private Resource parse(String name, String text) throws Exception {
		Resource resource = resourceSet.createResource(URI.createURI("memory:/" + name));
		models.add(resource);
		resource.load(new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)), Map.of());
		assertTrue(resource.getErrors().toString(), resource.getErrors().isEmpty());
		return resource;
	}

	private static <T extends Type> T findByName(Resource resource, String name, Class<T> kind) {
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			EObject object = contents.next();
			if (kind.isInstance(object) && name.equals(kind.cast(object).getDeclaredName())) {
				return kind.cast(object);
			}
		}
		throw new AssertionError("Missing " + name);
	}

	private static List<Multiplicity> ownedMultiplicities(Usage usage) {
		return NamespaceUtil.getOwnedMembersOf(usage).filter(Multiplicity.class::isInstance)
				.map(Multiplicity.class::cast).toList();
	}
}
