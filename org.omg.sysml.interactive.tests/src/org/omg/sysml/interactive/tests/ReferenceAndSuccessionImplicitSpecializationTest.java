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

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SuccessionAsUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Behavior-contract regression tests for the {@code SuccessionAsUsage}
 * chained specialization through a {@code DecisionNode}/{@code MergeNode}
 * ({@code checkDecisionNodeOutgoingSuccessionSpecialization}/
 * {@code checkMergeNodeIncomingSuccessionSpecialization}, SysML Table 32
 * &sect;8.4.1, narrated &sect;8.4.13 "Actions Semantics"). Checks the raw
 * candidate through {@link TypeUtil#getImplicitGeneralTypesFor(Type)} before
 * transformation, then transforms and checks the same expectation against
 * the materialized {@code getOwnedSpecialization()} — a plain EMF read,
 * independent of whichever engine computed the candidate.
 */
public class ReferenceAndSuccessionImplicitSpecializationTest extends AbstractImplicitSpecializationTest {

	/**
	 * A {@code SuccessionAsUsage} whose source is a {@code DecisionNode} gets an
	 * additional chained specialization through the standard
	 * {@code ControlPerformances::DecisionPerformance::outgoingHBLink} feature.
	 * The target is a synthesized feature chain (decision node -&gt;
	 * outgoingHBLink), not a directly named library type, so this asserts the
	 * presence of a chained specialization rather than comparing qualified
	 * names.
	 */
	@Test
	public void successionFromADecisionNodeGetsTheDecisionChain() throws Exception {
		// action def DecisionTest {
		//     action A1;
		//     action A2;
		//     decide D;
		//     if true then A1;
		//     else A2;
		// }
		Resource resource = parse("decision.sysml", """
				action def DecisionTest {
					action A1;
					action A2;
					decide D;
					if true then A1;
					else A2;
				}
				""");
		SuccessionAsUsage succession = findSuccessionFrom(resource, "D");
		List<Type> candidates = TypeUtil.getImplicitGeneralTypesFor(succession);
		assertTrue("Expected a chained specialization among " + candidates,
				hasChainedGeneral(candidates.stream()));

		ElementUtil.transformAll(resource, true);
		assertTrue("Expected a chained materialized specialization", hasChainedGeneral(
				succession.getOwnedSpecialization().stream().map(org.omg.sysml.lang.sysml.Specialization::getGeneral)));
	}

	/**
	 * A {@code SuccessionAsUsage} whose target is a {@code MergeNode} gets an
	 * additional chained specialization through the standard
	 * {@code ControlPerformances::MergePerformance::incomingHBLink} feature.
	 */
	@Test
	public void successionToAMergeNodeGetsTheMergeChain() throws Exception {
		// action def ControlNodeTest {
		//     action B1;
		//     then M;
		//     action B2;
		//     then M;
		//     merge M;
		// }
		Resource resource = parse("merge.sysml", """
				action def ControlNodeTest {
					action B1;
					then M;
					action B2;
					then M;
					merge M;
				}
				""");
		SuccessionAsUsage succession = findSuccessionTo(resource, "M");
		List<Type> candidates = TypeUtil.getImplicitGeneralTypesFor(succession);
		assertTrue("Expected a chained specialization among " + candidates,
				hasChainedGeneral(candidates.stream()));

		ElementUtil.transformAll(resource, true);
		assertTrue("Expected a chained materialized specialization", hasChainedGeneral(
				succession.getOwnedSpecialization().stream().map(org.omg.sysml.lang.sysml.Specialization::getGeneral)));
	}


	private static SuccessionAsUsage findSuccessionFrom(Resource resource, String sourceName) {
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			var object = contents.next();
			if (object instanceof SuccessionAsUsage succession
					&& org.omg.sysml.util.UsageUtil.getSourceOf(succession) != null
					&& sourceName.equals(org.omg.sysml.util.UsageUtil.getSourceOf(succession).getDeclaredName())) {
				return succession;
			}
		}
		throw new AssertionError("Missing succession from " + sourceName);
	}

	private static SuccessionAsUsage findSuccessionTo(Resource resource, String targetName) {
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			var object = contents.next();
			if (object instanceof SuccessionAsUsage succession
					&& org.omg.sysml.util.UsageUtil.getTargetOf(succession) != null
					&& targetName.equals(org.omg.sysml.util.UsageUtil.getTargetOf(succession).getDeclaredName())) {
				return succession;
			}
		}
		throw new AssertionError("Missing succession to " + targetName);
	}

	private static boolean hasChainedGeneral(java.util.stream.Stream<Type> generals) {
		return generals.anyMatch(general -> general instanceof Feature feature
				&& !feature.getOwnedFeatureChaining().isEmpty());
	}
}
