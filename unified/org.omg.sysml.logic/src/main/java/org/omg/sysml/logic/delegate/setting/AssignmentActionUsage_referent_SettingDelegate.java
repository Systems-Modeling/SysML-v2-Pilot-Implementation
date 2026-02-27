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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;
import org.omg.sysml.model.sysml.AssignmentActionUsage;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FeatureMembership;

/**
 * Generated setting delegate for {@code AssignmentActionUsage.referent}.
 */
public class AssignmentActionUsage_referent_SettingDelegate extends AbstractSettingDelegate {

    public AssignmentActionUsage_referent_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "AssignmentActionUsage.referent";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * OCL2.0 deriveAssignmentActionUsageReferent
         * referent =
         *     let unownedFeatures : Sequence(Feature) = ownedMembership->
         *         reject(oclIsKindOf(FeatureMembership)).memberElement->
         *         selectByKind(Feature) in
         *     if unownedFeatures->isEmpty() then null
         *     else unownedFeatures->first().oclAsType(Feature)
         *     endif
         */
        Feature result = null;
        if (owner instanceof AssignmentActionUsage self) {
            for (var membership : self.getOwnedMembership()) {
                if (!(membership instanceof FeatureMembership) && membership.getMemberElement() instanceof Feature feature) {
                    result = feature;
                    break;
                }
            }
        }
        return result;
    }
}
