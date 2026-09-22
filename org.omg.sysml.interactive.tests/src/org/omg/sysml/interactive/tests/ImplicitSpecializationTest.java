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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.sysml.adapter.TypeAdapter;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.lang.sysml.ConnectionDefinition;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationCacheUtil;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationServices;
import org.omg.sysml.logic.implicit.specialization.api.IImplicitSpecializationCache;
import org.omg.sysml.logic.implicit.specialization.api.IImplicitSpecializationService;
import org.omg.sysml.logic.implicit.specialization.api.ImplicitSpecialization;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Exercises lazy queries on live parsed models without invoking the Pilot
 * transformation.
 */
public class ImplicitSpecializationTest {

	private static final Set<Resource> immutableResources = Collections.newSetFromMap(new IdentityHashMap<>());
	private static ResourceSet resourceSet;
	private final List<Resource> models = new ArrayList<>();
	private ImplicitSpecializationService implicitSpecializationService;

	/**
	 * Loads and resolves libraries once; test model resources are uncached unless
	 * selected explicitly.
	 */
	@BeforeClass
	public static void loadLibraries() {
		SysMLInteractive interactive = SysMLInteractive.createInstance();
		interactive.setVerbose(false);
		interactive.getLibraryIndexCache().setIndexDisabled(true);
		interactive.loadLibrary(Path.of(System.getProperty("libraryPath")).toAbsolutePath().toString());
		resourceSet = interactive.getResourceSet();
		immutableResources.addAll(resourceSet.getResources());
		for (int i = 0; i < resourceSet.getResources().size(); i++) {
			EcoreUtil2.resolveLazyCrossReferences(resourceSet.getResources().get(i), null);
		}
	}

	@Before
	public void setUp() {
		this.implicitSpecializationService = new ImplicitSpecializationService(
				type -> immutableResources.contains(type.eResource()));
		ImplicitSpecializationServices.install(resourceSet, implicitSpecializationService);

	}

	/**
	 * Removes each scenario without altering the shared library contents or cache
	 * policy.
	 */
	@After
	public void removeModels() {
		for (Resource resource : models) {
			immutableResources.remove(resource);
			resource.unload();
			resourceSet.getResources().remove(resource);
		}
	}

	private ImplicitSpecializationService installImplicitSpecializationService(Predicate<Type> predicate) {
		ImplicitSpecializationService service = new ImplicitSpecializationService(predicate);
		ImplicitSpecializationServices.install(resourceSet, service);
		return service;
	}

	/**
	 * Car's inherited Parts::Part is filtered without losing raw candidates or
	 * inserting relationships.
	 */
	@Test
	public void reducedConsultationDoesNotTransformOrMaterialize() throws Exception {
		// part def Vehicle; part def Car :> Vehicle;
		Resource resource = parse("reduction.sysml", "part def Vehicle; part def Car :> Vehicle;", true);
		Type vehicle = find(resource, "Vehicle", Type.class);
		Type car = find(resource, "Car", Type.class);
		var raw = ImplicitSpecializationServices.get(car).getImplicitSpecializationCandidates(car);
		assertContains(raw, "Parts::Part");
		assertTrue(ImplicitSpecializationServices.get(car).getImplicitSpecializations(car).isEmpty());

		// Reduction is a projection: it must not remove the engine's default or alter
		// the explicit edge.
		assertSame(raw, ImplicitSpecializationServices.get(car).getImplicitSpecializationCandidates(car));
		assertEquals(1, car.getOwnedSpecialization().size());
		assertSame(vehicle, car.getOwnedSpecialization().get(0).getGeneral());
		assertFalse(ElementUtil.isTransformed(car));
		assertFalse(ElementUtil.isTransformed(vehicle));

		// Pilot resolution after transformation uses the reduced view, while explicit
		// raw queries remain intact.
		ElementUtil.transformAll(resource, false);
		assertTrue(TypeUtil.getImplicitGeneralTypesFor(car).isEmpty());
		assertContains(ImplicitSpecializationServices.get(car).getImplicitSpecializationCandidates(car), "Parts::Part");

		// Materialization is explicit and idempotent, even if the view was previously
		// cached.
		TypeUtil.insertImplicitSpecializations(vehicle);
		TypeUtil.insertImplicitSpecializations(vehicle);
		assertEquals(1, vehicle.getOwnedSpecialization().size());
		assertTrue(vehicle.getOwnedSpecialization().get(0).isImplied());
	}

