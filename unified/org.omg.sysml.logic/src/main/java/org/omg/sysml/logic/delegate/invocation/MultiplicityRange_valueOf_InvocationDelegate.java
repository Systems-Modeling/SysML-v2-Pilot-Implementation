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
import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.model.sysml.LiteralInfinity;
import org.omg.sysml.model.sysml.LiteralInteger;
import org.omg.sysml.model.sysml.MultiplicityRange;

/**
 * Generated invocation delegate for {@code MultiplicityRange::valueOf}.
 */
public class MultiplicityRange_valueOf_InvocationDelegate extends AbstractInvocationDelegate {

    private static final int NULL_UNLIMITED_NATURAL = Integer.MIN_VALUE;

    public MultiplicityRange_valueOf_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "MultiplicityRange::valueOf";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * if bound = null or not bound.isModelLevelEvaluable then 
         *     null
         * else
         *     let boundEval: Sequence(Element) = bound.evaluate(owningType) in
         *     if boundEval->size() <> 1 then null else
         *         let valueEval: Element = boundEval->at(1) in
         *         if valueEval.oclIsKindOf(LiteralInfinity) then *
         *         else if valueEval.oclIsKindOf(LiteralInteger) then
         *             let value : Integer = 
         *                 valueEval.oclAsKindOf(LiteralInteger).value in
         *             if value >= 0 then value else null endif
         *         else null
         *         endif endif
         *     endif
         * endif
         */
        var result = NULL_UNLIMITED_NATURAL;
        if (target instanceof MultiplicityRange self) {
            var bound = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Expression expression
                    ? expression
                    : null;
            if (bound != null && bound.isIsModelLevelEvaluable()) {
                var boundEval = bound.evaluate(self.getOwningType());
                if (boundEval.size() == 1) {
                    var valueEval = boundEval.getFirst();
                    if (valueEval instanceof LiteralInfinity) {
                        result = -1;
                    } else if (valueEval instanceof LiteralInteger literalInteger) {
                        var value = literalInteger.getValue();
                        if (value >= 0) {
                            result = value;
                        }
                    }
                }
            }
        }
        return Integer.valueOf(result);
    }
}
