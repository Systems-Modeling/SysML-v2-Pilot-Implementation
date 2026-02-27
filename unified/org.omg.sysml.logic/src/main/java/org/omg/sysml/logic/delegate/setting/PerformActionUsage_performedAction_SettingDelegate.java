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
import org.omg.sysml.model.sysml.ActionUsage;
import org.omg.sysml.model.sysml.PerformActionUsage;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;

/**
 * Generated setting delegate for {@code PerformActionUsage.performedAction}.
 */
public class PerformActionUsage_performedAction_SettingDelegate extends AbstractSettingDelegate {

    public PerformActionUsage_performedAction_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "PerformActionUsage.performedAction";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * redefines fallback for PerformActionUsage.performedAction
         * redefines EventOccurrenceUsage.eventOccurrence
         * This follows EventOccurrenceUsage.eventOccurrence semantics specialized for ActionUsage:
         * return self when no referencedFeatureTarget exists, otherwise return the referenced
         * target when it is an ActionUsage.
         */
        Object result = null;
        if (owner instanceof PerformActionUsage self) {
            var referencedFeatureTarget = self.referencedFeatureTarget();
            if (referencedFeatureTarget == null) {
                result = self;
            } else if (referencedFeatureTarget instanceof ActionUsage actionUsage) {
                result = actionUsage;
            }
        }
        return result;
    }
}
