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
import org.omg.sysml.model.sysml.FeatureDirectionKind;
import org.omg.sysml.model.sysml.FeatureValue;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.ResultExpressionMembership;
import org.omg.sysml.model.sysml.Specialization;

/**
 * Generated invocation delegate for {@code Expression::modelLevelEvaluable}.
 */
public class Expression_modelLevelEvaluable_InvocationDelegate extends AbstractInvocationDelegate {

    public Expression_modelLevelEvaluable_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Expression::modelLevelEvaluable";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * ownedSpecialization->forAll(isImplied) and 
         * ownedFeature->forAll(f |
         *     (directionOf(f) = FeatureDirectionKind::_'in' or f = result) and
         *         f.ownedFeature->isEmpty() and f.valuation = null or
         *     f.owningFeatureMembership.oclIsKindOf(ResultExpressionMembership) and
         *         f.oclAsType(Expression).modelLevelEvaluable(visited)
         */
        var result = false;
        if (target instanceof Expression self) {
            var visited = new BasicEList<Feature>();
            if (arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof EList<?> visitedArg) {
                for (Object element : visitedArg) {
                    if (element instanceof Feature feature) {
                        visited.add(feature);
                    }
                }
            }
            result = true;
            for (Specialization specialization : self.getOwnedSpecialization()) {
                if (!specialization.isIsImplied()) {
                    result = false;
                    break;
                }
            }
            if (result) {
                for (Feature feature : self.getOwnedFeature()) {
                    var hasValuation = false;
                    for (Membership membership : feature.getOwnedMembership()) {
                        if (membership instanceof FeatureValue) {
                            hasValuation = true;
                            break;
                        }
                    }
                    var conditionA = (feature.getDirection() == FeatureDirectionKind.IN || feature == self.getResult())
                            && feature.getOwnedFeature().isEmpty()
                            && !hasValuation;
                    var conditionB = false;
                    if (feature.getOwningFeatureMembership() instanceof ResultExpressionMembership
                            && feature instanceof Expression nestedExpression
                            && !visited.contains(feature)) {
                        var nextVisited = new BasicEList<Feature>();
                        nextVisited.addAll(visited);
                        nextVisited.add(feature);
                        conditionB = nestedExpression.modelLevelEvaluable(nextVisited);
                    }
                    if (!(conditionA || conditionB)) {
                        result = false;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(result);
    }
}
