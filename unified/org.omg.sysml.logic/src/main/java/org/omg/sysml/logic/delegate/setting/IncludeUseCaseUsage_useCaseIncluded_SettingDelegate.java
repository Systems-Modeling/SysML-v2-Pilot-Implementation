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
import org.omg.sysml.model.sysml.IncludeUseCaseUsage;
import org.omg.sysml.model.sysml.UseCaseUsage;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;

/**
 * Generated setting delegate for {@code IncludeUseCaseUsage.useCaseIncluded}.
 */
public class IncludeUseCaseUsage_useCaseIncluded_SettingDelegate extends AbstractSettingDelegate {

    public IncludeUseCaseUsage_useCaseIncluded_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "IncludeUseCaseUsage.useCaseIncluded";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * redefines fallback for IncludeUseCaseUsage.useCaseIncluded
         * redefines PerformActionUsage.performedAction
         * This follows the EventOccurrenceUsage.eventOccurrence semantics inherited through
         * PerformActionUsage: return self when no referencedFeatureTarget exists, otherwise return
         * the referenced target when it is a UseCaseUsage.
         */
        Object result = null;
        if (owner instanceof IncludeUseCaseUsage self) {
            var referencedFeatureTarget = self.referencedFeatureTarget();
            if (referencedFeatureTarget == null) {
                result = self;
            } else if (referencedFeatureTarget instanceof UseCaseUsage useCaseUsage) {
                result = useCaseUsage;
            }
        }
        return result;
    }
}
