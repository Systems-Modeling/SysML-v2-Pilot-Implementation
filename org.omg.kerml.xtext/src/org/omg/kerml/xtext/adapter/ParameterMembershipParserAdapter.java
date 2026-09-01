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

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ParameterMembership;

public class ParameterMembershipParserAdapter extends MembershipParserAdapter {

	public ParameterMembershipParserAdapter(ParameterMembership element) {
		super(element);
	}

	@Override
	public ParameterMembership getTarget() {
		return (ParameterMembership)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		ParameterMembership target = getTarget();
		Feature parameter = target.getOwnedMemberParameter();
		if (parameter != null) {
			parameter.setDirection(target.parameterDirection());
		}
	}
}
