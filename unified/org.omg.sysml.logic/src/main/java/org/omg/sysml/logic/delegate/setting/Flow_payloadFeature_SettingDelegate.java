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
import org.omg.sysml.model.sysml.Flow;
import org.omg.sysml.model.sysml.PayloadFeature;

/**
 * Generated setting delegate for {@code Flow.payloadFeature}.
 */
public class Flow_payloadFeature_SettingDelegate extends AbstractSettingDelegate {

    public Flow_payloadFeature_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "Flow.payloadFeature";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * OCL2.0 deriveFlowPayloadFeature
         * payloadFeature =
         *     let payloadFeatures : Sequence(PayloadFeature) =
         *         ownedFeature->selectByKind(PayloadFeature) in
         *     if payloadFeatures->isEmpty() then null
         *     else payloadFeatures->first()
         *     endif
         */
        PayloadFeature result = null;
        if (owner instanceof Flow self) {
            for (var ownedFeature : self.getOwnedFeature()) {
                if (ownedFeature instanceof PayloadFeature payloadFeature) {
                    result = payloadFeature;
                    break;
                }
            }
        }
        return result;
    }
}
