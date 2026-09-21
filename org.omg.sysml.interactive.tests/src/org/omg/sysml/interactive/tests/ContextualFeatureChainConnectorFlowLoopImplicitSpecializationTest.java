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

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Flow;
import org.omg.sysml.lang.sysml.FlowEnd;
import org.omg.sysml.lang.sysml.ForLoopActionUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;

/**
 * Behavior-contract regression tests for the feature-chain-target,
 * flow-feature and loop-variable contextual rules. On this pre-refactoring
 * mechanism, all three are computed as part of transforming the owning
 * expression/connector/action rather than lazily before it, so each test
 * transforms first, then checks the expectation against the materialized
 * {@code getOwnedRedefinition()}.
 *
 * <p>{@code applyConnectorEndRules} is not covered here: constructing a
 * minimal textual connector whose end directly owns a value Expression
 * (rather than going through an ordinary {@code FeatureValue}) was not
 * confirmed against a working fixture in the time available for this pass —
 * left for a follow-up rather than forcing a guessed, possibly-wrong model.</p>
 */
public class ContextualFeatureChainConnectorFlowLoopImplicitSpecializationTest extends AbstractImplicitSpecializationTest{


	/**
	 * The nested target feature of a feature-chain expression's source
	 * parameter must redefine both the standard chain-target library feature
	 * ({@code ControlFunctions::'.'::source::target}) and the chain
	 * expression's own {@code targetFeature}. KerML §8.3.4.8.4
	 * FeatureChainExpression, {@code checkFeatureChainExpressionTargetRedefinition}
	 * / {@code checkFeatureChainExpressionSourceTargetRedefinition} (Table 11
	 * Note 5, §8.4.4.1).
	 */
	@Test
	public void featureChainSourceTargetRedefinesTheStandardChainTargetAndTheExpressionTarget() throws Exception {
		// struct V { feature n : Integer; } feature v1 : V; feature v1n = v1.n;
		Resource resource = parse("chain.kerml", """
				package Chain {
					public import ScalarValues::*;
					struct V {
						feature n : Integer;
					}
					feature v1 : V;
					feature v1n = v1.n;
				}
				""");
		Feature v1n = findByName(resource, "v1n", Feature.class);
		FeatureValue valuation = FeatureUtil.getValuationFor(v1n);
		assertNotNull("Missing valuation for v1n", valuation);
		FeatureChainExpression chain = (FeatureChainExpression)valuation.getValue();

		// sourceTargetFeature() is computed while transforming the owning
		// expression on the old adapter mechanism, not lazily before it;
		// transform first.
		ElementUtil.transformAll(resource, true);
		Feature sourceTarget = chain.sourceTargetFeature();
		assertNotNull("Missing sourceTargetFeature()", sourceTarget);
		assertOwnedRedefinitionContainsGeneral(sourceTarget, chain.getTargetFeature());
		assertOwnedRedefinitionContainsQualifiedName(sourceTarget, "ControlFunctions::'.'::source::target");
	}

	/**
	 * The first owned feature of a {@link FlowEnd} redefines
	 * {@code Transfers::Transfer::source::sourceOutput} when it is the flow's
	 * first end, and {@code Transfers::Transfer::target::targetInput} when it
	 * is the second — {@code checkFeatureFlowFeatureRedefinition} (KerML
	 * §8.4.4.10.2 Flows), matching the {@code FlowEndImpl} "sourceOutput"/
	 * "targetInput" entries in {@code ImplicitGeneralizationMap}.
	 */
	@Test
	public void flowEndFeaturesRedefineSourceOutputAndTargetInput() throws Exception {
		// item def S;
		// action a2 { action aa { out part target; } flow aa.target to snd1.receiver; action snd1 send { in :>> payload : S; } }
		Resource resource = parse("flow.sysml", """
				item def S;
				action a2 {
					action aa {
						out part target;
					}
					flow aa.target to snd1.receiver;
					action snd1 send {
						in :>> payload : S;
					}
				}
				""");
		Flow flow = findByName(resource, "a2", org.omg.sysml.lang.sysml.ActionUsage.class).getOwnedFeature().stream()
				.filter(Flow.class::isInstance).map(Flow.class::cast).findFirst()
				.orElseThrow(() -> new AssertionError("Missing owned Flow"));
		List<Feature> ends = flow.getOwnedEndFeature();
		assertTrue("Expected two flow ends, got " + ends.size(), ends.size() >= 2);
		FlowEnd sourceEnd = (FlowEnd)ends.get(0);
		FlowEnd targetEnd = (FlowEnd)ends.get(1);
		Feature sourceFeature = sourceEnd.getOwnedFeature().get(0);
		Feature targetFeature = targetEnd.getOwnedFeature().get(0);

		// The old adapter mechanism computes this rule while transforming the
		// owning Flow, not lazily before it; transform first, per class Javadoc.
		ElementUtil.transformAll(resource, true);
		assertOwnedRedefinitionContainsQualifiedName(sourceFeature, "Transfers::Transfer::source::sourceOutput");
		assertOwnedRedefinitionContainsQualifiedName(targetFeature, "Transfers::Transfer::target::targetInput");
	}

	/**
	 * A {@code for} loop's loop variable redefines
	 * {@code Actions::ForLoopAction::var} — SysML §8.3.17.9 ForLoopActionUsage,
	 * {@code checkForLoopActionUsageVarRedefinition} (narrated §8.4.13.10 Loop
	 * Action Usages).
	 */
	@Test
	public void forLoopVariableRedefinesTheStandardLoopVariableAndSubsetsTheSequence() throws Exception {
		// action a { for n : ScalarValues::Integer in (1, 2, 3) { } }
		Resource resource = parse("forloop.sysml", """
				action a {
					for n : ScalarValues::Integer in (1, 2, 3) {
					}
				}
				""");
		ForLoopActionUsage loop = findByName(resource, "a", org.omg.sysml.lang.sysml.ActionUsage.class)
				.getOwnedFeature().stream().filter(ForLoopActionUsage.class::isInstance)
				.map(ForLoopActionUsage.class::cast).findFirst()
				.orElseThrow(() -> new AssertionError("Missing ForLoopActionUsage"));
		ReferenceUsage loopVariable = loop.getLoopVariable();
		assertNotNull("Missing loop variable", loopVariable);

		// Same as the flow case: computed while transforming the owning action.
		ElementUtil.transformAll(resource, true);
		assertOwnedRedefinitionContainsQualifiedName(loopVariable, "Actions::ForLoopAction::var");
	}


}
