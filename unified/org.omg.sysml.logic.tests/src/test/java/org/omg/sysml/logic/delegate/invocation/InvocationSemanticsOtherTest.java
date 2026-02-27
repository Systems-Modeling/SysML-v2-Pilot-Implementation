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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.Comment;
import org.omg.sysml.model.sysml.DecisionNode;
import org.omg.sysml.model.sysml.LibraryPackage;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.LiteralInfinity;
import org.omg.sysml.model.sysml.LiteralInteger;
import org.omg.sysml.model.sysml.Multiplicity;
import org.omg.sysml.model.sysml.MultiplicityRange;
import org.omg.sysml.model.sysml.Namespace;
import org.omg.sysml.model.sysml.Package;
import org.omg.sysml.model.sysml.SysMLFactory;
import org.omg.sysml.model.sysml.VisibilityKind;

/**
 * Invocation semantics tests for translated rules outside requested category groups.
 */
public class InvocationSemanticsOtherTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void controlNodeMultiplicityHasBoundsRule() throws Exception {
        DecisionNode decisionNode = SysMLFactory.eINSTANCE.createDecisionNode();
        Multiplicity multiplicity = SysMLFactory.eINSTANCE.createMultiplicityRange();
        assertFalse((Boolean) semantics.invokeInvocation("ControlNode_multiplicityHasBounds_InvocationDelegate",
                "ControlNode", "multiplicityHasBounds", 3, decisionNode, semantics.args(multiplicity, 1, 1)));
        assertFalse(decisionNode.multiplicityHasBounds(multiplicity, 1, 1));
    }

    @Test
    void libraryPackageLibraryNamespaceRule() throws Exception {
        LibraryPackage libraryPackage = SysMLFactory.eINSTANCE.createLibraryPackage();
        assertSame(libraryPackage, semantics.invokeInvocation("LibraryPackage_libraryNamespace_InvocationDelegate",
                "LibraryPackage", "libraryNamespace", 0, libraryPackage, null));
        assertSame(libraryPackage, libraryPackage.libraryNamespace());
    }

    @Test
    void multiplicityRangeHasBoundsRule() throws Exception {
        MultiplicityRange multiplicityRange = SysMLFactory.eINSTANCE.createMultiplicityRange();
        assertFalse((Boolean) semantics.invokeInvocation("MultiplicityRange_hasBounds_InvocationDelegate",
                "MultiplicityRange", "hasBounds", 2, multiplicityRange, semantics.args(1, 1)));
        assertFalse(multiplicityRange.hasBounds(1, 1));
    }

    @Test
    void multiplicityRangeValueOfRule() throws Exception {
        MultiplicityRange multiplicityRange = SysMLFactory.eINSTANCE.createMultiplicityRange();
        assertEquals(Integer.MIN_VALUE, semantics.invokeInvocation("MultiplicityRange_valueOf_InvocationDelegate",
                "MultiplicityRange", "valueOf", 1, multiplicityRange, semantics.args((Object) null)));
        assertEquals(Integer.MIN_VALUE, multiplicityRange.valueOf(null));
    }

    @Test
    void multiplicityRangeValueOfWithLiteralIntegerRule() throws Exception {
        var multiplicityRange = SysMLFactory.eINSTANCE.createMultiplicityRange();
        LiteralInteger bound = SysMLFactory.eINSTANCE.createLiteralInteger();
        bound.setValue(3);
        assertEquals(3, semantics.invokeInvocation("MultiplicityRange_valueOf_InvocationDelegate",
                "MultiplicityRange", "valueOf", 1, multiplicityRange, semantics.args(bound)));
        assertEquals(3, multiplicityRange.valueOf(bound));
    }

    @Test
    void multiplicityRangeValueOfWithLiteralInfinityRule() throws Exception {
        var multiplicityRange = SysMLFactory.eINSTANCE.createMultiplicityRange();
        LiteralInfinity bound = SysMLFactory.eINSTANCE.createLiteralInfinity();
        assertEquals(-1, semantics.invokeInvocation("MultiplicityRange_valueOf_InvocationDelegate",
                "MultiplicityRange", "valueOf", 1, multiplicityRange, semantics.args(bound)));
        assertEquals(-1, multiplicityRange.valueOf(bound));
    }

    @Test
    void namespaceMembershipsOfVisibilityRule() throws Exception {
        Package namespace = SysMLFactory.eINSTANCE.createPackage();
        var excluded = new BasicEList<Namespace>();
        assertTrue(((EList<?>) semantics.invokeInvocation("Namespace_membershipsOfVisibility_InvocationDelegate",
                "Namespace", "membershipsOfVisibility", 2, namespace, semantics.args((Object) null, semantics.args()))).isEmpty());
        assertTrue(namespace.membershipsOfVisibility(null, excluded).isEmpty());
    }

    @Test
    void namespaceNamesOfRule() throws Exception {
        Package namespace = SysMLFactory.eINSTANCE.createPackage();
        Comment element = SysMLFactory.eINSTANCE.createComment();
        assertTrue(((EList<?>) semantics.invokeInvocation("Namespace_namesOf_InvocationDelegate",
                "Namespace", "namesOf", 1, namespace, semantics.args(element))).isEmpty());
        assertTrue(namespace.namesOf(element).isEmpty());
    }

    @Test
    void namespaceResolveVisibleRule() throws Exception {
        Package namespace = SysMLFactory.eINSTANCE.createPackage();
        assertNull(semantics.invokeInvocation("Namespace_resolveVisible_InvocationDelegate",
                "Namespace", "resolveVisible", 1, namespace, semantics.args("missingName")));
        assertNull(namespace.resolveVisible("missingName"));
    }

    @Test
    void namespaceResolveRule() throws Exception {
        Package namespace = SysMLFactory.eINSTANCE.createPackage();
        assertNull(semantics.invokeInvocation("Namespace_resolve_InvocationDelegate",
                "Namespace", "resolve", 1, namespace, semantics.args("missing::name")));
        assertNull(namespace.resolve("missing::name"));
    }

    @Test
    void namespaceResolveLocalRule() throws Exception {
        Package namespace = SysMLFactory.eINSTANCE.createPackage();
        assertNull(semantics.invokeInvocation("Namespace_resolveLocal_InvocationDelegate",
                "Namespace", "resolveLocal", 1, namespace, semantics.args("missing")));
        assertNull(namespace.resolveLocal("missing"));
    }

    @Test
    void namespaceUnqualifiedNameOfFallbackRule() throws Exception {
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        assertNull(semantics.invokeInvocation("Namespace_unqualifiedNameOf_InvocationDelegate",
                "Namespace", "unqualifiedNameOf", 1, namespace, semantics.args("a::b")));
        assertNull(namespace.unqualifiedNameOf("a::b"));
    }

    @Test
    void packageImportedMembershipsRule() throws Exception {
        Package packageElement = SysMLFactory.eINSTANCE.createPackage();
        var excluded = new BasicEList<Namespace>();
        assertTrue(((EList<?>) semantics.invokeInvocation("Package_importedMemberships_InvocationDelegate",
                "Package", "importedMemberships", 1, packageElement, semantics.args(semantics.args()))).isEmpty());
        assertTrue(packageElement.importedMemberships(excluded).isEmpty());
    }

    @Test
    void packageIncludeAsMemberRule() throws Exception {
        Package packageElement = SysMLFactory.eINSTANCE.createPackage();
        Comment element = SysMLFactory.eINSTANCE.createComment();
        assertTrue((Boolean) semantics.invokeInvocation("Package_includeAsMember_InvocationDelegate",
                "Package", "includeAsMember", 1, packageElement, semantics.args(element)));
        assertTrue(packageElement.includeAsMember(element));
    }

    @Test
    void packageIncludeAsMemberWithNullElementRule() throws Exception {
        var packageElement = SysMLFactory.eINSTANCE.createPackage();
        assertFalse((Boolean) semantics.invokeInvocation("Package_includeAsMember_InvocationDelegate",
                "Package", "includeAsMember", 1, packageElement, semantics.args((Object) null)));
        assertFalse(packageElement.includeAsMember(null));
    }

    @Test
    void namespaceImportedMembershipsRule() throws Exception {
        Package namespace = SysMLFactory.eINSTANCE.createPackage();
        var excluded = new BasicEList<Namespace>();
        assertTrue(((EList<?>) semantics.invokeInvocation("Namespace_importedMemberships_InvocationDelegate",
                "Namespace", "importedMemberships", 1, namespace, semantics.args(semantics.args()))).isEmpty());
        assertTrue(namespace.importedMemberships(excluded).isEmpty());
    }

    @Test
    void namespaceVisibilityOfRule() throws Exception {
        Package namespace = SysMLFactory.eINSTANCE.createPackage();
        Membership membership = SysMLFactory.eINSTANCE.createMembership();
        assertEquals(VisibilityKind.PRIVATE, semantics.invokeInvocation("Namespace_visibilityOf_InvocationDelegate",
                "Namespace", "visibilityOf", 1, namespace, semantics.args(membership)));
        assertEquals(VisibilityKind.PRIVATE, namespace.visibilityOf(membership));
    }

    @Test
    void namespaceVisibleMembershipsRule() throws Exception {
        Package namespace = SysMLFactory.eINSTANCE.createPackage();
        var excluded = new BasicEList<Namespace>();
        assertTrue(((EList<?>) semantics.invokeInvocation("Namespace_visibleMemberships_InvocationDelegate",
                "Namespace", "visibleMemberships", 3, namespace, semantics.args(semantics.args(), Boolean.FALSE, Boolean.FALSE)))
                        .isEmpty());
        assertTrue(namespace.visibleMemberships(excluded, false, false).isEmpty());
    }

    @Test
    void namespaceMembershipsOfVisibilityWithOwnedMembershipsRule() throws Exception {
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        var excluded = new BasicEList<Namespace>();
        var publicMembership = SysMLFactory.eINSTANCE.createMembership();
        publicMembership.setVisibility(VisibilityKind.PUBLIC);
        var privateMembership = SysMLFactory.eINSTANCE.createMembership();
        privateMembership.setVisibility(VisibilityKind.PRIVATE);
        namespace.getOwnedRelationship().add(publicMembership);
        namespace.getOwnedRelationship().add(privateMembership);
        var result = (EList<?>) semantics.invokeInvocation("Namespace_membershipsOfVisibility_InvocationDelegate",
                "Namespace", "membershipsOfVisibility", 2, namespace, semantics.args(VisibilityKind.PUBLIC, semantics.args()));
        assertEquals(1, result.size());
        assertSame(publicMembership, result.getFirst());
        var operationResult = namespace.membershipsOfVisibility(VisibilityKind.PUBLIC, excluded);
        assertEquals(1, operationResult.size());
        assertSame(publicMembership, operationResult.getFirst());
    }

    @Test
    void namespaceMembershipsOfVisibilityWithNullVisibilityRule() throws Exception {
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        var excluded = new BasicEList<Namespace>();
        var publicMembership = SysMLFactory.eINSTANCE.createMembership();
        publicMembership.setVisibility(VisibilityKind.PUBLIC);
        var privateMembership = SysMLFactory.eINSTANCE.createMembership();
        privateMembership.setVisibility(VisibilityKind.PRIVATE);
        namespace.getOwnedRelationship().add(publicMembership);
        namespace.getOwnedRelationship().add(privateMembership);
        var result = (EList<?>) semantics.invokeInvocation("Namespace_membershipsOfVisibility_InvocationDelegate",
                "Namespace", "membershipsOfVisibility", 2, namespace, semantics.args((Object) null, semantics.args()));
        assertEquals(2, result.size());
        assertTrue(result.contains(publicMembership));
        assertTrue(result.contains(privateMembership));
        var operationResult = namespace.membershipsOfVisibility(null, excluded);
        assertEquals(2, operationResult.size());
        assertTrue(operationResult.contains(publicMembership));
        assertTrue(operationResult.contains(privateMembership));
    }
}
