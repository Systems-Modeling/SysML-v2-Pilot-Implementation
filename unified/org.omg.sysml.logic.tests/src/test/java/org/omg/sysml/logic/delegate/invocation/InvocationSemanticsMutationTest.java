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

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Mutation-focused invocation semantics tests.
 *
 * <p>These tests ensure invocation delegates react consistently when source state changes.
 */
public class InvocationSemanticsMutationTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void elementEffectiveNameFollowsDeclaredNameMutation() throws Exception {
        var element = SysMLFactory.eINSTANCE.createComment();

        element.setDeclaredName("alpha");
        assertEquals("alpha", semantics.invokeInvocation(
                "Element_effectiveName_InvocationDelegate",
                "Element", "effectiveName", 0, element, null));

        element.setDeclaredName("beta");
        assertEquals("beta", semantics.invokeInvocation(
                "Element_effectiveName_InvocationDelegate",
                "Element", "effectiveName", 0, element, null));
    }

    @Test
    void elementEscapedNameFollowsDeclaredNameMutation() throws Exception {
        var element = SysMLFactory.eINSTANCE.createComment();

        element.setDeclaredName("plain_identifier");
        assertEquals("plain_identifier", semantics.invokeInvocation(
                "Element_escapedName_InvocationDelegate",
                "Element", "escapedName", 0, element, null));

        element.setDeclaredName("contains space");
        assertEquals("'contains space'", semantics.invokeInvocation(
                "Element_escapedName_InvocationDelegate",
                "Element", "escapedName", 0, element, null));
    }

    @Test
    void elementPathFollowsSiblingOrderMutation() throws Exception {
        var owner = SysMLFactory.eINSTANCE.createComment();
        var first = SysMLFactory.eINSTANCE.createComment();
        var second = SysMLFactory.eINSTANCE.createComment();
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        owner.getOwnedRelationship().add(owningMembership);
        owningMembership.getOwnedRelatedElement().add(first);
        owningMembership.getOwnedRelatedElement().add(second);

        assertEquals("/1/2", semantics.invokeInvocation(
                "Element_path_InvocationDelegate",
                "Element", "path", 0, second, null));
        assertEquals("/1/2", second.path());

        owningMembership.getOwnedRelatedElement().remove(first);
        assertEquals("/1/1", semantics.invokeInvocation(
                "Element_path_InvocationDelegate",
                "Element", "path", 0, second, null));
        assertEquals("/1/1", second.path());
    }
}
