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
package org.omg.sysml.model.sysml;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Cross-reference integrity tests for core relationship ownership links.
 *
 * <p>What it validates:
 * <ul>
 * <li>setting {@code owningRelatedElement} updates the owner-side {@code ownedRelationship};</li>
 * <li>moving a relationship between owners updates both opposite sides;</li>
 * <li>moving an owned related element between relationships updates {@code owningRelationship}.</li>
 * </ul>
 */
public class CrossReferenceIntegrityTest {

    @Test
    public void settingOwningRelatedElementUpdatesOwnerOwnedRelationshipOpposite() {
        var owner = SysMLFactory.eINSTANCE.createPackage();
        var membership = SysMLFactory.eINSTANCE.createMembership();

        membership.setOwningRelatedElement(owner);

        assertSame(owner, membership.getOwningRelatedElement());
        assertTrue(owner.getOwnedRelationship().contains(membership));
    }

    @Test
    public void movingRelationshipBetweenOwnersKeepsOppositesConsistent() {
        var ownerA = SysMLFactory.eINSTANCE.createPackage();
        var ownerB = SysMLFactory.eINSTANCE.createPackage();
        var membership = SysMLFactory.eINSTANCE.createMembership();

        membership.setOwningRelatedElement(ownerA);
        membership.setOwningRelatedElement(ownerB);

        assertFalse(ownerA.getOwnedRelationship().contains(membership));
        assertTrue(ownerB.getOwnedRelationship().contains(membership));
        assertSame(ownerB, membership.getOwningRelatedElement());
    }

    @Test
    public void movingOwnedRelatedElementBetweenRelationshipsUpdatesOwningRelationship() {
        var relationshipA = SysMLFactory.eINSTANCE.createOwningMembership();
        var relationshipB = SysMLFactory.eINSTANCE.createOwningMembership();
        var child = SysMLFactory.eINSTANCE.createComment();

        relationshipA.getOwnedRelatedElement().add(child);
        relationshipB.getOwnedRelatedElement().add(child);

        assertFalse(relationshipA.getOwnedRelatedElement().contains(child));
        assertTrue(relationshipB.getOwnedRelatedElement().contains(child));
        assertSame(relationshipB, child.getOwningRelationship());
    }
}
