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
import java.util.ArrayList

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
	def checkConnector(Connector c){
		val cowners = getOwnersWhoAreType(c, newArrayList);
		val relatedFeaturesOwners = c.getRelatedFeature().map[getOwnersWhoAreType(newArrayList)]
		relatedFeaturesOwners.forEach[s|cowners.retainAll(s)]
		if (cowners.empty) //no common Types
			error("A connector and its related features must have a common context", c, SysMLPackage.eINSTANCE.connector_ConnectorEnd, INVALID_CONNECTOR_END__CONTEXT)
	}
	
	//return element's owner up to (but not including) the first one that is not a Type
	protected def List<Type> getOwnersWhoAreType(Element e, List<Type> tlist){
 		var owner = e.getOwner()
		while(owner instanceof Type && !tlist.contains(owner) ){
			tlist.add(owner as Type)
			owner = owner.getOwner
		}
		return tlist
	}
	
	@Check
	def checkBindingConnector(BindingConnector bc){
		val rf = bc.relatedFeature
		if (rf.length !== 2) 
			return //ignore i.e.,) "bind a to b" which with invalid syntax but picked up there

		val inFeature = rf.map[owningFeatureMembership].filter[direction == FeatureDirectionKind.IN].map[ownedMemberFeature_comp].findFirst[true]
		val outFeature = rf.map[owningFeatureMembership].filter[direction == FeatureDirectionKind.OUT].map[ownedMemberFeature_comp].findFirst[true]
		
		//Argument type conformance
		if (inFeature !== null && outFeature !== null){
			val outComformsToIn = inFeature.type.map[conformsFrom(outFeature.type)]
			if (outComformsToIn.filter[!empty].length != inFeature.type.length)		
				error("Output feature must conform to input feature", bc, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDINGCONNECTOR__ARGUMENT_TYPE)
		}
		else { //Binding type conformance
			val f1types = rf.get(0).type
			val f2types = rf.get(1).type
			var usedSupertypes = f1types.map[conformsTo(f2types)]
			
			val f2typesFiltered = new ArrayList(f2types) // Create a new list to avoid a possible exception when "removeAll" is used
			f2typesFiltered.removeAll(usedSupertypes.flatten) // Filter f1 supertypes from f2 types
			
			// for f1
			for(var i = 0; i < usedSupertypes.length; i++){
				if (usedSupertypes.get(i).empty) {//no supertype found
					//check its subtypes
					var usedSubtypes = f1types.get(i).conformsFrom(f2types)
					if (usedSubtypes.empty) {
						error("Binding connector ends must have conforming types", bc, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDINGCONNECTOR__BINDING_TYPE)
						return
					}
					else
						f2typesFiltered.removeAll(usedSubtypes) // Filter f1 subtypes from f2 types
				}
			}
			
			// for f2
			usedSupertypes = f2typesFiltered.map[conformsTo(f1types)]
			for(var i = 0; i < usedSupertypes.length; i++){
				if (usedSupertypes.get(i).empty) {//no supertype found
					//check its subtypes
					var usedSubtypes = f2typesFiltered.get(i).conformsFrom(f1types)
					if (usedSubtypes.empty) {
						error("Binding connector ends must have conforming types", bc, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDINGCONNECTOR__BINDING_TYPE)
						return
					}
				}
			}
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
