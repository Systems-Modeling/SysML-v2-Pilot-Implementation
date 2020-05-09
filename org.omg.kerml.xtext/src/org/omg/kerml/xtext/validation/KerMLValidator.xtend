/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018-2020 Model Driven Solutions, Inc.
 * Copyright (c) 2020 California Institute of Technology/Jet Propulsion Laboratory
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Zoltan Kiss, IncQuery
 *  Balazs Grill, IncQuery
 *  Ed Seidewitz, MDS
 *  Miyako Wilson, JPL
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.validation

import org.omg.sysml.lang.sysml.Type
import java.util.Set
import org.eclipse.xtext.validation.Check
import org.eclipse.emf.common.util.EList
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Connector
import java.util.List
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.BindingConnector
import org.omg.sysml.lang.sysml.FeatureDirectionKind
import org.omg.sysml.lang.sysml.Feature
import org.omg.sysml.lang.sysml.impl.FeatureImpl
import org.omg.sysml.lang.sysml.InvocationExpression
import org.omg.sysml.lang.sysml.impl.InvocationExpressionImpl

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class KerMLValidator extends AbstractKerMLValidator {

	public static val INVALID_CONNECTOR_END__CONTEXT = 'Invalid Connector - Connector context'
	public static val INVALID_BINDINGCONNECTOR__ARGUMENT_TYPE = 'Invalid BindingConnector - Argument type conformance'
	public static val INVALID_BINDINGCONNECTOR__BINDING_TYPE = 'Invalid BindingConnector - Binding type conformance'
	
	@Check
	def checkInvocationExpression(InvocationExpression e) {
		(e as InvocationExpressionImpl).getArgumentConnectors().forEach[checkBindingConnector]
	}
	 
	@Check
	def checkConnector(Connector c){
		var relatedFeatures = c.relatedFeature
		
		// Allow related features that are inherited by the owner of the connector
		val cOwner = c.owner
		if (cOwner instanceof Type) {
			val ownerFeatures = cOwner.inheritedFeature
			relatedFeatures.removeIf[f|ownerFeatures.contains(f)]
		}
		
		val cPath = c.getFeatureMembershipPath;
		val relatedFeaturesPath = relatedFeatures.map[getFeatureMembershipPath]
		relatedFeaturesPath.forEach[s|cPath.retainAll(s)]
		if (cPath.empty) //no common Types
			error("A connector and its related features must have a common context", c, SysMLPackage.eINSTANCE.connector_ConnectorEnd, INVALID_CONNECTOR_END__CONTEXT)
	}
	
	//return features's owners up to and including the first one that is not a Feature and an owningType
	protected def List<Element> getFeatureMembershipPath(Feature f){
		val ownerList = newArrayList
 		var owner = f.owner
 		var owningType = f.owningType
		while(owner instanceof Feature && owner === owningType) {			
			ownerList.add(owner)
			owningType = (owner as Feature).owningType
			owner = owner.owner
		}
		if (owner !== null) {
			ownerList.add(owner)
		}
		return ownerList
	}
	
	@Check
	def checkBindingConnector(BindingConnector bc){
		val rf = bc.relatedFeature
		if (rf.length !== 2) {
			return //ignore binding connectors with invalid syntax
		}
		
		val inFeature = rf.map[owningFeatureMembership].filter[direction == FeatureDirectionKind.IN].map[ownedMemberFeature_comp].findFirst[true]
		val outFeature = rf.map[owningFeatureMembership].filter[direction == FeatureDirectionKind.OUT].map[ownedMemberFeature_comp].findFirst[true]
		
		if (// TEMP: Do not check argument type conformance for feature value connectors.
			!(bc.owner instanceof Feature && (bc.owner as FeatureImpl).valueConnector === bc) &&
			
			inFeature !== null && outFeature !== null){
			//Argument type conformance
			val inTypes = inFeature.type
			val outTypes = outFeature.type
			val outConformsToIn = inTypes.map[conformsFrom(outTypes)]
			if (outConformsToIn.filter[!empty].length != inTypes.length)		
				error("Output feature must conform to input feature", bc, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDINGCONNECTOR__ARGUMENT_TYPE)
		}
		else { 
			//Binding type conformance
			val f1types = rf.get(0).type
			val f2types = rf.get(1).type
			
			val f1ConformsTof2 = f2types.map[conformsFrom(f1types)]
			val f2ConformsTof1 = f1types.map[conformsFrom(f2types)]
			
			if (f1ConformsTof2.filter[!empty].length != f2types.length &&
				f2ConformsTof1.filter[!empty].length != f1types.length)
				error("Binding connector ends must have conforming types", bc, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDINGCONNECTOR__BINDING_TYPE)
		}
	}
	
	//return related subtypes
	protected def Iterable<Type> conformsFrom(Type supertype, EList<Type> subtypes) 
	{
		subtypes.filter[subtype|subtype.conformsTo(supertype)]
	}
	
	//return related supertypes
    protected def Iterable<Type> conformsTo(Type subtype, EList<Type> supertypes) 
	{
		supertypes.filter[supertype|subtype.conformsTo(supertype)]
	}

	protected def boolean conformsTo(Type subtype, Type supertype) {
		subtype.conformsTo(supertype, newHashSet);
	}
	
	// Note: Generalizations are allowed to be cyclic.
	protected def boolean conformsTo(Type subtype, Type supertype, Set<Type> visited) {
		if (supertype === null || subtype === supertype) {
			true
		} else {
			visited.add(subtype)
			if (subtype.isConjugated) {
				var originalType = subtype.ownedConjugator.originalType	
				!visited.contains(originalType) && originalType.conformsTo(supertype)
			} else {
				subtype.ownedGeneralization.exists[!visited.contains(general) && general.conformsTo(supertype, visited)]
			}
		}
	}
	

}
