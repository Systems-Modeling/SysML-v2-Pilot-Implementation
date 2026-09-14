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
package org.omg.sysml.xtext.postprocessing;

import org.omg.sysml.lang.sysml.ConnectionUsage;

public class ConnectionUsageParserPostProcessor extends PartUsageParserPostProcessor {

	public ConnectionUsageParserPostProcessor(ConnectionUsage element) {
		super(element);
	}

	@Override
	public ConnectionUsage getTarget() {
		return (ConnectionUsage)super.getTarget();
	}
}
