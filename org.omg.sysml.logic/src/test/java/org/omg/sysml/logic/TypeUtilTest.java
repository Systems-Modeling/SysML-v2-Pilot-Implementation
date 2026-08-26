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

import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.omg.sysml.lang.sysml.AssignmentActionUsage;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.SysMLFactory;

/**
 * Tests utility behavior reached from SysML derived properties.
 */
public class TypeUtilTest {

	/**
	 * Derived properties on some feature-like SysML elements ask TypeUtil for
	 * owned parameters. When the feature is a chain whose target has not been
	 * linked yet, the basic feature is null and the derivation must simply see no
	 * parameters.
	 */
	@Test
	public void derivedPropertyHandlesUnresolvedChainedFeatureWithoutParameters() {
		SysMLLogicStandaloneSetup.doSetup();

		AssignmentActionUsage assignment = SysMLFactory.eINSTANCE.createAssignmentActionUsage();
		FeatureChaining unresolvedChaining = SysMLFactory.eINSTANCE.createFeatureChaining();
		assignment.getOwnedRelationship().add(unresolvedChaining);

		assertNull(assignment.getValueExpression());
	}
}
