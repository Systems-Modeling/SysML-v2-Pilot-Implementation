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

package org.omg.sysml.xtext.adapter;

import org.omg.kerml.xtext.adapter.FeatureParserAdapter;
import org.omg.sysml.lang.sysml.AttributeDefinition;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.util.UsageUtil;

public class UsageParserAdapter extends FeatureParserAdapter {

	public UsageParserAdapter(Usage element) {
		super(element);
	}

	@Override
	public Usage getTarget() {
		return (Usage)super.getTarget();
	}

	@Override
	public void postProcess () {
		super.postProcess();
		Usage target = getTarget();
		if (target.isVariation()) {
			target.setIsAbstract(true);
		}
        Type featuringType = UsageUtil.getExpectedFeaturingTypeOf(target);
        if (target.getDirection() != null || target.isEnd() || featuringType == null ||
                featuringType instanceof AttributeDefinition || featuringType instanceof AttributeUsage) {
			target.setIsComposite(false);
		}
	}

	@Override
	protected void setIsVariableIfConstant() {
	}
}
