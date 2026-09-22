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

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.ExhibitStateUsage;
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage;
import org.omg.sysml.lang.sysml.UseCaseUsage;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.util.ElementUtil;

/**
 * Tests the implicit-specialization defaults of {@link ActionUsage} subtypes (SysML Table 32,
 * &sect;8.4.13 and &sect;8.4.18 to &sect;8.4.21).
 * <p>
 * Each test checks the raw candidates of the public {@link ImplicitSpecializationService}
 * before transformation, then the materialized {@code getOwnedSpecialization()} after it.
 */
public class ActionUsageImplicitSpecializationTest extends AbstractImplicitSpecializationTest {


	/**
	 * A transition-trigger {@link AcceptActionUsage} gets none of the ActionUsage defaults: its
	 * match in the {@code PRIORITY_EXCLUSIVE} rule family (defined in
	 * the "Computation order" section of {@code org.omg.sysml.logic/doc/implicit-specialization.md}) suppresses every fallback
	 * ({@code checkAcceptActionUsageTriggerActionSpecialization}, SysML &sect;8.4.13.6).
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
				""", true);
		AcceptActionUsage trigger = findSingle(resource, AcceptActionUsage.class);

		// The ordinary AcceptActionUsage base default (Actions::acceptActions) must be
		// absent: it would otherwise always apply via the ActionUsage fallback case.
		assertNotContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(trigger), "Actions::acceptActions");
		// Nor does the generic action-ownership fallback ("subaction"/"ownedAction") apply.
		assertNotContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(trigger), "Actions::Action::subactions");
		assertNotContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(trigger), "Parts::Part::ownedActions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationDoesNotContain(trigger, "Actions::acceptActions");
		assertOwnedSpecializationDoesNotContain(trigger, "Actions::Action::subactions");
		assertOwnedSpecializationDoesNotContain(trigger, "Parts::Part::ownedActions");
	}

	/**
	 * An {@link IncludeUseCaseUsage} subsets the non-composite
	 * {@code UseCases::UseCase::includedUseCases} ({@code checkIncludeUseCaseSpecialization}).
	 * It is also a {@link UseCaseUsage}, whose rule requires a composite usage: if the plain
	 * use-case rule were selected instead, the feature would get no default at all.
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
				""", true);
		IncludeUseCaseUsage included = findSingle(resource, IncludeUseCaseUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(included), "UseCases::UseCase::includedUseCases");
		assertNotContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(included), "UseCases::UseCase::subUseCases");

		// The plain nested (composite) UseCaseUsage takes the sibling, composite-only rule.
		UseCaseUsage nested = findByName(resource, "ucNested", UseCaseUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(nested), "UseCases::UseCase::subUseCases");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(included, "UseCases::UseCase::includedUseCases");
		assertOwnedSpecializationDoesNotContain(included, "UseCases::UseCase::subUseCases");
		assertOwnedSpecializationContains(nested, "UseCases::UseCase::subUseCases");
	}

	/**
	 * An {@link ActionUsage} composite under another {@link ActionUsage} with
	 * no more specific subtype (not a case/analysis/verification/use case/
	 * calculation/state) falls through to the generic
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
				""", true);
		ActionUsage b = findByName(resource, "b", ActionUsage.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(b), "Actions::Action::subactions");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(b, "Actions::Action::subactions");
	}

	/**
	 * A composite {@code AnalysisCaseUsage} nested under an {@code AnalysisCaseDefinition} gets
	 * both its subtype default ({@code checkAnalysisCaseUsageSubAnalysisCaseSpecialization},
	 * SysML &sect;8.4.19) and the cumulative performance default
	 * ({@code checkStepSubperformanceSpecialization}, KerML Table 10).
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
				""", true);
		ActionUsage massAnalysisCase = findByName(resource, "massAnalysisCase", ActionUsage.class);
		var candidates =  getImplicitSpecializationService().getImplicitSpecializationCandidates(massAnalysisCase);
		assertContains(candidates, "AnalysisCases::AnalysisCase::subAnalysisCases");
		assertContains(candidates, "Performances::Performance::subperformances");

		// After reduction, "subperformances" stays a raw candidate but is not
		// materialized: Actions::Action::subactions (itself reached transitively
		// from subAnalysisCases via Cases::Case::subcases/Calculations::Calculation::
		// subcalculations) already subsets Performances::Performance::subperformances
		// in the standard library, so the more specific subAnalysisCases edge alone
		// is inserted (KerML &sect;8.4.2 — a more specific implied relationship
		// subsumes a less specific one, which is then not inserted).
		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(massAnalysisCase, "AnalysisCases::AnalysisCase::subAnalysisCases");
	}

	/**
	 * An ExhibitStateUsage owned by a PartDefinition subsets {@code Parts::Part::exhibitedStates}
	 * ({@code checkExhibitStateUsageSpecialization}, SysML &sect;8.3.18.2), in addition to its
	 * StateUsage default.
	 */
	@Test
	public void exhibitStateUsageOfAPartSubsetsTheExhibitedStates() throws Exception {
		// state def Running;
		// part def Vehicle {
		//     exhibit state running : Running;
		// }
		Resource resource = parse("exhibit.sysml", """
				state def Running;
				part def Vehicle {
					exhibit state running : Running;
				}
				""", true);
		ExhibitStateUsage running = findByName(resource, "running", ExhibitStateUsage.class);

		// Raw candidates: the StateUsage default and the exhibited-state subsetting of the part.
		var candidates = getImplicitSpecializationService().getImplicitSpecializationCandidates(running);
		assertContains(candidates, "States::stateActions");
		assertContains(candidates, "Parts::Part::exhibitedStates");

		// Parts::Part::exhibitedStates is the more specific general and is materialized.
		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(running, "Parts::Part::exhibitedStates");
	}

	/**
	 * An IncludeUseCaseUsage owned by a PartDefinition subsets {@code Parts::Part::performedActions}
	 * ({@code includeUseCaseUsagePerformedActionSpecialization}, which applies
	 * {@code checkPerformActionUsageSpecialization}, SysML &sect;8.3.17.14, to an
	 * IncludeUseCaseUsage, a kind of PerformActionUsage).
	 */
	@Test
	public void includeUseCaseUsageOfAPartSubsetsThePerformedActions() throws Exception {
		// use case def Drive;
		// part def Driver {
		//     include use case drive : Drive;
		// }
		Resource resource = parse("include.sysml", """
				use case def Drive;
				part def Driver {
					include use case drive : Drive;
				}
				""", true);
		IncludeUseCaseUsage drive = findByName(resource, "drive", IncludeUseCaseUsage.class);

		// The owner is a part, not a use case: the performed-action subsetting applies, not
		// UseCases::UseCase::includedUseCases.
		var candidates = getImplicitSpecializationService().getImplicitSpecializationCandidates(drive);
		assertContains(candidates, "Parts::Part::performedActions");
		assertNotContains(candidates, "UseCases::UseCase::includedUseCases");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(drive, "Parts::Part::performedActions");
	}
}