	/**
	 * An edited connection changes its default after invalidation, preserving
	 * unrelated membership caches.
	 */
	@Test
	public void invalidationResetsDefaultWithoutClearingMemberships() throws Exception {
		// Before: connection def Link { end item a; }
		// After: connection def Link { end item a; end item b; }
		Resource resource = parse("invalidation.sysml", "connection def Link { end item a; }", true);
		ConnectionDefinition link = find(resource, "Link", ConnectionDefinition.class);
		var original = ImplicitSpecializationServices.get(link).getImplicitSpecializations(link);
		assertContains(original, "Connections::Connection");
		TypeAdapter adapter = (TypeAdapter) ElementUtil.getElementAdapter(link);
		var memberships = adapter.getFeatureMembership();

		addEnd(link);
		assertSame("Model edits do not invalidate automatically", original,
				ImplicitSpecializationServices.get(link).getImplicitSpecializations(link));
		ImplicitSpecializationCacheUtil.invalidate(link);
		assertSame("Invalidation is independent of memberships", memberships, adapter.getFeatureMembership());
		assertContains(ImplicitSpecializationServices.get(link).getImplicitSpecializations(link),
				"Connections::BinaryConnection");

		// Reading the ordinary derived membership property must not discard
		// specialization results.
		var cached = ImplicitSpecializationServices.get(link).getImplicitSpecializationCandidates(link);
		link.getFeatureMembership();
		assertSame(cached, ImplicitSpecializationServices.get(link).getImplicitSpecializationCandidates(link));
	}

	/**
	 * Resource selection supports user libraries and leaves editable connections
	 * recomputed on demand.
	 */
	@Test
	public void cacheSelectionIsLazyAndIndependentOfLibraryOrigin() throws Exception {
		Resource library = parse("user-library.sysml", "part def UserPart;", true);
		Type userPart = find(library, "UserPart", Type.class);
		var cached = ImplicitSpecializationServices.get(userPart).getImplicitSpecializationCandidates(userPart);
		assertSame(cached, ImplicitSpecializationServices.get(userPart).getImplicitSpecializationCandidates(userPart));

		// The model is not selected: adding the second end needs no
		// specialization-cache invalidation.
		Resource editable = parse("editable.sysml", "connection def Link { end item a; }", false);
		ConnectionDefinition link = find(editable, "Link", ConnectionDefinition.class);
		assertContains(ImplicitSpecializationServices.get(link).getImplicitSpecializations(link),
				"Connections::Connection");
		addEnd(link);
		assertContains(ImplicitSpecializationServices.get(link).getImplicitSpecializations(link),
				"Connections::BinaryConnection");
		assertSame("Editing another resource preserves library caches", cached,
				ImplicitSpecializationServices.get(userPart).getImplicitSpecializationCandidates(userPart));

		// Policy installation itself cannot evaluate the predicate or visit model
		// elements.
		AtomicBoolean consulted = new AtomicBoolean();

		installImplicitSpecializationService(type -> {
			consulted.set(true);
			return immutableResources.contains(type.eResource());
		});
		assertFalse(consulted.get());
		ImplicitSpecializationServices.get(userPart).getImplicitSpecializations(userPart);
		assertFalse("An installed cache bypasses the policy", consulted.get());
		ImplicitSpecializationServices.get(link).getImplicitSpecializations(link);
		assertTrue("An uncached type asks whether a cache may be installed", consulted.get());
		installImplicitSpecializationService(type -> immutableResources.contains(type.eResource()));
	}

