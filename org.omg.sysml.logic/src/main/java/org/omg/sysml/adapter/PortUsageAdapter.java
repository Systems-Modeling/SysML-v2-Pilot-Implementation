/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2022, 2025, 2026 Model Driven Solutions, Inc.
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

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.UsageUtil;

public class PortUsageAdapter extends UsageAdapter {

	public PortUsageAdapter(PortUsage element) {
		super(element);
	}
	
	public PortUsage getTarget() {
		return (PortUsage)super.getTarget();
	}
	
	/**
	 * @satisfies validatePortUsageIsReference
	 */
	public void postProcess() {
		super.postProcess();
		PortUsage target = getTarget();
		EObject featuringType = UsageUtil.getExpectedFeaturingTypeOf(target);
		if (!(featuringType instanceof PortDefinition || featuringType instanceof PortUsage)) {
			target.setIsComposite(false);
		}
	}
	
	// Implicit Generalization
	
	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		if (isStructureOwnedComposite()) {
			addDefaultGeneralType("subobject");
		}
	}
	
	/**
	 * @satisfies checkPortUsageOwnedPortSpecialization
	 * @satisfies checkPortUsageSubportSpecialization
	 * @satisfies checkPortUsageSpecialization
	 */
	@Override
	protected String getDefaultSupertype() {
		return isOwnedPort()?
					getDefaultSupertype("ownedPort"):
			   isSubport()?
					getDefaultSupertype("subport"):
					getDefaultSupertype("base");
	}
	
	public boolean isOwnedPort() {
		PortUsage target = getTarget();
		Type owningType = target.getOwningType();
		return owningType instanceof PartDefinition || owningType instanceof PartUsage;		
	}
	
	public boolean isSubport() {
		PortUsage target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() && (owningType instanceof PortDefinition || owningType instanceof PortUsage);
	}
	
	// Transformation
	
	@Override
	protected boolean isAddMultiplicity() {
		return isAddDefaultMultiplicity();
	}
	
}
