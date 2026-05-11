/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.ConstructorExpression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.TypeUtil;

public class ConstructorExpressionAdapter extends InstantiationExpressionAdapter {

	public ConstructorExpressionAdapter(ConstructorExpression element) {
		super(element);
	}
	
	@Override
	public ConstructorExpression getTarget() {
		return (ConstructorExpression)super.getTarget();
	}
		
	// Transformation
	
	/**
	 * @satisifies checkConstructorExpressionResultSpecialization
	 */
	protected void addResultTyping() {
		ConstructorExpression target = getTarget();
		Type instantiatedType = target.getInstantiatedType();
		if (instantiatedType != null) {
			Feature result = TypeUtil.getOwnedResultParameterOf(target);
			if (result != null) {
				if (instantiatedType instanceof Feature) {
					TypeUtil.addImplicitGeneralTypeTo(result, SysMLPackage.eINSTANCE.getSubsetting(), instantiatedType);
				} else {
					TypeUtil.addImplicitGeneralTypeTo(result, SysMLPackage.eINSTANCE.getFeatureTyping(), instantiatedType);
				}
			}
		}
	}
		
	@Override
	public void addAdditionalMembers() {
		TypeUtil.addResultParameterTo(getTarget());
		addResultTyping();
	}
	
}
