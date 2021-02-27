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

import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.impl.ExpressionImpl;
import org.omg.sysml.lang.sysml.impl.TypeImpl;

public class ExpressionTransformer extends StepTransformer {

	public ExpressionTransformer(Expression element) {
		super(element);
	}
	
	@Override
	public Expression getElement() {
		return (Expression)super.getElement();
	}

	public static BindingConnector getOrCreateResultConnectorFor(
		TypeImpl type, BindingConnector resultConnector, Feature result) {
		if (resultConnector == null) {
			Expression resultExpression = 
					(Expression)type.getOwnedFeatureByMembership(ResultExpressionMembership.class);
			if (resultExpression != null) {
				resultConnector = type.makeResultBinding(resultExpression, result);
			}
		}
		return resultConnector;
	}

	protected Feature createFeatureForParameter(Feature parameter) {
		if (parameter == null) {
			return null;
		} else {
			ExpressionImpl expression = (ExpressionImpl)getElement();
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
		ExpressionImpl expression = (ExpressionImpl)getElement();
		if (expression.getInput().isEmpty()) {
			for (Feature parameter: expression.getTypeParameters()) {
				createFeatureForParameter(parameter);
			}
		}
	}
	
	protected void computeOutput() {
		ExpressionImpl expression = (ExpressionImpl)getElement();
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
		ExpressionImpl expression = (ExpressionImpl)getElement();
		super.transform();
		if (expression.getOwningNamespace() instanceof Multiplicity || 
				expression.getOwningMembership() instanceof FeatureValue) {
			addImplicitFeaturingTypes();
		}
		computeInput();
		computeOutput();
	}
		
}
