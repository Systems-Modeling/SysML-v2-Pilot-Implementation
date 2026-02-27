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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;
import org.omg.sysml.model.sysml.FeatureTyping;
import org.omg.sysml.model.sysml.PortDefinition;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * Generated setting delegate for {@code PortUsage.portDefinition}.
 */
public class PortUsage_portDefinition_SettingDelegate extends AbstractSettingDelegate {

    public PortUsage_portDefinition_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "PortUsage.portDefinition";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * inferred fallback for PortUsage.portDefinition
         * inferred source Feature.ownedTyping
         * The occurrenceDefinitions of this PortUsage, which must all be PortDefinitions.
         *
         * This implementation uses Feature.ownedTyping as source to avoid recursive evaluation between:
         * - PortUsage.portDefinition (this feature), and
         * - OccurrenceUsage.occurrenceDefinition (redefined in PortUsageImpl from portDefinition).
         */
        var values = new BasicEList<Object>();
        var sourceValue = owner.eGet(SysMLPackage.eINSTANCE.getFeature_OwnedTyping(), resolve);
        if (sourceValue instanceof Iterable<?> iterable) {
            for (var candidate : iterable) {
                if (candidate instanceof FeatureTyping featureTyping) {
                    var typed = featureTyping.getType();
                    if (typed instanceof PortDefinition) {
                        values.add(typed);
                    }
                }
            }
        } else if (sourceValue instanceof FeatureTyping featureTyping) {
            var typed = featureTyping.getType();
            if (typed instanceof PortDefinition) {
                values.add(typed);
            }
        }
        Object resolvedValue = values;
        if (values.isEmpty()) {
            resolvedValue = super.get(owner, resolve, coreType);
        }
        return resolvedValue;
    }
}
