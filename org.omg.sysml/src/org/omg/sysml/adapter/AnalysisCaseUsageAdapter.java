/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2023 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.AnalysisCaseDefinition;
import org.omg.sysml.lang.sysml.AnalysisCaseUsage;
import org.omg.sysml.lang.sysml.Type;

public class AnalysisCaseUsageAdapter extends CaseUsageAdapter {

	public AnalysisCaseUsageAdapter(AnalysisCaseUsage element) {
		super(element);
	}
	
	@Override
	public AnalysisCaseUsage getTarget() {
		return (AnalysisCaseUsage)super.getTarget();
	}
	
	@Override
	protected String getSubactionType() {
		return isSubAnalysisCase()? "subAnalysisCase": super.getSubactionType();	
	}
		
	public boolean isSubAnalysisCase() {
		Type owningType = getTarget().getOwningType();
		return isNonEntryExitComposite() &&
			   (owningType instanceof AnalysisCaseDefinition || owningType instanceof AnalysisCaseUsage);
	}
	
}
