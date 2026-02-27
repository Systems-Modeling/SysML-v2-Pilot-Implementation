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
package org.omg.sysml.logic.delegate.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;
import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import org.eclipse.emf.common.util.BasicEList;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated setting delegate for {@code Feature.type}.
 */
public class Feature_type_SettingDelegate extends AbstractSettingDelegate {

    public Feature_type_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "Feature.type";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * OCL2.0 deriveFeatureType
         * type = 
         *     let types : OrderedSet(Types) = OrderedSet{self}->
         *         -- Note: The closure operation automatically handles circular relationships.
         *         closure(typingFeatures()).typing.type->asOrderedSet() in
         *     types->reject(t1 | types->exist(t2 | t2 <> t1 and t2.specializes(t1)))
         */
        /*
         * OrderedSet{self} is the seed for closure(typingFeatures()) traversal, not an unconditional
         * member of the final derived type set. The resulting values come from ".typing.type" on the
         * closure result. If self is not reached via that navigation, it is not included.
         */
        var result = new BasicEList<Type>();
        if (owner instanceof Feature self) {
            var discoveredTypes = new LinkedHashSet<Type>();
            var visitedFeatures = new LinkedHashSet<Feature>();
            var queue = new ArrayDeque<Feature>();
            queue.add(self);
            while (!queue.isEmpty()) {
                var current = queue.removeFirst();
                if (!visitedFeatures.add(current)) {
                    continue;
                }
                for (var typingFeature : current.typingFeatures()) {
                    if (typingFeature != null) {
                        queue.addLast(typingFeature);
                        for (var type : typingFeature.getType()) {
                            discoveredTypes.add(type);
                        }
                    }
                }
            }

            for (var candidate : discoveredTypes) {
                var reject = false;
                for (var other : discoveredTypes) {
                    if (other != candidate && other.specializes(candidate)) {
                        reject = true;
                        break;
                    }
                }
                if (!reject) {
                    result.add(candidate);
                }
            }
        }
        return result;
    }
}
