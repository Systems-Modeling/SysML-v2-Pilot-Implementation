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
 * Generated invocation delegate for {@code Feature::isFeaturedWithin}.
 */
public class Feature_isFeaturedWithin_InvocationDelegate extends AbstractInvocationDelegate {

    public Feature_isFeaturedWithin_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Feature::isFeaturedWithin";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 isFeaturedWithIn_Body
         * if type = null then
         *     featuringType->forAll(f | f = resolveGlobal('Base::Anything').memberElement)
         * else
         *     featuringType->forAll(f | type.isCompatibleWith(f)) or
         *     isVariable and type.specializes(owningType) or
         *     chainingFeature->notEmpty() and chainingFeature->first().isVariable and
         *         type.specializes(chainingFeature->first().owningType)
         * endif
         */
        var result = false;
        if (target instanceof Feature self) {
            var type = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Type argType
                    ? argType
                    : null;
            if (type == null) {
                var anythingMembership = self.resolveGlobal("Base::Anything");
                var anything = anythingMembership != null ? anythingMembership.getMemberElement() : null;
                result = true;
                for (Type featuringType : self.getFeaturingType()) {
                    if (featuringType != anything) {
                        result = false;
                        break;
                    }
                }
            } else {
                var allFeaturingTypesCompatible = true;
                for (Type featuringType : self.getFeaturingType()) {
                    if (!type.isCompatibleWith(featuringType)) {
                        allFeaturingTypesCompatible = false;
                        break;
                    }
                }
                var variableOwningTypeCompatible = self.isIsVariable()
                        && self.getOwningType() != null
                        && type.specializes(self.getOwningType());
                var firstChainingFeatureVariableOwningTypeCompatible = false;
                if (!self.getChainingFeature().isEmpty()) {
                    var firstChainingFeature = self.getChainingFeature().getFirst();
                    firstChainingFeatureVariableOwningTypeCompatible = firstChainingFeature != null
                            && firstChainingFeature.isIsVariable()
                            && firstChainingFeature.getOwningType() != null
                            && type.specializes(firstChainingFeature.getOwningType());
                }
                result = allFeaturingTypesCompatible
                        || variableOwningTypeCompatible
                        || firstChainingFeatureVariableOwningTypeCompatible;
            }
        }
        return Boolean.valueOf(result);
    }
}
