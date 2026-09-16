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

package org.omg.sysml.xtext.tests.parser;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.omg.sysml.xtext.tests.SysMLTestSetup;
import org.omg.sysml.xtext.tests.TestModels;
import org.omg.sysml.xtext.tests.TestModels.TestModel;

/**
 * Parser tests: every {@code .sysml} / {@code .kerml} file found under the configured roots
 * (see {@link TestModels#PARSER_ROOTS_PROPERTY}) is one test case, which passes if and only if
 * the file parses without syntax errors. Linking and validation are deliberately not performed,
 * so the models do not need the standard library and may reference undefined names.
 */
@RunWith(Parameterized.class)
public class ParserTest {

	@Parameters(name = "{0}")
	public static Collection<TestModel> models() {
		return TestModels.collect(
				TestModels.getRoots(TestModels.PARSER_ROOTS_PROPERTY, TestModels.DEFAULT_PARSER_ROOT));
	}

	private final TestModel model;

	public ParserTest(TestModel model) {
		this.model = model;
	}

	@Test
	public void parsesWithoutSyntaxErrors() {
		XtextResourceSet resourceSet = SysMLTestSetup.createResourceSet();
		URI uri = URI.createFileURI(model.path().toString());
		Resource resource = resourceSet.createResource(uri);
		assertNotNull("No resource factory registered for " + uri, resource);
		try {
			resource.load(resourceSet.getLoadOptions());
		} catch (IOException e) {
			fail("Could not read " + model.path() + ": " + e);
		}

		// Diagnostics attached to the resource by loading are syntax errors (or I/O problems);
		// linking errors are only added when proxies get resolved, which is not done here.
		if (!resource.getErrors().isEmpty()) {
			fail(formatDiagnostics(resource.getErrors()));
		}
		IParseResult parseResult = ((XtextResource) resource).getParseResult();
		assertNotNull("No parse result for " + model.path(), parseResult);
		if (parseResult.hasSyntaxErrors()) {
			fail(formatSyntaxErrors(parseResult.getSyntaxErrors()));
		}
		// An empty file is a valid (empty) root namespace, so a missing root element is not an error.
	}

	private String formatDiagnostics(List<Resource.Diagnostic> diagnostics) {
		return "Errors in " + model.path() + ":\n" + diagnostics.stream()
				.map(d -> "  " + d.getLine() + ":" + d.getColumn() + " " + d.getMessage())
				.collect(Collectors.joining("\n"));
	}

	private String formatSyntaxErrors(Iterable<INode> errorNodes) {
		StringBuilder sb = new StringBuilder("Syntax errors in " + model.path() + ":");
		for (INode node : errorNodes) {
			SyntaxErrorMessage message = node.getSyntaxErrorMessage();
			sb.append("\n  ").append(node.getStartLine()).append(": ")
			  .append(message == null ? "syntax error" : message.getMessage());
		}
		return sb.toString();
	}

}
