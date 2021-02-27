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

import org.omg.sysml.lang.sysml.CalculationDefinition;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.CalculationDefinitionImpl;
import org.omg.sysml.util.ElementUtil;

public class CalculationDefinitionTransformer extends ActionDefinitionTransformer {

	public CalculationDefinitionTransformer(CalculationDefinition element) {
		super(element);
	}
	
	public CalculationDefinition getElement() {
		return (CalculationDefinition)super.getElement();
	}
	
	public static void addResultParameter(Type type) {
		if (type.getOwnedFeatureMembership().stream().noneMatch(ReturnParameterMembership.class::isInstance)) {
			ReturnParameterMembership membership = SysMLFactory.eINSTANCE.createReturnParameterMembership();
			Feature resultParameter = SysMLFactory.eINSTANCE.createReferenceUsage();
			membership.setOwnedMemberParameter_comp(resultParameter);
			type.getOwnedFeatureMembership_comp().add(membership);
			ElementUtil.transform(resultParameter);
		}
	}
	
	@Override
	public void transform() {
		CalculationDefinitionImpl definition = (CalculationDefinitionImpl)getElement();
		super.transform();
		addResultParameter(definition);
		definition.setResultConnector(
				ExpressionTransformer.getOrCreateResultConnectorFor(
						definition, definition.getResultConnector(), definition.getResult()));
	}
}
