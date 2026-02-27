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
import org.omg.sysml.model.sysml.ConnectorAsUsage;
import org.omg.sysml.model.sysml.Usage;

/**
 * Generated setting delegate for {@code Usage.nestedConnection}.
 */
public class Usage_nestedConnection_SettingDelegate extends AbstractSettingDelegate {

    public Usage_nestedConnection_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "Usage.nestedConnection";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * OCL2.0 deriveUsageNestedConnection
         * nestedConnection = nestedUsage->selectByKind(ConnectorAsUsage)
         */
        var result = new BasicEList<ConnectorAsUsage>();
        if (owner instanceof Usage self) {
            for (var nestedUsage : self.getNestedUsage()) {
                if (nestedUsage instanceof ConnectorAsUsage connectorAsUsage) {
                    result.add(connectorAsUsage);
                }
            }
        }
        return result;
    }
}
