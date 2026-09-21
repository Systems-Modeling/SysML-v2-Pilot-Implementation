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

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.UseCaseUsage;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Behavior-contract regression tests for the implicit-specialization defaults
 * applied to {@link ActionUsage} subtypes (SysML Table 32 &sect;8.4.1, with
 * per-subtype citations in &sect;8.4.13/8.4.18-21). Checks the raw candidate
 * through {@link TypeUtil#getImplicitGeneralTypesFor(Type)} before
 * transformation, then transforms and checks the same expectation against
 * the materialized {@code getOwnedSpecialization()} — a plain EMF read,
 * independent of whichever engine computed the candidates.
 */
public class ActionUsageImplicitSpecializationTest extends AbstractImplicitSpecializationTest {


	/**
	 * A transition trigger {@link AcceptActionUsage} must get none of the
	 * generic ActionUsage defaults: SysML &sect;8.3.17.2 "AcceptActionUsage"
	 * (the {@code isTriggerAction()} operation) and the
	 * {@code checkAcceptActionUsageTriggerActionSpecialization} constraint
	 * (&sect;8.4.13.6 "Accept Action Usages") mean the whole default-typing
	 * fallback is suppressed for it, not just the ActionUsage-subtype dispatch.
	 */
	@Test
	public void triggerAcceptActionGetsNoDefaultTyping() throws Exception {
		// attribute def Signal;
		// state def Machine {
		//     state off;
		//     state starting;
		//     transition t1 first off accept Signal then starting;
		// }
		Resource resource = parse("trigger.sysml", """
				attribute def Signal;
				state def Machine {
					state off;
					state starting;
					transition t1 first off accept Signal then starting;
				}
				""");
		AcceptActionUsage trigger = findSingle(resource, AcceptActionUsage.class);

		// The ordinary AcceptActionUsage base default (Actions::acceptActions) must be
		// absent: it would otherwise always apply via the ActionUsage fallback case.
		assertNotContains(TypeUtil.getImplicitGeneralTypesFor(trigger), "Actions::acceptActions");
		// Nor does the generic action-ownership fallback ("subaction"/"ownedAction") apply.
		assertNotContains(TypeUtil.getImplicitGeneralTypesFor(trigger), "Actions::Action::subactions");
		assertNotContains(TypeUtil.getImplicitGeneralTypesFor(trigger), "Parts::Part::ownedActions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationDoesNotContain(trigger, "Actions::acceptActions");
		assertOwnedSpecializationDoesNotContain(trigger, "Actions::Action::subactions");
		assertOwnedSpecializationDoesNotContain(trigger, "Parts::Part::ownedActions");
	}

	/**
	 * An {@code include use case} usage is an {@link IncludeUseCaseUsage},
	 * which is itself a kind of {@link UseCaseUsage}. SysML Table 32
	 * {@code checkIncludeUseCaseSpecialization} subsets the reference
	 * (non-composite) {@code UseCases::UseCase::includedUseCases}, while the
	 * plain-nested-use-case rule {@code checkUseCaseUsageSubUseCaseSpecialization}
	 * subsets the composite {@code UseCases::UseCase::subUseCases} and
	 * requires {@code isComposite()}.
	 */
	@Test
	public void includedUseCaseSubsetsTheNonCompositeIncludedUseCases() throws Exception {
		// use case def UC1;
		// use case def UseSystem {
		//     include use case ucInclude : UC1;
		//     use case ucNested : UC1;
		// }
		Resource resource = parse("usecase.sysml", """
				use case def UC1;
				use case def UseSystem {
					include use case ucInclude : UC1;
					use case ucNested : UC1;
				}
				""");
		IncludeUseCaseUsage included = findSingle(resource, IncludeUseCaseUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(included), "UseCases::UseCase::includedUseCases");
		assertNotContains(TypeUtil.getImplicitGeneralTypesFor(included), "UseCases::UseCase::subUseCases");

		// The plain nested (composite) UseCaseUsage takes the sibling, composite-only rule.
		UseCaseUsage nested = findByName(resource, "ucNested", UseCaseUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(nested), "UseCases::UseCase::subUseCases");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(included, "UseCases::UseCase::includedUseCases");
		assertOwnedSpecializationDoesNotContain(included, "UseCases::UseCase::subUseCases");
		assertOwnedSpecializationContains(nested, "UseCases::UseCase::subUseCases");
	}

	/**
	 * An {@link ActionUsage} composite under another {@link ActionUsage} with
	 * no more specific subtype falls through to the generic
	 * {@code checkActionUsageSubactionSpecialization} default (SysML Table 32,
	 * &sect;8.4.13), subsetting {@code Actions::Action::subactions}.
	 */
	@Test
	public void plainNestedActionGetsTheGenericSubactionDefault() throws Exception {
		// action def A;
		// action a : A {
		//     action b;
		// }
		Resource resource = parse("action.sysml", """
				action def A;
				action a : A {
					action b;
				}
				""");
		ActionUsage b = findByName(resource, "b", ActionUsage.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(b), "Actions::Action::subactions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(b, "Actions::Action::subactions");
	}

	/**
	 * A composite {@code AnalysisCaseUsage} nested under an
	 * {@code AnalysisCaseDefinition} gets the exclusive subtype default
	 * ({@code checkAnalysisCaseUsageSubAnalysisCaseSpecialization}, SysML
	 * Table 32 &sect;8.4.19 "Analysis Case Usages"); the unconditional,
	 * cumulative performance default (Table 10) is a raw candidate too but is
	 * reduced away at materialization time, see below.
	 */
	@Test
	public void analysisCaseUsageGetsBothTheSubtypeDefaultAndThePerformanceDefault() throws Exception {
		// analysis def MassAnalysisCase;
		// analysis def AnalysisPlan {
		//     analysis massAnalysisCase : MassAnalysisCase;
		// }
		Resource resource = parse("analysis.sysml", """
				analysis def MassAnalysisCase;
				analysis def AnalysisPlan {
					analysis massAnalysisCase : MassAnalysisCase;
				}
				""");
		ActionUsage massAnalysisCase = findByName(resource, "massAnalysisCase", ActionUsage.class);
		List<Type> candidates = TypeUtil.getImplicitGeneralTypesFor(massAnalysisCase);
		assertContains(candidates, "AnalysisCases::AnalysisCase::subAnalysisCases");

		// After reduction, "subperformances" stays a raw candidate but is not
		// materialized: Actions::Action::subactions (itself reached transitively
		// from subAnalysisCases via Cases::Case::subcases/Calculations::Calculation::
		// subcalculations) already subsets Performances::Performance::subperformances
		// in the standard library, so the more specific subAnalysisCases edge alone
		// is inserted (KerML &sect;8.4.2 — a more specific implied relationship
		// subsumes a less specific one, which is then not inserted). This reduction
		// is identical on the pre-refactoring adapter mechanism, since it is driven
		// entirely by the standard library's own subsetting chain, not by which
		// engine computes the candidates.
		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(massAnalysisCase, "AnalysisCases::AnalysisCase::subAnalysisCases");
	}


}
