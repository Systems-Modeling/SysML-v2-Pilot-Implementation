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

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.util.UsageUtil;

public class PortUsageParserAdapter extends UsageParserAdapter {

	public PortUsageParserAdapter(PortUsage element) {
		super(element);
	}

	@Override
	public PortUsage getTarget() {
		return (PortUsage)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		PortUsage target = getTarget();
		EObject featuringType = UsageUtil.getExpectedFeaturingTypeOf(target);
		if (!(featuringType instanceof PortDefinition || featuringType instanceof PortUsage)) {
			target.setIsComposite(false);
		}
	}
}
