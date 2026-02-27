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
import org.omg.sysml.model.sysml.MultiplicityRange;

/**
 * Generated invocation delegate for {@code MultiplicityRange::hasBounds}.
 */
public class MultiplicityRange_hasBounds_InvocationDelegate extends AbstractInvocationDelegate {

    private static final int NULL_UNLIMITED_NATURAL = Integer.MIN_VALUE;

    public MultiplicityRange_hasBounds_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "MultiplicityRange::hasBounds";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * valueOf(upperBound) = upper and
         * let lowerValue: UnlimitedNatural = valueOf(lowerBound) in
         * (lowerValue = lower or
         *  lowerValue = null and 
         *     (lower = upper or 
         *      lower = 0 and upper = *))
         */
        var result = false;
        if (target instanceof MultiplicityRange self) {
            var lower = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Integer value
                    ? value.intValue()
                    : 0;
            var upper = arguments != null && arguments.size() > 1 && arguments.get(1) instanceof Integer value
                    ? value.intValue()
                    : 0;
            var upperValue = self.valueOf(self.getUpperBound());
            if (upperValue == upper) {
                var lowerValue = self.valueOf(self.getLowerBound());
                result = lowerValue == lower
                        || (lowerValue == NULL_UNLIMITED_NATURAL
                                && (lower == upper || (lower == 0 && upper == -1)));
            }
        }
        return Boolean.valueOf(result);
    }
}
