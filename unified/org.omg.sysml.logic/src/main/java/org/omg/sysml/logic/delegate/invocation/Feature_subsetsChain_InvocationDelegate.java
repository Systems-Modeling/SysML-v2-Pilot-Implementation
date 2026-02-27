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
import org.omg.sysml.model.sysml.Specialization;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated invocation delegate for {@code Feature::subsetsChain}.
 */
public class Feature_subsetsChain_InvocationDelegate extends AbstractInvocationDelegate {

    public Feature_subsetsChain_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Feature::subsetsChain";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * allSuperTypes()->selectAsKind(Feature)->
         *     exists(f | let n: Integer = f.chainingFeature->size() in
         *         n >= 2 and
         *         f.chainingFeature->at(n-1) = first and
         *         f.chainingFeature->at(n) = second)
         */
        var result = false;
        if (target instanceof Feature self) {
            var first = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Feature argFirst
                    ? argFirst
                    : null;
            var second = arguments != null && arguments.size() > 1 && arguments.get(1) instanceof Feature argSecond
                    ? argSecond
                    : null;
            if (first != null && second != null) {
                var visited = new LinkedHashSet<Type>();
                var toVisit = new ArrayDeque<Type>();
                for (Specialization specialization : self.getOwnedSpecialization()) {
                    if (specialization.getGeneral() != null) {
                        toVisit.addLast(specialization.getGeneral());
                    }
                }
                while (!toVisit.isEmpty()) {
                    var supertype = toVisit.removeFirst();
                    if (visited.add(supertype)) {
                        if (supertype instanceof Type type) {
                            for (Specialization specialization : type.getOwnedSpecialization()) {
                                if (specialization.getGeneral() != null) {
                                    toVisit.addLast(specialization.getGeneral());
                                }
                            }
                        }
                    }
                }
                for (Type supertype : visited) {
                    if (supertype instanceof Feature feature) {
                        var size = feature.getChainingFeature().size();
                        if (size >= 2
                                && feature.getChainingFeature().get(size - 2) == first
                                && feature.getChainingFeature().get(size - 1) == second) {
                            result = true;
                            break;
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(result);
    }
}
