/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *
 * Contributors:
 *  Vince Molnár
 *
*******************************************************************************/

package org.omg.sysml.xtext.tests.validation;

import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.validation.Issue;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.omg.sysml.xtext.tests.TestModels;
import org.omg.sysml.xtext.tests.validation.ValidationManifest.Entry;
import org.omg.sysml.xtext.tests.validation.ValidationManifest.Expectation;

/**
 * Validation tests: every entry of the manifest(s) named by
 * {@link ValidationManifest#MANIFESTS_PROPERTY} is one test case. The model is parsed, linked
 * against the standard library and validated; then
 * <ul>
 * <li>an {@code invalid} case passes if at least one issue, of any severity, carries the
 *     issue code of the targeted rule (anywhere in the model);</li>
 * <li>a {@code valid} case passes if no issue carries that code and there is no issue of
 *     severity ERROR at all (syntax and linking errors included). Warnings from other rules
 *     are tolerated.</li>
 * </ul>
 * On failure the message lists every issue actually reported.
 */
@RunWith(Parameterized.class)
public class ValidationTest {

	@Parameters(name = "{0}")
	public static Collection<Entry> entries() {
		return ValidationManifest.read(
				TestModels.getRoots(ValidationManifest.MANIFESTS_PROPERTY, ValidationManifest.DEFAULT_MANIFEST));
	}

	@BeforeClass
	public static void loadLibrary() {
		LibraryResourceSet.getInstance();
	}

	private final Entry entry;

	public ValidationTest(Entry entry) {
		this.entry = entry;
	}

	@Test
	public void validatesAsExpected() {
		List<Issue> issues = LibraryResourceSet.getInstance().validate(entry.file());
		String code = entry.issueCode();
		boolean ruleViolated = issues.stream().anyMatch(issue -> Objects.equals(code, issue.getCode()));
		boolean hasErrors = issues.stream().anyMatch(issue -> issue.getSeverity() == Severity.ERROR);

		if (entry.expected() == Expectation.INVALID && !ruleViolated) {
			fail("Expected a violation of " + entry.rule() + " (issue code '" + code + "') in "
					+ entry.file().getFileName() + ", but it was not reported." + formatIssues(issues));
		}
		if (entry.expected() == Expectation.VALID && ruleViolated) {
			fail("Expected no violation of " + entry.rule() + " (issue code '" + code + "') in "
					+ entry.file().getFileName() + ", but it was reported." + formatIssues(issues));
		}
		if (entry.expected() == Expectation.VALID && hasErrors) {
			fail("Expected " + entry.file().getFileName() + " to be free of errors." + formatIssues(issues));
		}
	}

	static String formatIssues(List<Issue> issues) {
		if (issues.isEmpty()) {
			return "\n  (no issues reported)";
		}
		return "\n  Reported issues:\n" + issues.stream()
				.map(ValidationTest::formatIssue)
				.collect(Collectors.joining("\n"));
	}

	static String formatIssue(Issue issue) {
		return "    " + issue.getSeverity() + " " + issue.getLineNumber() + ":" + issue.getColumn()
				+ " " + issue.getCode() + "  " + issue.getMessage();
	}

}
