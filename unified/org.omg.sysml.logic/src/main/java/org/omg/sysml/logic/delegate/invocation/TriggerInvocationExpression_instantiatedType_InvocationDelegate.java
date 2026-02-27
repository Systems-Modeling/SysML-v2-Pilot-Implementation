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
import org.omg.sysml.model.sysml.TriggerInvocationExpression;
import org.omg.sysml.model.sysml.TriggerKind;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated invocation delegate for {@code TriggerInvocationExpression::instantiatedType}.
 */
public class TriggerInvocationExpression_instantiatedType_InvocationDelegate extends AbstractInvocationDelegate {

    public TriggerInvocationExpression_instantiatedType_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "TriggerInvocationExpression::instantiatedType";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * resolveGlobal(
         *     if kind = TriggerKind::when then
         *         'Triggers::TriggerWhen'
         *     else if kind = TriggerKind::at then
         *         'Triggers::TriggerAt'
         *     else
         *         'Triggers::TriggerAfter'
         *     endif endif
         * ).memberElement.oclAsType(Type)
         */
        Type result = null;
        if (target instanceof TriggerInvocationExpression self) {
            var qualifiedName = "Triggers::TriggerAfter";
            if (self.getKind() == TriggerKind.WHEN) {
                qualifiedName = "Triggers::TriggerWhen";
            } else if (self.getKind() == TriggerKind.AT) {
                qualifiedName = "Triggers::TriggerAt";
            }
            var membership = self.resolveGlobal(qualifiedName);
            if (membership != null && membership.getMemberElement() instanceof Type type) {
                result = type;
            }
        }
        return result;
    }
}
