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

import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

public class UsageTransformer extends FeatureTransformer {

	public UsageTransformer(Usage element) {
		super(element);
	}
	
	@Override
	public Usage getElement() {
		return (Usage)super.getElement();
	}
	
	/**
	 * Return the relevant subject parameter to which a Usage should be bound.
	 */
	public Feature getRelevantSubjectParameterFor(Usage usage) {
		Type owningType = usage.getOwningType();		
		return !(owningType instanceof Usage) || owningType.isAbstract() || 
			   !TransformerUtil.hasRelevantSubjectParameter((Usage)owningType)? null:
			   TransformerUtil.getSubjectParameterOf(((Usage)owningType).getOwningType());
	}
	
	@Override
	public void computeValueConnector() {
		Usage usage = getElement();
		FeatureValue valuation = TransformerUtil.getValuationFor(usage);
		if (valuation == null && TransformerUtil.isSubjectParameter(usage)){
			Feature subjectParameter = getRelevantSubjectParameterFor(usage);
			if (subjectParameter != null) {
				TransformerUtil.addBindingConnectorTo(usage, subjectParameter, usage);
			}
		} else {
			super.computeValueConnector();
		}
	}
	
	public static void computeSubjectParameterOf(Type type) {
		if (type != null && 
			type.getOwnedMembership().stream().noneMatch(SubjectMembership.class::isInstance)) {
			Usage parameter = SysMLFactory.eINSTANCE.createReferenceUsage();
			SubjectMembership membership = SysMLFactory.eINSTANCE.createSubjectMembership();
			membership.setOwnedSubjectParameter_comp(parameter);
			type.getOwnedFeatureMembership_comp().add(membership);
		}
	}
	
	protected void addVariationTyping() {
		Usage usage = getElement();
		Definition variationDefinition = TransformerUtil.getOwningVariationDefinitionFor(usage);
		if (variationDefinition != null && TransformerUtil.isVariant(usage)) {
			TransformerUtil.addGeneralTypeTo(usage, SysMLPackage.eINSTANCE.getFeatureTyping(), variationDefinition);
		}		
	}
	
	@Override
	public void transform() {		
		addVariationTyping();
		super.transform();
	}
	
}
