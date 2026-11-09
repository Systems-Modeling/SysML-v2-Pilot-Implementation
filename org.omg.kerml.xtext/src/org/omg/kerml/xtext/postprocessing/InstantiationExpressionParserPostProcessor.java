/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.kerml.xtext.postprocessing;

import org.omg.sysml.lang.sysml.InstantiationExpression;
import org.omg.sysml.util.TypeUtil;

public class InstantiationExpressionParserPostProcessor extends ExpressionParserPostProcessor {

	public InstantiationExpressionParserPostProcessor(InstantiationExpression element) {
		super(element);
	}

	@Override
	public InstantiationExpression getTarget() {
		return (InstantiationExpression)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		TypeUtil.addResultParameterTo(getTarget());
	}

}
