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
import org.omg.sysml.adapter.TypeAdapter;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TriggerInvocationExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

/**
 * Behavior-contract regression tests for the "pre-default feature" rules
 * (variant FeatureTyping, OperatorExpression FeatureTyping, trigger-at
 * FeatureTyping, requirement assume/require constraint subsetting, framed
 * concern subsetting, and the pre-existing verified-requirement bug). Checks
 * the raw candidate through {@link TypeUtil#getImplicitGeneralTypesFor(Type)}
 * before transformation, then transforms and checks the same expectation
 * against the materialized {@code getOwnedSpecialization()}.
 *
 * <p>Two branches are not covered here and are left as explicit gaps rather
 * than forced: the {@code ReferenceUsage} transition payload chaining (no
 * minimal, self-contained textual form was found without a deeper grammar
 * investigation) and the {@code SatisfyRequirementUsage} of a
 * {@code ViewpointUsage} "satisfied" branch (no textual construct was found
 * that reliably creates an explicit {@code SatisfyRequirementUsage} owned by
 * a {@code view def} whose satisfied requirement is a nested
 * {@code viewpoint} usage; the fixtures only show implicit view/viewpoint
 * ownership without a visible satisfy relationship).</p>
 */
public class PriorityFeatureImplicitSpecializationTest extends AbstractImplicitSpecializationTest {

	/**
	 * A {@code variant} member of a {@code variation} Definition gets a
	 * FeatureTyping to the owning variation Definition itself (SysML
	 * &sect;8.4.2.3 "Variation Definitions and Usages").
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
				""");
		AttributeUsage a1 = findByName(resource, "a1", AttributeUsage.class);
		Type choices = findByName(resource, "AttributeChoices", Type.class);
		assertTrue(UsageUtil.isVariant(a1));

		// The old adapter mechanism doesn't expose a kind-tagged candidate
		// list through the public TypeUtil facade, but TypeAdapter itself
		// keeps its raw candidates in a Map<EClass, List<Type>> keyed by
		// specialization kind: triggering computation through the no-arg
		// getImplicitGeneralTypes() first, then reading the FEATURE_TYPING
		// bucket directly, reproduces the same kind-filtered check.
		TypeAdapter adapter = (TypeAdapter) ElementUtil.getElementAdapter(a1);
		adapter.getImplicitGeneralTypes();
		boolean typedByChoices = adapter.getImplicitGeneralTypes(SysMLPackage.Literals.FEATURE_TYPING).contains(choices);
		assertTrue("Expected a1 to be FeatureTyping'd by AttributeChoices, got "
				+ adapter.getImplicitGeneralTypes(SysMLPackage.Literals.FEATURE_TYPING), typedByChoices);

		ElementUtil.transformAll(resource, true);
		boolean materializedTypedByChoices = a1.getOwnedSpecialization().stream()
				.anyMatch(specialization -> specialization instanceof FeatureTyping && specialization.getGeneral() == choices);
		assertTrue("Expected a1's materialized specializations to include a FeatureTyping to AttributeChoices, got "
				+ a1.getOwnedSpecialization(), materializedTypedByChoices);
	}

	/**
	 * An {@link OperatorExpression} (here, integer addition) gets a
	 * FeatureTyping to the resolved operator function from the Kernel
	 * Function Library (KerML &sect;8.3.4.8.17 "OperatorExpression").
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
				""");
		OperatorExpression plus = findSingle(resource, OperatorExpression.class);
		TypeAdapter adapter = (TypeAdapter) ElementUtil.getElementAdapter(plus);
		adapter.getImplicitGeneralTypes();
		boolean typed = !adapter.getImplicitGeneralTypes(SysMLPackage.Literals.FEATURE_TYPING).isEmpty();
		assertTrue("Expected a FeatureTyping candidate for the '+' OperatorExpression", typed);

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
				""");
		TriggerInvocationExpression trigger = findSingle(resource, TriggerInvocationExpression.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(trigger), "Triggers::TriggerAt");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(trigger, "Triggers::TriggerAt");
	}

	/**
	 * An {@code assume constraint} member of a {@code requirement def} gets
	 * subsetting to {@code Requirements::RequirementCheck::assumptions}
	 * (SysML &sect;8.3.20.4 "ConstraintUsage", &sect;8.3.21.7
	 * "RequirementConstraintMembership").
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
				""");
		ConstraintUsage c1 = findByName(resource, "c1", ConstraintUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(c1), "Requirements::RequirementCheck::assumptions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c1, "Requirements::RequirementCheck::assumptions");
	}

	/**
	 * A {@code require constraint} member of a {@code requirement def} gets
	 * the sibling subsetting to {@code Requirements::RequirementCheck::constraints}.
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
				""");
		ConstraintUsage c1 = findByName(resource, "c1", ConstraintUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(c1), "Requirements::RequirementCheck::constraints");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(c1, "Requirements::RequirementCheck::constraints");
	}

	/**
	 * A framed {@link ConcernUsage} (via {@code frame}) gets subsetting to
	 * {@code Requirements::RequirementCheck::concerns} (SysML &sect;8.3.21.4
	 * "ConcernUsage", &sect;8.3.21.5 "FramedConcernMembership").
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
				""");
		ConcernUsage framed = null;
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			Object object = contents.next();
			if (object instanceof ConcernUsage concern && UsageUtil.isFramedConcern(concern)) {
				framed = concern;
				break;
			}
		}
		assertNotNull("Expected a framed ConcernUsage", framed);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(framed), "Requirements::RequirementCheck::concerns");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(framed, "Requirements::RequirementCheck::concerns");
	}

	/**
	 * A verified {@link RequirementUsage} (via {@code verify} in a
	 * {@code verification def}'s objective) is correctly detected by
	 * {@code UsageUtil.isVerifiedRequirement}.
	 *
	 * <p><b>Known pre-existing bug, not fixed here:</b> the actual subsetting
	 * this branch resolves through {@code ImplicitGeneralizationMap}
	 * (key {@code RequirementUsageImpl.class, "verification"}) does not appear,
	 * because the map's qualified name is {@code Verifications::VerificationCase::
	 * obj::requirementVerifications} while the real standard library package is
	 * {@code VerificationCases}. The library lookup therefore silently fails to
	 * resolve and no candidate is added. This test asserts today's actual
	 * (buggy) behavior as the pre-refactoring baseline.</p>
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
				""");
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
		assertNotContains(TypeUtil.getImplicitGeneralTypesFor(verified),
				"Verifications::VerificationCase::obj::requirementVerifications");
		assertNotContains(TypeUtil.getImplicitGeneralTypesFor(verified),
				"VerificationCases::VerificationCase::obj::requirementVerifications");

		// The bug persists after materialization too: neither the broken nor
		// the spec-correct qualified name ever reaches getOwnedSpecialization().
		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationNotContains(verified, "Verifications::VerificationCase::obj::requirementVerifications");
		assertOwnedSpecializationNotContains(verified, "VerificationCases::VerificationCase::obj::requirementVerifications");
	}
	
}
