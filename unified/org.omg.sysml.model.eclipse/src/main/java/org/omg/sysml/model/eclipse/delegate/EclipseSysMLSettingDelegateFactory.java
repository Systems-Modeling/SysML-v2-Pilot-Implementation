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
package org.omg.sysml.model.eclipse.delegate;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate;

/**
 * Eclipse design-time setting delegate factory for the SysML delegate URI.
 *
 * <p>This factory exists to register the SysML delegate URI in Eclipse extension registries, so
 * GenModel/Ecore editors can resolve {@code settingDelegates} declarations.
 */
public class EclipseSysMLSettingDelegateFactory implements EStructuralFeature.Internal.SettingDelegate.Factory {

    @Override
    public EStructuralFeature.Internal.SettingDelegate createSettingDelegate(EStructuralFeature eStructuralFeature) {
        return new BasicSettingDelegate.Stateless(eStructuralFeature) {
            @Override
            protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
                return eStructuralFeature.isMany() ? ECollections.emptyEList() : null;
            }

            @Override
            protected boolean isSet(InternalEObject owner) {
                return false;
            }
        };
    }
}
