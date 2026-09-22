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

import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.self;
import static org.omg.sysml.logic.implicit.specialization.rules.ImplicitTypingPredicate.isPerformedAction;

import java.util.List;

import org.omg.sysml.lang.sysml.AnalysisCaseDefinition;
import org.omg.sysml.lang.sysml.AnalysisCaseUsage;
import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.UseCaseDefinition;
import org.omg.sysml.lang.sysml.UseCaseUsage;
import org.omg.sysml.lang.sysml.VerificationCaseDefinition;
import org.omg.sysml.lang.sysml.VerificationCaseUsage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.rules.ImplicitSpecializationRule.Outcome;

/**
 * Rules of the constraints of SysML &sect;8.3.22 to &sect;8.3.25, Cases, Analysis Cases, Verification
 * Cases and Use Cases. The specific case defaults subsume the generic subcase, subcalculation and
 * subaction defaults, which they exclude once they apply.
 * <p>
 * Specification quotations are from SysML 2.1.
 */
final class SysMLCaseRules {

	private SysMLCaseRules() {
	}

	/**
	 * Returns the rules of this clause.
	 *
	 * @return the rules, in registration order
	 */
	static List<ImplicitSpecializationRule> rules() {
		return List.of(
				self("checkAnalysisCaseUsageSubAnalysisCaseSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, AnalysisCaseUsage.class,
						SysMLCaseRules::subAnalysisCaseSpecialization)
						.excluding("checkCaseUsageSubcaseSpecialization", "checkCalculationUsageSubcalculationSpecialization",
								"checkActionUsageSubactionSpecialization"),
				self("checkVerificationCaseUsageSubVerificationCaseSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, VerificationCaseUsage.class,
						SysMLCaseRules::subVerificationCaseSpecialization)
						.excluding("checkCaseUsageSubcaseSpecialization", "checkCalculationUsageSubcalculationSpecialization",
								"checkActionUsageSubactionSpecialization"),
				self("includeUseCaseUsagePerformedActionSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, IncludeUseCaseUsage.class,
						SysMLCaseRules::includedPerformedActionSpecialization),
				self("checkIncludeUseCaseUsageSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, IncludeUseCaseUsage.class,
						SysMLCaseRules::includedUseCaseSpecialization)
						.excluding("checkCaseUsageSubcaseSpecialization", "checkCalculationUsageSubcalculationSpecialization",
								"checkActionUsageSubactionSpecialization"),
				self("checkUseCaseUsageSubUseCaseSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, UseCaseUsage.class,
						SysMLCaseRules::subUseCaseSpecialization)
						.excluding("checkCaseUsageSubcaseSpecialization", "checkCalculationUsageSubcalculationSpecialization",
								"checkActionUsageSubactionSpecialization"),
				self("checkCaseUsageSubcaseSpecialization", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, CaseUsage.class, SysMLCaseRules::subcaseSpecialization)
						.excluding("checkCalculationUsageSubcalculationSpecialization", "checkActionUsageSubactionSpecialization"));
	}

	/**
	 * Adds the subAnalysisCase default ({@code checkAnalysisCaseUsageSubAnalysisCaseSpecialization},
	 * SysML &sect;8.4.19).
	 * <p>
	 * SysML §8.3.23.3, {@code checkAnalysisCaseUsageSubAnalysisCaseSpecialization}: "A composite
	 * AnalysisCaseUsage whose owningType is an AnalysisCaseDefinition or AnalysisCaseUsage must
	 * specialize the AnalysisCaseUsage AnalysisCases::AnalysisCase::subAnalysisCases from the Systems
	 * Model Library."
	 */
	private static Outcome subAnalysisCaseSpecialization(AnalysisCaseUsage analysis, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		return ownedSubcase(analysis, analysis.getOwningType() instanceof AnalysisCaseDefinition
				|| analysis.getOwningType() instanceof AnalysisCaseUsage, "subAnalysisCase", result);
	}

