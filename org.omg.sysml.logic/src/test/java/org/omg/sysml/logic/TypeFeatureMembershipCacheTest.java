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

package org.omg.sysml.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.TypeUtil;

/**
 * Verifies that derived feature memberships reflect owned membership mutations that happen after an initial read.
 */
public class TypeFeatureMembershipCacheTest {

	/**
     * Verifies that a second read of {@link Type#getFeatureMembership()} sees a newly added owned membership after the
     * first read has already populated the derived list.
     */
    @Test
    public void getFeatureMembershipReflectsOwnedMembershipsAddedAfterFirstRead() {
        initializeStandalone();

        Type type = this.createType("FixtureType");
        Feature initialFeature = this.createFeature("initialFeature");
        FeatureMembership initialMembership = TypeUtil.addOwnedFeatureTo(type, initialFeature);

        EList<FeatureMembership> initialMemberships = type.getFeatureMembership();

        assertEquals(1, initialMemberships.size());
        assertSame(initialMembership, initialMemberships.get(0));
        assertSame(initialFeature, initialMemberships.get(0).getOwnedMemberFeature());

        Feature addedFeature = this.createFeature("addedFeature");
        FeatureMembership addedMembership = TypeUtil.addOwnedFeatureTo(type, addedFeature);

        EList<FeatureMembership> updatedMemberships = type.getFeatureMembership();

        assertEquals(2, updatedMemberships.size());
        assertTrue(updatedMemberships.contains(initialMembership));
        assertTrue(updatedMemberships.contains(addedMembership));
        assertSame(addedMembership, updatedMemberships.get(1));
        assertSame(addedFeature, updatedMemberships.get(1).getOwnedMemberFeature());
    }

    /**
     * Installs the standalone delegates used by direct EMF logic tests.
     */
    private void initializeStandalone() {
        SysMLLogicStandaloneSetup.doSetup();
    }

    /**
     * Creates a type with the given declared name.
     *
     * @param name
     *            the declared type name used in the test fixture
     * @return a new type instance
     */
    private Type createType(String name) {
        Type type = SysMLFactory.eINSTANCE.createType();
        type.setDeclaredName(name);
        return type;
    }

    /**
     * Creates a feature with the given declared name.
     *
     * @param name
     *            the declared feature name used in the test fixture
     * @return a new feature instance
     */
    private Feature createFeature(String name) {
        Feature feature = SysMLFactory.eINSTANCE.createFeature();
        feature.setDeclaredName(name);
        return feature;
    }
}
