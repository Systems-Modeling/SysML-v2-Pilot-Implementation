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
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.Namespace;

/**
 * Generated invocation delegate for {@code Namespace::resolve}.
 */
public class Namespace_resolve_InvocationDelegate extends AbstractInvocationDelegate {

    public Namespace_resolve_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Namespace::resolve";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * let qualification : String = qualificationOf(qualifiedName) in
         * let name : String = unqualifiedNameOf(qualifiedName) in
         * if qualification = null then resolveLocal(name)
         * else if qualification = '$' then  resolveGlobal(name)
         * else 
         *     let namespaceMembership : Membership = resolve(qualification) in
         *     if namespaceMembership = null or 
         *        not namespaceMembership.memberElement.oclIsKindOf(Namespace) 
         *     then null
         *     else 
         *         namespaceMembership.memberElement.oclAsType(Namespace).
         *         resolveVisible(name) 
         *     endif
         * endif endif
         */
        Membership result = null;
        if (target instanceof Namespace self) {
            var qualifiedName = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof String value
                    ? value
                    : null;
            if (qualifiedName != null) {
                var qualification = self.qualificationOf(qualifiedName);
                var name = self.unqualifiedNameOf(qualifiedName);
                if (qualification == null) {
                    result = self.resolveLocal(name);
                } else if ("$".equals(qualification)) {
                    result = self.resolveGlobal(name);
                } else {
                    var namespaceMembership = self.resolve(qualification);
                    if (namespaceMembership != null && namespaceMembership.getMemberElement() instanceof Namespace namespace) {
                        result = namespace.resolveVisible(name);
                    }
                }
            }
        }
        return result;
    }
}
