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

import java.util.List
import org.eclipse.xtext.validation.Check
import org.omg.sysml.lang.sysml.Type
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Connector
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.BindingConnector
import org.omg.sysml.lang.sysml.Feature
import org.omg.sysml.lang.sysml.impl.FeatureImpl
import org.omg.sysml.lang.sysml.InvocationExpression
import org.omg.sysml.lang.sysml.impl.InvocationExpressionImpl
import org.omg.sysml.lang.sysml.Relationship
import org.omg.sysml.lang.sysml.impl.TypeImpl
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.FeatureReferenceExpression
import org.omg.sysml.lang.sysml.LiteralExpression
import org.omg.sysml.lang.sysml.NullExpression
import org.omg.sysml.lang.sysml.impl.MembershipImpl
import org.omg.sysml.lang.sysml.impl.ElementImpl

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class KerMLValidator extends AbstractKerMLValidator {

	public static val INVALID_CONNECTOR_END__CONTEXT = 'Invalid Connector - Connector context'
	public static val INVALID_CONNECTOR_END__CONTEXT_MSG = "Connected features should have a common context"
	public static val INVALID_BINDINGCONNECTOR__ARGUMENT_TYPE = 'Invalid BindingConnector - Argument type conformance'
	public static val INVALID_BINDINGCONNECTOR__ARGUMENT_TYPE_MSG = "Output feature must conform to input feature"
	public static val INVALID_BINDINGCONNECTOR__BINDING_TYPE = 'Invalid BindingConnector - Binding type conformance'
	public static val INVALID_BINDINGCONNECTOR__BINDING_TYPE_MSG = "Bound features should have conforming types"
	public static val INVALID_FEATURE_NO_TYPE = 'Invalid Feature - Mandatory typing'
	public static val INVALID_FEATURE_NO_TYPE_MSG = "Features must have at least one type"
	public static val INVALID_RELATIONSHIP_RELATEDELEMENTS = 'Invalid Relationship - Related element minimum validation'
	public static val INVALID_RELATIONSHIP_RELATEDELEMENTS_MSG = "Relationships must have at least two related elements"
	public static val INVALID_MEMBERSHIP__DISTINGUISHABILITY = "Invalid Membership - Distinguishablity"
	public static val INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_0 = "Duplicate of owned member ID"
	public static val INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_1 = "Duplicate owned member name"
	public static val INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_2 = "Duplicate of inherited member name"
	public static val INVALID_ELEMENT__ID_DISTINGUISHABILITY = "Invalid Element - ID distinguishability"
	public static val INVALID_ELEMENT__ID_DISTINGUISHABILITY_MSG = "Duplicate of other ID or member name"
		
	@Check
	def checkElement(Element elm) {
		if (elm.humanId !== null) {
			val owner = elm.owner;
			if (owner !== null) {
				for (e: owner.ownedElement) {
					if (e != elm) {
						if (elm.humanId == e.humanId || elm.humanId == (e as ElementImpl).effectiveName) {
							warning(INVALID_ELEMENT__ID_DISTINGUISHABILITY_MSG, elm, SysMLPackage.eINSTANCE.element_HumanId, INVALID_ELEMENT__ID_DISTINGUISHABILITY)							
						}						
					}
				}
			}
		}
	}
	
	@Check
	def checkMembership(Membership mem){
		val pack = mem.membershipOwningPackage;	
		// Do not check distinguishability for automatically constructed expressions and binding connectors (to improve performance).
		if (!(pack instanceof InvocationExpression || pack instanceof FeatureReferenceExpression || pack instanceof LiteralExpression || pack instanceof NullExpression ||
			  pack instanceof BindingConnector)) {
			for (e : pack.ownedElement) {
				if (mem.memberElement !== e && e.humanId !== null && (mem as MembershipImpl).memberEffectiveName == e.humanId) {
					if (mem.ownedMemberElement !== null) {
						warning(INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_0, mem.ownedMemberElement, SysMLPackage.eINSTANCE.element_Name, INVALID_MEMBERSHIP__DISTINGUISHABILITY)
					} else {
						warning(INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_0, mem, SysMLPackage.eINSTANCE.membership_MemberName, INVALID_MEMBERSHIP__DISTINGUISHABILITY)
					}
				}
			}
			for (m: pack.ownedMembership) {
				if (m.memberElement !== mem.memberElement && !mem.isDistinguishableFrom(m)) {
					if (mem.ownedMemberElement !== null) {
						warning(INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_1, mem.ownedMemberElement, SysMLPackage.eINSTANCE.element_Name, INVALID_MEMBERSHIP__DISTINGUISHABILITY)
					} else {
						warning(INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_1, mem, SysMLPackage.eINSTANCE.membership_MemberName, INVALID_MEMBERSHIP__DISTINGUISHABILITY)
					}
				}
						
			}
			if (pack instanceof Type){
				for (m : pack.inheritedMembership) {
					if (m.memberElement !== mem.memberElement && !mem.isDistinguishableFrom(m)){
						if (mem.ownedMemberElement !== null) {
							warning(INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_2, mem.ownedMemberElement, SysMLPackage.eINSTANCE.element_Name, INVALID_MEMBERSHIP__DISTINGUISHABILITY)
						} else {
							warning(INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_2, mem, SysMLPackage.eINSTANCE.membership_MemberName, INVALID_MEMBERSHIP__DISTINGUISHABILITY)
						}
					}
				}
			}
		}
		
	}	
	
	@Check
	def checkFeature(Feature f){
		val types = (f as FeatureImpl).type;
		if (types !== null && types.isEmpty)
			error(INVALID_FEATURE_NO_TYPE_MSG, f, SysMLPackage.eINSTANCE.feature_Type, INVALID_FEATURE_NO_TYPE)
	}
	
	@Check
	def checkRelationship(Relationship r){
		// Allow abstract associations and connectors to have less than two ends.
		if (!(r instanceof Type && (r as Type).isAbstract)) {
			val relatedElements = r.getRelatedElement
			if ( relatedElements !== null && relatedElements.length < 2)
				error(INVALID_RELATIONSHIP_RELATEDELEMENTS_MSG, r, SysMLPackage.eINSTANCE.relationship_RelatedElement, INVALID_RELATIONSHIP_RELATEDELEMENTS)	
		}
	}
	
	@Check
	def checkInvocationExpression(InvocationExpression e) {
		// If an invocation expression already has instantiated argument connectors, then these will be
		// validated as existing model content. Otherwise, create and validate the argument connectors.
		if ((e as InvocationExpressionImpl).basicGetArgumentConnectors() === null) {
			(e as InvocationExpressionImpl).getArgumentConnectors().forEach[checkBindingConnector]
		}
	}
	 
	@Check
	def checkConnector(Connector c){
		var relatedFeatures = c.relatedFeature
		
		// Allow related features that are inherited by the owner of the connector
		// (or have no featuring types and are thus implicitly inherited from Anything).
		val cOwner = c.owner
		if (cOwner instanceof Type) {
			val ownerFeatures = cOwner.inheritedFeature
			relatedFeatures.removeIf[f|f.featuringType.empty || ownerFeatures.contains(f)]
		}
		
		val featuringTypes = c.featuringType
		for (relatedFeature: relatedFeatures) {
			if (!(featuringTypes.isEmpty? relatedFeature.isFeaturedWithin(null):
				featuringTypes.exists[featuringType | relatedFeature.isFeaturedWithin(featuringType)])) {
				warning(INVALID_CONNECTOR_END__CONTEXT_MSG, c, SysMLPackage.eINSTANCE.connector_ConnectorEnd, INVALID_CONNECTOR_END__CONTEXT)
				return
			}
		}
	}
	
	@Check
	def checkBindingConnector(BindingConnector bc){
		val rf = bc.relatedFeature
		if (rf.length !== 2) {
			return //ignore binding connectors with invalid syntax
		}
		
//		val inFeature = rf.map[owningFeatureMembership].filter[m|m !== null && m.direction == FeatureDirectionKind.IN].map[ownedMemberFeature_comp].findFirst[true]
//		val outFeature = rf.map[owningFeatureMembership].filter[m|m !== null && m.direction == FeatureDirectionKind.OUT].map[ownedMemberFeature_comp].findFirst[true]
//		
//		if (inFeature !== null && outFeature !== null){
//			//Argument type conformance
//			val inTypes = inFeature.type
//			val outTypes = outFeature.type
//			val outConformsToIn = inTypes.map[conformsFrom(outTypes)]
//			if (outConformsToIn.filter[!empty].length != inTypes.length)		
//				error(INVALID_BINDINGCONNECTOR__ARGUMENT_TYPE_MSG, bc, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDINGCONNECTOR__ARGUMENT_TYPE)
//		} else { 
			//Binding type conformance
			val f1types = (rf.get(0) as FeatureImpl).type
			val f2types = (rf.get(1) as FeatureImpl).type
						 
			val f1ConformsTof2 = f2types.map[conformsFrom(f1types)]
			val f2ConformsTof1 = f1types.map[conformsFrom(f2types)]
			
			if (f1ConformsTof2.filter[!empty].length != f2types.length &&
				f2ConformsTof1.filter[!empty].length != f1types.length)
				warning(INVALID_BINDINGCONNECTOR__BINDING_TYPE_MSG, bc, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDINGCONNECTOR__BINDING_TYPE)
//		}
	}
	
	//return related subtypes
	protected def Iterable<Type> conformsFrom(Type supertype, List<Type> subtypes) 
	{
		subtypes.filter[subtype|subtype.conformsTo(supertype)]
	}
	
	//return related supertypes
    protected def Iterable<Type> conformsTo(Type subtype, List<Type> supertypes) 
	{
		supertypes.filter[supertype|subtype.conformsTo(supertype)]
	}

	protected def boolean conformsTo(Type subtype, Type supertype) {
		supertype === null || (subtype as TypeImpl).conformsTo(supertype);
	}
	
}
