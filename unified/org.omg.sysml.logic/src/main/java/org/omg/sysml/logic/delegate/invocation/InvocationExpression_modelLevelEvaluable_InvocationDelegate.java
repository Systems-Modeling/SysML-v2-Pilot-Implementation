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
import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.InvocationExpression;

/**
 * Generated invocation delegate for {@code InvocationExpression::modelLevelEvaluable}.
 */
public class InvocationExpression_modelLevelEvaluable_InvocationDelegate extends AbstractInvocationDelegate {

    public InvocationExpression_modelLevelEvaluable_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "InvocationExpression::modelLevelEvaluable";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * argument->forAll(modelLevelEvaluable(visited)) and
         *     function.isModelLevelEvaluable
         */
        var result = false;
        if (target instanceof InvocationExpression self) {
            var visited = new BasicEList<Feature>();
            if (arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof EList<?> visitedArg) {
                for (Object element : visitedArg) {
                    if (element instanceof Feature feature) {
                        visited.add(feature);
                    }
                }
            }
            result = true;
            for (Expression argument : self.getArgument()) {
                if (argument == null || !argument.modelLevelEvaluable(visited)) {
                    result = false;
                    break;
                }
            }
            if (result) {
                var function = self.getFunction();
                result = function != null && function.isIsModelLevelEvaluable();
            }
        }
        return Boolean.valueOf(result);
    }
}
