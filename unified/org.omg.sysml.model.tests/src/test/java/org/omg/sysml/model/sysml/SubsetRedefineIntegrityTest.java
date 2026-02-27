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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.ecore.EReference;
import org.junit.jupiter.api.Test;

/**
 * Metamodel integrity tests for subset/redefine edge contracts.
 *
 * <p>What it validates:
 * <ul>
 * <li>selected references keep both {@code redefines} and {@code subsets} annotations;</li>
 * <li>selected subset/redefine references keep derived/transient/volatile semantics;</li>
 * <li>selected subset/redefine references keep stable opposite-reference contracts.</li>
 * </ul>
 */
public class SubsetRedefineIntegrityTest {

    @Test
    public void membershipOwningNamespaceKeepsSubsetAndRedefineContract() {
        var reference = SysMLPackage.eINSTANCE.getMembership_MembershipOwningNamespace();

        this.assertSubsetRedefineDerivedReference(reference);
        assertEquals(1, reference.getLowerBound());
        assertEquals(SysMLPackage.eINSTANCE.getNamespace(), reference.getEReferenceType());
    }

    @Test
    public void importOwningNamespaceKeepsSubsetAndRedefineContract() {
        var reference = SysMLPackage.eINSTANCE.getImport_ImportOwningNamespace();

        this.assertSubsetRedefineDerivedReference(reference);
        assertEquals(1, reference.getLowerBound());
        assertEquals(SysMLPackage.eINSTANCE.getNamespace(), reference.getEReferenceType());
    }

    @Test
    public void featureTypingOwningFeatureKeepsSubsetAndRedefineContract() {
        var reference = SysMLPackage.eINSTANCE.getFeatureTyping_OwningFeature();

        this.assertSubsetRedefineDerivedReference(reference);
        assertEquals(0, reference.getLowerBound());
        assertEquals(SysMLPackage.eINSTANCE.getFeature(), reference.getEReferenceType());
    }

    @Test
    public void subsetRedefineOppositesRemainConsistent() {
        this.assertOppositeConsistency(
                SysMLPackage.eINSTANCE.getMembership_MembershipOwningNamespace(),
                SysMLPackage.eINSTANCE.getNamespace_OwnedMembership());
        this.assertOppositeConsistency(
                SysMLPackage.eINSTANCE.getImport_ImportOwningNamespace(),
                SysMLPackage.eINSTANCE.getNamespace_OwnedImport());
        this.assertOppositeConsistency(
                SysMLPackage.eINSTANCE.getFeatureTyping_OwningFeature(),
                SysMLPackage.eINSTANCE.getFeature_OwnedTyping());
    }

    private void assertSubsetRedefineDerivedReference(EReference reference) {
        assertNotNull(reference.getEAnnotation("redefines"));
        assertNotNull(reference.getEAnnotation("subsets"));
        assertTrue(reference.isDerived());
        assertTrue(reference.isTransient());
        assertTrue(reference.isVolatile());
    }

    private void assertOppositeConsistency(EReference reference, EReference expectedOpposite) {
        assertSame(expectedOpposite, reference.getEOpposite());
        assertSame(reference, expectedOpposite.getEOpposite());
    }
}
