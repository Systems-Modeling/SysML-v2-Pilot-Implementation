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
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FeatureDirectionKind;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated invocation delegate for {@code Type::directionOfExcluding}.
 */
public class Type_directionOfExcluding_InvocationDelegate extends AbstractInvocationDelegate {

    public Type_directionOfExcluding_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Type::directionOfExcluding";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * let excludedSelf : Set(Type) = excluded->including(self) in 
         * if feature.owningType = self then feature.direction
         * else
         *     let directions : Sequence(FeatureDirectionKind) =
         *         supertypes(false)->excluding(excludedSelf).
         *         directionOfExcluding(feature, excludedSelf)->
         *         select(d | d <> null) in
         *     if directions->isEmpty() then null
         *  else
         *     let direction : FeatureDirectionKind = directions->first() in
         *     if not isConjugated then direction
         *     else if direction = FeatureDirectionKind::_'in' then FeatureDirectionKind::out
         *     else if direction = FeatureDirectionKind::out then FeatureDirectionKind::_'in'
         *     else direction
         *     endif endif endif   endif
         * endif
         */
        FeatureDirectionKind result = null;
        if (target instanceof Type self) {
            var feature = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Feature value
                    ? value
                    : null;
            var excludedSelf = new BasicEList<Type>();
            if (arguments != null && arguments.size() > 1 && arguments.get(1) instanceof EList<?> excludedArg) {
                for (var element : excludedArg) {
                    if (element instanceof Type type && !excludedSelf.contains(type)) {
                        excludedSelf.add(type);
                    }
                }
            }
            if (!excludedSelf.contains(self)) {
                excludedSelf.add(self);
            }
            if (feature != null) {
                if (feature.getOwningType() == self) {
                    result = feature.getDirection();
                } else {
                    var directions = new BasicEList<FeatureDirectionKind>();
                    for (var supertype : self.supertypes(false)) {
                        if (!excludedSelf.contains(supertype)) {
                            var direction = supertype.directionOfExcluding(feature, excludedSelf);
                            if (direction != null) {
                                directions.add(direction);
                            }
                        }
                    }
                    if (!directions.isEmpty()) {
                        var direction = directions.getFirst();
                        if (!self.isIsConjugated()) {
                            result = direction;
                        } else if (direction == FeatureDirectionKind.IN) {
                            result = FeatureDirectionKind.OUT;
                        } else if (direction == FeatureDirectionKind.OUT) {
                            result = FeatureDirectionKind.IN;
                        } else {
                            result = direction;
                        }
                    }
                }
            }
        }
        return result;
    }
}
