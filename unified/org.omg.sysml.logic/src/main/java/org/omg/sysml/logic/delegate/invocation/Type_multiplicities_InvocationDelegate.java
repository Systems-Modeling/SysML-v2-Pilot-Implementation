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
import org.eclipse.emf.common.util.BasicEList;
import org.omg.sysml.model.sysml.Multiplicity;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated invocation delegate for {@code Type::multiplicities}.
 */
public class Type_multiplicities_InvocationDelegate extends AbstractInvocationDelegate {

    public Type_multiplicities_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Type::multiplicities";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * if multiplicity <> null then OrderedSet{multiplicity}
         * else 
         *     ownedSpecialization.general->closure(t |
         *         if t.multiplicity <> null then OrderedSet{}
         *         else ownedSpecialization.general
         *     )->select(multiplicity <> null).multiplicity->asOrderedSet()
         * endif
         */
        var result = new BasicEList<Multiplicity>();
        if (target instanceof Type self) {
            var ownMultiplicity = self.getMultiplicity();
            if (ownMultiplicity != null) {
                result.add(ownMultiplicity);
            } else {
                var pending = new ArrayDeque<Type>();
                Set<Type> visited = new LinkedHashSet<>();
                pending.add(self);
                visited.add(self);
                while (!pending.isEmpty()) {
                    var current = pending.removeFirst();
                    for (var specialization : current.getOwnedSpecialization()) {
                        var general = specialization.getGeneral();
                        if (general != null && visited.add(general)) {
                            var generalMultiplicity = general.getMultiplicity();
                            if (generalMultiplicity != null) {
                                if (!result.contains(generalMultiplicity)) {
                                    result.add(generalMultiplicity);
                                }
                            } else {
                                pending.addLast(general);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
