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
import org.omg.sysml.model.sysml.FeatureReferenceExpression;
import org.omg.sysml.model.sysml.FeatureValue;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.Metaclass;
import org.omg.sysml.model.sysml.MetadataFeature;

/**
 * Generated invocation delegate for {@code FeatureReferenceExpression::modelLevelEvaluable}.
 */
public class FeatureReferenceExpression_modelLevelEvaluable_InvocationDelegate extends AbstractInvocationDelegate {

    public FeatureReferenceExpression_modelLevelEvaluable_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "FeatureReferenceExpression::modelLevelEvaluable";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * referent.conformsTo('Anything::self') or
         * visited->excludes(referent) and 
         * (referent.oclIsKindOf(Expression) and 
         *     referent.oclAsType(Expression).modelLevelEvaluable(visited->including(referent)) or
         * referent.owningType <> null and 
         *     (referent.owningType.isOclKindOf(MetaClass) or 
         *     referent.owningType.isOclKindOf(MetadataFeature)) or
         * referent.featuringType->isEmpty() and
         *     (referent.valuation = null or 
         *     referent.valuation.modelLevelEvaluable(visited->including(referent))))
         */
        var result = false;
        if (target instanceof FeatureReferenceExpression self) {
            var visited = new BasicEList<Feature>();
            if (arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof EList<?> visitedArg) {
                for (Object element : visitedArg) {
                    if (element instanceof Feature feature) {
                        visited.add(feature);
                    }
                }
            }
            var referent = self.getReferent();
            if (referent != null) {
                var anythingSelfMembership = self.resolveGlobal("Anything::self");
                var isAnythingSelf = anythingSelfMembership != null && anythingSelfMembership.getMemberElement() == referent;
                if (isAnythingSelf) {
                    result = true;
                } else if (!visited.contains(referent)) {
                    if (referent instanceof Expression expression) {
                        var nextVisited = new BasicEList<Feature>();
                        nextVisited.addAll(visited);
                        nextVisited.add(referent);
                        result = expression.modelLevelEvaluable(nextVisited);
                    }
                    if (!result) {
                        var owningType = referent.getOwningType();
                        result = owningType instanceof Metaclass || owningType instanceof MetadataFeature;
                    }
                    if (!result && referent.getFeaturingType().isEmpty()) {
                        Expression valuation = null;
                        for (Membership membership : referent.getOwnedMembership()) {
                            if (membership instanceof FeatureValue featureValue) {
                                valuation = featureValue.getValue();
                                break;
                            }
                        }
                        if (valuation == null) {
                            result = true;
                        } else {
                            var nextVisited = new BasicEList<Feature>();
                            nextVisited.addAll(visited);
                            nextVisited.add(referent);
                            result = valuation.modelLevelEvaluable(nextVisited);
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(result);
    }
}
