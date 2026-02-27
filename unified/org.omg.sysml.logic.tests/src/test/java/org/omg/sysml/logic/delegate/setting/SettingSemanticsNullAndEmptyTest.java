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

import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Null and empty-input behavior tests for selected setting delegates.
 */
public class SettingSemanticsNullAndEmptyTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void membershipOwningNamespaceReturnsNullWhenUnset() {
        var membership = SysMLFactory.eINSTANCE.createMembership();
        assertNull(semantics.evaluateSetting("Membership", "membershipOwningNamespace", membership));
        assertNull(membership.getMembershipOwningNamespace());
    }

    @Test
    void featureTypingOwningFeatureReturnsNullWhenTypedFeatureUnset() {
        var featureTyping = SysMLFactory.eINSTANCE.createFeatureTyping();
        assertNull(semantics.evaluateSetting("FeatureTyping", "owningFeature", featureTyping));
        assertNull(featureTyping.getOwningFeature());
    }

    @Test
    void specializationOwningTypeReturnsNullWhenNoSourceIsSet() {
        var specialization = SysMLFactory.eINSTANCE.createSpecialization();
        assertNull(semantics.evaluateSetting("Specialization", "owningType", specialization));
        assertNull(specialization.getOwningType());
    }

    @Test
    void annotationOwnedAnnotatingElementReturnsNullWhenOwnedRelatedElementIsEmpty() {
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        assertNull(semantics.evaluateSetting("Annotation", "ownedAnnotatingElement", annotation));
        assertNull(annotation.getOwnedAnnotatingElement());
    }
}
