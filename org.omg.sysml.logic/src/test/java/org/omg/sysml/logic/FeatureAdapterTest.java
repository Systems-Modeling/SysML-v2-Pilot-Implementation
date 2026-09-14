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
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * Tests feature derived-property computations implemented by the logic adapters.
 */
public class FeatureAdapterTest {

	/**
	 * A partially linked feature chain can contribute a null entry to
	 * typingFeatures(). Type derivation must ignore that unresolved chaining
	 * target instead of recursing into it.
	 */
	@Test
	public void typeDerivationIgnoresUnresolvedChainingFeature() {
		SysMLLogicStandaloneSetup.doSetup();
		SysMLPackage.eINSTANCE.eClass();

		Feature feature = SysMLFactory.eINSTANCE.createFeature();
		FeatureChaining unresolvedChaining = SysMLFactory.eINSTANCE.createFeatureChaining();
		feature.getOwnedRelationship().add(unresolvedChaining);

		assertNull(feature.typingFeatures().get(0));
		assertTrue(feature.getType().isEmpty());
	}
}
