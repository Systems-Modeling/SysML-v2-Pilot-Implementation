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
package org.omg.sysml.logic.adapter;

import java.util.Optional;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * Base type for generated SysML element adapters.
 *
 * @param <T> adapted SysML element type
 */
public abstract class AbstractSysMLAdapter<T> extends AdapterImpl {

    private final Class<T> adaptedType;

    protected AbstractSysMLAdapter(Class<T> adaptedType) {
        this.adaptedType = adaptedType;
    }

    public final Class<T> adaptedType() {
        return adaptedType;
    }

    @Override
    public boolean isAdapterForType(Object type) {
        return type == adaptedType;
    }

    @Override
    public void setTarget(Notifier newTarget) {
        super.setTarget(newTarget);
    }

    public final Optional<T> adaptedTarget() {
        var target = getTarget();
        if (adaptedType.isInstance(target)) {
            return Optional.of(adaptedType.cast(target));
        }
        return Optional.empty();
    }
}
