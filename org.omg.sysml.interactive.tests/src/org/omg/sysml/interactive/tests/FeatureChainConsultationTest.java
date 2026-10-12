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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

/** Characterizes feature-chain structure and semantics across consultation and editing. */
public class FeatureChainConsultationTest {
	private static ResourceSet resourceSet;
	private final List<Resource> models = new ArrayList<>();

	/** Loads and resolves the standard library once for the textual scenarios. */
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

	private Resource parse(String name, String text) throws Exception {
		Resource resource = resourceSet.createResource(URI.createURI("memory:/" + name));
		models.add(resource);
		resource.load(new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)), Map.of());
		assertTrue(resource.getErrors().toString(), resource.getErrors().isEmpty());
		return resource;
	}

	private static <T extends Type> T findByName(Resource resource, String name, Class<T> kind) {
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			var object = contents.next();
			if (kind.isInstance(object) && name.equals(kind.cast(object).getDeclaredName())) {
				return kind.cast(object);
			}
		}
		throw new AssertionError("Missing " + name);
	}

	private static <T> T findSingle(Resource resource, Class<T> kind) {
		T found = null;
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			var object = contents.next();
			if (kind.isInstance(object)) {
				if (found != null) {
					throw new AssertionError("Expected exactly one " + kind.getSimpleName() + ", found a second");
				}
				found = kind.cast(object);
			}
		}
		if (found == null) {
			throw new AssertionError("Missing " + kind.getSimpleName());
		}
		return found;
	}


	/**
	 * A cached textual chain retains its source target, output and argument order
	 * through queries, cache clearing and repeated materialization.
	 */
	@Test
	public void chainRetainsSourceTargetAndResult() throws Exception {
		Resource resource = parse("chainLifecycle.kerml", """
				package Chain {
					struct V { feature n : ScalarValues::Integer; }
					feature v : V;
					feature selected = v.n;
				}
				""");
		FeatureChainExpression chain = findSingle(resource, FeatureChainExpression.class);
		Feature target = findByName(resource, "n", Feature.class);
		// Resolution and result lookup can create the nested source target in the current implementation.
		EcoreUtil2.resolveLazyCrossReferences(resource, null);
		// Pilot computes feature-chain specializations through explicit transformation.
		ElementUtil.transformAll(resource, false);
		Feature result = chain.getResult();
		Feature source = sourceParameter(chain);
		Feature sourceTarget = chain.sourceTargetFeature();
		assertNotNull(sourceTarget);
		assertEquals("", sourceTarget.getDeclaredName());
		assertSame(source, sourceTarget.getOwningType());
		assertEquals(List.of(sourceTarget), source.getOwnedFeature());
		List<Expression> arguments = List.copyOf(chain.getArgument());
		assertEquals(1, arguments.size());
		assertEquals(target.getType(), result.getType());
		assertTrue(FeatureUtil.getRedefinedFeaturesWithComputedOf(sourceTarget).contains(target));
		assertTrue(FeatureUtil.getRedefinedFeaturesWithComputedOf(sourceTarget).stream()
				.anyMatch(feature -> "ControlFunctions::'.'::source::target".equals(feature.getQualifiedName())));
		assertTrue(TypeUtil.getGeneralTypesOf(result).stream().anyMatch(type -> type instanceof Feature feature
				&& feature.getChainingFeature().equals(List.of(source, sourceTarget))));

		// Cold derived queries and transformation must preserve structural identities and argument positions.
		clearDerivedCaches(resource);
		assertSame(result, chain.getResult());
		assertSame(sourceTarget, chain.sourceTargetFeature());
		ElementUtil.transformAll(resource, true);
		ElementUtil.transformAll(resource, true);
		assertSame(result, chain.getResult());
		assertSame(sourceTarget, chain.sourceTargetFeature());
		assertEquals(arguments, chain.getArgument());
		assertEquals(List.of(sourceTarget), source.getOwnedFeature());
		assertEquals(target.getType(), result.getType());
	}

	/**
	 * Retargeting a prepared chain A -> missing -> B -> A changes its redefinitions
	 * and result type without replacing its nested feature; explicit transformation refreshes semantics.
	 */
	@Test
	public void targetEditsPreservePreparedStructure() throws Exception {
		Resource resource = parse("editedChain.kerml", """
				package Edited {
					struct V {
						feature number : ScalarValues::Integer;
						feature flag : ScalarValues::Boolean;
					}
					feature v : V;
					feature selected = v.number;
				}
				""");
		FeatureChainExpression chain = findSingle(resource, FeatureChainExpression.class);
		Feature number = findByName(resource, "number", Feature.class);
		Feature flag = findByName(resource, "flag", Feature.class);
		EcoreUtil2.resolveLazyCrossReferences(resource, null);
		// Pilot computes feature-chain specializations through explicit transformation.
		ElementUtil.transformAll(resource, false);
		Feature result = chain.getResult();
		Feature sourceTarget = chain.sourceTargetFeature();
		assertNotNull(sourceTarget);
		Membership reference = chain.getOwnedMembership().stream()
				.filter(member -> member.getMemberElement() == number).findFirst().orElseThrow();
		List<Relationship> relationships = List.copyOf(sourceParameter(chain).getOwnedRelationship());

		// An absent target is an intermediate editor state, not a request to rebuild the source target.
		reference.setMemberElement(null);
		invalidateEditedModel(resource);
		ElementUtil.transformAll(resource, false);
		assertNull(chain.getTargetFeature());
		assertFalse(FeatureUtil.getRedefinedFeaturesWithComputedOf(sourceTarget).contains(number));
		assertSame(sourceTarget, chain.sourceTargetFeature());
		for (Feature target : List.of(flag, number)) {
			// Equivalent texts: v.flag, then v.number, retaining the expression and its source parameter.
			reference.setMemberElement(target);
			invalidateEditedModel(resource);
			ElementUtil.transformAll(resource, false);
			List<Feature> redefined = FeatureUtil.getRedefinedFeaturesWithComputedOf(sourceTarget);
			assertEquals(List.of(target), redefined.stream().filter(f -> f == number || f == flag).toList());
			assertEquals(target.getType(), result.getType());
			assertSame(result, chain.getResult());
			assertSame(sourceTarget, chain.sourceTargetFeature());
			assertEquals(relationships, sourceParameter(chain).getOwnedRelationship());
			assertTrue(ElementUtil.isTransformed(chain));
		}
	}

	/**
	 * Nested chains over cyclic source subsettings terminate and keep distinct
	 * source targets, while their results retain the recursive structure's type.
	 */
	@Test
	public void nestedChainsWithCyclicSourcesRetainDistinctTargets() throws Exception {
		Resource resource = parse("cyclicChain.kerml", """
				package Cyclic {
					struct Node { feature next : Node; }
					feature a : Node :> b;
					feature b : Node :> a;
					feature selected = (a.next).next;
				}
				""");
		Feature selected = findByName(resource, "selected", Feature.class);
		FeatureChainExpression outer = (FeatureChainExpression) FeatureUtil.getValuationFor(selected).getValue();
		EcoreUtil2.resolveLazyCrossReferences(resource, null);
		// Pilot computes feature-chain specializations through explicit transformation.
		ElementUtil.transformAll(resource, false);
		FeatureChainExpression inner = (FeatureChainExpression) outer.getArgument().get(0);
		Type node = findByName(resource, "Node", Type.class);
		// Query the outer result first to exercise nested semantic consultation.
		assertEquals(List.of(node), outer.getResult().getType());
		assertEquals(List.of(node), inner.getResult().getType());
		Feature outerTarget = outer.sourceTargetFeature();
		Feature innerTarget = inner.sourceTargetFeature();
		assertNotNull(outerTarget);
		assertNotNull(innerTarget);
		assertNotSame(innerTarget, outerTarget);
		clearDerivedCaches(resource);
		assertEquals(List.of(node), outer.getResult().getType());
		assertSame(outerTarget, outer.sourceTargetFeature());
		assertSame(innerTarget, inner.sourceTargetFeature());
	}

	/**
	 * An incomplete programmatic chain tolerates an absent parameter; once an input
	 * exists, repeated feature consultation supplies exactly one nested source target.
	 */
	@Test
	public void programmaticChainSupportsDeferredSourceCreation() {
		// No textual equivalent for this intermediate construction state: neither input nor output exists yet.
		FeatureChainExpression chain = SysMLFactory.eINSTANCE.createFeatureChainExpression();
		assertNull(chain.sourceTargetFeature());
		chain.getFeature();
		assertTrue(chain.getOwnedRelationship().isEmpty());
		Feature source = TypeUtil.addOwnedParameterTo(chain, SysMLFactory.eINSTANCE.createLiteralInteger())
				.getOwnedMemberParameter();
		TypeUtil.addResultParameterTo(chain);
		ElementUtil.clearCachesOf(chain);
		// Match the parser's completed parameter order before consulting the chain.
		chain.getFeature();
		Feature sourceTarget = chain.sourceTargetFeature();
		assertNotNull(sourceTarget);
		assertEquals("", sourceTarget.getDeclaredName());
		chain.getFeatureMembership();
		assertSame(sourceTarget, chain.sourceTargetFeature());
		assertEquals(List.of(sourceTarget), source.getOwnedFeature());
	}

	/**
	 * A caller-supplied nested feature is retained, including its name, rather than
	 * being replaced by an anonymous source target during consultation.
	 */
	@Test
	public void explicitNestedSourceFeatureIsPreserved() {
		// Programmatically supply the nested feature that the textual syntax normally leaves implicit.
		FeatureChainExpression chain = SysMLFactory.eINSTANCE.createFeatureChainExpression();
		Feature source = TypeUtil.addOwnedParameterTo(chain, SysMLFactory.eINSTANCE.createLiteralInteger())
				.getOwnedMemberParameter();
		Feature explicit = SysMLFactory.eINSTANCE.createFeature();
		explicit.setDeclaredName("explicitTarget");
		TypeUtil.addOwnedFeatureTo(source, explicit);
		TypeUtil.addResultParameterTo(chain);
		chain.getFeature();
		chain.getResult();
		assertSame(explicit, chain.sourceTargetFeature());
		assertEquals("explicitTarget", explicit.getDeclaredName());
		assertEquals(List.of(explicit), source.getOwnedFeature());
	}

	/**
	 * An XMI chain lacking the nested feature acquires a source target through the
	 * current consultation path and retains its target identity and inferred type.
	 */
	@Test
	public void xmiChainProvidesSourceTargetWithoutParserCallback() throws Exception {
		Resource parsed = parse("xmiChain.kerml", """
				package XmiChain {
					struct V { feature n : ScalarValues::Integer; }
					feature v : V;
					feature selected = v.n;
				}
				""");
		EcoreUtil2.resolveLazyCrossReferences(parsed, null);
		FeatureChainExpression original = findSingle(parsed, FeatureChainExpression.class);
		Feature sourceTarget = original.sourceTargetFeature();
		assertNotNull(sourceTarget);
		// Serialize a deliberately unprepared nested structure while preserving input, output and references.
		sourceParameter(original).getOwnedRelationship().remove(sourceTarget.getOwningRelationship());
		Resource serialized = new XMIResourceImpl(URI.createURI("memory:/chainSerialized.xmi"));
		serialized.getContents().addAll(parsed.getContents());
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		serialized.save(bytes, Map.of());
		Resource loaded = new XMIResourceImpl(URI.createURI("memory:/chainLoaded.xmi"));
		try {
			parsed.getResourceSet().getResources().add(loaded);
			loaded.load(new ByteArrayInputStream(bytes.toByteArray()), Map.of());
			FeatureChainExpression chain = findSingle(loaded, FeatureChainExpression.class);
			assertNull(chain.sourceTargetFeature());
			Feature result = chain.getResult();
			ElementUtil.transformAll(loaded, false);
			Feature restored = chain.sourceTargetFeature();
			assertNotNull(restored);
			Feature target = findByName(loaded, "n", Feature.class);
			assertSame(target, chain.getTargetFeature());
			assertTrue(FeatureUtil.getRedefinedFeaturesWithComputedOf(restored).contains(target));
			assertEquals(target.getType(), result.getType());
			assertSame(restored, chain.sourceTargetFeature());
		} finally {
			loaded.unload();
			parsed.getResourceSet().getResources().remove(loaded);
		}
	}

	private Feature sourceParameter(FeatureChainExpression chain) {
		return chain.getOwnedFeature().stream().filter(feature -> feature.getDirection() == FeatureDirectionKind.IN)
				.findFirst().orElseThrow();
	}

	/** Resets Pilot adapters so explicit transformation recomputes semantics after edits. */
	private void invalidateEditedModel(Resource resource) {
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			if (contents.next() instanceof Element element) {
				ElementUtil.clean(element);
			}
		}
	}

	private void clearDerivedCaches(Resource resource) {
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			if (contents.next() instanceof Element element) {
				ElementUtil.clearCachesOf(element);
			}
		}
	}
}
