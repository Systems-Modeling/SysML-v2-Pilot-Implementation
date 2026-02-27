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
package org.omg.sysml.logic.delegate;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;

/**
 * Base invocation delegate used by SysML operation delegates.
 *
 * <p>Concrete delegates extend this class and provide an identifier via
 * {@link #delegateId()}. The default invocation behavior returns a type-compatible neutral value
 * (or an empty list for multi-valued operations), allowing execution to remain stable when no
 * operation-specific logic is implemented yet.
 */
public abstract class AbstractInvocationDelegate extends BasicInvocationDelegate {

    protected AbstractInvocationDelegate(EOperation operation) {
        super(operation);
    }

    protected abstract String delegateId();

    @Override
    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
        if (eOperation.isMany()) {
            return ECollections.emptyEList();
        }
        Class<?> instanceClass = eOperation.getEType() == null ? null : eOperation.getEType().getInstanceClass();
        if (instanceClass == Boolean.class || instanceClass == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (instanceClass == Integer.class || instanceClass == Integer.TYPE) {
            return Integer.valueOf(0);
        }
        if (instanceClass == Long.class || instanceClass == Long.TYPE) {
            return Long.valueOf(0L);
        }
        if (instanceClass == Double.class || instanceClass == Double.TYPE) {
            return Double.valueOf(0d);
        }
        if (instanceClass == Float.class || instanceClass == Float.TYPE) {
            return Float.valueOf(0f);
        }
        return null;
    }

    /**
     * Fallback invocation delegate used when a generated delegate class cannot be resolved.
     *
     * <p>It preserves deterministic behavior by delegating to the base neutral-value
     * implementation while exposing the expected delegate identifier.
     */
    public static final class FallbackInvocationDelegate extends AbstractInvocationDelegate {

        private final String id;

        public FallbackInvocationDelegate(EOperation operation, String id) {
            super(operation);
            this.id = id;
        }

        @Override
        protected String delegateId() {
            return id;
        }
    }
}
