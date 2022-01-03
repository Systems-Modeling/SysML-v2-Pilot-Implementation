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

package org.omg.sysml.adapter;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.PathStepExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.TypeUtil;

public class PathStepExpressionAdapter extends OperatorExpressionAdapter {

	public PathStepExpressionAdapter(PathStepExpression element) {
		super(element);
	}
	
	@Override
	public PathStepExpression getTarget() {
		return (PathStepExpression)super.getTarget();
	}

	@Override
	protected void addResultTyping() {
		PathStepExpression target = getTarget();
		EList<Feature> ownedFeatures = target.getOwnedFeature();
		if (ownedFeatures.size() > 1) {
			Feature featureReference = ownedFeatures.get(1);
			if (featureReference instanceof Expression) {
				ElementUtil.transform(featureReference);
				TypeUtil.addImplicitGeneralTypeTo(target.getResult(),
						SysMLPackage.eINSTANCE.getSubsetting(), ((Expression)featureReference).getResult());
			}
		}
	}
	
}
