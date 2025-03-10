/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2025 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.TypeUtil;

public class InvocationExpressionAdapter extends ExpressionAdapter {

	public InvocationExpressionAdapter(InvocationExpression element) {
		super(element);
	}
	
	@Override
	public InvocationExpression getTarget() {
		return (InvocationExpression)super.getTarget();
	}
	
	// Transformation
	
	protected void createSelfResultConnector() {
		InvocationExpression target = getTarget();
		Type instantiatedType = target.getInstantiatedType();
		if (instantiatedType != null && 
				!(instantiatedType instanceof Function || instantiatedType instanceof Expression)) {
			Feature result = TypeUtil.getResultParameterOf(getTarget());
			if (result != null) {
				addBindingConnector(getTarget(), result);
			}
		}		
	}
	
	protected void addResultTyping() {
		InvocationExpression target = getTarget();
		Type instantiatedType = target.getInstantiatedType();
		if (instantiatedType != null && 
				!(instantiatedType instanceof Function || instantiatedType instanceof Expression)) {
			Feature result = TypeUtil.getResultParameterOf(getTarget());
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
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		createSelfResultConnector();
		addResultTyping();
	}
	
}
