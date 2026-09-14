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

package org.omg.kerml.xtext.postprocessing;

import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.util.ElementUtil;

public class MembershipParserPostProcessor extends RelationshipParserPostProcessor {

	public MembershipParserPostProcessor(Membership element) {
		super(element);
	}

	@Override
	public Membership getTarget() {
		return (Membership)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		Membership target = getTarget();
		if (!(target instanceof OwningMembership)) {
			target.setMemberName(ElementUtil.unescapeString(target.getMemberName()));
			target.setMemberShortName(ElementUtil.unescapeString(target.getMemberShortName()));
		}
	}
}
