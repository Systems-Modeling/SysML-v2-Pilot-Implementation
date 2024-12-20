/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2024 Model Driven Solutions, Inc.
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
 * Contributors:
 *   Laszlo Gati, MDS
 */
package org.omg.sysml.semantics.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;


/**
 * Semantic constraint tests for binary cases for "Implied Definition Subclassification Relationships" and
 * "Implied Usage Subsetting Relationships" (SysML v2 Specification, Tables 30 and 31)
 */
public class SysMLBinaryRelationTest extends SysMLSemanticTest {
	
	@Test
	public void checkConnectionDefinitionBinarySpecialization() {
		var resource = getResource();
		var connectionDefinition = SysMLFactory.eINSTANCE.createConnectionDefinition();
		
		resource.getContents().add(connectionDefinition);
		
		addEndTo(connectionDefinition);
		addEndTo(connectionDefinition);
		
		ElementUtil.transformAll(connectionDefinition, true);
		
		assertTrue(specializes(connectionDefinition, "Connections::BinaryConnection"));
	}
	
	@Test
	public void checkInterfaceDefinitionBinarySpecialization() {
		var resource = getResource();
		var interfaceDefinition = SysMLFactory.eINSTANCE.createInterfaceDefinition();
		
		resource.getContents().add(interfaceDefinition);
		
		addEndTo(interfaceDefinition);
		addEndTo(interfaceDefinition);
		
		ElementUtil.transformAll(interfaceDefinition, true);
		
		assertTrue(specializes(interfaceDefinition, "Interfaces::BinaryInterface"));
	}
	
	@Test
	public void checkConnectionUsageBinarySpecialization() {
		var resource = getResource();
		var connectionUsage = SysMLFactory.eINSTANCE.createConnectionUsage();
		
		resource.getContents().add(connectionUsage);
		
		addEndTo(connectionUsage);
		addEndTo(connectionUsage);
		
		ElementUtil.transformAll(connectionUsage, true);
		
		assertTrue(specializes(connectionUsage, "Connections::binaryConnections"));
	}
	
	@Test
	public void checkInterfaceUsageBinarySpecialization() {
		var resource = getResource();
		var interfaceUsage = SysMLFactory.eINSTANCE.createInterfaceUsage();
		
		resource.getContents().add(interfaceUsage);
		
		addEndTo(interfaceUsage);
		addEndTo(interfaceUsage);
		
		ElementUtil.transformAll(interfaceUsage, true);
		
		assertTrue(specializes(interfaceUsage, "Interfaces::binaryInterfaces"));
	}
	
	@Test
	public void checkFlowConnectionUsageFlowSpecialization() {
		//Succession flow connection is always binary, no base case
		var resource = getResource();
		var flowConnectionUsage = SysMLFactory.eINSTANCE.createFlowConnectionUsage();
		
		resource.getContents().add(flowConnectionUsage);
		
		addEndTo(flowConnectionUsage);
		addEndTo(flowConnectionUsage);
		
		ElementUtil.transformAll(flowConnectionUsage, true);
		
		assertTrue(specializes(flowConnectionUsage, "FlowConnections::flowConnections"));
	}
	
	@Test
	public void checkSuccessionFlowConnectionUsageSpecialization() {
		//Succession flow connection is always binary, no base case
		var resource = getResource();
		var interfaceDefinition = SysMLFactory.eINSTANCE.createSuccessionFlowConnectionUsage();
		
		resource.getContents().add(interfaceDefinition);
		
		addEndTo(interfaceDefinition);
		addEndTo(interfaceDefinition);
		
		ElementUtil.transformAll(interfaceDefinition, true);
		
		assertTrue(specializes(interfaceDefinition, "FlowConnections::successionFlowConnections"));
	}
	
	//Utility methods
	
	public static void addEndTo(Type type) {
		var end = SysMLFactory.eINSTANCE.createFeature();
		var endMembership = SysMLFactory.eINSTANCE.createEndFeatureMembership();
		endMembership.setFeature(end);
		type.getOwnedRelationship().add(endMembership);
	}
}
