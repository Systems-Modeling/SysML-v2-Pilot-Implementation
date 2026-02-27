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
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.model.sysml.LiteralBoolean;

/**
 * Generated invocation delegate for {@code Expression::checkCondition}.
 */
public class Expression_checkCondition_InvocationDelegate extends AbstractInvocationDelegate {

    public Expression_checkCondition_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Expression::checkCondition";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * let results: Sequence(Element) = evaluate(target) in
         *     result->size() = 1 and
         *     results->first().oclIsKindOf(LiteralBoolean) and 
         *     results->first().oclAsType(LiteralBoolean).value
         */
        var result = false;
        if (target instanceof Expression self) {
            var evaluationTarget = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Element element
                    ? element
                    : null;
            var evaluated = self.evaluate(evaluationTarget);
            if (self.getResult() != null && evaluated != null && !evaluated.isEmpty()
                    && evaluated.getFirst() instanceof LiteralBoolean literalBoolean) {
                result = literalBoolean.isValue();
            }
        }
        return Boolean.valueOf(result);
    }
}
