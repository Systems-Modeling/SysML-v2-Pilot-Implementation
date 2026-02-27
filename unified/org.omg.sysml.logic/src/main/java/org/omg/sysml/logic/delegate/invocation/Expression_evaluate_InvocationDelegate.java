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
import org.eclipse.emf.common.util.ECollections;
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.model.sysml.FeatureMembership;
import org.omg.sysml.model.sysml.ResultExpressionMembership;

/**
 * Generated invocation delegate for {@code Expression::evaluate}.
 */
public class Expression_evaluate_InvocationDelegate extends AbstractInvocationDelegate {

    public Expression_evaluate_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Expression::evaluate";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 evaluatePre
         * isModelLevelEvaluable
         */
        var result = ECollections.<Element>emptyEList();
        if (target instanceof Expression self && self.isIsModelLevelEvaluable()) {
            var evaluationTarget = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Element element
                    ? element
                    : null;
            for (FeatureMembership featureMembership : self.getOwnedFeatureMembership()) {
                if (featureMembership instanceof ResultExpressionMembership resultExpressionMembership) {
                    var ownedResultExpression = resultExpressionMembership.getOwnedResultExpression();
                    if (ownedResultExpression != null && ownedResultExpression != self) {
                        result = ownedResultExpression.evaluate(evaluationTarget);
                    }
                    break;
                }
            }
        }
        return result;
    }
}
