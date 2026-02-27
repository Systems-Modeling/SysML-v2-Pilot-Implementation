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
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Subsetting;

/**
 * Generated setting delegate for {@code Feature.ownedSubsetting}.
 */
public class Feature_ownedSubsetting_SettingDelegate extends AbstractSettingDelegate {

    public Feature_ownedSubsetting_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "Feature.ownedSubsetting";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * OCL2.0 deriveFeatureOwnedSubsetting
         * ownedSubsetting = ownedSpecialization->selectByKind(Subsetting)
         */
        var result = new BasicEList<Subsetting>();
        if (owner instanceof Feature self) {
            for (var ownedSpecialization : self.getOwnedSpecialization()) {
                if (ownedSpecialization instanceof Subsetting subsetting) {
                    result.add(subsetting);
                }
            }
        }
        return result;
    }
}
