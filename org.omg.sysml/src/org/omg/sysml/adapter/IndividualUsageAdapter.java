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

import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.IndividualDefinition;
import org.omg.sysml.lang.sysml.IndividualUsage;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

public class IndividualUsageAdapter extends ItemUsageAdapter {

	public IndividualUsageAdapter(IndividualUsage element) {
		super(element);
	}
	
	@Override
	public IndividualUsage getTarget() {
		return (IndividualUsage)super.getTarget();
	}

	protected boolean needsIndividualDefinition() {
		IndividualUsage target = getTarget();
		return target.getOwnedTyping().stream().map(FeatureTyping::getType).
					noneMatch(IndividualDefinition.class::isInstance) &&
			   target.getOwnedSubsetting().stream().map(Subsetting::getSubsettedFeature).
					noneMatch(IndividualUsage.class::isInstance);
	}
		
	protected void addIndividualDefinition() {
		IndividualUsage target = getTarget();
		if ((target.isTimeSlice() || target.isSnapshot()) && needsIndividualDefinition()) {
			Type owningType = target.getOwningType();
			if (owningType instanceof IndividualDefinition) {
				addImplicitGeneralType(SysMLPackage.eINSTANCE.getFeatureTyping(), owningType);
			} else if (owningType instanceof IndividualUsage) {
				addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), owningType);
			}
		}
	}
	
	@Override
	public void computeImplicitGeneralTypes() {
		addIndividualDefinition();
		super.computeImplicitGeneralTypes();
	}
	
}
