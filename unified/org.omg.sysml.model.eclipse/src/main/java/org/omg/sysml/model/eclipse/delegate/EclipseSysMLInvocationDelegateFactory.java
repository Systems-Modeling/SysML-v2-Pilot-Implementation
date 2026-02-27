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
package org.omg.sysml.model.eclipse.delegate;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;

/**
 * Eclipse design-time invocation delegate factory for the SysML delegate URI.
 *
 * <p>This factory exists to register the SysML delegate URI in Eclipse extension registries, so
 * GenModel/Ecore editors can resolve {@code invocationDelegates} declarations.
 */
public class EclipseSysMLInvocationDelegateFactory implements EOperation.Internal.InvocationDelegate.Factory {

    @Override
    public EOperation.Internal.InvocationDelegate createInvocationDelegate(EOperation eOperation) {
        return new BasicInvocationDelegate(eOperation) {
            @Override
            public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
                return eOperation.isMany() ? ECollections.emptyEList() : null;
            }
        };
    }
}
