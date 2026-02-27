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
import org.omg.sysml.model.sysml.Differencing;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated setting delegate for {@code Type.ownedDifferencing}.
 */
public class Type_ownedDifferencing_SettingDelegate extends AbstractSettingDelegate {

    public Type_ownedDifferencing_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "Type.ownedDifferencing";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * OCL2.0 deriveTypeOwnedDifferencing
         * ownedDifferencing =
         *     ownedRelationship->selectByKind(Differencing)
         */
        var result = new BasicEList<Differencing>();
        if (owner instanceof Type self) {
            for (var ownedRelationship : self.getOwnedRelationship()) {
                if (ownedRelationship instanceof Differencing differencing) {
                    result.add(differencing);
                }
            }
        }
        return result;
    }
}
