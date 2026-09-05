/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.sysml.xtext.postprocessing;

import org.omg.kerml.xtext.postprocessing.ClassifierParserPostProcessor;
import org.omg.sysml.lang.sysml.Definition;

public class DefinitionParserPostProcessor extends ClassifierParserPostProcessor {

	public DefinitionParserPostProcessor(Definition element) {
		super(element);
	}

	@Override
	public Definition getTarget() {
		return (Definition)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		Definition target = getTarget();
		if (target.isVariation()) {
			target.setIsAbstract(true);
		}
	}
}
