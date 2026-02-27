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
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.Set;
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FeatureValue;
import org.omg.sysml.model.sysml.MetadataFeature;

/**
 * Generated invocation delegate for {@code MetadataFeature::evaluateFeature}.
 */
public class MetadataFeature_evaluateFeature_InvocationDelegate extends AbstractInvocationDelegate {

    public MetadataFeature_evaluateFeature_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "MetadataFeature::evaluateFeature";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * let selectedFeatures : Sequence(Feature) = feature->
         *     select(closure(ownedRedefinition.redefinedFeature)->
         *            includes(baseFeature)) in
         * if selectedFeatures->isEmpty() then null
         * else
         *     let selectedFeature : Feature = selectedFeatures->first() in
         *     let featureValues : FeatureValue = selectedFeature->
         *         closure(ownedRedefinition.redefinedFeature).ownedMember->
         *         selectAsKind(FeatureValue) in
         *     if featureValues->isEmpty() then null
         *     else featureValues->first().value.evaluate(self)
         *     endif
         */
        EList<Element> result = null;
        if (target instanceof MetadataFeature self) {
            var baseFeature = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Feature value
                    ? value
                    : null;
            if (baseFeature != null) {
                Feature selectedFeature = null;
                for (var feature : self.getFeature()) {
                    if (isInRedefinitionClosure(feature, baseFeature)) {
                        selectedFeature = feature;
                        break;
                    }
                }
                if (selectedFeature != null) {
                    FeatureValue firstFeatureValue = null;
                    for (var feature : collectRedefinitionClosure(selectedFeature)) {
                        for (var member : feature.getOwnedMember()) {
                            if (member instanceof FeatureValue featureValue) {
                                firstFeatureValue = featureValue;
                                break;
                            }
                        }
                        if (firstFeatureValue != null) {
                            break;
                        }
                    }
                    if (firstFeatureValue != null) {
                        Expression valueExpression = firstFeatureValue.getValue();
                        if (valueExpression != null) {
                            result = valueExpression.evaluate(self);
                        }
                    }
                }
            }
        }
        return result;
    }


private boolean isInRedefinitionClosure(Feature start, Feature searched) {
        var found = false;
        for (var feature : collectRedefinitionClosure(start)) {
            if (feature == searched) {
                found = true;
                break;
            }
        }
        return found;
    }

    private Set<Feature> collectRedefinitionClosure(Feature start) {
        Set<Feature> visited = new LinkedHashSet<>();
        var pending = new ArrayDeque<Feature>();
        pending.add(start);
        while (!pending.isEmpty()) {
            var current = pending.removeFirst();
            if (visited.add(current)) {
                for (var redefinition : current.getOwnedRedefinition()) {
                    var redefined = redefinition.getRedefinedFeature();
                    if (redefined != null && !visited.contains(redefined)) {
                        pending.addLast(redefined);
                    }
                }
            }
        }
        return visited;
    }
}
