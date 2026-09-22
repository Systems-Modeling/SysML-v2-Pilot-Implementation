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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.logic.SysMLLogicStandaloneSetup;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;

/**
 * Tests the ordering and execution semantics of {@link ImplicitSpecializationRules} with rules that
 * record when they run and add nothing, on elements built programmatically.
 */
public class ImplicitSpecializationRulesTest {

	private static final Path GENERATED_SWITCH = Path.of(
			"../org.omg.sysml.model/src/main/java/org/omg/sysml/lang/sysml/util/SysMLSwitch.java");

	/** Registers the SysML delegates needed by the derived properties that the engine reads, such as isConjugated. */
	@BeforeClass
	public static void setUp() {
		SysMLLogicStandaloneSetup.doSetup();
	}

	/**
	 * For every metaclass, the engine orders rule subjects as the generated {@code SysMLSwitch} tries
	 * its cases, including under multiple inheritance.
	 */
	@Test
	public void switchOrderMatchesTheGeneratedSwitch() throws IOException {
		String source = Files.readString(GENERATED_SWITCH, StandardCharsets.UTF_8);
		// Each "case SysMLPackage.X:" block lists the calls "caseY(" in the order they are tried.
		Matcher block = Pattern.compile("case SysMLPackage\\.\\w+: \\{(.*?)return result;", Pattern.DOTALL)
				.matcher(source);
		Pattern call = Pattern.compile("case(\\w+)\\(");
		int compared = 0;
		while (block.find()) {
			List<String> generated = new ArrayList<>();
			Matcher calls = call.matcher(block.group(1));
			while (calls.find()) {
				generated.add(calls.group(1));
			}
			// The first case of a block is the metaclass itself.
			EClass eClass = (EClass)SysMLPackage.eINSTANCE.getEClassifier(generated.get(0));
			List<String> computed = ImplicitSpecializationRulesByMetaclass.switchOrder(eClass).stream()
					.map(EClass::getName).toList();
			assertEquals("Switch order of " + eClass.getName(), generated, computed);
			compared++;
		}
		assertEquals(SysMLPackage.eINSTANCE.getEClassifiers().stream().filter(EClass.class::isInstance).count(),
				compared);
	}

	/**
	 * Within a family, rules run from the most specific subject metaclass to the most general one,
	 * whatever their registration order, and rules of the same metaclass keep their registration
	 * order.
	 */
	@Test
	public void rulesRunInSwitchOrderThenRegistrationOrder() {
		List<String> calls = new ArrayList<>();
		ImplicitSpecializationRules engine = new ImplicitSpecializationRules(List.of(
				recording("feature", ImplicitSpecializationRuleFamily.PRIORITY, Feature.class, calls),
				recording("part", ImplicitSpecializationRuleFamily.PRIORITY, PartUsage.class, calls),
				recording("usage1", ImplicitSpecializationRuleFamily.PRIORITY, Usage.class, calls),
				recording("usage2", ImplicitSpecializationRuleFamily.PRIORITY, Usage.class, calls)));

		// A PartUsage is a Usage and a Feature: all four rules apply.
		apply(engine, SysMLFactory.eINSTANCE.createPartUsage());
		assertEquals(List.of("part", "usage1", "usage2", "feature"), calls);
	}

	/**
	 * A rule that fully determines the Type lets its own family finish and stops the later
	 * families.
	 */
	@Test
	public void determiningRuleStopsTheLaterFamilies() {
		List<String> calls = new ArrayList<>();
		ImplicitSpecializationRules engine = new ImplicitSpecializationRules(List.of(
				recording("determines", ImplicitSpecializationRuleFamily.CONTEXT, Feature.class, calls,
						ImplicitSpecializationRule.Outcome.APPLIED_DETERMINES),
				recording("sameFamily", ImplicitSpecializationRuleFamily.CONTEXT, Feature.class, calls),
				recording("later", ImplicitSpecializationRuleFamily.PRIORITY, Feature.class, calls)));

		ImplicitSpecializationResult result = apply(engine, SysMLFactory.eINSTANCE.createFeature());
		assertEquals(List.of("determines", "sameFamily"), calls);
		// The redefinitions are published before returning.
		assertTrue(result.areRedefinitionsStable());
	}

	/**
	 * A rule that suppresses the fallbacks prevents the metadata and default families, but not the
	 * redefinition and expression-result families.
	 */
	@Test
	public void suppressingRuleSkipsOnlyTheFallbackFamilies() {
		List<String> calls = new ArrayList<>();
		ImplicitSpecializationRules engine = new ImplicitSpecializationRules(List.of(
				recording("suppresses", ImplicitSpecializationRuleFamily.PRIORITY, Feature.class, calls,
						ImplicitSpecializationRule.Outcome.APPLIED_SUPPRESSES_FALLBACKS),
				recording("metadata", ImplicitSpecializationRuleFamily.METADATA, Feature.class, calls),
				recording("redefinition", ImplicitSpecializationRuleFamily.REDEFINITION, Feature.class, calls),
				recording("result", ImplicitSpecializationRuleFamily.EXPRESSION_RESULT, Feature.class, calls),
				recording("default", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, Feature.class, calls)));

		ImplicitSpecializationResult result = apply(engine, SysMLFactory.eINSTANCE.createFeature());
		assertEquals(List.of("suppresses", "redefinition", "result"), calls);
		assertFalse(result.areFallbackSpecializationsAllowed());
	}