	/**
	 * Adds the subVerificationCase default ({@code
	 * checkVerificationCaseUsageSubVerificationCaseSpecialization}, SysML &sect;8.4.20).
	 * <p>
	 * SysML §8.3.24.4, {@code checkVerificationCaseUsageSubVerificationCaseSpecialization}: "If it is
	 * composite and owned by a VerificationCaseDefinition or VerificationCaseUsage, then it must
	 * specialize VerificationCaseUsage VerificationCases::VerificationCase::subVerificationCases."
	 */
	private static Outcome subVerificationCaseSpecialization(VerificationCaseUsage verification,
			ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		return ownedSubcase(verification, verification.getOwningType() instanceof VerificationCaseDefinition
				|| verification.getOwningType() instanceof VerificationCaseUsage, "subVerificationCase", result);
	}

	/** Adds "performedAction" to an IncludeUseCaseUsage performed by a part ({@code checkPerformActionUsageSpecialization}). */
	private static Outcome includedPerformedActionSpecialization(IncludeUseCaseUsage include,
			ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		if (!isPerformedAction(include)) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMappedSubsetting(result, include, "performedAction");
		return Outcome.APPLIED;
	}

	/**
	 * Adds "subUseCase" to an IncludeUseCaseUsage of a use case. Unlike a plain UseCaseUsage, it
	 * subsets the non-composite {@code UseCases::UseCase::includedUseCases}, so the rule does not
	 * require {@code isComposite()} ({@code checkIncludeUseCaseUsageSpecialization}, SysML &sect;8.4.21).
	 * <p>
	 * SysML §8.3.25.2, {@code checkIncludeUseCaseUsageSpecialization}: "A IncludeUseCaseUsage whose
	 * owningType is a UseCaseDefinition or UseCaseUsage must directly or indirectly specialize the
	 * UseCaseUsage UseCases::UseCase::includedUseCases from the Systems Model Library."
	 */
	private static Outcome includedUseCaseSpecialization(IncludeUseCaseUsage include, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		Type owner = include.getOwningType();
		if (!(owner instanceof UseCaseDefinition || owner instanceof UseCaseUsage)) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMappedSubsetting(result, include, "subUseCase");
		return Outcome.APPLIED;
	}

	/**
	 * Adds the subUseCase default ({@code checkUseCaseUsageSubUseCaseSpecialization}, SysML &sect;8.4.21).
	 * <p>
	 * SysML §8.3.25.4, {@code checkUseCaseUsageSubUseCaseSpecialization}: "A composite UseCaseUsage
	 * whose owningType is a UseCaseDefinition or UseCaseUsage must specialize the UseCaseUsage
	 * UseCases::UseCase::subUseCases from the Systems Model Library."
	 */
	private static Outcome subUseCaseSpecialization(UseCaseUsage useCase, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		return ownedSubcase(useCase, useCase.getOwningType() instanceof UseCaseDefinition
				|| useCase.getOwningType() instanceof UseCaseUsage, "subUseCase", result);
	}

	/**
	 * Adds the subcase default ({@code checkCaseUsageSubcaseSpecialization}, SysML &sect;8.4.18).
	 * <p>
	 * SysML §8.3.22.3, {@code checkCaseUsageSubcaseSpecialization}: "A composite CaseUsage whose
	 * owningType is a CaseDefinition or CaseUsage must directly or indirectly specialize the CaseUsage
	 * Cases::Case::subcases."
	 */
	private static Outcome subcaseSpecialization(CaseUsage caseUsage, ImplicitSpecializationResult result,
			ImplicitSpecializationEvaluationContext context) {
		return ownedSubcase(caseUsage, caseUsage.getOwningType() instanceof CaseDefinition
				|| caseUsage.getOwningType() instanceof CaseUsage, "subcase", result);
	}

	private static Outcome ownedSubcase(CaseUsage caseUsage, boolean ownedByCaseOfSameKind, String key,
			ImplicitSpecializationResult result) {
		if (!caseUsage.isComposite() || !ownedByCaseOfSameKind) {
			return Outcome.NOT_APPLICABLE;
		}
		SpecializationHelper.addMappedSubsetting(result, caseUsage, key);
		return Outcome.APPLIED;
	}
}
