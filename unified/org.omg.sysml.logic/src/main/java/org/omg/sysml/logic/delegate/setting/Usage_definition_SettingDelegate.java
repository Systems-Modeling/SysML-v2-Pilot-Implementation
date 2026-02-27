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
import org.eclipse.emf.common.util.BasicEList;
import org.omg.sysml.model.sysml.Classifier;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;

/**
 * Generated setting delegate for {@code Usage.definition}.
 */
public class Usage_definition_SettingDelegate extends AbstractSettingDelegate {

    public Usage_definition_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "Usage.definition";
    }

    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * inferred fallback for Usage.definition
         * inferred source Feature.type
         * The  Classifiers  that are the types of this  Usage . Nominally, these are  Definitions , but other kinds of Kernel  Classifiers  are also allowed, to permit use of  Classifiers  from the Kernel Model Libraries.
         */
        var values = new BasicEList<Object>();
        {
            var sourceValue = owner.eGet(SysMLPackage.eINSTANCE.getFeature_Type(), resolve);
            if (sourceValue instanceof Iterable<?> iterable) {
                for (var candidate : iterable) {
                    if (candidate instanceof Classifier) {
                        values.add(candidate);
                    }
                }
            } else if (sourceValue instanceof Classifier) {
                values.add(sourceValue);
            }
        }
        Object resolvedValue = values;
        if (values.isEmpty()) {
            resolvedValue = super.get(owner, resolve, coreType);
        }
        return resolvedValue;
    }
}
