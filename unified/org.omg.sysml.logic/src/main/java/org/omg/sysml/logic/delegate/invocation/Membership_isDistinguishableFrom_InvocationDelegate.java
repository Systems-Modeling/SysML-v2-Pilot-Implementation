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
import org.omg.sysml.model.sysml.Membership;

/**
 * Generated invocation delegate for {@code Membership::isDistinguishableFrom}.
 */
public class Membership_isDistinguishableFrom_InvocationDelegate extends AbstractInvocationDelegate {

    public Membership_isDistinguishableFrom_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Membership::isDistinguishableFrom";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * not (memberElement.oclKindOf(other.memberElement.oclType()) or
         *      other.memberElement.oclKindOf(memberElement.oclType())) or
         * (shortMemberName = null or
         *     (shortMemberName <> other.shortMemberName and
         *      shortMemberName <> other.memberName)) and
         * (memberName = null or
         *     (memberName <> other.shortMemberName and
         *      memberName <> other.memberName)))
         */
        var result = false;
        if (target instanceof Membership self) {
            var other = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Membership membership
                    ? membership
                    : null;
            if (other != null) {
                var selfElement = self.getMemberElement();
                var otherElement = other.getMemberElement();
                var kindCompatible = selfElement != null
                        && otherElement != null
                        && (otherElement.getClass().isInstance(selfElement)
                                || selfElement.getClass().isInstance(otherElement));
                if (!kindCompatible) {
                    result = true;
                } else {
                    var shortMemberName = self.getMemberShortName();
                    var otherShortMemberName = other.getMemberShortName();
                    var otherMemberName = other.getMemberName();
                    var shortNameDistinct = shortMemberName == null
                            || (!shortMemberName.equals(otherShortMemberName)
                                    && !shortMemberName.equals(otherMemberName));
                    var memberName = self.getMemberName();
                    var memberNameDistinct = memberName == null
                            || (!memberName.equals(otherShortMemberName)
                                    && !memberName.equals(otherMemberName));
                    result = shortNameDistinct && memberNameDistinct;
                }
            }
        }
        return Boolean.valueOf(result);
    }
}
