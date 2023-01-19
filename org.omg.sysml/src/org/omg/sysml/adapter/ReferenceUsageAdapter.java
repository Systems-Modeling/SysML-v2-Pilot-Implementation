/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.UsageUtil;

public class ReferenceUsageAdapter extends UsageAdapter {

	public static final String TRANSITION_LINK_FEATURE = "TransitionPerformances::TransitionPerformance::transitionLink";

	public ReferenceUsageAdapter(ReferenceUsage element) {
		super(element);
	}
	
	@Override
	public ReferenceUsage getTarget() {
		return (ReferenceUsage)super.getTarget();
	}
	
	// Implicit Generalization
	
	@Override
	public void addDefaultGeneralType() {
		ReferenceUsage target = getTarget();
		Type type = target.getOwningType();
		if ((type instanceof TransitionUsage) && target == UsageUtil.getPayloadParameterOf((TransitionUsage)type)) {
			Feature accepterParameter = UsageUtil.getAccepterPayloadParameterOf((TransitionUsage)type);
			if (accepterParameter != null) {
				addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), accepterParameter);
				target.setDeclaredName(accepterParameter.getDeclaredName());
				return;
			}
		}
		super.addDefaultGeneralType();
	}
	
	// Computed Redefinitions
	
	@Override
	protected void addRedefinitions(Element skip) {
		ReferenceUsage target = getTarget();
		Type type = target.getOwningType();
		if ((type instanceof TransitionUsage) && target == UsageUtil.getTransitionLinkFeatureOf((TransitionUsage)type)) {
			addImplicitGeneralType(SysMLPackage.eINSTANCE.getRedefinition(), 
					(Feature)SysMLLibraryUtil.getLibraryType(getTarget(), TRANSITION_LINK_FEATURE));
		} else {
			super.addRedefinitions(skip);
		}
	}
	
}
