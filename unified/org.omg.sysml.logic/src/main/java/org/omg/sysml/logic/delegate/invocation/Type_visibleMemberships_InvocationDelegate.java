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
 * Generated invocation delegate for {@code Type::visibleMemberships}.
 */
public class Type_visibleMemberships_InvocationDelegate extends AbstractInvocationDelegate {

    public Type_visibleMemberships_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Type::visibleMemberships";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * let visibleMemberships : OrderedSet(Membership) =
         *     self.oclAsType(Namespace).
         *         visibleMemberships(excluded, isRecursive, includeAll) in
         * let visibleInheritedMemberships : OrderedSet(Membership) = 
         *     inheritedMemberships(excluded->including(self), Set{}, isRecursive)->
         *         select(includeAll or visibility = VisibilityKind::public) in
         * visibleMemberships->union(visibleInheritedMemberships)
         */
        var result = new BasicEList<Membership>();
        if (target instanceof Type self) {
            var excluded = new BasicEList<Namespace>();
            if (arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof EList<?> excludedArg) {
                for (var element : excludedArg) {
                    if (element instanceof Namespace namespace) {
                        excluded.add(namespace);
                    }
                }
            }
            var isRecursive = arguments != null && arguments.size() > 1 && arguments.get(1) instanceof Boolean value
                    ? value.booleanValue()
                    : false;
            var includeAll = arguments != null && arguments.size() > 2 && arguments.get(2) instanceof Boolean value
                    ? value.booleanValue()
                    : false;

            Set<Membership> memberships = new LinkedHashSet<>();
            var visibility = includeAll ? null : VisibilityKind.PUBLIC;
            memberships.addAll(self.membershipsOfVisibility(visibility, excluded));

            if (isRecursive) {
                for (var member : self.getOwnedMember()) {
                    if (member instanceof Namespace namespace) {
                        var owningMembership = namespace.getOwningMembership();
                        if (includeAll || (owningMembership != null && owningMembership.getVisibility() == VisibilityKind.PUBLIC)) {
                            var nextExcluded = new BasicEList<Namespace>();
                            nextExcluded.addAll(excluded);
                            if (!nextExcluded.contains(self)) {
                                nextExcluded.add(self);
                            }
                            memberships.addAll(namespace.visibleMemberships(nextExcluded, true, includeAll));
                        }
                    }
                }
            }

            var excludedWithSelf = new BasicEList<Namespace>();
            excludedWithSelf.addAll(excluded);
            if (!excludedWithSelf.contains(self)) {
                excludedWithSelf.add(self);
            }
            for (var inherited : self.inheritedMemberships(excludedWithSelf, new BasicEList<Type>(), isRecursive)) {
                if (includeAll || inherited.getVisibility() == VisibilityKind.PUBLIC) {
                    memberships.add(inherited);
                }
            }
            result.addAll(memberships);
        }
        return result;
    }
}
