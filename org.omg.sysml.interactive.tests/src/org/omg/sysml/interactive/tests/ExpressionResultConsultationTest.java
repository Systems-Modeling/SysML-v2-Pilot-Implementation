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
import org.omg.sysml.lang.sysml.ConstructorExpression;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.IndexExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

/** Tests the semantic contract of expression results across consultation and explicit transformation. */
public class ExpressionResultConsultationTest {

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
	 * A feature reference exposes a stable output result typed by the referent's
	 * classifier after semantic transformation, including after cache clearing and
	 * repeated materialization.
	 */
	@Test
	public void referenceResultRetainsReferentAndType() throws Exception {
		Resource resource = parse("referenceResult.kerml", """
				package Reference {
					classifier Value;
					feature original : Value;
					feature copy = original;
				}
				""");
		Feature original = findByName(resource, "original", Feature.class);
		Type value = findByName(resource, "Value", Type.class);
		FeatureReferenceExpression expression = findSingle(resource, FeatureReferenceExpression.class);

		// The public result must specialize the exact referent, not an unrelated library feature.
		Feature result = expression.getResult();
		assertNotNull(result);
		// Result subsetting is populated by semantic transformation.
		ElementUtil.transform(expression);
		assertTrue(TypeUtil.getGeneralTypesOf(result).contains(original));
		assertTrue(result.getType().contains(value));
		assertStableThroughTransformation(resource, expression, result);
		assertTrue(result.getType().contains(value));
	}

	/**
	 * A constructor result retains the instantiated classifier and its identity
	 * through repeated consultations and explicit materialization.
	 */
	@Test
	public void constructorResultRetainsInstantiatedType() throws Exception {
		Resource resource = parse("constructorResult.kerml", """
				package Construction {
					classifier Product;
					feature product = new Product();
				}
				""");
		ConstructorExpression expression = findSingle(resource, ConstructorExpression.class);
		Type product = findByName(resource, "Product", Type.class);

		// The constructor's result denotes a Product both before and after transformation.
		Feature result = expression.getResult();
		assertNotNull(result);
		assertTrue(result.getType().contains(product));
		assertStableThroughTransformation(resource, expression, result);
		assertTrue(result.getType().contains(product));
	}

	/**
	 * Invoking a behavior that is not a function exposes a result typed by that
	 * behavior after explicit semantic transformation.
	 */
	@Test
	public void behaviorInvocationResultRetainsBehaviorType() throws Exception {
		Resource resource = parse("behaviorResult.sysml", """
				action def Move;
				part p { ref movement = Move(); }
				""");
		InvocationExpression invocation = findSingle(resource, InvocationExpression.class);
		Type move = findByName(resource, "Move", Type.class);

		// This is the behavior-result rule, distinct from a function's return parameter.
		Feature result = invocation.getResult();
		assertNotNull(result);
		// Behavior result typing is populated by semantic transformation.
		ElementUtil.transform(invocation);
		assertTrue(result.getType().contains(move));
		assertStableThroughTransformation(resource, invocation, result);
		assertTrue(result.getType().contains(move));
	}

	/**
	 * Consulting a function invocation's result must preserve positional arguments
	 * and the result's type when the argument list is queried before and after it.
	 */
	@Test
	public void functionResultPreservesArgumentOrder() throws Exception {
		Resource resource = parse("functionResult.sysml", """
				calc def Choose {
					in leftValue : ScalarValues::Integer;
					in rightValue : ScalarValues::Integer;
					return selectedValue : ScalarValues::Integer = leftValue;
				}
				part p { ref choice = Choose(11, 22); }
				""");
		Feature choice = findByName(resource, "choice", Feature.class);
		InvocationExpression invocation = (InvocationExpression) FeatureUtil.getValuationFor(choice).getValue();

		// Resolve arguments first: result redefinitions participate in their positional ordering.
		List<Expression> arguments = List.copyOf(invocation.getArgument());
		assertEquals(2, arguments.size());
		assertEquals(List.of(11, 22), arguments.stream()
				.map(argument -> ((org.omg.sysml.lang.sysml.LiteralInteger) argument).getValue()).toList());
		Feature result = invocation.getResult();
		assertNotNull(result);
		assertEquals(List.of("ScalarValues::Integer"), result.getType().stream().map(Type::getQualifiedName).toList());
		assertStableThroughTransformation(resource, invocation, result);
		assertEquals(arguments, invocation.getArgument());
	}

