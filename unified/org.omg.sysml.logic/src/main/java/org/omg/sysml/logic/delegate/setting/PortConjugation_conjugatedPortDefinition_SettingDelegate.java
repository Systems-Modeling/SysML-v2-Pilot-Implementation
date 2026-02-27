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
import org.omg.sysml.model.sysml.ConjugatedPortDefinition;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;

/**
 * Generated setting delegate for {@code PortConjugation.conjugatedPortDefinition}.
 */
public class PortConjugation_conjugatedPortDefinition_SettingDelegate extends AbstractSettingDelegate {

    public PortConjugation_conjugatedPortDefinition_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "PortConjugation.conjugatedPortDefinition";
    }

    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * redefines fallback for PortConjugation.conjugatedPortDefinition
         * redefines Conjugation.conjugatedType
         * redefines Relationship.owningRelatedElement
         */
        Object resolvedValue = null;
        var candidate0 = owner.eGet(SysMLPackage.eINSTANCE.getConjugation_ConjugatedType(), resolve);
        if (candidate0 instanceof ConjugatedPortDefinition) {
            resolvedValue = candidate0;
        }
        if (resolvedValue == null) {
            var candidate1 = owner.eGet(SysMLPackage.eINSTANCE.getRelationship_OwningRelatedElement(), resolve);
            if (candidate1 instanceof ConjugatedPortDefinition) {
                resolvedValue = candidate1;
            }
        }
        if (resolvedValue == null) {
            resolvedValue = super.get(owner, resolve, coreType);
        }
        return resolvedValue;
    }
}
