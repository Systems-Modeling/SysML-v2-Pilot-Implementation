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
package org.omg.sysml.logic.delegate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Determinism tests for repeated delegate evaluation on unchanged model state.
 */
public class DelegateDeterminismTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void repeatedInvocationOfElementEscapedNameIsDeterministic() throws Exception {
        var element = SysMLFactory.eINSTANCE.createComment();
        element.setDeclaredName("a value with spaces");

        var first = semantics.invokeInvocation(
                "Element_escapedName_InvocationDelegate", "Element", "escapedName", 0, element, null);
        var second = semantics.invokeInvocation(
                "Element_escapedName_InvocationDelegate", "Element", "escapedName", 0, element, null);

        assertEquals(first, second);
    }

    @Test
    void repeatedInvocationOfElementPathIsDeterministic() throws Exception {
        var owner = SysMLFactory.eINSTANCE.createComment();
        var child = SysMLFactory.eINSTANCE.createComment();
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        owner.getOwnedRelationship().add(owningMembership);
        owningMembership.getOwnedRelatedElement().add(child);

        var first = semantics.invokeInvocation("Element_path_InvocationDelegate", "Element", "path", 0, child, null);
        var second = semantics.invokeInvocation("Element_path_InvocationDelegate", "Element", "path", 0, child, null);

        assertEquals(first, second);
    }

    @Test
    void repeatedSettingEvaluationOfMembershipOwningNamespaceIsDeterministic() {
        var membership = SysMLFactory.eINSTANCE.createMembership();
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        membership.setOwningRelatedElement(namespace);

        var first = semantics.evaluateSetting("Membership", "membershipOwningNamespace", membership);
        var second = semantics.evaluateSetting("Membership", "membershipOwningNamespace", membership);

        assertSame(first, second);
    }
}
