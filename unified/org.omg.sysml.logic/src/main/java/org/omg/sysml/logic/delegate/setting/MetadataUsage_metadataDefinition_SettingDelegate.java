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
import org.omg.sysml.model.sysml.Metaclass;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;

/**
 * Generated setting delegate for {@code MetadataUsage.metadataDefinition}.
 */
public class MetadataUsage_metadataDefinition_SettingDelegate extends AbstractSettingDelegate {

    public MetadataUsage_metadataDefinition_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "MetadataUsage.metadataDefinition";
    }

    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * inferred fallback for MetadataUsage.metadataDefinition
         * inferred source Usage.definition
         * The  MetadataDefinition  that is the  definition  of this  MetadataUsage .
         */
        Object resolvedValue = null;
        var candidate = owner.eGet(SysMLPackage.eINSTANCE.getUsage_Definition(), resolve);
        if (candidate instanceof Iterable<?> iterable) {
            for (var item : iterable) {
                if (item instanceof Metaclass) {
                    resolvedValue = item;
                    break;
                }
            }
        } else if (candidate instanceof Metaclass) {
            resolvedValue = candidate;
        }
        if (resolvedValue == null) {
            resolvedValue = super.get(owner, resolve, coreType);
        }
        return resolvedValue;
    }
}
