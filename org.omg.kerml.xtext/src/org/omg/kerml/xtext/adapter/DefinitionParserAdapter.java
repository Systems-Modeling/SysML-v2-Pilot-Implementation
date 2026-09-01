/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.kerml.xtext.adapter;

import org.omg.sysml.lang.sysml.Definition;

public class DefinitionParserAdapter extends ElementParserAdapter {

	public DefinitionParserAdapter(Definition element) {
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