	/**
	 * The priority family is the alternative of the exclusive priority family: it runs only when no
	 * exclusive priority rule applied.
	 */
	@Test
	public void alternativeFamilyRunsOnlyWhenTheOtherDidNotApply() {
		List<String> calls = new ArrayList<>();
		ImplicitSpecializationRules engine = new ImplicitSpecializationRules(List.of(
				recording("exclusive", ImplicitSpecializationRuleFamily.PRIORITY_EXCLUSIVE, PartUsage.class, calls),
				recording("cumulative", ImplicitSpecializationRuleFamily.PRIORITY, Feature.class, calls)));

		// For a PartUsage, the exclusive rule applies and the priority family is skipped.
		apply(engine, SysMLFactory.eINSTANCE.createPartUsage());
		assertEquals(List.of("exclusive"), calls);

		// A plain Feature has no exclusive rule: the priority family runs.
		calls.clear();
		apply(engine, SysMLFactory.eINSTANCE.createFeature());
		assertEquals(List.of("cumulative"), calls);
	}

	/**
	 * In the first-match default key family, only the first rule that applies runs, from the most
	 * specific subject metaclass; a rule that does not apply lets the next one run.
	 */
	@Test
	public void firstMatchFamilyRunsOnlyTheFirstApplicableRule() {
		List<String> calls = new ArrayList<>();
		ImplicitSpecializationRules engine = new ImplicitSpecializationRules(List.of(
				recording("part", ImplicitSpecializationRuleFamily.DEFAULT_KEY, PartUsage.class, calls,
						ImplicitSpecializationRule.Outcome.NOT_APPLICABLE),
				recording("usage", ImplicitSpecializationRuleFamily.DEFAULT_KEY, Usage.class, calls),
				recording("feature", ImplicitSpecializationRuleFamily.DEFAULT_KEY, Feature.class, calls)));

		// The PartUsage rule does not apply, the Usage rule applies and ends the family.
		apply(engine, SysMLFactory.eINSTANCE.createPartUsage());
		assertEquals(List.of("part", "usage"), calls);
	}

	/**
	 * A rule that applies prevents the rules it excludes from running; a rule that does not apply
	 * excludes nothing.
	 */
	@Test
	public void appliedRuleExcludesTheListedRules() {
		List<String> calls = new ArrayList<>();
		ImplicitSpecializationRules engine = new ImplicitSpecializationRules(List.of(
				recording("specific", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, PartUsage.class, calls)
						.excluding("generic"),
				recording("generic", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, Feature.class, calls)));

		// For a PartUsage, the specific rule applies first and excludes the generic one.
		apply(engine, SysMLFactory.eINSTANCE.createPartUsage());
		assertEquals(List.of("specific"), calls);

		// A plain Feature is not a PartUsage: only the generic rule is selected.
		calls.clear();
		apply(engine, SysMLFactory.eINSTANCE.createFeature());
		assertEquals(List.of("generic"), calls);
	}

	/**
	 * Registrations that the engine cannot order unambiguously are refused at construction: a
	 * duplicate identifier, an exclusion of a rule of another family, and an exclusion that could
	 * not take effect because the excluded rule runs first.
	 */
	@Test
	public void invalidRegistrationsAreRefused() {
		List<String> calls = new ArrayList<>();
		assertThrows(IllegalArgumentException.class, () -> new ImplicitSpecializationRules(List.of(
				recording("same", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, Feature.class, calls),
				recording("same", ImplicitSpecializationRuleFamily.PRIORITY, Feature.class, calls))));
		assertThrows(IllegalArgumentException.class, () -> new ImplicitSpecializationRules(List.of(
				recording("excluding", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, Feature.class, calls)
						.excluding("other"),
				recording("other", ImplicitSpecializationRuleFamily.PRIORITY, Feature.class, calls))));
		// A Feature rule excluding a PartUsage rule: for a PartUsage, the PartUsage rule runs first.
		assertThrows(IllegalArgumentException.class, () -> new ImplicitSpecializationRules(List.of(
				recording("generic", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, Feature.class, calls)
						.excluding("specific"),
				recording("specific", ImplicitSpecializationRuleFamily.DEFAULT_ADDITION, PartUsage.class, calls))));
		// No rule ran during these registrations.
		assertEquals(List.of(), calls);
	}

	private static ImplicitSpecializationResult apply(ImplicitSpecializationRules engine, Type type) {
		ImplicitSpecializationEvaluationContext context =
				new ImplicitSpecializationEvaluationContext(new ImplicitSpecializationService());
		ImplicitSpecializationResult result = new ImplicitSpecializationResult(type);
		engine.apply(type, result, context);
		return result;
	}

	/** Declares a rule that records its identifier when it runs, adds nothing and applies. */
	private static <T extends Type> ImplicitSpecializationRule recording(String id,
			ImplicitSpecializationRuleFamily family, Class<T> subjectType, List<String> calls) {
		return recording(id, family, subjectType, calls, ImplicitSpecializationRule.Outcome.APPLIED);
	}

	/** Declares a rule that records its identifier when it runs, adds nothing and returns an outcome. */
	private static <T extends Type> ImplicitSpecializationRule recording(String id,
			ImplicitSpecializationRuleFamily family, Class<T> subjectType, List<String> calls,
			ImplicitSpecializationRule.Outcome outcome) {
		return ImplicitSpecializationRule.self(id, family, subjectType, (type, result, context) -> {
			calls.add(id);
			return outcome;
		});
	}
}
