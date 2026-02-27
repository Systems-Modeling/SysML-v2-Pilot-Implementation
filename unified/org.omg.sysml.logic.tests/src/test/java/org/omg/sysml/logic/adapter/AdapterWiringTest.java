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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.omg.sysml.model.sysml.AcceptActionUsage;
import org.omg.sysml.model.sysml.SysMLFactory;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * Verifies wiring between generated adapters and runtime SysML instances.
 */
public class AdapterWiringTest {

    @Test
    void factoryDispatchesToExpectedGeneratedAdapter() {
        var factory = new SysMLLogicAdapterFactory();
        var element = SysMLFactory.eINSTANCE.createAcceptActionUsage();

        var adapter = factory.createAdapter(element);

        assertInstanceOf(AcceptActionUsageAdapter.class, adapter);
    }

    @Test
    void adapterServiceAttachesAndReusesGeneratedAdapters() {
        var adapterFactory = new SysMLLogicAdapterFactory();
        var adapters = new SysMLAdapters(adapterFactory);
        var element = SysMLFactory.eINSTANCE.createAcceptActionUsage();

        var first = adapters.adapt(element, AcceptActionUsageAdapter.class);
        var second = adapters.adapt(element, AcceptActionUsageAdapter.class);

        assertSame(first, second);
        assertEquals(1, element.eAdapters().stream().filter(AcceptActionUsageAdapter.class::isInstance).count());
        assertTrue(first.adaptedTarget().isPresent());
        assertSame(element, first.adaptedTarget().orElseThrow());
    }

    @Test
    void adapterServiceFindReturnsEmptyBeforeAttachment() {
        var adapters = new SysMLAdapters(new SysMLLogicAdapterFactory());
        var element = SysMLFactory.eINSTANCE.createAcceptActionUsage();

        var found = adapters.find(element, AcceptActionUsageAdapter.class);

        assertTrue(found.isEmpty());
    }

    @Test
    void logicAdapterFactoryMatchesSysMLPackageAndElements() {
        var factory = new SysMLLogicAdapterFactory();
        var element = SysMLFactory.eINSTANCE.createAcceptActionUsage();

        assertTrue(factory.isFactoryForType(SysMLPackage.eINSTANCE));
        assertTrue(factory.isFactoryForType(element));
        assertFalse(factory.isFactoryForType("not-sysml"));
    }

    @Test
    void adapterServiceFindReturnsExistingAdapter() {
        var adapters = new SysMLAdapters(new SysMLLogicAdapterFactory());
        AcceptActionUsage element = SysMLFactory.eINSTANCE.createAcceptActionUsage();
        var attached = adapters.adapt(element, AcceptActionUsageAdapter.class);

        var found = adapters.find(element, AcceptActionUsageAdapter.class);

        assertTrue(found.isPresent());
        assertSame(attached, found.orElseThrow());
    }
}
