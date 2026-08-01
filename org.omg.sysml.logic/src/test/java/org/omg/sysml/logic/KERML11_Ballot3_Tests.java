/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.util.TypeUtil;

public class KERML11_Ballot3_Tests {

	@BeforeClass
	public static void setUp() {
		SysMLLogicStandaloneSetup.doSetup();
	}

	/**
	 * Test resolution to KERML11-1 Binding connectors should not be considered owned cross features
	 * @throws InvocationTargetException
	 */
	@Test
	public void testKERML11_1() {
		Association association = SysMLFactory.eINSTANCE.createAssociation();
		
		Feature end1 = SysMLFactory.eINSTANCE.createFeature();
		end1.setDeclaredName("end1");
		end1.setIsEnd(true);
		TypeUtil.addOwnedFeatureTo(association, end1);
		
		Feature end2 = SysMLFactory.eINSTANCE.createFeature();
		end2.setDeclaredName("end2");
		end2.setIsEnd(true);
		TypeUtil.addOwnedFeatureTo(association, end2);
		
		BindingConnector connector = SysMLFactory.eINSTANCE.createBindingConnector();
		FeatureUtil.addTypeFeaturingTo(connector).setFeaturingType(association);
		ConnectorUtil.addConnectorEndTo(connector, end1);
		ConnectorUtil.addConnectorEndTo(connector, end1);
		NamespaceUtil.addOwnedMemberTo(end1, connector);
		
		Feature feature = SysMLFactory.eINSTANCE.createFeature();
		feature.setDeclaredName("crossFeature");
		NamespaceUtil.addOwnedMemberTo(end1, feature);		
		
		Feature crossFeature = end1.ownedCrossFeature();
		assertNotNull("Not null", crossFeature);
		assertEquals("cross feature", feature, crossFeature);
	}
}
