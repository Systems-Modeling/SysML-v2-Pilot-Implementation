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
package org.omg.sysml.logic.delegate.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;
import org.omg.sysml.model.sysml.Element;

/**
 * Generated setting delegate for {@code Element.qualifiedName}.
 */
public class Element_qualifiedName_SettingDelegate extends AbstractSettingDelegate {

    public Element_qualifiedName_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "Element.qualifiedName";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * OCL2.0 deriveElementQualifiedName
         * qualifiedName =
         *     if owningNamespace = null then null
         *     else if name <> null and 
         *         owningNamespace.ownedMember->
         *         select(m | m.name = name).indexOf(self) <> 1 then null
         *     else if owningNamespace.owner = null then escapedName()
         *     else if owningNamespace.qualifiedName = null or 
         *             escapedName() = null then null
         *     else owningNamespace.qualifiedName + '::' + escapedName()
         *     endif endif endif endif
         */
        String result = null;
        if (owner instanceof Element self) {
            var owningNamespace = self.getOwningNamespace();
            if (owningNamespace != null) {
                var name = self.getName();
                var duplicateName = false;
                if (name != null) {
                    var matchingIndex = 0;
                    var foundSelf = false;
                    for (var member : owningNamespace.getOwnedMember()) {
                        if (name.equals(member.getName())) {
                            matchingIndex++;
                            if (member == self) {
                                foundSelf = true;
                                break;
                            }
                        }
                    }
                    duplicateName = !foundSelf || matchingIndex != 1;
                }

                if (!duplicateName) {
                    if (owningNamespace.getOwner() == null) {
                        result = self.escapedName();
                    } else {
                        var owningNamespaceQualifiedName = owningNamespace.getQualifiedName();
                        var escapedName = self.escapedName();
                        if (owningNamespaceQualifiedName != null && escapedName != null) {
                            result = owningNamespaceQualifiedName + "::" + escapedName;
                        }
                    }
                }
            }
        }
        return result;
    }
}
