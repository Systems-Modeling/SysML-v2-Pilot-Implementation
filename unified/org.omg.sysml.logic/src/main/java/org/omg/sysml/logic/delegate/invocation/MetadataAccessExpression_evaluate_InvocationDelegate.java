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
import org.omg.sysml.model.sysml.MetadataAccessExpression;
import org.omg.sysml.model.sysml.MetadataFeature;

/**
 * Generated invocation delegate for {@code MetadataAccessExpression::evaluate}.
 */
public class MetadataAccessExpression_evaluate_InvocationDelegate extends AbstractInvocationDelegate {

    public MetadataAccessExpression_evaluate_InvocationDelegate(EOperation operation) {
        super(operation);
    }

    @Override
    protected String delegateId() {
        return "MetadataAccessExpression::evaluate";
    }

    /**
     * @generated NOT
     */
    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        /*
         * OCL2.0 unnamed1
         * referencedElement.ownedElement->
         *     select(oclIsKindOf(MetadataFeature) 
         *         and annotatedElement->includes(referencedElement))->
         *     including(metaclassFeature())
         */
        var result = new BasicEList<Element>();
        if (target instanceof MetadataAccessExpression self) {
            var referencedElement = self.getReferencedElement();
            if (referencedElement != null) {
                for (Element element : referencedElement.getOwnedElement()) {
                    if (element instanceof MetadataFeature metadataFeature
                            && metadataFeature.getAnnotatedElement().contains(referencedElement)) {
                        result.add(metadataFeature);
                    }
                }
                var metaclassFeature = self.metaclassFeature();
                if (metaclassFeature != null) {
                    result.add(metaclassFeature);
                }
            }
        }
        return result;
    }
}
