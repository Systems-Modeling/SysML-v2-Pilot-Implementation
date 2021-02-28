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

package org.omg.sysml.transform;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;

public class ExpressionTransformer extends StepTransformer {

	public ExpressionTransformer(Expression element) {
		super(element);
	}
	
	@Override
	public Expression getElement() {
		return (Expression)super.getElement();
	}

	protected Feature createFeatureForParameter(Feature parameter) {
		if (parameter == null) {
			return null;
		} else {
			Expression expression = getElement();
			Feature feature = SysMLFactory.eINSTANCE.createFeature();
			FeatureMembership membership = SysMLFactory.eINSTANCE.createParameterMembership();
			membership.setOwnedMemberFeature_comp(feature);
			membership.setMemberName("$" + parameter.getName());
			expression.getOwnedFeatureMembership_comp().add(membership);
			FeatureMembership parameterMembership = parameter.getOwningFeatureMembership();
			if (parameterMembership != null) {
				membership.setDirection(parameterMembership.getDirection());
			}			
			return feature;
		}
	}
	
	protected void computeInput() {
		Expression expression = getElement();
		if (expression.getInput().isEmpty()) {
			for (Feature parameter: TransformerUtil.getTypeParametersOf(expression)) {
				createFeatureForParameter(parameter);
			}
		}
	}
	
	protected void computeOutput() {
		Expression expression = getElement();
		if (expression.getOutput().isEmpty()) {
			Feature parameter = SysMLFactory.eINSTANCE.createFeature();
			ParameterMembership membership = SysMLFactory.eINSTANCE.createReturnParameterMembership();
			membership.setOwnedMemberParameter_comp(parameter);
			membership.setMemberName("$result");
			expression.getOwnedFeatureMembership_comp().add(membership);
		}		
	}
			
	@Override
	public void transform() {
		Expression expression = getElement();
		super.transform();
		if (expression.getOwningNamespace() instanceof Multiplicity || 
				expression.getOwningMembership() instanceof FeatureValue) {
			addImplicitFeaturingTypes();
		}
		computeInput();
		computeOutput();
	}
		
}
