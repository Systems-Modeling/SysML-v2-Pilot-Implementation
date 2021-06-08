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
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.TypeUtil;

public class OccurrenceUsageAdapter extends UsageAdapter {

	public OccurrenceUsageAdapter(OccurrenceUsage element) {
		super(element);
	}
	
	@Override
	public OccurrenceUsage getTarget() {
		return (OccurrenceUsage)super.getTarget();
	}

	protected boolean needsIndividualDefinition() {
		OccurrenceUsage target = getTarget();
		return target.isIndividual() &&
			   target.getOwnedTyping().stream().
			   		map(FeatureTyping::getType).
			   		noneMatch(TypeUtil::isIndividual) &&
			   target.getOwnedSubsetting().stream().
			   		map(Subsetting::getSubsettedFeature).
					noneMatch(TypeUtil::isIndividual);
	}
		
	protected void addIndividualDefinition() {
		OccurrenceUsage target = getTarget();
		if (target.getPortionKind() != null && needsIndividualDefinition()) {
			Type owningType = target.getOwningType();
			if (TypeUtil.isIndividual(owningType)) {
				addImplicitGeneralType(
						owningType instanceof OccurrenceUsage? 
								SysMLPackage.eINSTANCE.getSubsetting():
								SysMLPackage.eINSTANCE.getFeatureTyping(), 
						owningType);
			}
		}
	}
	
	@Override
	public void computeImplicitGeneralTypes() {
		addIndividualDefinition();
		super.computeImplicitGeneralTypes();
	}
	
}
