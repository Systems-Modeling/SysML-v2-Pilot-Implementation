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
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TriggerInvocationExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.ViewpointUsage;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.UsageUtil;

/**
 * Tests the rules of the priority families ({@code PRIORITY_EXCLUSIVE} and {@code PRIORITY}). The
 * transition-trigger AcceptActionUsage is covered by
 * {@code ActionUsageImplicitSpecializationTest.triggerAcceptActionGetsNoDefaultTyping}.
 * <p>
 */
public class PriorityFeatureImplicitSpecializationTest extends AbstractImplicitSpecializationTest {

	/**
	 * A {@code variant} member of a {@code variation} Definition gets a
	 * FeatureTyping to the owning variation Definition itself
	 * ({@code checkUsageVariationDefinitionSpecialization}, SysML &sect;8.4.2.3
	 * "Variation Definitions and Usages").
	 */
	@Test
	public void variantOfAVariationDefinitionGetsFeatureTypingToIt() throws Exception {
		// variation attribute def AttributeChoices {
		//     variant attribute a1;
		//     variant attribute a2;
		// }
		Resource resource = parse("variant.sysml", """
				variation attribute def AttributeChoices {
					variant attribute a1;
					variant attribute a2;
				}
				""", true);
		AttributeUsage a1 = findByName(resource, "a1", AttributeUsage.class);
		Type choices = findByName(resource, "AttributeChoices", Type.class);
		assertTrue(UsageUtil.isVariant(a1));
		var candidates =  getImplicitSpecializationService().getImplicitSpecializationCandidates(a1);
		boolean typedByChoices = candidates.stream()
				.anyMatch(candidate -> candidate.specializationKind() == SysMLPackage.Literals.FEATURE_TYPING
						&& candidate.generalType() == choices);
		assertTrue("Expected a1 to be FeatureTyping'd by AttributeChoices, got " + candidates, typedByChoices);

		ElementUtil.transformAll(resource, true);
		boolean materializedTypedByChoices = a1.getOwnedSpecialization().stream()
				.anyMatch(specialization -> specialization instanceof FeatureTyping && specialization.getGeneral() == choices);
		assertTrue("Expected a1's materialized specializations to include a FeatureTyping to AttributeChoices, got "
				+ a1.getOwnedSpecialization(), materializedTypedByChoices);
	}

	/**
	 * An {@link OperatorExpression} (here, integer addition) gets a
	 * FeatureTyping to the resolved operator function from the Kernel Function
	 * Library (KerML &sect;8.3.4.8.17 "OperatorExpression"; narrative
	 * &sect;7.4.9.2 "Operator Expressions").
	 */
	@Test
	public void operatorExpressionGetsFeatureTypingToResolvedOperator() throws Exception {
		// attribute def A {
		//     attribute x = 1 + 2;
		// }
		Resource resource = parse("operator.sysml", """
				attribute def A {
					attribute x = 1 + 2;
				}
				""", true);
		OperatorExpression plus = findSingle(resource, OperatorExpression.class);
		var candidates =  getImplicitSpecializationService().getImplicitSpecializationCandidates(plus);
		boolean typed = candidates.stream()
				.anyMatch(candidate -> candidate.specializationKind() == SysMLPackage.Literals.FEATURE_TYPING);
		assertTrue("Expected a FeatureTyping candidate for the '+' OperatorExpression, got " + candidates, typed);

		ElementUtil.transformAll(resource, true);
		boolean materializedTyped = plus.getOwnedSpecialization().stream()
				.anyMatch(specialization -> specialization instanceof FeatureTyping);
		assertTrue("Expected a materialized FeatureTyping for the '+' OperatorExpression, got "
				+ plus.getOwnedSpecialization(), materializedTyped);
	}

	/**
	 * A {@link TriggerInvocationExpression} with kind {@code at} gets a
	 * FeatureTyping to {@code Triggers::TriggerAt} (SysML &sect;8.3.17.17
	 * "TriggerInvocationExpression").
	 */
	@Test
	public void atTriggerInvocationGetsFeatureTypingToTriggerAt() throws Exception {
		// action a1 {
		//     then accept at new Time::Iso8601DateTime("2022-01-30T01:00:00Z");
		// }
		Resource resource = parse("trigger-at.sysml", """
				action a1 {
					then accept at new Time::Iso8601DateTime("2022-01-30T01:00:00Z");
				}
				""", true);
		TriggerInvocationExpression trigger = findSingle(resource, TriggerInvocationExpression.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(trigger), "Triggers::TriggerAt");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(trigger, "Triggers::TriggerAt");
	}

	/**
	 * An {@code assume constraint} member of a {@code requirement def} gets
	 * {@code checkConstraintUsageRequirementConstraintSpecialization} (SysML
	 * &sect;8.3.20.4 "ConstraintUsage", &sect;8.3.21.7
	 * "RequirementConstraintMembership"): subsetting
	 * {@code Requirements::RequirementCheck::assumptions}.
	 */
	@Test
	public void assumeConstraintGetsAssumptionSubsetting() throws Exception {
		// constraint def C;
		// requirement def R {
		//     assume constraint c1 : C;
		// }
		Resource resource = parse("assume.sysml", """
				constraint def C;
				requirement def R {
					assume constraint c1 : C;
				}
				""", true);
		ConstraintUsage c1 = findByName(resource, "c1", ConstraintUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(c1), "Requirements::RequirementCheck::assumptions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c1, "Requirements::RequirementCheck::assumptions");
	}

	/**
	 * A {@code require constraint} member of a {@code requirement def} gets
	 * the sibling {@code checkConstraintUsageRequirementConstraintSpecialization}
	 * branch: subsetting {@code Requirements::RequirementCheck::constraints}.
	 */
	@Test
	public void requireConstraintGetsRequirementSubsetting() throws Exception {
		// constraint def C;
		// requirement def R {
		//     require constraint c1 : C;
		// }
		Resource resource = parse("require.sysml", """
				constraint def C;
				requirement def R {
					require constraint c1 : C;
				}
				""", true);
		ConstraintUsage c1 = findByName(resource, "c1", ConstraintUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(c1), "Requirements::RequirementCheck::constraints");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c1, "Requirements::RequirementCheck::constraints");
	}

