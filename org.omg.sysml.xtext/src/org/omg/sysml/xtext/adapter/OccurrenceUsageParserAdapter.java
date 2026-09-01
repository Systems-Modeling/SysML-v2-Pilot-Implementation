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

import org.omg.sysml.lang.sysml.OccurrenceUsage;

public class OccurrenceUsageParserAdapter extends UsageParserAdapter {

	public OccurrenceUsageParserAdapter(OccurrenceUsage element) {
		super(element);
	}

	@Override
	public OccurrenceUsage getTarget() {
		return (OccurrenceUsage)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		
		OccurrenceUsage self = getTarget();
		if (self.getPortionKind() != null) {
			self.setIsPortion(true);
		}
	}
}
