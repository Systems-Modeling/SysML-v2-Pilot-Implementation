/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2023-2025 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PortionKind;

public class OccurrenceUsageAdapter extends UsageAdapter {

	public OccurrenceUsageAdapter(OccurrenceUsage element) {
		super(element);
	}
	
	@Override
	public OccurrenceUsage getTarget() {
		return (OccurrenceUsage)super.getTarget();
	}
	
	// Post-processing
	
	@Override
	public void postProcess() {
		super.postProcess();
		
		OccurrenceUsage self = getTarget();
		if (self.getPortionKind() != null) {
			self.setIsPortion(true);
		}
	}
	
	// Implicit Generalization
	
	/**
	 * @satisfies checkFeatureObjectSpecialization
	 * @satisfies checkFeatureSubobjectSpecialization
	 * @satisfies checkFeatureDataValueSpecialization
	 * @satisfies checkOccurrenceUsageSnapshotSpecialization
	 * @satisfies checkOccurrenceUsageSuboccurrenceSpecialization
	 * @satisfies checkOccurrenceUsageTimeSliceSpecialization
	 */
	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		if (hasDataType()) {
			addDefaultGeneralType("dataValue");
		}
		if (hasStructureType()) {
			addDefaultGeneralType(isSubobject()? "subobject": "object");
		}
		else if (isSuboccurrence()) {
			addDefaultGeneralType("suboccurrence");
		}
		PortionKind portionKind = getTarget().getPortionKind();
		if (portionKind  == PortionKind.SNAPSHOT) {
			addDefaultGeneralType("snapshot");
		} else if (portionKind == PortionKind.TIMESLICE) {
			addDefaultGeneralType("timeslice");
		}
	}
	
	@Override
	protected boolean isSuboccurrence() {
		OccurrenceUsage target = getTarget();
		return super.isSuboccurrence() ||
				target.isComposite() && 
			   	target.getOwningType() instanceof OccurrenceUsage;
	}
	
	/**
	 * @satisfies checkOccurrenceUsageSpecialization
	 */
	@Override
	protected String getDefaultSupertype() {
		return getDefaultSupertype("base");
	}
}
