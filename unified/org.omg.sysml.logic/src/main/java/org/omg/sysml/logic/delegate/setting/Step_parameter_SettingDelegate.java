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
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.ParameterMembership;
import org.omg.sysml.model.sysml.Step;

/**
 * Generated setting delegate for {@code Step.parameter}.
 */
public class Step_parameter_SettingDelegate extends AbstractSettingDelegate {

    public Step_parameter_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    protected String delegateId() {
        return "Step.parameter";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * inferred fallback for Step.parameter
         * inferred source Type.featureMembership
         * The parameters of a Step are the member features identified by ParameterMemberships.
         */
        var values = new BasicEList<Object>();
        if (owner instanceof Step self) {
            for (var featureMembership : self.getFeatureMembership()) {
                if (featureMembership instanceof ParameterMembership parameterMembership) {
                    var parameter = parameterMembership.getOwnedMemberParameter();
                    if (parameter instanceof Feature && !values.contains(parameter)) {
                        values.add(parameter);
                    }
                }
            }
        }
        Object resolvedValue = values;
        if (values.isEmpty()) {
            resolvedValue = super.get(owner, resolve, coreType);
        }
        return resolvedValue;
    }
}
