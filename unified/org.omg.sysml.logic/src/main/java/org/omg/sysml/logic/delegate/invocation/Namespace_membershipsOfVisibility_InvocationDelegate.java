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
import org.omg.sysml.model.sysml.Namespace;
import org.omg.sysml.model.sysml.VisibilityKind;

/**
 * Generated invocation delegate for {@code Namespace::membershipsOfVisibility}.
 */
public class Namespace_membershipsOfVisibility_InvocationDelegate extends AbstractInvocationDelegate {

    public Namespace_membershipsOfVisibility_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Namespace::membershipsOfVisibility";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * ownedMembership->
         *     select(mem | visibility = null or mem.visibility = visibility)->
         *     union(ownedImport->
         *         select(imp | visibility = null or imp.visibility = visibility).
         *         importedMemberships(excluded->including(self)))
         */
        var result = new BasicEList<>();
        if (target instanceof Namespace self) {
            var visibility = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof VisibilityKind value
                    ? value
                    : null;
            var excluded = new BasicEList<Namespace>();
            if (arguments != null && arguments.size() > 1 && arguments.get(1) instanceof EList<?> excludedArg) {
                for (var element : excludedArg) {
                    if (element instanceof Namespace namespace) {
                        excluded.add(namespace);
                    }
                }
            }
            for (var membership : self.getOwnedMembership()) {
                if (visibility == null || membership.getVisibility() == visibility) {
                    result.add(membership);
                }
            }
            for (var imported : self.getOwnedImport()) {
                if (visibility == null || imported.getVisibility() == visibility) {
                    var excludedWithSelf = new BasicEList<Namespace>();
                    excludedWithSelf.addAll(excluded);
                    if (!excludedWithSelf.contains(self)) {
                        excludedWithSelf.add(self);
                    }
                    result.addAll(imported.importedMemberships(excludedWithSelf));
                }
            }
        }
        return result;
    }
}
