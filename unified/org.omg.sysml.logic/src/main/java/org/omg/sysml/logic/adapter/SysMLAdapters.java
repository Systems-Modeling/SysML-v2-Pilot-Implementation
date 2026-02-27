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

import org.eclipse.emf.ecore.EObject;

/**
 * Runtime adapter access service for SysML model elements.
 */
public class SysMLAdapters {

    private final SysMLLogicAdapterFactory adapterFactory;

    public SysMLAdapters(SysMLLogicAdapterFactory adapterFactory) {
        this.adapterFactory = adapterFactory;
    }

    public <A extends AbstractSysMLAdapter<?>> Optional<A> find(EObject element, Class<A> adapterClass) {
        for (var adapter : element.eAdapters()) {
            if (adapterClass.isInstance(adapter)) {
                return Optional.of(adapterClass.cast(adapter));
            }
        }
        return Optional.empty();
    }

    public <A extends AbstractSysMLAdapter<?>> A adapt(EObject element, Class<A> adapterClass) {
        var existing = find(element, adapterClass);
        if (existing.isPresent()) {
            return existing.orElseThrow();
        }

        var created = adapterFactory.createAdapter(element);
        if (created == null || !adapterClass.isInstance(created)) {
            var createdType = created == null ? "null" : created.getClass().getName();
            throw new IllegalStateException(
                    "Cannot adapt " + element.eClass().getName() + " with " + adapterClass.getName()
                            + "; factory produced " + createdType);
        }

        element.eAdapters().add(created);
        return adapterClass.cast(created);
    }
}
