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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Flow;
import org.omg.sysml.lang.sysml.FlowEnd;
import org.omg.sysml.lang.sysml.ForLoopActionUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;

/**
 * Tests the rules of the {@code CONTEXT} family for feature-chain targets, flow ends and loop
 * variables. The families are defined in the "Computation order" section of {@code org.omg.sysml.logic/doc/implicit-specialization.md}. Each test reaches the anonymous feature through the model API used by the rule,
 * such as {@code sourceTargetFeature()}.
 * <p>
 */
public class ContextualFeatureChainConnectorFlowLoopImplicitSpecializationTest extends AbstractImplicitSpecializationTest{

	/**
	 * The nested target feature of a feature-chain source parameter redefines both
	 * {@code ControlFunctions::'.'::source::target} and the expression's {@code targetFeature}
	 * (KerML §8.3.4.8.4). This redefinition fully determines the feature, so no later rule family
	 * applies.
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
				""", true);
		// sourceTargetFeature() is an invocation-delegate operation that reads a
		// nested feature created by lazy linking; force resolution before reading it.
		EcoreUtil2.resolveLazyCrossReferences(resource, null);
		Feature v1n = findByName(resource, "v1n", Feature.class);
		FeatureValue valuation = FeatureUtil.getValuationFor(v1n);
		assertNotNull("Missing valuation for v1n", valuation);
		FeatureChainExpression chain = (FeatureChainExpression)valuation.getValue();
		Feature sourceTarget = chain.sourceTargetFeature();
		assertNotNull("Missing sourceTargetFeature()", sourceTarget);

		var candidates =  getImplicitSpecializationService().getImplicitSpecializationCandidates(sourceTarget);
		assertContainsGeneral(candidates, chain.getTargetFeature());
		assertTrue("Expected a redefinition to the standard chain-target library feature in " + candidates,
				candidates.stream().anyMatch(c -> "ControlFunctions::'.'::source::target".equals(
						c.generalType() == null ? null : c.generalType().getQualifiedName())));

		ElementUtil.transformAll(resource, true);
		assertOwnedRedefinitionContainsGeneral(sourceTarget, chain.getTargetFeature());
		assertOwnedRedefinitionContainsQualifiedName(sourceTarget, "ControlFunctions::'.'::source::target");
	}

	/**
	 * The first owned feature of a {@link FlowEnd} redefines
	 * {@code Transfers::Transfer::source::sourceOutput} for the first end of the flow and
	 * {@code Transfers::Transfer::target::targetInput} for the second
	 * ({@code checkFeatureFlowFeatureRedefinition}, KerML §8.4.4.10.2).
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
				""", true);
		Flow flow = findByName(resource, "a2", org.omg.sysml.lang.sysml.ActionUsage.class).getOwnedFeature().stream()
				.filter(Flow.class::isInstance).map(Flow.class::cast).findFirst()
				.orElseThrow(() -> new AssertionError("Missing owned Flow"));
		List<Feature> ends = flow.getOwnedEndFeature();
		assertTrue("Expected two flow ends, got " + ends.size(), ends.size() >= 2);
		FlowEnd sourceEnd = (FlowEnd)ends.get(0);
		FlowEnd targetEnd = (FlowEnd)ends.get(1);
		Feature sourceFeature = sourceEnd.getOwnedFeature().get(0);
		Feature targetFeature = targetEnd.getOwnedFeature().get(0);

		assertContainsQualifiedName( getImplicitSpecializationService().getImplicitSpecializationCandidates(sourceFeature),
				"Transfers::Transfer::source::sourceOutput");
		assertContainsQualifiedName( getImplicitSpecializationService().getImplicitSpecializationCandidates(targetFeature),
				"Transfers::Transfer::target::targetInput");

		ElementUtil.transformAll(resource, true);
		assertOwnedRedefinitionContainsQualifiedName(sourceFeature, "Transfers::Transfer::source::sourceOutput");
		assertOwnedRedefinitionContainsQualifiedName(targetFeature, "Transfers::Transfer::target::targetInput");
	}

	/**
	 * The target feature of a flow nested in a part redefines only its explicit feature and
	 * {@code Transfers::Transfer::target::targetInput}; it must not redefine the part that owns the
	 * flow.
	 * <p>
	 * KerML §8.4.4.10.2 gives the target FlowEnd feature no redefinition of the flow owner. A rule
	 * kept from the removed "flow from" notation used to add one for every flow owned by a Feature.
	 */
	@Test
	public void flowTargetFeatureDoesNotRedefineTheFlowOwner() throws Exception {
		// package FlowTest {
		//     part def A { out item x; }
		//     part def B { in item y; }
		//     part p { part a : A; part b : B; flow a.x to b.y; }
		// }
		Resource resource = parse("flowOwner.sysml", """
				package FlowTest {
					part def A { out item x; }
					part def B { in item y; }
					part p {
						part a : A;
						part b : B;
						flow a.x to b.y;
					}
				}
				""", true);
		Feature owner = findByName(resource, "p", Feature.class);
		Flow flow = owner.getOwnedFeature().stream()
				.filter(Flow.class::isInstance).map(Flow.class::cast).findFirst()
				.orElseThrow(() -> new AssertionError("Missing owned Flow"));
		// Target feature: the first owned feature of the second FlowEnd, which explicitly redefines B::y.
		Feature targetFeature = ((FlowEnd)flow.getOwnedEndFeature().get(1)).getOwnedFeature().get(0);

		// Before transformation, targetInput is the only implicit redefinition; FlowTest::p must not appear.
		List<String> implicitRedefinitions = getImplicitSpecializationService()
				.getImplicitSpecializationCandidates(targetFeature).stream()
				.filter(candidate -> candidate.specializationKind() == SysMLPackage.Literals.REDEFINITION)
				.map(candidate -> candidate.generalType().getQualifiedName()).toList();
		assertEquals(List.of("Transfers::Transfer::target::targetInput"), implicitRedefinitions);

		// After transformation, no materialized redefinition targets the owner of the flow.
		ElementUtil.transformAll(resource, true);
		assertTrue(targetFeature.getOwnedRedefinition().stream()
				.noneMatch(redefinition -> redefinition.getRedefinedFeature() == owner));
	}

