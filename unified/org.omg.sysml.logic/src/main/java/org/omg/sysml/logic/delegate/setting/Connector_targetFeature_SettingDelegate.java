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
import org.omg.sysml.model.sysml.Feature;

/**
 * Generated setting delegate for {@code Connector.targetFeature}.
 */
public class Connector_targetFeature_SettingDelegate extends AbstractSettingDelegate {

    public Connector_targetFeature_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "Connector.targetFeature";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * OCL2.0 deriveConnectorTargetFeature
         * targetFeature =
         *     if relatedFeature->size() < 2 then OrderedSet{}
         *     else 
         *         relatedFeature->
         *             subSequence(2, relatedFeature->size())->
         *             asOrderedSet()
         *     endif
         */
        var result = new BasicEList<Feature>();
        if (owner instanceof Connector self) {
            var relatedFeatures = self.getRelatedFeature();
            if (relatedFeatures.size() >= 2) {
                for (var i = 1; i < relatedFeatures.size(); i++) {
                    var relatedFeature = relatedFeatures.get(i);
                    if (!result.contains(relatedFeature)) {
                        result.add(relatedFeature);
                    }
                }
            }
        }
        return result;
    }
}
