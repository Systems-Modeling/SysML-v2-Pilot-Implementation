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

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Boundary tests for translated and fallback delegate behavior.
 *
 * <p>These tests lock expected behavior at the boundary where translated implementations stop
 * and generic fallback behavior is used.
 */
public class DelegateFallbackBoundaryTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    public void implementedSubsetsFallbackStillResolvesMembershipOwningNamespace() {
        var membership = SysMLFactory.eINSTANCE.createMembership();
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        membership.setOwningRelatedElement(namespace);

        assertSame(namespace, semantics.evaluateSetting("Membership", "membershipOwningNamespace", membership));
    }

    @Test
    public void unimplementedFeatureOwningTypeFallsBackToDefaultNull() {
        var ownerNamespace = SysMLFactory.eINSTANCE.createPackage();
        var feature = SysMLFactory.eINSTANCE.createActionUsage();
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        owningMembership.setOwningRelatedElement(ownerNamespace);
        owningMembership.getOwnedRelatedElement().add(feature);

        assertNull(semantics.evaluateSetting("Feature", "owningType", feature));
    }

    @Test
    public void annotationOwningAnnotatingElementResolvesFromOwningRelatedElement() {
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        var annotatingElement = SysMLFactory.eINSTANCE.createMetadataFeature();
        annotation.setOwningRelatedElement(annotatingElement);

        assertSame(annotatingElement, semantics.evaluateSetting("Annotation", "owningAnnotatingElement", annotation));
    }
}