	/**
	 * A {@code for} loop variable redefines {@code Actions::ForLoopAction::var}
	 * ({@code checkForLoopActionUsageVarRedefinition}, SysML §8.3.17.9) and subsets the sequence
	 * parameter of the loop.
	 */
	@Test
	public void forLoopVariableRedefinesTheStandardLoopVariableAndSubsetsTheSequence() throws Exception {
		// action a { for n : ScalarValues::Integer in (1, 2, 3) { } }
		Resource resource = parse("forloop.sysml", """
				action a {
					for n : ScalarValues::Integer in (1, 2, 3) {
					}
				}
				""", true);
		ForLoopActionUsage loop = findByName(resource, "a", org.omg.sysml.lang.sysml.ActionUsage.class)
				.getOwnedFeature().stream().filter(ForLoopActionUsage.class::isInstance)
				.map(ForLoopActionUsage.class::cast).findFirst()
				.orElseThrow(() -> new AssertionError("Missing ForLoopActionUsage"));
		ReferenceUsage loopVariable = loop.getLoopVariable();
		assertNotNull("Missing loop variable", loopVariable);

		var candidates =  getImplicitSpecializationService().getImplicitSpecializationCandidates(loopVariable);
		assertContainsQualifiedName(candidates, "Actions::ForLoopAction::var");

		ElementUtil.transformAll(resource, true);
		assertOwnedRedefinitionContainsQualifiedName(loopVariable, "Actions::ForLoopAction::var");
	}
}
