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
import org.omg.sysml.model.sysml.Element;

/**
 * Generated invocation delegate for {@code Element::path}.
 */
public class Element_path_InvocationDelegate extends AbstractInvocationDelegate {

    public Element_path_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Element::path";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * if qualifiedName <> null then qualifiedName
         * else if owningRelationship <> null then
         *     owningRelationship.path() + '/' + 
         *     owningRelationship.ownedRelatedElement->indexOf(self).toString()
         *     -- A position index shall be converted to a decimal string representation 
         *     -- consisting of only decimal digits, with no sign, leading zeros or leading 
         *     -- or trailing whitespace.
         * else ''
         * endif endif
         */
        var result = "";
        if (target instanceof Element self) {
            var qualifiedName = self.getQualifiedName();
            if (qualifiedName != null) {
                result = qualifiedName;
            } else {
                var owningRelationship = self.getOwningRelationship();
                if (owningRelationship != null) {
                    var index = owningRelationship.getOwnedRelatedElement().indexOf(self);
                    var oneBasedIndex = index >= 0 ? index + 1 : 0;
                    result = owningRelationship.path() + "/" + oneBasedIndex;
                }
            }
        }
        return result;
    }
}
