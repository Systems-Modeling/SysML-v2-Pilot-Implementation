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
package org.omg.sysml.logic.implicit.specialization.rules;

import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.defaultKey;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.self;

import java.util.Collections;
import java.util.List;

import org.omg.sysml.lang.sysml.AssertConstraintUsage;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.ItemDefinition;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;
import org.omg.sysml.util.UsageUtil;

/**
 * Rules of the constraints of SysML &sect;8.3.20, Constraints, and &sect;8.3.21, Requirements.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLRequirementRules {

	private SysMLRequirementRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				self("requirementMembershipSpecialization", ImplicitSpecializationRuleFamily.PRIORITY,
						ConstraintUsage.class, SysMLRequirementRules::requirementMembershipSpecialization),
				self("checkRequirementUsageObjectiveRedefinition", ImplicitSpecializationRuleFamily.REDEFINITION,
						RequirementUsage.class, SysMLRequirementRules::objectiveRedefinition)
						.excluding(KerMLFeatureRules.POSITIONAL_REDEFINITION),
				defaultKey("checkConstraintUsageSpecialization", ConstraintUsage.class, SysMLRequirementRules::constraintKey),
				defaultKey("checkAssertConstraintUsageSpecialization", AssertConstraintUsage.class, SysMLRequirementRules::negatedKey),
				defaultKey("checkRequirementUsageSpecialization", RequirementUsage.class, SysMLRequirementRules::requirementKey),
				defaultKey("checkSatisfyRequirementUsageSpecialization", SatisfyRequirementUsage.class,
						SysMLRequirementRules::negatedKey),
				defaultKey("checkConcernUsageSpecialization", ConcernUsage.class, SysMLRequirementRules::concernKey),
				self("checkConstraintUsageCheckedConstraintSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, ConstraintUsage.class,
						SysMLRequirementRules::checkedConstraintSpecialization),
				self("concernUsageSubrequirementSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, ConcernUsage.class,
						SysMLRequirementRules::concernSubrequirementSpecialization));
	}

	/**
	 * Redefines the objective of each direct general type of the owning type of an objective
	 * RequirementUsage.
	 * <p>
	 * SysML §8.3.21.9, {@code checkRequirementUsageObjectiveRedefinition}: "A RequirementUsage whose
	 * owningFeatureMembership is a ObjectiveMembership must redefine the objectiveRequirement of each
	 * CaseDefinition or CaseUsage that is specialized by the owningType of the RequirementUsage."
	 */
	private static Outcome objectiveRedefinition(RequirementUsage requirement, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!UsageUtil.isObjective(requirement)) {
			return Outcome.NOT_APPLICABLE;
		}
		PositionalRedefinitions.add(requirement, type -> objectiveOf(requirement, type), result, context);
		return Outcome.APPLIED;
	}

	/** Returns the owned objective of the owning type, or the objective of a general type. */
	private static List<RequirementUsage> objectiveOf(RequirementUsage requirement, Type type) {
		if (type == requirement.getOwningType()) {
			return Collections.singletonList(UsageUtil.getOwnedObjectiveRequirementOf(type));
		}
		return Collections.singletonList(UsageUtil.getObjectiveRequirementOf(type));
	}

	/**
	 * Subsets a ConstraintUsage according to the requirement membership that owns it. The three
	 * constraints are mutually exclusive and are tested in this order: a verified requirement, a
	 * framed concern, then a requirement constraint.
	 * <p>
	 * SysML §8.3.21.9, {@code checkRequirementUsageRequirementVerificationSpecialization}: "A
	 * RequirementUsage whose owningFeatureMembership is a RequirementVerificationMembership must
	 * directly or indirectly specialize the RequirementUsage
	 * VerificationCases::VerificationCase::obj::requirementVerifications."
	 * <p>
	 * SysML §8.3.21.4, {@code checkConcernUsageFramedConcernSpecialization}: "If a ConcernUsage is
	 * owned via a FramedConcernMembership, then it must directly or indirectly specialize the
	 * ConcernUsage Requirements::RequirementCheck::concerns from the Systems Model Library."
	 * <p>
	 * SysML §8.3.20.4, {@code checkConstraintUsageRequirementConstraintSpecialization}: "A
	 * composite ConstraintUsage whose owningFeatureMembership is a RequirementConstraintMembership
	 * must directly or indirectly specialize on the ConstraintUsages assumptions or constraints from
	 * the ConstraintDefinition Requirements::RequirementCheck in the Systems Model Library, depending
	 * on whether the kind of the RequirementConstraintMembership is assumption or requirement,
	 * respectively."
	 */
	private static Outcome requirementMembershipSpecialization(ConstraintUsage constraint,
			ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		if (constraint instanceof RequirementUsage requirement && UsageUtil.isVerifiedRequirement(requirement)) {
			SpecializationHelper.addLibrary(result, constraint, SysMLPackage.Literals.SUBSETTING,
					SpecializationHelper.mapped(constraint, "verification"));
		} else if (constraint instanceof ConcernUsage concern && UsageUtil.isFramedConcern(concern)) {
			SpecializationHelper.addLibrary(result, constraint, SysMLPackage.Literals.SUBSETTING,
					SpecializationHelper.mapped(constraint, "concern"));
		} else if (UsageUtil.getRequirementConstraintKindOf(constraint) != null) {
			SpecializationHelper.addLibrary(result, constraint, SysMLPackage.Literals.SUBSETTING,
					SpecializationHelper.mapped(constraint, UsageUtil.getRequirementConstraintKindOf(constraint).toString()));
		} else {
			return Outcome.NOT_APPLICABLE;
		}
		return Outcome.APPLIED;
	}

	/**
	 * Selects the negated default of a negated assertion and the base default otherwise
	 * ({@code checkAssertConstraintUsageSpecialization}, {@code checkSatisfyRequirementUsageSpecialization},
	 * SysML Table 32; negated variants of KerML {@code checkInvariantSpecialization}).
	 * <p>
	 * SysML §8.3.20.2, {@code checkAssertConstraintUsageSpecialization}: "If a AssertConstraintUsage
	 * is negated, then it must directly or indirectly specialize the ConstraintUsage
	 * Constraints::negatedConstraintChecks. Otherwise, it must directly or indirectly specialize the
	 * ConstraintUsage Constraints::assertedConstraintChecks."
	 * <p>
	 * SysML §8.3.21.10, {@code checkSatisfyRequirementUsageSpecialization}: "If a
	 * SatisfyRequirementUsage is negated, then it must directly or indirectly specialize the
	 * RequirementUsage Requirements::notSatisfiedRequirementChecks. Otherwise, it must directly or
	 * indirectly specialize the RequirementUsage Requirements::satisfiedRequirementChecks."
	 */
	private static String negatedKey(AssertConstraintUsage assertion,
			ImplicitSpecializationEvaluationContext context) {
		if (assertion.isNegated()) {
			return "negated";
		}
		return "base";
	}

	/**
	 * Selects {@code checkRequirementUsageSubrequirementSpecialization} for a subrequirement and
	 * {@code checkRequirementUsageSpecialization} otherwise (SysML Table 32, &sect;8.4.17).
	 * <p>
	 * SysML §8.3.21.9, {@code checkRequirementUsageSpecialization}: "A RequirementUsage must directly
	 * or indirectly specialize the base RequirementUsage Requirements::requirementChecks from the
	 * Systems Model Library."
	 */
	private static String requirementKey(RequirementUsage requirement,
			ImplicitSpecializationEvaluationContext context) {
		if (UsageUtil.isSubrequirement(requirement)) {
			return "subrequirement";
		}
		return "base";
	}

	/**
	 * Adds "checkedConstraint" for a composite ConstraintUsage owned by an item
	 * ({@code checkConstraintUsageCheckedConstraintSpecialization}, SysML &sect;8.4.16). The performance
	 * default is added by the Expression rule.
	 * <p>
	 * SysML §8.3.20.4, {@code checkConstraintUsageCheckedConstraintSpecialization}: "A ConstraintUsage
	 * whose owningType is an ItemDefinition or ItemUsage must directly or indirectly specialize the
	 * ConstraintUsage Items::Item::checkedConstraints."
	 */
	private static Outcome checkedConstraintSpecialization(ConstraintUsage constraint, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		Type owner = constraint.getOwningType();
		if (!constraint.isComposite() || !(owner instanceof ItemDefinition || owner instanceof ItemUsage)) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMappedSubsetting(result, constraint, "checkedConstraint");
		return Outcome.APPLIED;
	}

	/**
	 * Adds "subrequirement" for a ConcernUsage that is a subrequirement of its owning RequirementUsage
	 * (SysML Table 32, key of {@code checkRequirementUsageSubrequirementSpecialization}).
	 */
	private static Outcome concernSubrequirementSpecialization(ConcernUsage concern, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		if (!UsageUtil.isSubrequirement(concern)) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMappedSubsetting(result, concern, "subrequirement");
		return Outcome.APPLIED;
	}

	/**
	 * SysML §8.3.20.4, {@code checkConstraintUsageSpecialization}: "A ConstraintUsage must directly or
	 * indirectly specialize the base ConstraintUsage Constraints::constraintChecks from the Systems
	 * Model Library."
	 */
	private static String constraintKey(ConstraintUsage constraint,
			ImplicitSpecializationEvaluationContext context) {
		return "base";
	}

	/**
	 * SysML §8.3.21.4, {@code checkConcernUsageSpecialization}: "A ConcernUsage must directly or
	 * indirectly specialize the base ConcernUsage Requirements::concernChecks from the Systems Model
	 * Library."
	 */
	private static String concernKey(ConcernUsage concern,
			ImplicitSpecializationEvaluationContext context) {
		return "base";
	}
}
