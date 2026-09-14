/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of theEclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *
 *******************************************************************************/

package org.omg.sysml.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.omg.sysml.lang.sysml.ConnectionDefinition;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FlowUsage;
import org.omg.sysml.lang.sysml.InterfaceDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

/**
 * Tests utility methods for connection and flow usages.
 */
public class UsageUtilTest {

	/**
	 * Verifies that connection and interface ends are filtered to their API types.
	 */
	@Test
	public void endUtilitiesReturnOnlyMatchingEndUsages() {
		SysMLLogicStandaloneSetup.doSetup();

		ConnectionDefinition connection = SysMLFactory.eINSTANCE.createConnectionDefinition();
		PartUsage connectionEnd = end(SysMLFactory.eINSTANCE.createPartUsage());
		TypeUtil.addOwnedFeatureTo(connection, connectionEnd);
		TypeUtil.addOwnedFeatureTo(connection, end(SysMLFactory.eINSTANCE.createFeature()));
		assertEquals(List.of(connectionEnd), UsageUtil.getConnectionEndOf(connection));

		InterfaceDefinition interfaceDefinition = SysMLFactory.eINSTANCE.createInterfaceDefinition();
		PortUsage interfaceEnd = end(SysMLFactory.eINSTANCE.createPortUsage());
		TypeUtil.addOwnedFeatureTo(interfaceDefinition, interfaceEnd);
		TypeUtil.addOwnedFeatureTo(interfaceDefinition, end(SysMLFactory.eINSTANCE.createPartUsage()));
		assertEquals(List.of(interfaceEnd), UsageUtil.getInterfaceEndOf(interfaceDefinition));
	}

	/**
	 * Verifies that a message flow has no end features.
	 */
	@Test
	public void isMessageRequiresAFlowUsageWithoutEnds() {
		SysMLLogicStandaloneSetup.doSetup();

		FlowUsage message = SysMLFactory.eINSTANCE.createFlowUsage();
		assertTrue(UsageUtil.isMessage(message));
		TypeUtil.addOwnedFeatureTo(message, end(SysMLFactory.eINSTANCE.createFeature()));
		assertFalse(UsageUtil.isMessage(message));
		assertFalse(UsageUtil.isMessage(SysMLFactory.eINSTANCE.createFeature()));
	}

	/**
	 * Marks a feature as an end.
	 *
	 * @param feature
	 *            the feature to configure
	 * @param <T>
	 *            the feature type
	 * @return the configured feature
	 */
	private <T extends Feature> T end(T feature) {
		feature.setIsEnd(true);
		return feature;
	}
}
