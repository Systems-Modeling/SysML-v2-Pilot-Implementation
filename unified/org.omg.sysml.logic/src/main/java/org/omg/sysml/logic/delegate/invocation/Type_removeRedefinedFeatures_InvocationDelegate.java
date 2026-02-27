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
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.Type;

/**
 * Generated invocation delegate for {@code Type::removeRedefinedFeatures}.
 */
public class Type_removeRedefinedFeatures_InvocationDelegate extends AbstractInvocationDelegate {

    public Type_removeRedefinedFeatures_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Type::removeRedefinedFeatures";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * let reducedMemberships : Sequence(Membership) =
         *     memberships->reject(mem1 |
         *         memberships->excluding(mem1)->
         *             exists(mem2 | allRedefinedFeaturesOf(mem2)->
         *                 includes(mem1.memberElement))) in
         * let redefinedFeatures : Set(Feature) = 
         *     ownedFeature.redefinition.redefinedFeature->asSet() in
         * reducedMemberships->reject(mem | allRedefinedFeaturesOf(mem)->
         *     exists(feature | redefinedFeatures->includes(feature)))
         */
        var result = new BasicEList<Membership>();
        if (target instanceof Type self) {
            var memberships = new BasicEList<Membership>();
            if (arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof EList<?> membershipArg) {
                for (var element : membershipArg) {
                    if (element instanceof Membership membership) {
                        memberships.add(membership);
                    }
                }
            }
            var reducedMemberships = new BasicEList<Membership>();
            for (var mem1 : memberships) {
                var keep = true;
                for (var mem2 : memberships) {
                    if (mem1 != mem2 && self.allRedefinedFeaturesOf(mem2).contains(mem1.getMemberElement())) {
                        keep = false;
                        break;
                    }
                }
                if (keep) {
                    reducedMemberships.add(mem1);
                }
            }

            Set<Feature> redefinedFeatures = new LinkedHashSet<>();
            for (var ownedFeature : self.getOwnedFeature()) {
                for (var redefinition : ownedFeature.getOwnedRedefinition()) {
                    var redefined = redefinition.getRedefinedFeature();
                    if (redefined != null) {
                        redefinedFeatures.add(redefined);
                    }
                }
            }

            for (var membership : reducedMemberships) {
                var reject = false;
                for (var feature : self.allRedefinedFeaturesOf(membership)) {
                    if (redefinedFeatures.contains(feature)) {
                        reject = true;
                        break;
                    }
                }
                if (!reject) {
                    result.add(membership);
                }
            }
        }
        return result;
    }
}
