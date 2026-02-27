/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *
 *******************************************************************************/
package org.omg.sysml.logic.delegate.invocation;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Boundary tests for invocation delegates that currently rely on base fallback behavior.
 *
 * <p>What this test covers:
 * fallback delegates must return neutral values compatible with operation signatures.
 */
public class InvocationFallbackBoundaryTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    public void invocationExpressionEvaluateFallsBackToEmptyList() throws Exception {
        var invocationExpression = SysMLFactory.eINSTANCE.createInvocationExpression();

        var result = (EList<?>) semantics.invokeInvocation(
                "InvocationExpression_evaluate_InvocationDelegate",
                "Expression",
                "evaluate",
                1,
                invocationExpression,
                semantics.args(SysMLFactory.eINSTANCE.createPackage()));

        assertTrue(result.isEmpty());
    }

    @Test
    public void namespaceQualificationOfFallsBackToNull() throws Exception {
        var namespace = SysMLFactory.eINSTANCE.createPackage();

        var result = semantics.invokeInvocation(
                "Namespace_qualificationOf_InvocationDelegate",
                "Namespace",
                "qualificationOf",
                1,
                namespace,
                semantics.args("Base::Anything"));

        assertNull(result);
    }

    @Test
    public void importImportedMembershipsFallsBackToEmptyList() throws Exception {
        var membershipImport = SysMLFactory.eINSTANCE.createMembershipImport();

        var result = (EList<?>) semantics.invokeInvocation(
                "Import_importedMemberships_InvocationDelegate",
                "Import",
                "importedMemberships",
                1,
                membershipImport,
                semantics.args(semantics.args()));

        assertTrue(result.isEmpty());
    }

    @Test
    public void namespaceResolveGlobalFallsBackToNull() throws Exception {
        var namespace = SysMLFactory.eINSTANCE.createPackage();

        var result = semantics.invokeInvocation(
                "Namespace_resolveGlobal_InvocationDelegate",
                "Namespace",
                "resolveGlobal",
                1,
                namespace,
                semantics.args("Base::Anything"));

        assertNull(result);
    }
}
