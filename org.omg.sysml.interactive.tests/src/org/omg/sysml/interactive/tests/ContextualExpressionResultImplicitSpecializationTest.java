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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.ConstructorExpression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.IndexExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.SelectExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.api.IImplicitSpecializationCache;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;

/**
 * Tests the rules of the {@code EXPRESSION_RESULT} family (KerML §8.4.4.9), defined in
 * the "Computation order" section of {@code org.omg.sysml.logic/doc/implicit-specialization.md}. Each test reaches the
 * anonymous result feature through {@code getResult()}.
 * <p>
 * Not covered: the FeatureChainExpression result rule, whose general is a synthesized chain.
 */
public class ContextualExpressionResultImplicitSpecializationTest extends AbstractImplicitSpecializationTest{

	/**
	 * A {@link FeatureReferenceExpression}'s result must subset the
	 * referenced Feature itself. KerML §8.4.4.9.3 Feature Reference
	 * Expressions, {@code checkFeatureReferenceExpressionResultSpecialization}.
	 */
	@Test
	public void featureReferenceExpressionResultSubsetsTheReferent() throws Exception {
		// feature original; feature copy = original;
		Resource resource = parse("reference.kerml", """
				package Reference {
					feature original;
					feature copy = original;
				}
				""", true);
		Feature original = findByName(resource, "original", Feature.class);
		Feature copy = findByName(resource, "copy", Feature.class);
		FeatureReferenceExpression expression = (FeatureReferenceExpression)FeatureUtil.getValuationFor(copy).getValue();
		Feature resultFeature = expression.getResult();
		assertNotNull("Missing result feature", resultFeature);

		assertContainsGeneral( getImplicitSpecializationService().getImplicitSpecializationCandidates(resultFeature), original);

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContainsGeneral(resultFeature, original);
	}

	/**
	 * An {@link IndexExpression}'s result must subset its sequence argument's
	 * own result, unless that sequence result already specializes
	 * {@code Collections::Collection} — this case uses a plain multiplicity
	 * sequence, not a Collection, so the subsetting must apply. KerML
	 * §8.3.4.8.6 IndexExpression, {@code checkIndexExpressionResultSpecialization}
	 * (also Table 10, §8.4.4.1).
	 */
	@Test
	public void indexExpressionResultSubsetsTheNonCollectionSequenceResult() throws Exception {
		// classifier A; feature a : A[*]; feature b = a#(1);
		Resource resource = parse("index.kerml", """
				package Index {
					classifier A;
					feature a : A[*];
					feature b = a#(1);
				}
				""", true);
		Feature b = findByName(resource, "b", Feature.class);
		IndexExpression expression = (IndexExpression)FeatureUtil.getValuationFor(b).getValue();
		Feature resultFeature = expression.getResult();
		assertNotNull("Missing result feature", resultFeature);
		Feature sequenceResult = expression.getArgument().get(0).getResult();
		assertNotNull("Missing sequence argument result", sequenceResult);

		assertContainsGeneral( getImplicitSpecializationService().getImplicitSpecializationCandidates(resultFeature), sequenceResult);

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContainsGeneral(resultFeature, sequenceResult);
	}

	/**
	 * Regression test: the raw result of an {@link IndexExpression}'s result is complete. The index
	 * rule reads the arguments of the expression, which are ordered by the parameters their owned
	 * features redefine, including the result being computed. The rules of the
	 * {@code EXPRESSION_RESULT} family run after the redefinitions of that result are published, so
	 * this read uses them instead of reentering the computation; when the index rule ran before
	 * the redefinitions, the read was a cycle and the result was cached as provisional.
	 */
	@Test
	public void indexExpressionResultIsComplete() throws Exception {
		// part def Wheel;
		// part def Vehicle {
		//     part wheels : Wheel[2];
		//     ref frontWheel = wheels#(1);
		// }
		Resource resource = parse("indexComplete.sysml", """
				part def Wheel;
				part def Vehicle {
					part wheels : Wheel[2];
					ref frontWheel = wheels#(1);
				}
				""", true);
		IndexExpression expression = findSingle(resource, IndexExpression.class);
		Feature resultFeature = expression.getResult();
		assertNotNull("Missing result feature", resultFeature);

		// Computing the raw candidates fills the cache of the result feature.
		getImplicitSpecializationService().getImplicitSpecializationCandidates(resultFeature);
		IImplicitSpecializationCache cache = IImplicitSpecializationCache.find(resultFeature);
		assertNotNull("Missing cache of the result feature", cache);
		// Expected: complete. It was provisional when the index rule read the arguments before the
		// redefinitions of the result were published.
		assertTrue("The raw result of the index expression result is provisional", cache.isComplete());
	}

