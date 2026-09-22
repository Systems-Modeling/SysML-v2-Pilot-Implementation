/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License, version 2, as published by
 * the Eclipse Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 */
package org.omg.sysml.interactive.tests;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.util.ElementUtil;

/**
 * Tests the semantic-metadata specializations
 * ({@code checkMetadataFeatureSemanticSpecialization}, KerML &sect;8.4.4.13).
 * <p>
 * The test checks the raw candidates of the public {@link ImplicitSpecializationService}
 * before transformation, then the materialized {@link Type#getOwnedSpecialization()} after it.
 */
public class SemanticMetadataImplicitSpecializationTest extends AbstractImplicitSpecializationTest {

	/**
	 * A feature annotated with {@code #moe} from {@code ParametersOfInterestMetadata} gets the
	 * evaluated base type {@code ParametersOfInterestMetadata::measuresOfEffectiveness} as a
	 * candidate, without requiring the Pilot transformation.
	 */
	@Test
	public void metadataAnnotatedFeatureGetsTheEvaluatedBaseType() throws Exception {
		// private import ParametersOfInterestMetadata::*; #moe attribute score;
		Resource resource = parse("metadata.sysml",
				"private import ParametersOfInterestMetadata::*; #moe attribute score;", false);
		Feature score = findByName(resource, "score", Feature.class);
		assertContains( getImplicitSpecializationService().getImplicitSpecializationCandidates(score),
				"ParametersOfInterestMetadata::measuresOfEffectiveness");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(score, "ParametersOfInterestMetadata::measuresOfEffectiveness");
	}

}
