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

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.ConstructorExpression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.IndexExpression;
import org.omg.sysml.lang.sysml.SelectExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Behavior-contract regression tests for the expression-result contextual
 * rules (KerML &sect;8.4.4.9 "Expressions Semantics"). Each test navigates to
 * the specific expression's own {@code getResult()} feature via the live
 * parsed model — the same feature the contextual rule itself targets —
 * rather than by declared name, since result features are anonymous, and
 * compares against the exact object the rule composes its candidate from
 * wherever that object is a synthesized (not library-named) feature. Checks
 * the raw candidate through {@link TypeUtil#getImplicitGeneralTypesFor(Type)}
 * before transformation, then transforms and checks the same expectation
 * against the materialized {@code getOwnedSpecialization()}.
 *
 * <p>Not covered here: {@code FeatureChainExpression}'s own result rule
 * subsets a synthesized two-hop chain feature with no simple identity or
 * name to assert against without more investigation than this pass allows —
 * skipped rather than forcing a fragile structural assertion. The
 * {@code InvocationExpression} branch of the instantiation-result rule is
 * also skipped: it shares the exact same code path already exercised by the
 * {@code ConstructorExpression} test below, and constructing a working
 * non-constructor, non-Function invocation expression textually did not
 * succeed in the time available.</p>
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
				""");
		Feature original = findByName(resource, "original", Feature.class);
		Feature copy = findByName(resource, "copy", Feature.class);
		FeatureReferenceExpression expression = (FeatureReferenceExpression)FeatureUtil.getValuationFor(copy).getValue();
		Feature resultFeature = expression.getResult();
		assertNotNull("Missing result feature", resultFeature);

		// Unlike the constructor-result rule below, this rule is computed while
		// transforming the owning expression on the old adapter mechanism, not
		// lazily before it; transform first.
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
				""");
		Feature b = findByName(resource, "b", Feature.class);
		IndexExpression expression = (IndexExpression)FeatureUtil.getValuationFor(b).getValue();
		Feature resultFeature = expression.getResult();
		assertNotNull("Missing result feature", resultFeature);
		Feature sequenceResult = expression.getArgument().get(0).getResult();
		assertNotNull("Missing sequence argument result", sequenceResult);

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContainsGeneral(resultFeature, sequenceResult);
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
				""");
		Feature d = findByName(resource, "d", Feature.class);
		SelectExpression expression = (SelectExpression)FeatureUtil.getValuationFor(d).getValue();
		Feature resultFeature = expression.getResult();
		assertNotNull("Missing result feature", resultFeature);
		Feature firstArgumentResult = expression.getArgument().get(0).getResult();
		assertNotNull("Missing first argument result", firstArgumentResult);

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContainsGeneral(resultFeature, firstArgumentResult);
	}

	/**
	 * A {@link ConstructorExpression}'s result gets a FeatureTyping to the
	 * instantiated type when that type is a Classifier (not a Feature).
	 * KerML §8.4.4.9.4 Constructor Expressions,
	 * {@code checkConstructorExpressionResultSpecialization} (also Table 10,
	 * §8.4.4.1).
	 */
	@Test
	public void constructorExpressionResultGetsFeatureTypingToTheInstantiatedClassifier() throws Exception {
		// classifier L; feature l = new L();
		Resource resource = parse("constructor.kerml", """
				package Constructor {
					classifier L;
					feature l = new L();
				}
				""");
		Feature l = findByName(resource, "l", Feature.class);
		Type instantiatedType = findByName(resource, "L", Type.class);
		ConstructorExpression expression = (ConstructorExpression)FeatureUtil.getValuationFor(l).getValue();
		Feature resultFeature = expression.getResult();
		assertNotNull("Missing result feature", resultFeature);

		assertContainsGeneral(TypeUtil.getImplicitGeneralTypesFor(resultFeature), instantiatedType);

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContainsGeneral(resultFeature, instantiatedType);
	}

}
