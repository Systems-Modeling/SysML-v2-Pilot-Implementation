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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Performance-smoke tests for selected translated invocation delegates.
 *
 * <p>What this test covers:
 * repeated invocation on representative small models should remain within generous time bounds.
 */
public class InvocationPerformanceSmokeTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    public void featureAsCartesianProductRepeatedInvocationCompletesWithinBudget() {
        var feature = SysMLFactory.eINSTANCE.createActionUsage();

        assertTimeout(Duration.ofSeconds(2), () -> {
            for (var i = 0; i < 500; i++) {
                assertNotNull(semantics.invokeInvocation(
                        "Feature_asCartesianProduct_InvocationDelegate",
                        "Feature",
                        "asCartesianProduct",
                        0,
                        feature,
                        null));
            }
        });
    }

    @Test
    public void typeVisibleMembershipsRepeatedInvocationCompletesWithinBudget() {
        var type = SysMLFactory.eINSTANCE.createActionUsage();
        var ownedMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        ownedMembership.getOwnedRelatedElement().add(SysMLFactory.eINSTANCE.createActionUsage());
        type.getOwnedRelationship().add(ownedMembership);

        assertTimeout(Duration.ofSeconds(2), () -> {
            for (var i = 0; i < 500; i++) {
                assertNotNull(semantics.invokeInvocation(
                        "Type_visibleMemberships_InvocationDelegate",
                        "Type",
                        "visibleMemberships",
                        3,
                        type,
                        semantics.args(semantics.args(), Boolean.FALSE, Boolean.FALSE)));
            }
        });
    }

    @Test
    public void namespaceResolveVisibleRepeatedInvocationCompletesWithinBudget() {
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        var member = SysMLFactory.eINSTANCE.createActionUsage();
        member.setDeclaredName("alpha");
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        owningMembership.getOwnedRelatedElement().add(member);
        namespace.getOwnedRelationship().add(owningMembership);

        assertTimeout(Duration.ofSeconds(2), () -> {
            for (var i = 0; i < 500; i++) {
                semantics.invokeInvocation(
                        "Namespace_resolveVisible_InvocationDelegate",
                        "Namespace",
                        "resolveVisible",
                        1,
                        namespace,
                        semantics.args("alpha"));
            }
        });
    }
}
