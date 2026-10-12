/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 * Copyright (c) 2026 Obeo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.kerml.xtext.postprocessing;

import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.util.ExpressionUtil;

/** Prepares the owned source-target feature of a feature-chain expression. */
public class FeatureChainExpressionParserPostProcessor extends ExpressionParserPostProcessor {

	public FeatureChainExpressionParserPostProcessor(FeatureChainExpression element) {
		super(element);
	}

	@Override
	public FeatureChainExpression getTarget() {
		return (FeatureChainExpression)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		ExpressionUtil.prepareSourceTargetFeature(getTarget());
	}

}