	/**
	 * An index result and its sequence result remain distinct and stable during
	 * nested consultations; the outer result retains the sequence element type.
	 */
	@Test
	public void nestedResultConsultationsPreserveSequenceResult() throws Exception {
		Resource resource = parse("nestedResult.kerml", """
				package Indexing {
					classifier Value;
					feature values : Value[*];
					feature selected = values#(1);
				}
				""");
		IndexExpression expression = findSingle(resource, IndexExpression.class);
		Type value = findByName(resource, "Value", Type.class);

		// Index transformation computes result typing through its sequence argument.
		Feature result = expression.getResult();
		assertNotNull(result);
		ElementUtil.transform(expression);
		assertTrue(result.getType().contains(value));
		Expression sequence = expression.getArgument().get(0);
		Feature sequenceResult = sequence.getResult();
		assertTrue(result != sequenceResult);
		assertTrue(TypeUtil.getGeneralTypesOf(result).contains(sequenceResult));
		assertStableThroughTransformation(resource, expression, result);
		assertSame(sequenceResult, sequence.getResult());
	}

	/**
	 * Programmatically created expressions without parser preparation expose an
	 * output result and return the same object on subsequent reads.
	 */
	@Test
	public void programmaticExpressionsProvideStableResults() {
		// Incomplete editor states have no textual equivalent: no referent or instantiated type yet.
		List<Expression> expressions = List.of(SysMLFactory.eINSTANCE.createFeatureReferenceExpression(),
				SysMLFactory.eINSTANCE.createInvocationExpression(), SysMLFactory.eINSTANCE.createConstructorExpression());
		for (Expression expression : expressions) {
			Feature result = expression.getResult();
			assertNotNull(result);
			assertEquals(FeatureDirectionKind.OUT, result.getDirection());
			// No resource, parser or transformation is needed to retrieve an existing result again.
			assertSame(result, expression.getResult());
		}
	}

	/**
	 * An explicitly supplied return parameter is preserved for each expression
	 * kind; consulting the result must never replace it with a synthesized feature.
	 */
	@Test
	public void explicitReturnParametersArePreserved() {
		// Insert the explicit result directly to isolate the abstract-syntax contract from parsing.
		List<Expression> expressions = List.of(SysMLFactory.eINSTANCE.createFeatureReferenceExpression(),
				SysMLFactory.eINSTANCE.createInvocationExpression(), SysMLFactory.eINSTANCE.createConstructorExpression());
		for (Expression expression : expressions) {
			Feature explicit = SysMLFactory.eINSTANCE.createFeature();
			explicit.setDeclaredName("explicitResult");
			explicit.setDirection(FeatureDirectionKind.OUT);
			ReturnParameterMembership membership = SysMLFactory.eINSTANCE.createReturnParameterMembership();
			membership.setOwnedMemberParameter(explicit);
			expression.getOwnedRelationship().add(membership);
			// Both reads must select the supplied identity, and retain its single membership.
			assertSame(explicit, expression.getResult());
			assertSame(explicit, expression.getResult());
			assertEquals(List.of(membership), expression.getOwnedRelationship());
		}
	}

	/**
	 * An XMI-loaded constructor without an owned result still exposes a correctly
	 * typed result; materialization remains idempotent without parser callbacks.
	 */
	@Test
	public void xmiConstructorProvidesResultWithoutParserPreparation() throws Exception {
		Resource parsed = parse("xmiResult.kerml", """
				package Construction {
					classifier Product;
					feature product = new Product();
				}
				""");
		EcoreUtil2.resolveLazyCrossReferences(parsed, null);
		ConstructorExpression source = findSingle(parsed, ConstructorExpression.class);
		// Remove any result prepared during linking to serialize an unprepared abstract-syntax model.
		source.getOwnedRelationship().removeIf(ReturnParameterMembership.class::isInstance);
		Resource serialized = new XMIResourceImpl(URI.createURI("memory:/serialized.xmi"));
		serialized.getContents().addAll(parsed.getContents());
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		serialized.save(bytes, Map.of());
		Resource loaded = new XMIResourceImpl(URI.createURI("memory:/loaded.xmi"));
		try {
			parsed.getResourceSet().getResources().add(loaded);
			loaded.load(new ByteArrayInputStream(bytes.toByteArray()), Map.of());
			ConstructorExpression expression = findSingle(loaded, ConstructorExpression.class);
			Type product = findByName(loaded, "Product", Type.class);
			// XMI loading does not run the textual parser's post-processors.
			Feature result = expression.getResult();
			assertNotNull(result);
			assertTrue(result.getType().contains(product));
			assertStableThroughTransformation(loaded, expression, result);
		} finally {
			loaded.unload();
			parsed.getResourceSet().getResources().remove(loaded);
		}
	}

