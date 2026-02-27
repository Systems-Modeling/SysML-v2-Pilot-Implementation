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
package org.omg.sysml.logic.delegate.setting;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Guard and precedence tests for setting delegates with subset fallbacks.
 */
public class SettingSemanticsGuardTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void membershipOwningNamespaceReturnsNullWhenOwningRelatedElementIsNotNamespace() {
        var membership = SysMLFactory.eINSTANCE.createMembership();
        membership.setOwningRelatedElement(SysMLFactory.eINSTANCE.createComment());

        assertNull(semantics.evaluateSetting("Membership", "membershipOwningNamespace", membership));
        assertNull(membership.getMembershipOwningNamespace());
    }

    @Test
    void specializationOwningTypeFallsBackToSpecificWhenOwningRelatedElementIsNotType() {
        var specialization = SysMLFactory.eINSTANCE.createSpecialization();
        var specific = SysMLFactory.eINSTANCE.createPartDefinition();
        specialization.setOwningRelatedElement(SysMLFactory.eINSTANCE.createComment());
        specialization.setSpecific(specific);

        assertSame(specific, semantics.evaluateSetting("Specialization", "owningType", specialization));
        assertSame(specific, specialization.getOwningType());
    }

    @Test
    void specializationOwningTypePrefersOwningRelatedElementOverSpecific() {
        var specialization = SysMLFactory.eINSTANCE.createSpecialization();
        var owningType = SysMLFactory.eINSTANCE.createActionDefinition();
        var specific = SysMLFactory.eINSTANCE.createPartDefinition();
        specialization.setOwningRelatedElement(owningType);
        specialization.setSpecific(specific);

        assertSame(owningType, semantics.evaluateSetting("Specialization", "owningType", specialization));
        assertSame(owningType, specialization.getOwningType());
    }
}
