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
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated invocation delegate for {@code Feature::canAccess}.
 */
public class Feature_canAccess_InvocationDelegate extends AbstractInvocationDelegate {

    public Feature_canAccess_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Feature::canAccess";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * let anythingType: Element =
         *     subsettingFeature.resolveGlobal('Base::Anything').memberElement in
         * let allFeaturingTypes : Sequence(Type) =
         *     featuringTypes->closure(t |
         *         if not t.oclIsKindOf(Feature) then Sequence{}
         *         else
         *             let featuringTypes : OrderedSet(Type) = t.oclAsType(Feature).featuringType in
         *             if featuringTypes->isEmpty() then Sequence{anythingType}
         *             else featuringTypes
         *             endif 
         *         endif) in
         * allFeaturingTypes->exists(t | feature.isFeaturedWithin(t))
         */
        var result = false;
        if (target instanceof Feature self) {
            var feature = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Feature argFeature
                    ? argFeature
                    : null;
            if (feature != null) {
                Type anythingType = null;
                var anythingMembership = self.resolveGlobal("Base::Anything");
                if (anythingMembership != null) {
                    var memberElement = anythingMembership.getMemberElement();
                    if (memberElement instanceof Type type) {
                        anythingType = type;
                    }
                }
                var allFeaturingTypes = new LinkedHashSet<Type>();
                var toVisit = new ArrayDeque<Type>();
                for (Type type : self.getFeaturingType()) {
                    if (type != null && allFeaturingTypes.add(type)) {
                        toVisit.addLast(type);
                    }
                }
                while (!toVisit.isEmpty()) {
                    var type = toVisit.removeFirst();
                    if (type instanceof Feature featuringFeature) {
                        var featuringTypes = featuringFeature.getFeaturingType();
                        if (featuringTypes.isEmpty()) {
                            if (anythingType != null && allFeaturingTypes.add(anythingType)) {
                                toVisit.addLast(anythingType);
                            }
                        } else {
                            for (Type featuringType : featuringTypes) {
                                if (featuringType != null && allFeaturingTypes.add(featuringType)) {
                                    toVisit.addLast(featuringType);
                                }
                            }
                        }
                    }
                }
                for (Type type : allFeaturingTypes) {
                    if (feature.isFeaturedWithin(type)) {
                        result = true;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(result);
    }
}
