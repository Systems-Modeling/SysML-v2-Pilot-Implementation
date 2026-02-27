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

import org.eclipse.emf.ecore.EOperation;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.logic.delegate.AbstractInvocationDelegate;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FeatureMembership;
import org.omg.sysml.model.sysml.FeatureValue;
import org.omg.sysml.model.sysml.MetadataFeature;
import org.omg.sysml.model.sysml.Multiplicity;

/**
 * Generated invocation delegate for {@code Feature::ownedCrossFeature}.
 */
public class Feature_ownedCrossFeature_InvocationDelegate extends AbstractInvocationDelegate {

    public Feature_ownedCrossFeature_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Feature::ownedCrossFeature";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * if not isEnd or owningType = null then null
         * else
         *     let ownedMemberFeatures: Sequence(Feature) =
         *         ownedMember->selectByKind(Feature)->
         *             reject(oclIsKindOf(Multiplicity) or 
         *                    oclIsKindOf(MetadataFeature) or
         *                    oclIsKindOf(FeatureValue))->
         *             reject(owningMembership.oclIsKindOf(FeatureMembership)) in
         *     if ownedMemberFeatures.isEmpty() then null
         *     else ownedMemberFeatures->first()
         *     endif
         */
        Feature result = null;
        if (target instanceof Feature self && self.isIsEnd() && self.getOwningType() != null) {
            for (var member : self.getOwnedMember()) {
                if (member instanceof Feature feature
                        && !(feature instanceof Multiplicity)
                        && !(feature instanceof MetadataFeature)
                        && !(feature instanceof FeatureValue)
                        && !(feature.getOwningMembership() instanceof FeatureMembership)) {
                    result = feature;
                    break;
                }
            }
        }
        return result;
    }
}
