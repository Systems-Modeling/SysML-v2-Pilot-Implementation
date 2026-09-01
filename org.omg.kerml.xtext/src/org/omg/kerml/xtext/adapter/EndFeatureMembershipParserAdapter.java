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

import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Feature;

public class EndFeatureMembershipParserAdapter extends MembershipParserAdapter {

	public EndFeatureMembershipParserAdapter(EndFeatureMembership element) {
		super(element);
	}

	@Override
	public EndFeatureMembership getTarget() {
		return (EndFeatureMembership)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		EndFeatureMembership target = getTarget();
		Feature endFeature = target.getOwnedMemberFeature();
		if (endFeature != null) {
			endFeature.setIsEnd(true);
		}
	}
}
