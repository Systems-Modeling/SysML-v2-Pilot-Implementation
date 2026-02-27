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
import org.eclipse.emf.common.util.BasicEList;
import org.omg.sysml.model.sysml.Connector;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated setting delegate for {@code Connector.defaultFeaturingType}.
 */
public class Connector_defaultFeaturingType_SettingDelegate extends AbstractSettingDelegate {

    public Connector_defaultFeaturingType_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "Connector.defaultFeaturingType";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * OCL2.0 deriveConnectorDefaultFeaturingType
         * let commonFeaturingTypes : OrderedSet(Type) = 
         *     relatedFeature->closure(featuringType)->select(t | 
         *         relatedFeature->forAll(f | f.isFeaturedWithin(t))
         *     ) in
         * let nearestCommonFeaturingTypes : OrderedSet(Type) =
         *     commonFeaturingTypes->reject(t1 | 
         *         commonFeaturingTypes->exists(t2 | 
         *             t2 <> t1 and t2->closure(featuringType)->contains(t1)
         *     )) in
         * if nearestCommonFeaturingTypes->isEmpty() then null
         * else nearestCommonFeaturingTypes->first()
         * endif
         */
        Type result = null;
        if (owner instanceof Connector self && !self.getRelatedFeature().isEmpty()) {
            var candidateTypes = new BasicEList<Type>();
            for (var candidate : self.getRelatedFeature().getFirst().getFeaturingType()) {
                if (!candidateTypes.contains(candidate)) {
                    candidateTypes.add(candidate);
                }
            }
            var commonFeaturingTypes = new BasicEList<Type>();
            for (var candidateType : candidateTypes) {
                var isCommon = true;
                for (var relatedFeature : self.getRelatedFeature()) {
                    if (!relatedFeature.isFeaturedWithin(candidateType)) {
                        isCommon = false;
                        break;
                    }
                }
                if (isCommon) {
                    commonFeaturingTypes.add(candidateType);
                }
            }
            var nearestCommonFeaturingTypes = new BasicEList<Type>();
            for (var commonType : commonFeaturingTypes) {
                var hasMoreSpecificCommonType = false;
                for (var otherCommonType : commonFeaturingTypes) {
                    if (otherCommonType != commonType && otherCommonType.specializes(commonType)) {
                        hasMoreSpecificCommonType = true;
                        break;
                    }
                }
                if (!hasMoreSpecificCommonType) {
                    nearestCommonFeaturingTypes.add(commonType);
                }
            }
            if (!nearestCommonFeaturingTypes.isEmpty()) {
                result = nearestCommonFeaturingTypes.getFirst();
            }
        }
        return result;
    }
}