	/**
	 * The standalone default recomputes queries; the injected Pilot binding
	 * explicitly enables reuse.
	 */
	@Test
	public void defaultIsUncachedAndPilotOptsIn() {
		// Equivalent model: feature value; count typing reads to observe actual
		// computation.
		AtomicInteger typingReads = new AtomicInteger();
		Feature feature = new FeatureImpl() {
			@Override
			public EList<FeatureTyping> getOwnedTyping() {
				typingReads.incrementAndGet();
				return super.getOwnedTyping();
			}
		};
		ResourceSet isolated = new ResourceSetImpl();
		Resource resource = new ResourceImpl(URI.createURI("memory:/default.kerml"));
		isolated.getResources().add(resource);
		resource.getContents().add(feature);
		IImplicitSpecializationService uncached = new ImplicitSpecializationService();
		ImplicitSpecializationServices.install(isolated, uncached);

		// No policy and no manually attached cache: each query evaluates the feature
		// again.
		TypeUtil.getImplicitGeneralTypesFor(feature);
		int firstReads = typingReads.get();
		TypeUtil.getImplicitGeneralTypesFor(feature);
		assertTrue("The default must not retain semantic results", typingReads.get() > firstReads);

		// Obtain the actual Guice binding registered by the Pilot runtime, not a
		// test-only policy.
		IResourceServiceProvider provider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(resource.getURI());
		IImplicitSpecializationService pilot = provider.get(IImplicitSpecializationService.class);
		ImplicitSpecializationServices.install(isolated, pilot);
		var candidates = pilot.getImplicitSpecializationCandidates(feature);
		int cachedReads = typingReads.get();
		assertSame(candidates, pilot.getImplicitSpecializationCandidates(feature));
		assertEquals("The Pilot binding installs a cache", cachedReads, typingReads.get());
	}

	/**
	 * Static utilities dispatch to the injected implementation and do not share
	 * services across ResourceSets.
	 */
	@Test
	public void utilitiesUseTheInjectedService() {
		// Equivalent model: feature value; the custom implementation supplies an
		// application-specific general.
		Feature feature = SysMLFactory.eINSTANCE.createFeature();
		Feature general = SysMLFactory.eINSTANCE.createFeature();
		Resource resource = new ResourceImpl(URI.createURI("memory:/injected.kerml"));
		ResourceSet isolated = new ResourceSetImpl();
		isolated.getResources().add(resource);
		resource.getContents().add(feature);
		// The feature is not transformed, so TypeUtil asks for the raw candidates.
		IImplicitSpecializationService custom = new ImplicitSpecializationService() {
			@Override
			public List<ImplicitSpecialization> getImplicitSpecializationCandidates(Type type) {
				assertSame(feature, type);
				return List.of(new ImplicitSpecialization(SysMLPackage.Literals.SUBSETTING, general));
			}
		};
		ImplicitSpecializationServices.install(isolated, custom);

		// TypeUtil must not bypass the supplied interface by calling a static
		// singleton.
		assertEquals(List.of(general), TypeUtil.getImplicitGeneralTypesFor(feature));
		assertSame(custom, ImplicitSpecializationServices.get(feature));
		assertSame("The shared model keeps its own service", implicitSpecializationService,
				ImplicitSpecializationServices.get(findLibraryType()));
	}

	/**
	 * Manually installed resource caches bypass a refusing policy, even when their
	 * contents are invalidated.
	 */
	@Test
	public void manuallyInstalledResourceCachesTakePrecedence() throws Exception {
		// part def Library { part item; } -- this resource is deliberately not selected
		// by the policy.
		Resource library = parse("manual-library.sysml", "part def Library { part item1; }", false);
		Type owner = find(library, "Library", Type.class);
		AtomicInteger policyCalls = new AtomicInteger();

		installImplicitSpecializationService(type -> {
			if (type.eResource() == library) {
				policyCalls.incrementAndGet();
				return false;
			}
			return immutableResources.contains(type.eResource());
		});
		List<Type> types = new ArrayList<>();
		for (var contents = EcoreUtil.getAllContents(library, false); contents.hasNext();) {
			if (contents.next() instanceof Type type) {
				types.add(type);
			}
		}
		assertTrue(types.size() >= 2);
		ImplicitSpecializationCacheUtil.installCaches(library);
		assertEquals("Manual installation never consults the policy", 0, policyCalls.get());
		assertFalse("Installation does not transform the model", ElementUtil.isTransformed(owner));
		for (Type type : types) {
			var cached = ImplicitSpecializationServices.get(type).getImplicitSpecializationCandidates(type);
			ImplicitSpecializationCacheUtil.installCaches(library);
			assertSame("Installation is idempotent", cached,
					ImplicitSpecializationServices.get(type).getImplicitSpecializationCandidates(type));
		}
		assertEquals("Attached caches bypass a refusing policy", 0, policyCalls.get());

		// Invalidation empties results, but retains the explicit permission represented
		// by the adapter.
		ImplicitSpecializationCacheUtil.invalidate(library);
		for (Type type : types) {
			ImplicitSpecializationServices.get(type).getImplicitSpecializations(type);
		}
		assertEquals("Refilling existing adapters still bypasses the policy", 0, policyCalls.get());

		// A subsequently added feature has no adapter and remains subject to the
		// refusing policy.
		Feature added = SysMLFactory.eINSTANCE.createFeature();
		TypeUtil.addOwnedFeatureTo(owner, added);
		ImplicitSpecializationServices.get(added).getImplicitSpecializationCandidates(added);
		assertTrue("New types still consult the installation policy", policyCalls.get() > 0);
	}