	/**
	 * A {@link SelectExpression}'s result must subset the result of its first
	 * (sequence) argument. KerML §8.3.4.8.18 SelectExpression,
	 * {@code checkSelectExpressionResultSpecialization} (also Table 10,
	 * §8.4.4.1).
	 */
	@Test
	public void selectExpressionResultSubsetsTheFirstArgumentResult() throws Exception {
		// feature x : ScalarValues::Integer[*] = (1, 2, 3); feature d = x.?{in xx; xx != null};
		Resource resource = parse("select.kerml", """
				package Select {
					public import ScalarValues::*;
					feature x : Integer[*] = (1, 2, 3);
					feature d = x.?{in xx; xx != null};
				}
				""", true);
		Feature d = findByName(resource, "d", Feature.class);
		SelectExpression expression = (SelectExpression)FeatureUtil.getValuationFor(d).getValue();
		Feature resultFeature = expression.getResult();
		assertNotNull("Missing result feature", resultFeature);
		Feature firstArgumentResult = expression.getArgument().get(0).getResult();
		assertNotNull("Missing first argument result", firstArgumentResult);

		assertContainsGeneral( getImplicitSpecializationService().getImplicitSpecializationCandidates(resultFeature), firstArgumentResult);

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContainsGeneral(resultFeature, firstArgumentResult);
	}

	/**
	 * A {@link ConstructorExpression}'s result is typed by the instantiated type when that type
	 * is a Classifier (KerML §8.4.4.9.4, {@code checkConstructorExpressionResultSpecialization}).
	 */
	@Test
	public void constructorExpressionResultGetsFeatureTypingToTheInstantiatedClassifier() throws Exception {
		// classifier L; feature l = new L();
		Resource resource = parse("constructor.kerml", """
				package Constructor {
					classifier L;
					feature l = new L();
				}
				""", true);
		Feature l = findByName(resource, "l", Feature.class);
		Type instantiatedType = findByName(resource, "L", Type.class);
		ConstructorExpression expression = (ConstructorExpression)FeatureUtil.getValuationFor(l).getValue();
		Feature resultFeature = expression.getResult();
		assertNotNull("Missing result feature", resultFeature);

		assertContainsGeneral( getImplicitSpecializationService().getImplicitSpecializationCandidates(resultFeature), instantiatedType);

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContainsGeneral(resultFeature, instantiatedType);
	}

	/**
	 * The result of an InvocationExpression whose instantiated type is a Behavior that is not a
	 * Function is typed by that Behavior ({@code checkInvocationExpressionBehaviorResultSpecialization},
	 * KerML &sect;8.3.4.8.8).
	 */
	@Test
	public void invocationOfABehaviorTypesTheResultByTheBehavior() throws Exception {
		// action def Move;
		// part p {
		//     ref r = Move();
		// }
		Resource resource = parse("invocation.sysml", """
				action def Move;
				part p {
					ref r = Move();
				}
				""", true);
		Type move = findByName(resource, "Move", Type.class);
		InvocationExpression invocation = findSingle(resource, InvocationExpression.class);
		Feature resultFeature = invocation.getResult();
		assertNotNull("Missing result feature", resultFeature);

		// Move is an ActionDefinition, a Behavior but not a Function: the result is typed by it.
		assertContainsGeneral(getImplicitSpecializationService().getImplicitSpecializationCandidates(resultFeature), move);

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContainsGeneral(resultFeature, move);
	}
}
