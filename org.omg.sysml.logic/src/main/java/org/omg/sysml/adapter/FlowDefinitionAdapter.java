/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 * 
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 */

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.FlowDefinition;

public class FlowDefinitionAdapter extends ActionDefinitionAdapter {

	public FlowDefinitionAdapter(FlowDefinition element) {
		super(element);
	}
	
	@Override
	public FlowDefinition getTarget() {
		return (FlowDefinition)super.getTarget();
	}
	
	/**
	 * @satisfies checkFlowDefinitionBinarySpecialization
	 * @satisfies checkFlowDefinitionSpecialization
	 */
	// From AssociationAdapter
	@Override
	protected String getDefaultSupertype() {
		return getTarget().getOwnedEndFeature().size() != 2 ? 
				getDefaultSupertype("base") :
				getDefaultSupertype("binary");
	}

}
