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

import org.omg.sysml.lang.sysml.LiteralExpression;

public class LiteralExpressionParserPostProcessor extends ExpressionParserPostProcessor {

	public LiteralExpressionParserPostProcessor(LiteralExpression element) {
		super(element);
	}

	@Override
	public LiteralExpression getTarget() {
		return (LiteralExpression)super.getTarget();
	}

}
