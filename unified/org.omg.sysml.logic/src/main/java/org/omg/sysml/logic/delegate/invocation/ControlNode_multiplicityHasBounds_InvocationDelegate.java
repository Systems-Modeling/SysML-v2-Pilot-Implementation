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
import org.omg.sysml.model.sysml.Multiplicity;
import org.omg.sysml.model.sysml.MultiplicityRange;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated invocation delegate for {@code ControlNode::multiplicityHasBounds}.
 */
public class ControlNode_multiplicityHasBounds_InvocationDelegate extends AbstractInvocationDelegate {

    public ControlNode_multiplicityHasBounds_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "ControlNode::multiplicityHasBounds";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * mult <> null and
         * if mult.oclIsKindOf(MultiplicityRange) then
         *     mult.oclAsType(MultiplicityRange).hasBounds(lower, upper)
         * else
         *     mult.allSuperTypes()->exists(
         *         oclisKindOf(MultiplicityRange) and
         *         oclAsType(MultiplicityRange).hasBounds(lower, upper)
         * endif
         */
        var result = false;
        var mult = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Multiplicity multiplicity
                ? multiplicity
                : null;
        var lower = arguments != null && arguments.size() > 1 && arguments.get(1) instanceof Integer l
                ? l.intValue()
                : 0;
        var upper = arguments != null && arguments.size() > 2 && arguments.get(2) instanceof Integer u
                ? u.intValue()
                : 0;
        if (mult instanceof MultiplicityRange multiplicityRange) {
            result = multiplicityRange.hasBounds(lower, upper);
        } else if (mult != null) {
            for (Type superType : mult.allSupertypes()) {
                if (superType instanceof MultiplicityRange multiplicityRange
                        && multiplicityRange.hasBounds(lower, upper)) {
                    result = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(result);
    }
}
