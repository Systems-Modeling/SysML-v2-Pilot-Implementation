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
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TransformationUtil;

public class TypeTransformer extends NamespaceTransformer {

	public TypeTransformer(Type element) {
		super(element);
	}
	
	public Type getElement() {
		return (Type)super.getElement();
	}
	
	public void addResultParameter() {
		Type type = getElement();
		if (type.getOwnedFeatureMembership().stream().noneMatch(ReturnParameterMembership.class::isInstance)) {
			ReturnParameterMembership membership = SysMLFactory.eINSTANCE.createReturnParameterMembership();
			Feature resultParameter = SysMLFactory.eINSTANCE.createReferenceUsage();
			membership.setOwnedMemberParameter_comp(resultParameter);
			type.getOwnedFeatureMembership_comp().add(membership);
			ElementUtil.transform(resultParameter);
		}
	}
	
	public void createResultConnector(Feature result) {
		Type type = getElement();
		Expression resultExpression = 
				(Expression)TransformationUtil.getOwnedFeatureByMembershipIn(type, ResultExpressionMembership.class);
		if (resultExpression != null) {
			TransformationUtil.addResultBindingTo(type, resultExpression, result);
		}
	}

	@Override
	public void transform() {
		super.transform();
		TransformationUtil.computeImplicitGeneralTypesFor(getElement());
	}
	
}
