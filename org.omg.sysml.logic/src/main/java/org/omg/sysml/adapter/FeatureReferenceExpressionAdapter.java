/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2022, 2026 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ElementFilterMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.TypeUtil;

public class FeatureReferenceExpressionAdapter extends ExpressionAdapter {

	public FeatureReferenceExpressionAdapter(FeatureReferenceExpression element) {
		super(element);
	}
	
	@Override
	public FeatureReferenceExpression getTarget() {
		return (FeatureReferenceExpression)super.getTarget();
	}
	
	// Caching
	
	private Feature selfReferenceFeature = null;
	
	public Feature getSelfReferenceFeature() {
		if (selfReferenceFeature == null) {
			selfReferenceFeature = ExpressionUtil.getSelfReferenceFeature(getTarget());
		}
		return selfReferenceFeature;
	}
	
	// Transformation
	
	protected boolean isInFilterExpression() {
		Expression root = ExpressionUtil.getRootExpressionFor(getTarget());
		return root.getOwningMembership() instanceof ElementFilterMembership;
	}
	
	/**
	 * @satisfies checkFeatureReferenceExpressionBindingConnector
	 */
	protected void addReferenceConnector() {
		FeatureReferenceExpression target = getTarget();
		Feature referent = target.getReferent();
		Feature result = target.getResult();
		if (referent != null && result != null) {
			addBindingConnector(referent, result);
		}
	}
	
	/**
	 * @satisfies checkFeatureFeatureReferenceResultSpecialization
	 */
	protected void addResultSubsetting() {
		FeatureReferenceExpression expression = getTarget();
		Feature result = expression.getResult();
		// Note: Use getReferentFor here to avoid "self reference" default.
		Element referent = ExpressionUtil.getReferentFor(expression);
		if (result != null && referent instanceof Feature) {
			TypeUtil.addImplicitGeneralTypeTo(result,
					SysMLPackage.eINSTANCE.getSubsetting(), (Feature)referent);
		}
	}
	
	@Override
	public void addAdditionalMembers() {
		TypeUtil.addResultParameterTo(getTarget());
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		//checkFeatureReferenceExpressionBindingConnector
		addReferenceConnector();
		// Add subsetting in order to inherit typing of referent.
		addResultSubsetting();
	}
	
}