	/**
	 * A result parameter's redefinitions are available before index-expression
	 * argument resolution.
	 */
	@Test
	public void expressionResultQueriesWorkWithoutTransformation() throws Exception {
		// The index result must subset the sequence result, including when arguments
		// ask for redefinitions.
		Resource resource = parse("index.kerml",
				"feature values : ScalarValues::Integer[3]; feature value = values#(1);", true);
		Feature value = find(resource, "value", Feature.class);
		var candidates = ImplicitSpecializationServices.get(value).getImplicitSpecializationCandidates(value);
		assertFalse(candidates.isEmpty());
		assertFalse(ElementUtil.isTransformed(value));
	}

	/**
	 * Multiple inheritance must select ActionUsage and FlowUsage defaults before
	 * generic event/connector rules.
	 */
	@Test
	public void switchPreservesSpecificDefaults() throws Exception {
		// A flow without ends is a message connection (checkFlowUsageSpecialization).
		Resource resource = parse("switch.sysml", "part def P { perform action a; flow f; }", false);
		assertContains(
				implicitSpecializationService.getImplicitSpecializationCandidates(find(resource, "a", Feature.class)),
				"Actions::actions");
		assertContains(
				implicitSpecializationService.getImplicitSpecializationCandidates(find(resource, "f", Feature.class)),
				"Flows::messages");
	}

	/**
	 * Cyclic explicit specializations terminate and retain a default that cannot
	 * prove itself redundant.
	 */
	@Test
	public void reductionDoesNotEraseDefaultsThroughSpecificTypeCycles() throws Exception {
		// This is an intermediate editor state; no validator is invoked to reject the
		// cycle.
		Resource resource = parse("cycle.sysml", "part def A :> B; part def B :> A;", false);
		Type a = find(resource, "A", Type.class);
		Type b = find(resource, "B", Type.class);
		assertContains(implicitSpecializationService.getImplicitSpecializationCandidates(a), "Parts::Part");
		assertContains(implicitSpecializationService.getImplicitSpecializationCandidates(b), "Parts::Part");
		assertFalse(implicitSpecializationService.getImplicitSpecializations(a).isEmpty());
		assertFalse(implicitSpecializationService.getImplicitSpecializations(b).isEmpty());
	}

	/**
	 * An exception during a rule must remove the active computation so the next
	 * request really retries.
	 */
	@Test
	public void failedComputationDoesNotLeaveARecursionGuard() throws Exception {
		Resource resource = parse("failure.sysml", "part def Owner;", false);
		PartDefinition owner = find(resource, "Owner", PartDefinition.class);
		AtomicBoolean fail = new AtomicBoolean(true);
		// A programmatic feature is required here to inject a failing derived access.
		Feature feature = new FeatureImpl() {
			@Override
			public EList<FeatureTyping> getOwnedTyping() {
				if (fail.getAndSet(false)) {
					throw new IllegalStateException("test failure");
				}
				return super.getOwnedTyping();
			}
		};
		TypeUtil.addOwnedFeatureTo(owner, feature);
		assertThrows(IllegalStateException.class,
				() -> implicitSpecializationService.getImplicitSpecializationCandidates(feature));
		assertContains(implicitSpecializationService.getImplicitSpecializationCandidates(feature), "Base::things");
	}

