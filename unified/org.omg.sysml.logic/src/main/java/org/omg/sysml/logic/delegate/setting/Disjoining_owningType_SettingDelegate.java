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
import org.omg.sysml.model.sysml.Type;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;

/**
 * Generated setting delegate for {@code Disjoining.owningType}.
 */
public class Disjoining_owningType_SettingDelegate extends AbstractSettingDelegate {

    public Disjoining_owningType_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "Disjoining.owningType";
    }

    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * subsets fallback for Disjoining.owningType
         * subsets Relationship.owningRelatedElement
         * subsets Disjoining.typeDisjoined
         */
        Object resolvedValue = null;
        var candidate0 = owner.eGet(SysMLPackage.eINSTANCE.getRelationship_OwningRelatedElement(), resolve);
        if (candidate0 instanceof Type) {
            resolvedValue = candidate0;
        }
        if (resolvedValue == null) {
            var candidate1 = owner.eGet(SysMLPackage.eINSTANCE.getDisjoining_TypeDisjoined(), resolve);
            if (candidate1 instanceof Type) {
                resolvedValue = candidate1;
            }
        }
        if (resolvedValue == null) {
            resolvedValue = super.get(owner, resolve, coreType);
        }
        return resolvedValue;
    }
}
