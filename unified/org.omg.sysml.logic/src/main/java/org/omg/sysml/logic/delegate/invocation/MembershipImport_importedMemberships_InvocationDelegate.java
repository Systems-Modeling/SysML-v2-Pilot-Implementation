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
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.MembershipImport;
import org.omg.sysml.model.sysml.Namespace;

/**
 * Generated invocation delegate for {@code MembershipImport::importedMemberships}.
 */
public class MembershipImport_importedMemberships_InvocationDelegate extends AbstractInvocationDelegate {

    public MembershipImport_importedMemberships_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "MembershipImport::importedMemberships";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * if not isRecursive or 
         *    not importedElement.oclIsKindOf(Namespace) or
         *    excluded->includes(importedElement)
         * then Sequence{importedMembership}
         * else importedElement.oclAsType(Namespace).
         *         visibleMemberships(excluded, true, importAll)->
         *         prepend(importedMembership)
         * endif
         */
        var result = new BasicEList<Membership>();
        if (target instanceof MembershipImport self) {
            var excluded = new BasicEList<Namespace>();
            if (arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof EList<?> excludedArg) {
                for (Object element : excludedArg) {
                    if (element instanceof Namespace namespace) {
                        excluded.add(namespace);
                    }
                }
            }
            var importedMembership = self.getImportedMembership();
            var importedElement = self.getImportedElement();
            var canRecurse = self.isIsRecursive() && importedElement instanceof Namespace
                    && !excluded.contains(importedElement);
            if (importedMembership != null) {
                result.add(importedMembership);
            }
            if (canRecurse && importedElement instanceof Namespace importedNamespace) {
                result.addAll(importedNamespace.visibleMemberships(excluded, true, self.isIsImportAll()));
            }
        }
        return result;
    }
}
