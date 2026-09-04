/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 * (at your option) any later version.
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
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;

/**
 * Tests transition derived-property computations.
 */
public class TransitionUsageAdapterTest {
	/**
	 * The source derivation asks transition adapters to add implicit members. 
	 * A transition with parameters but no source and no succession must not
	 * recursively recompute transition link connectors while its source is being
	 * derived.
	 */
	@Test
	public void transitionSourceDerivationIsReentrantSafeWithoutSuccession() {
		SysMLLogicStandaloneSetup.doSetup();
		SysMLPackage.eINSTANCE.eClass();
		SysMLFactory factory = SysMLFactory.eINSTANCE;
		TransitionUsage transition = factory.createTransitionUsage();
		Feature parameter = factory.createFeature();
		parameter.setDirection(FeatureDirectionKind.IN);
		ParameterMembership parameterMembership = factory.createParameterMembership();
		parameterMembership.setOwnedMemberParameter(parameter);
		transition.getOwnedRelationship().add(parameterMembership);
		assertNull(transition.getSource());
	}
}
