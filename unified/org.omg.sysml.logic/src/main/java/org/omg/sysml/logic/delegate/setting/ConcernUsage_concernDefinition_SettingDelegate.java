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
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.ConcernDefinition;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;

/**
 * Generated setting delegate for {@code ConcernUsage.concernDefinition}.
 */
public class ConcernUsage_concernDefinition_SettingDelegate extends AbstractSettingDelegate {

    public ConcernUsage_concernDefinition_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "ConcernUsage.concernDefinition";
    }

    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * inferred fallback for ConcernUsage.concernDefinition
         * inferred source Feature.type
         * The ConcernDefinition that is the single type of this ConcernUsage.
         */
        Object resolvedValue = null;
        var candidate = owner.eGet(SysMLPackage.eINSTANCE.getFeature_Type(), resolve);
        if (candidate instanceof Iterable<?> iterable) {
            for (var item : iterable) {
                if (item instanceof ConcernDefinition) {
                    resolvedValue = item;
                    break;
                }
            }
        } else if (candidate instanceof ConcernDefinition) {
            resolvedValue = candidate;
        }
        if (resolvedValue == null) {
            resolvedValue = super.get(owner, resolve, coreType);
        }
        return resolvedValue;
    }
}