	/**
	 * Materializing an end's featuring type must preserve the owning definition as
	 * a resource root.
	 */
	@Test
	public void materializationPreservesResourceRoots() throws Exception {
		// connection def Link { end item a; end item b; }
		Resource resource = parse("root.sysml", "", true);
		// Direct roots are used by plain EMF applications; the text parser wraps
		// definitions in a namespace.
		ConnectionDefinition link = SysMLFactory.eINSTANCE.createConnectionDefinition();
		resource.getContents().add(link);
		addEnd(link);
		addEnd(link);
		ElementUtil.transformAll(link, true);
		assertSame("Featuring must not move Link into one of its own ends", resource, link.eResource());
		assertTrue(link.getOwnedSpecialization().stream()
				.anyMatch(edge -> "Connections::BinaryConnection".equals(edge.getGeneral().getQualifiedName())));
	}

	/**
	 * Semantic metadata contributes its evaluated base feature before any
	 * transformation.
	 */
	@Test
	public void semanticMetadataIsEvaluatedInItsContext() throws Exception {
		// The metadata value refers to measuresOfEffectiveness, not the annotated
		// attribute.
		Resource resource = parse("metadata.sysml",
				"private import ParametersOfInterestMetadata::*; #moe attribute score;", false);
		Feature score = find(resource, "score", Feature.class);
		assertContains(implicitSpecializationService.getImplicitSpecializationCandidates(score),
				"ParametersOfInterestMetadata::measuresOfEffectiveness");
		assertFalse(ElementUtil.isTransformed(score));
	}

	/**
	 * Resolving a metadata metaclass must let an unnamed feature bind to the
	 * metadata-provided inherited member.
	 */
	@Test
	public void metadataMetaclassLinkingUsesTheAnnotatedTypesBases() throws Exception {
		Resource resource = parse("metadata-scope.kerml", """
				package MetadataScope {
				    private import Metaobjects::SemanticMetadata;
				    classifier P { feature a; }
				    feature p : P;
				    metaclass M :> SemanticMetadata {
				        :>> baseType = p meta KerML::Feature;
				    }
				    classifier Q {
				        feature a = 1;
				        #M feature p1 { feature :>> a = 2; }
				    }
				}
				""", true);
		Feature inherited = find(resource, "a", Feature.class); // P::a is the first declaration.
		assertEquals("MetadataScope::P::a", inherited.getQualifiedName());
		Feature annotated = find(resource, "p1", Feature.class);
		// Metaclass linking occurs during transformation. Resolving the child too early
		// would select Q::a.
		ElementUtil.transformAll(resource, false);
		Feature redefining = annotated.getOwnedFeature().get(0);
		assertSame(inherited, redefining.getOwnedRedefinition().get(0).getRedefinedFeature());
	}

	/**
	 * A genuine recursive dependency stays provisional until explicitly invalidated
	 * and recomputed.
	 */
	@Test
	public void recursiveResultsAreRetainedButNeverReportedComplete() throws Exception {
		Resource resource = parse("recursive.sysml", "part def Owner;", true);
		PartDefinition owner = find(resource, "Owner", PartDefinition.class);
		AtomicBoolean recursive = new AtomicBoolean(true);
		// Inject the dependency A -> A at a derived access; textual inheritance alone
		// is not a computation cycle.
		Feature feature = new FeatureImpl() {
			@Override
			public EList<FeatureTyping> getOwnedTyping() {
				if (recursive.get()) {
					implicitSpecializationService.getImplicitSpecializationCandidates(this);
				}
				return super.getOwnedTyping();
			}
		};
		TypeUtil.addOwnedFeatureTo(owner, feature);
		var provisional = implicitSpecializationService.getImplicitSpecializationCandidates(feature);
		assertEquals(List.of("Base::things"), provisional.stream().map(e -> e.generalType().getQualifiedName()).toList());
		assertSame(provisional, implicitSpecializationService.getImplicitSpecializationCandidates(feature));

		// Once the dependency is stable, invalidation must reset both views and all
		// computation state.
		recursive.set(false);
		ImplicitSpecializationCacheUtil.invalidate(feature);
		assertContains(implicitSpecializationService.getImplicitSpecializations(feature), "Base::things");
	}

