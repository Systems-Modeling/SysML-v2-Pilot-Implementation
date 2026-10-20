/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2026 Obeo
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Map;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.junit.Before;
import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.adapter.TypeAdapter;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationCacheUtil;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationServices;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

/** Tests derived model views during lazy specialization and transformation. */
public class ConservativeDerivedMembershipCacheTest {

	private SysMLInteractive interactive;

	/** Loads fresh, unresolved libraries so each test exercises lazy metadata linking. */
	@Before
	public void loadLibraries() {
		interactive = SysMLInteractive.createInstance();
		interactive.setVerbose(false);
		interactive.getLibraryIndexCache().setIndexDisabled(true);
		interactive.loadLibrary(Path.of(System.getProperty("libraryPath")).toAbsolutePath().toString());
		ImplicitSpecializationServices.install(interactive.getResourceSet(),
				new ImplicitSpecializationService(type -> true));
	}

	/**
	 * Resolving metadata before parent-first transformation must leave exactly two causation
	 * ends and no inherited-name warning, without an extra manual cache clear.
	 */
	@Test
	public void causationDoesNotRetainAnInheritedThirdEnd() throws Exception {
		// package Regression { private import CauseAndEffect::*;
		// occurrence a; occurrence b; #causation connect a to b; }
		Resource model = parse("causation.sysml", "package Regression { private import CauseAndEffect::*; "
				+ "occurrence a; occurrence b; #causation connect a to b; }");
		assertBinaryConnectorAfterTransformation(model);
	}

	/**
	 * Metadata on both ends of a derivation must not retain BinaryLink::target as a third end.
	 */
	@Test
	public void derivationDoesNotRetainAnInheritedThirdEnd() throws Exception {
		// package Regression { private import RequirementDerivation::*;
		// requirement a; requirement b;
		// #derivation connection { end #original ::> a; end #derive ::> b; } }
		Resource model = parse("derivation.sysml", "package Regression { private import RequirementDerivation::*; "
				+ "requirement a; requirement b; #derivation connection { end #original ::> a; end #derive ::> b; } }");
		assertBinaryConnectorAfterTransformation(model);
	}

	/**
	 * A model excluded from persistent specialization caching must still return correct members
	 * after transformation; absence of a cache must not be mistaken for a stable empty result.
	 */
	@Test
	public void uncachedCausationKeepsCorrectMembers() throws Exception {
		// Same causation model, with persistent caches enabled for libraries only.
		Resource model = parse("uncached.sysml", "package Regression { private import CauseAndEffect::*; "
				+ "occurrence a; occurrence b; #causation connect a to b; }");
		ImplicitSpecializationServices.install(interactive.getResourceSet(),
				new ImplicitSpecializationService(type -> type.eResource() != model));
		assertBinaryConnectorAfterTransformation(model);
	}

	/**
	 * Cyclic explicit inheritance must terminate and retain the owned features on either side,
	 * including when the model has no persistent specialization caches.
	 */
	@Test
	public void cyclicInheritanceTerminatesWithoutPersistentModelCaches() throws Exception {
		// part def A :> B { part a; } part def B :> A { part b; }
		Resource model = parse("cycle.sysml", "part def A :> B { part a; } part def B :> A { part b; }");
		ImplicitSpecializationServices.install(interactive.getResourceSet(),
				new ImplicitSpecializationService(type -> type.eResource() != model));
		EcoreUtil2.resolveLazyCrossReferences(model, null);
		Type a = find(model, "A", Type.class);
		Type b = find(model, "B", Type.class);

		// Each query must include both features and remain repeatable through the inheritance cycle.
		for (int i = 0; i < 2; i++) {
			assertTrue(TypeUtil.getFeatureOf(a).contains(find(model, "a", Feature.class)));
			assertTrue(TypeUtil.getFeatureOf(a).contains(find(model, "b", Feature.class)));
			assertTrue(TypeUtil.getFeatureOf(b).contains(find(model, "a", Feature.class)));
			assertTrue(TypeUtil.getFeatureOf(b).contains(find(model, "b", Feature.class)));
		}
	}

