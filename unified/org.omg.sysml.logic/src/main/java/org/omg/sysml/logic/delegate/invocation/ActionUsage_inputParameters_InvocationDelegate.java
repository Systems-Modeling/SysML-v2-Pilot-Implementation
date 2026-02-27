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
package org.omg.sysml.logic.delegate.invocation;

import org.eclipse.emf.ecore.EOperation;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.logic.delegate.AbstractInvocationDelegate;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.omg.sysml.model.sysml.ActionUsage;
import org.omg.sysml.model.sysml.Feature;

/**
 * Generated invocation delegate for {@code ActionUsage::inputParameters}.
 */
public class ActionUsage_inputParameters_InvocationDelegate extends AbstractInvocationDelegate {

    public ActionUsage_inputParameters_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "ActionUsage::inputParameters";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 inputParametersBody
         * input->select(f | f.owner = self)
         */
        var result = ECollections.<Feature>emptyEList();
        if (target instanceof ActionUsage self) {
            var ownedInputs = new BasicEList<Feature>();
            for (Feature input : self.getInput()) {
                if (input != null && input.getOwner() == self) {
                    ownedInputs.add(input);
                }
            }
            result = ownedInputs;
        }
        return result;
    }
}
