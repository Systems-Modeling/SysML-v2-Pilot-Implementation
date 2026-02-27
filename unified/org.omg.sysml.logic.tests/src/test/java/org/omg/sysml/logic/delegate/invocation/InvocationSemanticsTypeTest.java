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
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.ActionUsage;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.Namespace;
import org.omg.sysml.model.sysml.SysMLFactory;
import org.omg.sysml.model.sysml.Type;

/**
 * Invocation semantics tests for Type and Type-derived metaclasses.
 */
public class InvocationSemanticsTypeTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void typeAllSupertypesRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        EList<?> result = (EList<?>) semantics.invokeInvocation("Type_allSupertypes_InvocationDelegate",
                "Type", "allSupertypes", 0, type, null);
        assertEquals(1, result.size());
        assertTrue(result.contains(type));
        var operationResult = type.allSupertypes();
        assertEquals(1, operationResult.size());
        assertTrue(operationResult.contains(type));
    }

    @Test
    void typeDirectionOfRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.invokeInvocation("Type_directionOf_InvocationDelegate",
                "Type", "directionOf", 1, type, semantics.args(feature)));
        assertNull(type.directionOf(feature));
    }

    @Test
    void typeInheritedMembershipsRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        var excluded = new BasicEList<Namespace>();
        var excludedFeatures = new BasicEList<Type>();
        assertTrue(((EList<?>) semantics.invokeInvocation("Type_inheritedMemberships_InvocationDelegate",
                "Type", "inheritedMemberships", 3, type, semantics.args(semantics.args(), semantics.args(), Boolean.FALSE)))
                        .isEmpty());
        assertTrue(type.inheritedMemberships(excluded, excludedFeatures, false).isEmpty());
    }

    @Test
    void typeMultiplicitiesRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        assertTrue(((EList<?>) semantics.invokeInvocation("Type_multiplicities_InvocationDelegate",
                "Type", "multiplicities", 0, type, null)).isEmpty());
        assertTrue(type.multiplicities().isEmpty());
    }

    @Test
    void typeAllRedefinedFeaturesOfRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        Membership membership = SysMLFactory.eINSTANCE.createMembership();
        assertTrue(((EList<?>) semantics.invokeInvocation("Type_allRedefinedFeaturesOf_InvocationDelegate",
                "Type", "allRedefinedFeaturesOf", 1, type, semantics.args(membership))).isEmpty());
        assertTrue(type.allRedefinedFeaturesOf(membership).isEmpty());
    }

    @Test
    void typeSpecializesRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        ActionUsage supertype = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("Type_specializes_InvocationDelegate",
                "Type", "specializes", 1, type, semantics.args(supertype)));
        assertFalse(type.specializes(supertype));
    }

    @Test
    void typeIsCompatibleWithRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        ActionUsage otherType = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("Type_isCompatibleWith_InvocationDelegate",
                "Type", "isCompatibleWith", 1, type, semantics.args(otherType)));
        assertFalse(type.isCompatibleWith(otherType));
    }

    @Test
    void typeSupertypesRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        assertTrue(((EList<?>) semantics.invokeInvocation("Type_supertypes_InvocationDelegate",
                "Type", "supertypes", 1, type, semantics.args(Boolean.FALSE))).isEmpty());
        assertTrue(type.supertypes(false).isEmpty());
    }

    @Test
    void typeSpecializesFromLibraryRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("Type_specializesFromLibrary_InvocationDelegate",
                "Type", "specializesFromLibrary", 1, type, semantics.args("Non::Existing::Type")));
        assertFalse(type.specializesFromLibrary("Non::Existing::Type"));
    }

    @Test
    void typeNonPrivateMembershipsRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        var excluded = new BasicEList<Namespace>();
        var excludedFeatures = new BasicEList<Type>();
        assertTrue(((EList<?>) semantics.invokeInvocation("Type_nonPrivateMemberships_InvocationDelegate",
                "Type", "nonPrivateMemberships", 3, type, semantics.args(semantics.args(), semantics.args(), Boolean.FALSE)))
                        .isEmpty());
        assertTrue(type.nonPrivateMemberships(excluded, excludedFeatures, false).isEmpty());
    }

    @Test
    void typeVisibleMembershipsRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        var excluded = new BasicEList<Namespace>();
        assertTrue(((EList<?>) semantics.invokeInvocation("Type_visibleMemberships_InvocationDelegate",
                "Type", "visibleMemberships", 3, type, semantics.args(semantics.args(), Boolean.FALSE, Boolean.FALSE)))
                        .isEmpty());
        assertTrue(type.visibleMemberships(excluded, false, false).isEmpty());
    }

    @Test
    void typeDirectionOfExcludingRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        ActionUsage feature = SysMLFactory.eINSTANCE.createActionUsage();
        var excluded = new BasicEList<Type>();
        assertNull(semantics.invokeInvocation("Type_directionOfExcluding_InvocationDelegate",
                "Type", "directionOfExcluding", 2, type, semantics.args(feature, semantics.args())));
        assertNull(type.directionOfExcluding(feature, excluded));
    }

    @Test
    void typeInheritableMembershipsRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        var excluded = new BasicEList<Namespace>();
        var excludedFeatures = new BasicEList<Type>();
        assertTrue(((EList<?>) semantics.invokeInvocation("Type_inheritableMemberships_InvocationDelegate",
                "Type", "inheritableMemberships", 3, type, semantics.args(semantics.args(), semantics.args(), Boolean.FALSE)))
                        .isEmpty());
        assertTrue(type.inheritableMemberships(excluded, excludedFeatures, false).isEmpty());
    }

    @Test
    void typeRemoveRedefinedFeaturesRule() throws Exception {
        ActionUsage type = SysMLFactory.eINSTANCE.createActionUsage();
        var memberships = new BasicEList<Membership>();
        assertTrue(((EList<?>) semantics.invokeInvocation("Type_removeRedefinedFeatures_InvocationDelegate",
                "Type", "removeRedefinedFeatures", 1, type, semantics.args(semantics.args()))).isEmpty());
        assertTrue(type.removeRedefinedFeatures(memberships).isEmpty());
    }
}
