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
import org.eclipse.emf.common.util.BasicEList;
import org.omg.sysml.model.sysml.CrossSubsetting;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Subsetting;

/**
 * Generated invocation delegate for {@code Feature::typingFeatures}.
 */
public class Feature_typingFeatures_InvocationDelegate extends AbstractInvocationDelegate {

    public Feature_typingFeatures_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Feature::typingFeatures";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * if not isConjugated then
         *     let subsettedFeatures : OrderedSet(Feature) = 
         *         subsetting->reject(s | s.oclIsKindOf(CrossSubsetting)).subsettedFeatures in 
         *     if chainingFeature->isEmpty() or
         *        subsettedFeature->includes(chainingFeature->last())
         *     then subsettedFeatures
         *     else subsettedFeatures->append(chainingFeature->last())
         *     endif
         * else if conjugator.originalType.oclIsKindOf(Feature) then
         *     OrderedSet{conjugator.originalType.oclAsType(Feature)}
         * else OrderedSet{}
         * endif endif
         */
        var result = new BasicEList<Feature>();
        if (target instanceof Feature self) {
            if (!self.isIsConjugated()) {
                for (Subsetting subsetting : self.getOwnedSubsetting()) {
                    if (!(subsetting instanceof CrossSubsetting) && subsetting.getSubsettedFeature() != null) {
                        result.add(subsetting.getSubsettedFeature());
                    }
                }
                if (!self.getChainingFeature().isEmpty()) {
                    var lastChainingFeature = self.getChainingFeature().getLast();
                    if (!result.contains(lastChainingFeature)) {
                        result.add(lastChainingFeature);
                    }
                }
            } else {
                var ownedConjugator = self.getOwnedConjugator();
                if (ownedConjugator != null && ownedConjugator.getOriginalType() instanceof Feature feature) {
                    result.add(feature);
                }
            }
        }
        return result;
    }
}
