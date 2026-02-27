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
import org.omg.sysml.model.sysml.RenderingUsage;
import org.omg.sysml.model.sysml.ViewRenderingMembership;

/**
 * Generated setting delegate for {@code ViewRenderingMembership.referencedRendering}.
 */
public class ViewRenderingMembership_referencedRendering_SettingDelegate extends AbstractSettingDelegate {

    public ViewRenderingMembership_referencedRendering_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    protected String delegateId() {
        return "ViewRenderingMembership.referencedRendering";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * OCL2.0 deriveVewRenderingMembershipReferencedRendering
         * referencedRendering =
         *     let referencedFeature : Feature = 
         *         ownedRendering.referencedFeatureTarget() in
         *     if referencedFeature = null then ownedRendering
         *     else if referencedFeature.oclIsKindOf(RenderingUsage) then
         *         refrencedFeature.oclAsType(RenderingUsage)
         *     else null
         *     endif endif
         */
        Object result = null;
        if (owner instanceof ViewRenderingMembership self) {
            var referencedFeature = self.getOwnedRendering() == null
                    ? null
                    : self.getOwnedRendering().referencedFeatureTarget();
            if (referencedFeature == null) {
                result = self.getOwnedRendering();
            } else if (referencedFeature instanceof RenderingUsage renderingUsage) {
                result = renderingUsage;
            }
        }
        return result;
    }
}
