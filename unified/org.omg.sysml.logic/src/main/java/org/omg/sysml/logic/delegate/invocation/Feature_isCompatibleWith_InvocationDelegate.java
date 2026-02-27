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
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated invocation delegate for {@code Feature::isCompatibleWith}.
 */
public class Feature_isCompatibleWith_InvocationDelegate extends AbstractInvocationDelegate {

    public Feature_isCompatibleWith_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Feature::isCompatibleWith";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * specializes(otherType) or
         *     supertype.oclIsKindOf(Feature) and
         *     ownedFeature->isEmpty() and
         *     otherType.ownedFeature->isEmpty() and
         *     ownedRedefinitions.allRedefinedFeatures()->exists(f |  
         *         otherType.oclAsType(Feature).allRedefinedFeatures()->includes(f)) and
         *     canAccess(otherType.oclAsType(Feature))
         */
        var result = false;
        if (target instanceof Feature self) {
            var otherType = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Type argType
                    ? argType
                    : null;
            if (otherType != null) {
                result = self.specializes(otherType);
                if (!result && otherType instanceof Feature otherFeature) {
                    var hasFeatureSupertype = false;
                    for (Type supertype : self.supertypes(false)) {
                        if (supertype instanceof Feature) {
                            hasFeatureSupertype = true;
                            break;
                        }
                    }
                    if (hasFeatureSupertype && self.getOwnedFeature().isEmpty() && otherFeature.getOwnedFeature().isEmpty()) {
                        var overlapsAllRedefinedFeatures = false;
                        var allRedefinedFeatures = self.allRedefinedFeatures();
                        var otherAllRedefinedFeatures = otherFeature.allRedefinedFeatures();
                        for (Feature feature : allRedefinedFeatures) {
                            if (otherAllRedefinedFeatures.contains(feature)) {
                                overlapsAllRedefinedFeatures = true;
                                break;
                            }
                        }
                        if (overlapsAllRedefinedFeatures) {
                            result = self.canAccess(otherFeature);
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(result);
    }
}
