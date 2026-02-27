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
import org.omg.sysml.model.sysml.OwningMembership;
import org.omg.sysml.model.sysml.Relationship;

/**
 * Generated invocation delegate for {@code OwningMembership::path}.
 */
public class OwningMembership_path_InvocationDelegate extends AbstractInvocationDelegate {

    public OwningMembership_path_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "OwningMembership::path";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * if ownedElement.qualifiedName <> null then
         *     ownedElement.qualifiedName + '/owningMembership'
         * else self.oclAsType(Relationship).path()
         * endif
         */
        String result = null;
        if (target instanceof OwningMembership self) {
            var ownedElement = self.getOwnedMemberElement();
            var qualifiedName = ownedElement == null ? null : ownedElement.getQualifiedName();
            if (qualifiedName != null) {
                result = qualifiedName + "/owningMembership";
            } else {
                var relationship = (Relationship) self;
                var owningRelationship = relationship.getOwningRelationship();
                var owningRelatedElement = relationship.getOwningRelatedElement();
                if (owningRelationship == null && owningRelatedElement != null) {
                    var index = owningRelatedElement.getOwnedRelationship().indexOf(relationship) + 1;
                    result = owningRelatedElement.path() + "/" + Integer.toString(index);
                } else {
                    var relationshipQualifiedName = relationship.getQualifiedName();
                    if (relationshipQualifiedName != null) {
                        result = relationshipQualifiedName;
                    } else if (owningRelationship != null) {
                        var index = owningRelationship.getOwnedRelatedElement().indexOf(relationship) + 1;
                        result = owningRelationship.path() + "/" + Integer.toString(index);
                    } else {
                        result = "";
                    }
                }
            }
        }
        return result;
    }
}
