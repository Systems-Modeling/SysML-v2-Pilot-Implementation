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
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.common.util.BasicEList;
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Namespace;

/**
 * Generated invocation delegate for {@code Namespace::namesOf}.
 */
public class Namespace_namesOf_InvocationDelegate extends AbstractInvocationDelegate {

    public Namespace_namesOf_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Namespace::namesOf";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * let elementMemberships : Sequence(Membership) = 
         *     memberships->select(memberElement = element) in
         * memberships.memberShortName->
         *     union(memberships.memberName)->
         *     asSet()
         */
        var result = new BasicEList<String>();
        if (target instanceof Namespace self) {
            var element = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Element value
                    ? value
                    : null;
            if (element != null) {
                Set<String> names = new LinkedHashSet<>();
                for (var membership : self.getMembership()) {
                    if (membership != null && membership.getMemberElement() == element) {
                        var shortName = membership.getMemberShortName();
                        if (shortName != null) {
                            names.add(shortName);
                        }
                        var name = membership.getMemberName();
                        if (name != null) {
                            names.add(name);
                        }
                    }
                }
                result.addAll(names);
            }
        }
        return result;
    }
}