	/**
	 * Initial linking of the libraries must preserve the private redefinition filtering used
	 * by composite parts, so an inherited incomingTransferSort does not appear twice.
	 */
	@Test
	public void libraryLinkingKeepsIncomingTransferSortDistinguishable() throws Exception {
		// package Regression {
		//   part producer[1] { :>> incomingTransferSort = Occurrences::earlierFirstIncomingTransferSort; }
		//   part realization { part p :> producer; }
		// }
		Resource model = parse("sort.sysml", "package Regression { part producer[1] { "
				+ ":>> incomingTransferSort = Occurrences::earlierFirstIncomingTransferSort; } "
				+ "part realization { part p :> producer; } }");

		// Match the benchmark: resolve libraries before models, then transform the whole set.
		var resources = interactive.getResourceSet();
		for (int i = 0; i < resources.getResources().size(); i++) {
			EcoreUtil2.resolveLazyCrossReferences(resources.getResources().get(i), null);
		}
		ElementUtil.transformAll(resources, false);

		// Both inherited sources must be filtered consistently, without an extra cache clear.
		var validator = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(model.getURI()).getResourceValidator();
		var issues = validator.validate(model, CheckMode.ALL, CancelIndicator.NullImpl);
		assertTrue(issues.toString(), issues.isEmpty());
	}

	/**
	 * Complete specialization snapshots must not cause membership retention during an unrelated
	 * service evaluation; the same membership view can be retained after that evaluation ends.
	 */
	@Test
	public void membershipReuseWaitsForTheOutermostEvaluation() throws Exception {
		// class Owner; class Other;
		// Other receives a probe that reads Owner's members while its typing rules execute.
		Resource model = parse("evaluation.kerml", "class Owner; class Other;");
		Type owner = find(model, "Owner", Type.class);
		Type other = find(model, "Other", Type.class);
		// A complete empty snapshot isolates the evaluation guard from library dependencies.
		var cache = ImplicitSpecializationCacheUtil.installCache(owner);
		cache.setCandidates(List.of(), true);
		cache.setRedefinitionsStable(true);
		TypeAdapter adapter = (TypeAdapter) ElementUtil.getElementAdapter(owner);
		var expected = adapter.getFeatureMembership();
		assertSame(expected, adapter.getFeatureMembership());
		ElementUtil.clearCachesOf(owner);
		AtomicReference<List<FeatureMembership>> provisional = new AtomicReference<>();
		Feature probe = new FeatureImpl() {
			@Override
			public EList<FeatureTyping> getOwnedTyping() {
				if (provisional.get() == null) {
					assertTrue(ImplicitSpecializationServices.get(this).isEvaluationInProgress(this));
					var first = adapter.getFeatureMembership();
					provisional.set(first);
					assertEquals(expected, first);
					assertNotSame(first, adapter.getFeatureMembership());
				}
				return super.getOwnedTyping();
			}
		};
		TypeUtil.addOwnedFeatureTo(other, probe);
		ImplicitSpecializationServices.get(probe).getImplicitSpecializationCandidates(probe);

		// The first query outside evaluation can retain the result without a manual owner clear.
		var stable = adapter.getFeatureMembership();
		assertEquals(expected, stable);
		assertNotSame(provisional.get(), stable);
		assertSame(stable, adapter.getFeatureMembership());
	}

	private void assertBinaryConnectorAfterTransformation(Resource model) {
		// Resolution may fill a parent's derived view before both end redefinitions are available.
		EcoreUtil2.resolveLazyCrossReferences(model, null);
		Connector connector = null;
		for (var contents = model.getAllContents(); contents.hasNext();) {
			if (contents.next() instanceof Connector candidate) {
				connector = candidate;
				break;
			}
		}
		assertTrue(connector != null);
		assertEquals(2, connector.getOwnedEndFeature().size());
		connector.getFeatureMembership();

		// Transforming the parent clears its views, then can rebuild them before the children.
		ElementUtil.transformAll(model, false);
		assertEquals(connector.getOwnedEndFeature(), TypeUtil.getEndFeatureOf(connector));
		assertTrue(FeatureUtil.getRedefinedFeaturesWithComputedOf(connector.getOwnedEndFeature().get(1)).size() > 0);
		var validator = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(model.getURI()).getResourceValidator();
		var issues = validator.validate(model, CheckMode.ALL, CancelIndicator.NullImpl);
		assertTrue(issues.toString(), issues.isEmpty());
	}

	private Resource parse(String name, String text) throws Exception {
		Resource model = interactive.getResourceSet().createResource(URI.createURI("memory:/" + name));
		model.load(new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)), Map.of());
		assertTrue(model.getErrors().toString(), model.getErrors().isEmpty());
		return model;
	}

	private static <T extends Type> T find(Resource model, String name, Class<T> kind) {
		for (var contents = model.getAllContents(); contents.hasNext();) {
			var element = contents.next();
			if (kind.isInstance(element) && name.equals(kind.cast(element).getDeclaredName())) {
				return kind.cast(element);
			}
		}
		throw new AssertionError("Missing " + name);
	}
}
