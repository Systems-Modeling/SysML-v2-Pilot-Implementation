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
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Behavior-contract regression test for {@code checkMetadataFeatureSemanticSpecialization}
 * (KerML &sect;8.4.4.13.2-8.4.4.13.3 "Semantic Metadata"; concrete syntax KerML
 * &sect;7.4.13 "Metadata", SysML &sect;7.27.3 "Semantic Metadata"). Checks the
 * raw candidate through {@link TypeUtil#getImplicitGeneralTypesFor(Type)}
 * before transformation, then transforms and checks the same expectation
 * against the materialized {@link Type#getOwnedSpecialization()} — a plain
 * EMF read, independent of whichever engine computed the candidate, so it
 * keeps passing across any internal reorganization of the rule engine.
 */
public class SemanticMetadataImplicitSpecializationTest extends AbstractImplicitSpecializationTest {

	/**
	 * A feature annotated with a standard-library semantic-metadata metadata
	 * usage (here {@code #moe}, from {@code ParametersOfInterestMetadata}, whose
	 * {@code baseType} value expression evaluates to
	 * {@code ParametersOfInterestMetadata::measuresOfEffectiveness}) must get
	 * that evaluated base as an implicit specialization candidate, without
	 * requiring the Pilot transformation to run first.
	 */
	@Test
	public void metadataAnnotatedFeatureGetsTheEvaluatedBaseType() throws Exception {
		// private import ParametersOfInterestMetadata::*; #moe attribute score;
		Resource resource = parse("metadata.sysml",
				"private import ParametersOfInterestMetadata::*; #moe attribute score;");
		Feature score = findByName(resource, "score", Feature.class);
		assertContains(TypeUtil.getImplicitGeneralTypesFor(score),
				"ParametersOfInterestMetadata::measuresOfEffectiveness");

		ElementUtil.transformAll(resource, true);
		assertOwnedSpecializationContains(score, "ParametersOfInterestMetadata::measuresOfEffectiveness");
	}

}
