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
import org.eclipse.emf.common.util.ECollections;
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FeatureReferenceExpression;
import org.omg.sysml.model.sysml.FeatureValue;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.Redefinition;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated invocation delegate for {@code FeatureReferenceExpression::evaluate}.
 */
public class FeatureReferenceExpression_evaluate_InvocationDelegate extends AbstractInvocationDelegate {

    public FeatureReferenceExpression_evaluate_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "FeatureReferenceExpression::evaluate";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * if not target.oclIsKindOf(Type) then Sequence{}
         * else
         *     let feature: Sequence(Feature) = 
         *         target.oclAsType(Type).feature->select(f |
         *             f.ownedRedefinition.redefinedFeature->
         *                 includes(referent)) in
         *         if feature->notEmpty() then 
         *             feature.valuation.value.evaluate(target)
         *         else if referent.featuringType->isEmpty() 
         *             then referent
         *         else Sequence{} 
         *         endif endif
         * endif
         */
        var result = ECollections.<Element>emptyEList();
        var evaluationTarget = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Element element
                ? element
                : null;
        if (target instanceof FeatureReferenceExpression self && evaluationTarget instanceof Type evaluationType) {
            var referent = self.getReferent();
            if (referent != null) {
                Feature matchedFeature = null;
                for (Feature candidate : evaluationType.getFeature()) {
                    for (Redefinition redefinition : candidate.getOwnedRedefinition()) {
                        if (redefinition.getRedefinedFeature() == referent) {
                            matchedFeature = candidate;
                            break;
                        }
                    }
                    if (matchedFeature != null) {
                        break;
                    }
                }
                if (matchedFeature != null) {
                    var evaluatedFromValue = false;
                    for (Membership membership : matchedFeature.getOwnedMembership()) {
                        if (membership instanceof FeatureValue featureValue) {
                            var value = featureValue.getValue();
                            if (value != null) {
                                result = value.evaluate(evaluationTarget);
                                evaluatedFromValue = true;
                            }
                            break;
                        }
                    }
                    if (!evaluatedFromValue) {
                        var singleton = new BasicEList<Element>();
                        singleton.add(matchedFeature);
                        result = singleton;
                    }
                } else if (referent.getFeaturingType().isEmpty()) {
                    var singleton = new BasicEList<Element>();
                    singleton.add(referent);
                    result = singleton;
                }
            }
        }
        return result;
    }
}
