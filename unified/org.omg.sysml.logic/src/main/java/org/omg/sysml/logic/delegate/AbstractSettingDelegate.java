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

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate;

/**
 * Base setting delegate used by SysML derived-feature delegates.
 *
 * <p>Concrete delegates extend this class and provide an identifier via
 * {@link #delegateId()}. The default feature access behavior returns a type-compatible neutral
 * value (or an empty list for multi-valued features). Delegates may override
 * {@link #get(InternalEObject, boolean, boolean)} with OCL-based or subsets-annotation-based
 * feature-specific logic.
 */
public abstract class AbstractSettingDelegate extends BasicSettingDelegate.Stateless {

    protected AbstractSettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    protected abstract String delegateId();

    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        if (eStructuralFeature.isMany()) {
            return ECollections.emptyEList();
        }

        Class<?> instanceClass = eStructuralFeature.getEType().getInstanceClass();
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

    @Override
    protected boolean isSet(InternalEObject owner) {
        return false;
    }

    /**
     * Fallback setting delegate used when a generated delegate class cannot be resolved.
     *
     * <p>It preserves deterministic behavior by delegating to the base neutral-value
     * implementation while exposing the expected delegate identifier.
     */
    public static final class FallbackSettingDelegate extends AbstractSettingDelegate {

        private final String id;

        public FallbackSettingDelegate(EStructuralFeature feature, String id) {
            super(feature);
            this.id = id;
        }

        @Override
        protected String delegateId() {
            return id;
        }
    }
}