	/**
	 * Retargeting a reference A -> B -> A changes its result specialization and type,
	 * while retaining the result prepared once before the edits. Model adapters
	 * are explicitly removed to invalidate caches, then semantic transformation is
	 * rerun to update result subsetting without replacing the structural result.
	 */
	@Test
	public void preparedReferenceResultFollowsReferentEdits() throws Exception {
		Resource resource = parse("editedReference.kerml", """
				package EditedReference {
					classifier A;
					classifier B;
					feature a : A;
					feature b : B;
					feature copy = a;
				}
				""");
		FeatureReferenceExpression expression = findSingle(resource, FeatureReferenceExpression.class);
		Feature a = findByName(resource, "a", Feature.class);
		Feature b = findByName(resource, "b", Feature.class);
		Membership reference = expression.getOwnedMembership().stream()
				.filter(membership -> membership.getMemberElement() == a).findFirst().orElseThrow();
		// Prepare the structural result once, as a parser or an editor creation command would.
		TypeUtil.addResultParameterTo(expression);
		Feature result = TypeUtil.getOwnedResultParameterOf(expression);
		assertNotNull(result);
		List<Relationship> relationships = List.copyOf(expression.getOwnedRelationship());

		for (Feature referent : List.of(a, b, a)) {
			// Equivalent successive texts: copy = a; copy = b; copy = a, without reparsing.
			reference.setMemberElement(referent);
			invalidateEditedModel(resource);
			assertSame(referent, expression.getReferent());
			assertPreparedResultUnchanged(expression, result, relationships);
			// Refresh result subsetting through the semantic transformation lifecycle.
			ElementUtil.transform(expression);
			assertEquals(referent.getType(), result.getType());
			List<Type> generalTypes = TypeUtil.getGeneralTypesOf(result);
			assertTrue(generalTypes.contains(referent));
			// The old referent must disappear, rather than accumulate as another subsetting.
			for (Feature other : List.of(a, b)) {
				if (other != referent) {
					assertFalse(generalTypes.contains(other));
				}
			}
			assertPreparedResultUnchanged(expression, result, relationships);
		}
	}

	/**
	 * Editing the type of an unchanged referent updates its result transitively;
	 * semantic transformation restores result subsetting after cache invalidation,
	 * while the reference, result and return membership retain their identities.
	 */
	@Test
	public void preparedReferenceResultFollowsReferentTypeEdits() throws Exception {
		Resource resource = parse("editedReferentType.kerml", """
				package EditedReferentType {
					classifier A;
					classifier B;
					feature original : A;
					feature copy = original;
				}
				""");
		FeatureReferenceExpression expression = findSingle(resource, FeatureReferenceExpression.class);
		Feature original = findByName(resource, "original", Feature.class);
		Type a = findByName(resource, "A", Type.class);
		Type b = findByName(resource, "B", Type.class);
		var typing = original.getOwnedTyping().get(0);
		TypeUtil.addResultParameterTo(expression);
		Feature result = TypeUtil.getOwnedResultParameterOf(expression);
		assertNotNull(result);
		List<Relationship> relationships = List.copyOf(expression.getOwnedRelationship());

		for (Type type : List.of(a, b, a)) {
			// Only original's explicit typing changes; the expression still refers to original.
			typing.setType(type);
			invalidateEditedModel(resource);
			assertSame(original, expression.getReferent());
			ElementUtil.transform(expression);
			assertEquals(List.of(type), result.getType());
			assertPreparedResultUnchanged(expression, result, relationships);
		}
	}

	/**
	 * A constructor keeps its prepared result when its classifier changes, including
	 * an intermediate missing target. Restoring a target updates typing without a
	 * second preparation or a transformation.
	 */
	@Test
	public void preparedConstructorResultSurvivesTargetReplacement() throws Exception {
		Resource resource = parse("editedConstructor.kerml", """
				package EditedConstructor {
					classifier A;
					classifier B;
					feature product = new A();
				}
				""");
		ConstructorExpression expression = findSingle(resource, ConstructorExpression.class);
		Type a = findByName(resource, "A", Type.class);
		Type b = findByName(resource, "B", Type.class);
		Membership reference = expression.getOwnedMembership().stream()
				.filter(membership -> membership.getMemberElement() == a).findFirst().orElseThrow();
		TypeUtil.addResultParameterTo(expression);
		Feature result = TypeUtil.getOwnedResultParameterOf(expression);
		assertNotNull(result);
		List<Relationship> relationships = List.copyOf(expression.getOwnedRelationship());
		assertEquals(List.of(a), result.getType());

		// Intermediate editor state: the instantiated type is temporarily absent.
		reference.setMemberElement(null);
		invalidateEditedModel(resource);
		assertNull(expression.getInstantiatedType());
		assertPreparedResultUnchanged(expression, result, relationships);
		assertFalse(result.getType().contains(a));

		for (Type type : List.of(b, a)) {
			// Equivalent to new B(), then new A(), while retaining the same constructor object.
			reference.setMemberElement(type);
			invalidateEditedModel(resource);
			assertSame(type, expression.getInstantiatedType());
			assertEquals(List.of(type), result.getType());
			assertPreparedResultUnchanged(expression, result, relationships);
		}
	}

