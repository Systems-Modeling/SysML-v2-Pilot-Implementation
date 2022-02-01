/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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

import java.util.Collections;

import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TriggerInvocationExpression;
import org.omg.sysml.lang.sysml.TriggerKind;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.TypeUtil;

public class TriggerInvocationExpressionAdapter extends InvocationExpressionAdapter {

	public TriggerInvocationExpressionAdapter(TriggerInvocationExpression element) {
		super(element);
	}
	
	@Override
	public TriggerInvocationExpression getTarget() {
		return (TriggerInvocationExpression)super.getTarget();
	}
	
	@Override
	public void computeImplicitGeneralTypes() {
		TriggerInvocationExpression target = getTarget();
		TriggerKind kind = target.getKind();
		if (kind != null) {
			addDefaultGeneralType(SysMLPackage.eINSTANCE.getFeatureTyping(), 
					ImplicitGeneralizationMap.getDefaultSupertypeFor(target.getClass(), kind.toString()));
		}
		super.computeImplicitGeneralTypes();
	}
	
	public void addReceiverBinding() {
		TriggerInvocationExpression target = getTarget();
		Feature receiverParameter = TypeUtil.getOwnedParameterOf(target, 1, Feature.class);
		if (receiverParameter != null) {
			target.getFeaturingType().stream().filter(AcceptActionUsage.class::isInstance).forEach(action -> {
				Feature actionParameter = TypeUtil.getOwnedParameterOf(action, 1, Feature.class);
				addBindingConnector(Collections.singletonList(action), actionParameter, receiverParameter);
			});
		}
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		addReceiverBinding();
	}

}