	/**
	 * A framed {@link ConcernUsage} (via {@code frame}) gets
	 * {@code checkConcernUsageFramedConcernSpecialization} (SysML &sect;8.3.21.4
	 * "ConcernUsage", &sect;8.3.21.5 "FramedConcernMembership"): subsetting
	 * {@code Requirements::RequirementCheck::concerns}.
	 */
	@Test
	public void framedConcernGetsConcernSubsetting() throws Exception {
		// concern c3;
		// requirement def R2 {
		//     frame c3;
		// }
		Resource resource = parse("frame.sysml", """
				concern c3;
				requirement def R2 {
					frame c3;
				}
				""", true);
		ConcernUsage framed = null;
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			Object object = contents.next();
			if (object instanceof ConcernUsage concern && UsageUtil.isFramedConcern(concern)) {
				framed = concern;
				break;
			}
		}
		assertNotNull("Expected a framed ConcernUsage", framed);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(framed), "Requirements::RequirementCheck::concerns");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(framed, "Requirements::RequirementCheck::concerns");
	}

	/**
	 * A verified {@link RequirementUsage} (via {@code verify} in a {@code verification def}
	 * objective) is detected by {@code UsageUtil.isVerifiedRequirement}, which selects the
	 * {@code checkRequirementUsageRequirementVerificationSpecialization} branch (SysML
	 * &sect;8.3.21.9).
	 * <p>
	 * <b>Known bug:</b> the map entry {@code (RequirementUsageImpl, "verification")} names
	 * {@code Verifications::VerificationCase::obj::requirementVerifications}, but the library
	 * package is {@code VerificationCases}. The lookup fails and no candidate is added; this test
	 * asserts that current behavior until the map entry is fixed.
	 */
	@Test
	public void verifiedRequirementGetsVerificationSubsetting() throws Exception {
		// requirement def R;
		// requirement r : R;
		// verification def VC {
		//     objective {
		//         verify r;
		//     }
		// }
		Resource resource = parse("verify.sysml", """
				requirement def R;
				requirement r : R;
				verification def VC {
					objective {
						verify r;
					}
				}
				""", true);
		RequirementUsage verified = null;
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			Object object = contents.next();
			if (object instanceof RequirementUsage requirement && UsageUtil.isVerifiedRequirement(requirement)) {
				verified = requirement;
			}
		}
		assertNotNull("Expected the anonymous RequirementUsage created by 'verify r;' to be detected"
				+ " as a verified requirement", verified);
		// Document the current (buggy) outcome rather than the spec-correct one — see class Javadoc above.
		assertNotContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(verified),
				"Verifications::VerificationCase::obj::requirementVerifications");
		assertNotContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(verified),
				"VerificationCases::VerificationCase::obj::requirementVerifications");

		// The bug persists after materialization too: neither the broken nor
		// the spec-correct qualified name ever reaches getOwnedSpecialization().
		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationNotContains(verified, "Verifications::VerificationCase::obj::requirementVerifications");
		assertOwnedSpecializationNotContains(verified, "VerificationCases::VerificationCase::obj::requirementVerifications");
	}

	/**
	 * A SatisfyRequirementUsage owned by a ViewDefinition that satisfies a ViewpointUsage subsets
	 * {@code Views::View::viewpointSatisfactions}
	 * ({@code checkViewpointUsageViewpointSatisfactionSpecialization}, SysML &sect;8.3.26.9). The
	 * candidate is raw only: the satisfaction also subsets the satisfied viewpoint {@code vp},
	 * which already subsets {@code Views::View::viewpointSatisfactions}, so the reduced view omits
	 * it as redundant.
	 */
	@Test
	public void viewpointSatisfiedByAViewSubsetsTheViewpointSatisfactions() throws Exception {
		// viewpoint def VP;
		// view def V {
		//     viewpoint vp : VP;
		//     satisfy vp;
		// }
		Resource resource = parse("viewpoint.sysml", """
				viewpoint def VP;
				view def V {
					viewpoint vp : VP;
					satisfy vp;
				}
				""", true);
		SatisfyRequirementUsage satisfaction = findSingle(resource, SatisfyRequirementUsage.class);
		ViewpointUsage viewpoint = findByName(resource, "vp", ViewpointUsage.class);

		// The satisfied requirement is the ViewpointUsage vp and there is no "by" clause.
		var candidates = getImplicitSpecializationService().getImplicitSpecializationCandidates(satisfaction);
		assertContains(candidates, "Views::View::viewpointSatisfactions");

		// vp, a viewpoint of a view, subsets Views::View::viewpointSatisfactions itself.
		assertContains(getImplicitSpecializationService().getImplicitSpecializationCandidates(viewpoint),
				"Views::View::viewpointSatisfactions");
		// Hence the reduced view of the satisfaction, which subsets vp, omits the redundant candidate.
		assertNotContains(getImplicitSpecializationService().getImplicitSpecializations(satisfaction),
				"Views::View::viewpointSatisfactions");
	}
}
