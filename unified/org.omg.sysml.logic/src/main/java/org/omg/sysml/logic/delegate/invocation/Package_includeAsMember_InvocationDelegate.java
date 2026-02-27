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
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.MetadataFeature;
import org.omg.sysml.model.sysml.Package;

/**
 * Generated invocation delegate for {@code Package::includeAsMember}.
 */
public class Package_includeAsMember_InvocationDelegate extends AbstractInvocationDelegate {

    public Package_includeAsMember_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "Package::includeAsMember";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * let metadataFeatures: Sequence(AnnotatingElement) = 
         *     element.ownedAnnotation.annotatingElement->
         *         selectByKind(MetadataFeature) in
         *     self.filterCondition->forAll(cond | 
         *         metadataFeatures->exists(elem | 
         *             cond.checkCondition(elem)))
         */
        var result = false;
        if (target instanceof Package self) {
            var element = arguments != null && !arguments.isEmpty() && arguments.getFirst() instanceof Element value
                    ? value
                    : null;
            if (element != null) {
                var metadataFeatures = new BasicEList<Element>();
                for (var annotation : element.getOwnedAnnotation()) {
                    var annotatingElement = annotation.getAnnotatingElement();
                    if (annotatingElement instanceof MetadataFeature) {
                        metadataFeatures.add(annotatingElement);
                    }
                }
                result = true;
                for (var condition : self.getFilterCondition()) {
                    var exists = false;
                    for (var metadataFeature : metadataFeatures) {
                        if (condition.checkCondition(metadataFeature)) {
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        result = false;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(result);
    }
}