	/**
	 * {@code FeatureUtil.forceComputeRedefinitionsFor} invalidates a provisional result, even while
	 * another Feature is being computed, and keeps a complete result.
	 * <p>
	 * A provisional result that stayed cached during a query would never be recomputed by that
	 * query. A complete result must survive the refresh.
	 */
	@Test
	public void provisionalResultsAreRefreshedAndCompleteResultsKept() throws Exception {
		// part def Owner;
		// Two features are then added programmatically to Owner: "recursive" and "probe".
		Resource resource = parse("refresh.sysml", "part def Owner;", true);
		PartDefinition owner = find(resource, "Owner", PartDefinition.class);

		// Make the cached result of "recursive" provisional through a computation cycle.
		AtomicBoolean cycle = new AtomicBoolean(true);
		Feature recursive = new FeatureImpl() {
			@Override
			public EList<FeatureTyping> getOwnedTyping() {
				if (cycle.get()) {
					implicitSpecializationService.getImplicitSpecializationCandidates(this);
				}
				return super.getOwnedTyping();
			}
		};
		TypeUtil.addOwnedFeatureTo(owner, recursive);
		implicitSpecializationService.getImplicitSpecializationCandidates(recursive);
		IImplicitSpecializationCache cache = IImplicitSpecializationCache.find(recursive);
		assertNotNull(cache);
		assertNotNull(cache.getCandidates());
		assertFalse(cache.isComplete());
		cycle.set(false);

		// While "probe" is being computed, refresh "recursive", which is not itself being
		// computed: its provisional candidates must be invalidated.
		AtomicBoolean probed = new AtomicBoolean();
		AtomicBoolean evaluationInProgress = new AtomicBoolean();
		AtomicBoolean invalidatedDuringEvaluation = new AtomicBoolean();
		Feature probe = new FeatureImpl() {
			@Override
			public EList<FeatureTyping> getOwnedTyping() {
				if (!probed.getAndSet(true)) {
					evaluationInProgress.set(implicitSpecializationService.isEvaluationInProgress(recursive));
					FeatureUtil.forceComputeRedefinitionsFor(recursive);
					invalidatedDuringEvaluation.set(cache.getCandidates() == null);
				}
				return super.getOwnedTyping();
			}
		};
		TypeUtil.addOwnedFeatureTo(owner, probe);
		implicitSpecializationService.getImplicitSpecializationCandidates(probe);
		assertTrue("The probe must run during the computation of its own candidates", probed.get());
		assertTrue(evaluationInProgress.get());
		assertTrue("A provisional result must be invalidated", invalidatedDuringEvaluation.get());

		// Outside any query, the recomputed result of "recursive" is complete: the refresh keeps it.
		assertFalse(implicitSpecializationService.isEvaluationInProgress(recursive));
		var complete = implicitSpecializationService.getImplicitSpecializationCandidates(recursive);
		assertTrue(cache.isComplete());
		FeatureUtil.forceComputeRedefinitionsFor(recursive);
		assertSame(complete, cache.getCandidates());
	}

	private Type findLibraryType() {
		for (Resource library : immutableResources) {
			for (var contents = EcoreUtil.getAllContents(library, false); contents.hasNext();) {
				if (contents.next() instanceof Type type) {
					return type;
				}
			}
		}
		throw new AssertionError("Missing library type");
	}

	private Resource parse(String name, String text, boolean cached) throws Exception {
		Resource resource = resourceSet.createResource(URI.createURI("memory:/" + name));
		models.add(resource);
		if (cached) {
			immutableResources.add(resource);
		}
		resource.load(new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)), Map.of());
		assertTrue(resource.getErrors().toString(), resource.getErrors().isEmpty());
		return resource;
	}

	private static <T extends Type> T find(Resource resource, String name, Class<T> kind) {
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			var object = contents.next();
			if (kind.isInstance(object) && name.equals(kind.cast(object).getDeclaredName())) {
				return kind.cast(object);
			}
		}
		throw new AssertionError("Missing " + name);
	}

	private static void assertContains(List<ImplicitSpecialization> candidates, String qualifiedName) {
		List<String> generals = candidates.stream().map(candidate -> candidate.generalType().getQualifiedName())
				.toList();
		assertTrue("Expected " + qualifiedName + " in " + generals, generals.contains(qualifiedName));
	}

	private static void addEnd(ConnectionDefinition connection) {
		var end = SysMLFactory.eINSTANCE.createItemUsage();
		end.setDeclaredName("b");
		end.setIsEnd(true);
		var membership = SysMLFactory.eINSTANCE.createEndFeatureMembership();
		membership.setOwnedMemberFeature(end);
		connection.getOwnedRelationship().add(membership);
	}
}
