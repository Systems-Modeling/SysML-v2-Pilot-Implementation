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
import org.omg.sysml.model.sysml.StateDefinition;
import org.omg.sysml.model.sysml.StateSubactionMembership;
import org.omg.sysml.model.sysml.StateUsage;

/**
 * Generated invocation delegate for {@code StateUsage::isSubstateUsage}.
 */
public class StateUsage_isSubstateUsage_InvocationDelegate extends AbstractInvocationDelegate {

    public StateUsage_isSubstateUsage_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "StateUsage::isSubstateUsage";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * isComposite and owningType <> null and
         * (owningType.oclIsKindOf(StateDefinition) and
         *     owningType.oclAsType(StateDefinition).isParallel = isParallel or
         *  owningType.oclIsKindOf(StateUsage) and
         *     owningType.oclAsType(StateUsage).isParallel = isParallel) and
         * not owningFeatureMembership.oclIsKindOf(StateSubactionMembership)
         */
        var result = false;
        if (target instanceof StateUsage self) {
            var isParallel = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Boolean value
                    ? value.booleanValue()
                    : false;
            var owningType = self.getOwningType();
            var matchingOwningType = false;
            if (owningType instanceof StateDefinition stateDefinition) {
                matchingOwningType = stateDefinition.isIsParallel() == isParallel;
            } else if (owningType instanceof StateUsage stateUsage) {
                matchingOwningType = stateUsage.isIsParallel() == isParallel;
            }
            result = self.isIsComposite()
                    && owningType != null
                    && matchingOwningType
                    && !(self.getOwningFeatureMembership() instanceof StateSubactionMembership);
        }
        return Boolean.valueOf(result);
    }
}
