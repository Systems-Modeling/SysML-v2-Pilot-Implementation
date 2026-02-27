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
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.Comment;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Invocation semantics tests for Element rules.
 */
public class InvocationSemanticsElementTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void elementEffectiveNameRule() throws Exception {
        Comment element = SysMLFactory.eINSTANCE.createComment();
        element.setDeclaredName("NamedElement");
        assertEquals("NamedElement", semantics.invokeInvocation("Element_effectiveName_InvocationDelegate",
                "Element", "effectiveName", 0, element, null));
        assertEquals("NamedElement", element.effectiveName());
    }

    @Test
    void elementEffectiveShortNameRule() throws Exception {
        Comment element = SysMLFactory.eINSTANCE.createComment();
        element.setDeclaredShortName("NE");
        assertEquals("NE", semantics.invokeInvocation("Element_effectiveShortName_InvocationDelegate",
                "Element", "effectiveShortName", 0, element, null));
        assertEquals("NE", element.effectiveShortName());
    }

    @Test
    void elementEscapedNameRule() throws Exception {
        Comment element = SysMLFactory.eINSTANCE.createComment();
        element.setDeclaredName("name with space");
        assertEquals("'name with space'", semantics.invokeInvocation("Element_escapedName_InvocationDelegate",
                "Element", "escapedName", 0, element, null));
        assertEquals("'name with space'", element.escapedName());
    }

    @Test
    void elementEscapedNameIdentifierRule() throws Exception {
        var element = SysMLFactory.eINSTANCE.createComment();
        element.setDeclaredName("valid_identifier_1");
        assertEquals("valid_identifier_1", semantics.invokeInvocation("Element_escapedName_InvocationDelegate",
                "Element", "escapedName", 0, element, null));
        assertEquals("valid_identifier_1", element.escapedName());
    }

    @Test
    void elementEscapedNameEscapesQuotesRule() throws Exception {
        var element = SysMLFactory.eINSTANCE.createComment();
        element.setDeclaredName("O'Reilly");
        assertEquals("'O\\'Reilly'", semantics.invokeInvocation("Element_escapedName_InvocationDelegate",
                "Element", "escapedName", 0, element, null));
        assertEquals("'O\\'Reilly'", element.escapedName());
    }

    @Test
    void elementLibraryNamespaceRule() throws Exception {
        Comment element = SysMLFactory.eINSTANCE.createComment();
        assertNull(semantics.invokeInvocation("Element_libraryNamespace_InvocationDelegate",
                "Element", "libraryNamespace", 0, element, null));
        assertNull(element.libraryNamespace());
    }

    @Test
    void elementPathRule() throws Exception {
        Comment element = SysMLFactory.eINSTANCE.createComment();
        assertEquals("", semantics.invokeInvocation("Element_path_InvocationDelegate",
                "Element", "path", 0, element, null));
        assertEquals("", element.path());
    }

    @Test
    void elementPathWithOwningRelationshipRule() throws Exception {
        var owner = SysMLFactory.eINSTANCE.createComment();
        var first = SysMLFactory.eINSTANCE.createComment();
        var second = SysMLFactory.eINSTANCE.createComment();
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        owner.getOwnedRelationship().add(owningMembership);
        owningMembership.getOwnedRelatedElement().add(first);
        owningMembership.getOwnedRelatedElement().add(second);
        assertEquals("/1/2", semantics.invokeInvocation("Element_path_InvocationDelegate",
                "Element", "path", 0, second, null));
        assertEquals("/1/2", second.path());
    }
}
