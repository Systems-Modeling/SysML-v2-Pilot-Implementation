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
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.Namespace;
import org.omg.sysml.model.sysml.Type;
import org.omg.sysml.model.sysml.VisibilityKind;

/**
 * Generated invocation delegate for {@code Type::nonPrivateMemberships}.
 */
public class Type_nonPrivateMemberships_InvocationDelegate extends AbstractInvocationDelegate {

    public Type_nonPrivateMemberships_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Type::nonPrivateMemberships";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * let publicMemberships : OrderedSet(Membership) = 
         *     membershipsOfVisibility(VisibilityKind::public, excludedNamespaces) in
         * let protectedMemberships : OrderedSet(Membership) = 
         *     membershipsOfVisibility(VisibilityKind::protected, excludedNamespaces) in
         * let inheritedMemberships : OrderedSet(Membership) =
         *     inheritedMemberships(excludedNamespaces, excludedTypes, excludeImplied) in
         * publicMemberships->
         *     union(protectedMemberships)->
         *     union(inheritedMemberships)
         */
        var result = new BasicEList<Membership>();
        if (target instanceof Type self) {
            var excludedNamespaces = new BasicEList<Namespace>();
            if (arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof EList<?> namespaceArg) {
                for (var element : namespaceArg) {
                    if (element instanceof Namespace namespace) {
                        excludedNamespaces.add(namespace);
                    }
                }
            }
            var excludedTypes = new BasicEList<Type>();
            if (arguments != null && arguments.size() > 1 && arguments.get(1) instanceof EList<?> typeArg) {
                for (var element : typeArg) {
                    if (element instanceof Type type) {
                        excludedTypes.add(type);
                    }
                }
            }
            var excludeImplied = arguments != null && arguments.size() > 2 && arguments.get(2) instanceof Boolean value
                    ? value.booleanValue()
                    : false;
            Set<Membership> memberships = new LinkedHashSet<>();
            memberships.addAll(self.membershipsOfVisibility(VisibilityKind.PUBLIC, excludedNamespaces));
            memberships.addAll(self.membershipsOfVisibility(VisibilityKind.PROTECTED, excludedNamespaces));
            memberships.addAll(self.inheritedMemberships(excludedNamespaces, excludedTypes, excludeImplied));
            result.addAll(memberships);
        }
        return result;
    }
}
