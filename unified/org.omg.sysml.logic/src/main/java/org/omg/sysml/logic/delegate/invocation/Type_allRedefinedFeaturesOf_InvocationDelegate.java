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
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated invocation delegate for {@code Type::allRedefinedFeaturesOf}.
 */
public class Type_allRedefinedFeaturesOf_InvocationDelegate extends AbstractInvocationDelegate {

    public Type_allRedefinedFeaturesOf_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Type::allRedefinedFeaturesOf";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * if not membership.memberElement.oclIsType(Feature) then Set{} 
         * else membership.memberElement.oclAsType(Feature).allRedefinedFeatures()
         * endif
         */
        var result = new BasicEList<Feature>();
        if (target instanceof Type) {
            var membership = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Membership value
                    ? value
                    : null;
            if (membership != null && membership.getMemberElement() instanceof Feature feature) {
                result.addAll(feature.allRedefinedFeatures());
            }
        }
        return result;
    }
}