	/**
	 * Changing an invoked function updates the result's return-parameter redefinition
	 * and type while retaining its identity and positional argument. Returning to
	 * the original function must remove the intervening function's result semantics.
	 */
	@Test
	public void preparedInvocationResultFollowsFunctionEdits() throws Exception {
		Resource resource = parse("editedInvocation.sysml", """
				calc def NumberFunction {
					in inputValue : ScalarValues::Integer;
					return number : ScalarValues::Integer;
				}
				calc def FlagFunction {
					in inputValue : ScalarValues::Integer;
					return flag : ScalarValues::Boolean;
				}
				part p { ref value = NumberFunction(11); }
				""");
		InvocationExpression expression = findSingle(resource, InvocationExpression.class);
		Type numberFunction = findByName(resource, "NumberFunction", Type.class);
		Type flagFunction = findByName(resource, "FlagFunction", Type.class);
		Feature number = findByName(resource, "number", Feature.class);
		Feature flag = findByName(resource, "flag", Feature.class);
		Membership reference = expression.getOwnedMembership().stream()
				.filter(membership -> membership.getMemberElement() == numberFunction).findFirst().orElseThrow();
		TypeUtil.addResultParameterTo(expression);
		Feature result = TypeUtil.getOwnedResultParameterOf(expression);
		assertNotNull(result);
		List<Expression> arguments = List.copyOf(expression.getArgument());
		assertEquals(1, arguments.size());
		List<Relationship> relationships = List.copyOf(expression.getOwnedRelationship());

		for (Feature returnParameter : List.of(number, flag, number)) {
			// Change NumberFunction(11) to FlagFunction(11) and back, without rebuilding arguments.
			Type function = returnParameter.getOwningType();
			assertTrue(function == numberFunction || function == flagFunction);
			reference.setMemberElement(function);
			invalidateEditedModel(resource);
			assertSame(function, expression.getInstantiatedType());
			List<Feature> redefined = FeatureUtil.getRedefinedFeaturesWithComputedOf(result);
			// Redefinitions also include library results; the function-specific target must be unique.
			assertEquals(List.of(returnParameter), redefined.stream()
					.filter(feature -> feature == number || feature == flag).toList());
			assertEquals(returnParameter.getType(), result.getType());
			assertEquals(arguments, expression.getArgument());
			assertPreparedResultUnchanged(expression, result, relationships);
		}
	}

	/** Removes model adapters to invalidate cached semantics without preparing or transforming the model. */
	private void invalidateEditedModel(Resource resource) {
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			if (contents.next() instanceof Element element) {
				ElementUtil.clean(element);
			}
		}
	}

	/** Checks that edits do not require replacing the prepared result or its membership. */
	private void assertPreparedResultUnchanged(Expression expression, Feature result, List<Relationship> relationships) {
		boolean transformed = ElementUtil.isTransformed(expression);
		assertSame(result, expression.getResult());
		assertEquals(FeatureDirectionKind.OUT, result.getDirection());
		assertEquals(relationships, expression.getOwnedRelationship());
		assertEquals(1, relationships.stream().filter(ReturnParameterMembership.class::isInstance).count());
		// Consultation must not transform the expression as a side effect.
		assertEquals(transformed, ElementUtil.isTransformed(expression));
	}

	/** Checks the observable result contract without requiring consultation-time containment. */
	private void assertStableThroughTransformation(Resource resource, Expression expression, Feature result) {
		assertEquals(FeatureDirectionKind.OUT, result.getDirection());
		assertSame(result, expression.getResult());
		// Clearing derived caches must not replace the result observed by the caller.
		ElementUtil.clearCachesOf(expression);
		assertSame(result, expression.getResult());
		// Explicit transformation owns exactly one result; repeating it must not add another.
		ElementUtil.transformAll(resource, true);
		ElementUtil.transformAll(resource, true);
		assertSame(result, expression.getResult());
		assertEquals(1, expression.getOwnedRelationship().stream().filter(ReturnParameterMembership.class::isInstance).count());
	}
}
