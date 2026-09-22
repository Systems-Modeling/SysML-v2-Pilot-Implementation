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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.junit.Test;

/**
 * Regression tests for linking failures observed during a nested name resolution.
 * <p>
 * While a name is being resolved, the scope excludes the imports and memberships that
 * are still pending resolution (KerML 8.2.3.5.1). A nested resolution triggered at that
 * moment, for example by computing an effective name or an implicit specialization that
 * needs a metadata metaclass, can fail only because of those exclusions. Such a
 * provisional failure must not remain recorded once the outermost resolution completes:
 * every name below is visible through an import (KerML 8.2.3.5.3 and 8.2.3.5.4), so the
 * fully resolved resource must have no linking errors.
 */
public class NestedNameResolutionTest extends AbstractImplicitSpecializationTest {

	/**
	 * An import whose namespace is provided by another import of the same package must
	 * be resolved, as must a metadata value provided by that second import.
	 * <p>
	 * Resolving {@code RiskMetadata} excludes the first import and explores the second
	 * one, whose namespace {@code RiskLevelEnum} cannot be found while the first import
	 * is excluded. Without the fix this provisional failure stayed recorded, leaving
	 * errors on {@code RiskLevelEnum} and {@code high}.
	 */
	@Test
	public void importProvidedByAnotherImportIsResolved() throws Exception {
		// package RiskTest {
		//     private import RiskMetadata::*;
		//     private import RiskLevelEnum::*;
		//     part engine { @Risk { totalRisk = high; } }
		// }
		Resource resource = parse("risk.sysml",
				"package RiskTest {\n"
				+ "    private import RiskMetadata::*;\n"
				+ "    private import RiskLevelEnum::*;\n"
				+ "    part engine { @Risk { totalRisk = high; } }\n"
				+ "}");

		// Resolve every lazy link in document order, as a batch load does.
		EcoreUtil2.resolveLazyCrossReferences(resource, null);

		// The first link resolved (RiskMetadata) triggers the nested failure on RiskLevelEnum;
		// both must be resolved once the whole resource has been linked.
		assertTrue(resource.getErrors().toString(), resource.getErrors().isEmpty());
	}

	/**
	 * A metadata usage owned by a parameter must resolve its metaclass through a private
	 * import of the enclosing action.
	 * <p>
	 * Resolving names in the action computes the effective name and redefinitions of its
	 * parameter {@code dt}, whose implicit specializations resolve the metaclass of
	 * {@code @ToolVariable} while the import of {@code AnalysisTooling} is excluded.
	 * Without the fix, {@code ToolVariable} and its feature {@code name} stayed
	 * unresolved, even after transformation.
	 */
	@Test
	public void metadataOnNestedFeatureIsResolvedThroughEnclosingImport() throws Exception {
		// package ToolTest {
		//     action computeDynamics {
		//         private import AnalysisTooling::*;
		//         in dt : ScalarValues::Real { @ToolVariable { name = "deltaT"; } }
		//     }
		// }
		Resource resource = parse("toolVariable.sysml",
				"package ToolTest {\n"
				+ "    action computeDynamics {\n"
				+ "        private import AnalysisTooling::*;\n"
				+ "        in dt : ScalarValues::Real { @ToolVariable { name = \"deltaT\"; } }\n"
				+ "    }\n"
				+ "}");

		// Resolve every lazy link in document order.
		EcoreUtil2.resolveLazyCrossReferences(resource, null);

		// ToolVariable must be AnalysisTooling::ToolVariable and name its feature.
		assertTrue(resource.getErrors().toString(), resource.getErrors().isEmpty());
	}

	/**
	 * A metadata usage owned by the namespace that declares the import must resolve its
	 * metaclass through that import.
	 * <p>
	 * Resolving {@code ToolExecution} in {@code computeDynamics} computes the implicit
	 * specializations of {@code computeDynamics}, which resolve the metaclass of the same
	 * metadata usage again while its first resolution is still pending, which also makes
	 * the nested failure provisional.
	 */
	@Test
	public void metadataOnImportingNamespaceIsResolved() throws Exception {
		// package ToolExecutionTest {
		//     action computeDynamics {
		//         private import AnalysisTooling::*;
		//         metadata ToolExecution { toolName = "ModelCenter"; }
		//     }
		// }
		Resource resource = parse("toolExecution.sysml",
				"package ToolExecutionTest {\n"
				+ "    action computeDynamics {\n"
				+ "        private import AnalysisTooling::*;\n"
				+ "        metadata ToolExecution { toolName = \"ModelCenter\"; }\n"
				+ "    }\n"
				+ "}");

		// Resolve every lazy link in document order.
		EcoreUtil2.resolveLazyCrossReferences(resource, null);

		// ToolExecution must be AnalysisTooling::ToolExecution and toolName its feature.
		assertTrue(resource.getErrors().toString(), resource.getErrors().isEmpty());
	}

}
