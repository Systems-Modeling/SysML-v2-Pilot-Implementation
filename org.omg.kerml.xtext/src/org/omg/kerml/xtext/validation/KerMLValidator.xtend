/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018, 2019 Model Driven Solutions, Inc.
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
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.validation

import org.omg.sysml.lang.sysml.Type
import java.util.Set
import org.eclipse.xtext.validation.Check
import org.eclipse.emf.common.util.EList
import java.util.stream.Collectors
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Connector
import java.util.List
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.BindingConnector
import org.omg.sysml.lang.sysml.FeatureDirectionKind

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class KerMLValidator extends AbstractKerMLValidator {

	public static val INVALID_CONNECTOR_END = 'Invalid Connector - Type of connector and its relatedFeatures do not match'
	public static val INVALID_BINDINGCONNECTOR_ARGUMENT = 'Invalid BindingConnector - Each type of the relatedFeature with direction in must have a type of the relatedFeature with direction out that conforms to it'
	public static val INVALID_BINDINGCONNECTOR_BINDINGTYPE = 'Invalid BindingConnector - Each type of one of the relatedFeature must have a type of the other relatedFeature that either conforms to it or to which it conforms'
	 
	@Check
	def checkConnector(Connector c){
		val cowners = getOwnersWhoAreType(c, newArrayList);
		var relatedFeaturesOwners = c.getRelatedFeature().stream.map[getOwnersWhoAreType(newArrayList)].collect(Collectors.toList)
		relatedFeaturesOwners.stream().forEach[s|cowners.retainAll(s)]
		if (cowners.length == 0) //no common Types
			error(INVALID_CONNECTOR_END, c, SysMLPackage.eINSTANCE.connector_ConnectorEnd, INVALID_CONNECTOR_END)
	}
	//return element's owner up to (but not including) the first one that is not a Type
	protected def List<Type> getOwnersWhoAreType(Element e, List<Type> tlist){
 		var owner = e.getOwner()
		while( owner instanceof Type && !tlist.contains(owner) ){
			tlist.add(owner as Type)
			owner = owner.getOwner
		}
		return tlist
	}
	
	@Check
	def checkBindingConnector(BindingConnector bc){
		var rf = bc.relatedFeature
		if (rf.length !== 2) {
			return //ignore i.e.,) "bind a to b" which with invalid syntax but picked up there
		}
		println("f1: " + rf.get(0).name + " " + rf.get(0).getType().map[name] + " " + rf.get(0).getType())
		println("f2: " + rf.get(1).name + " " + rf.get(1).getType().map[name] + " " + rf.get(1).getType())

		var inFeature = rf.map[owningFeatureMembership].filter[direction == FeatureDirectionKind.IN].map[ownedMemberFeature_comp].findFirst[true]
		val outFeature = rf.map[owningFeatureMembership].filter[direction == FeatureDirectionKind.OUT].map[ownedMemberFeature_comp].findFirst[true]
		
		//Argument type conformance
		if (inFeature !== null && outFeature !== null){
			var outComformsToIn = inFeature.getType().stream().map[conformsFrom(outFeature.getType())].collect(Collectors.toList)
			if (outComformsToIn.stream().filter[length != 0].collect(Collectors.toList).length !== inFeature.getType().length)		
				error(INVALID_BINDINGCONNECTOR_ARGUMENT, bc, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDINGCONNECTOR_ARGUMENT)
		}
		else { //Binding type conformance
			rf.map[type].forEach(a|println(a.map[name] + " " + a))
			
			var f1types = rf.get(0).type
			var f2types = rf.get(1).type
			
			var usedSupertypes = f1types.stream().map[conformsTo(bc.relatedFeature.get(1).type)].collect(Collectors.toList);
			var f1superOrsubtypes = newHashSet //collect sub or supertypes for f1
			f1superOrsubtypes.addAll(usedSupertypes.stream.flatMap[stream].collect(Collectors.toList))
			for( var i = 0; i < usedSupertypes.length; i++){
				if (usedSupertypes.get(i).length == 0) {//no supertype found
					//check its subtypes
					var usedSubtypes = f1types.get(i).conformsFrom(bc.relatedFeature.get(1).type)
					if (usedSubtypes.length == 0)
						error(INVALID_BINDINGCONNECTOR_BINDINGTYPE, bc, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDINGCONNECTOR_BINDINGTYPE)	
					else
						f1superOrsubtypes.addAll(usedSubtypes);	
				}
			}
			//for f2
			f2types.removeAll(f1superOrsubtypes) //filter f2types with types that are not sub or supertypes of f1
			usedSupertypes = f2types.stream().map[conformsTo(bc.relatedFeature.get(0).type)].collect(Collectors.toList);
			for( var i = 0; i < usedSupertypes.length; i++){
				if (usedSupertypes.get(i).length == 0) {//no supertype found
					//check its subtypes
					var usedSubtypes = f2types.get(i).conformsFrom(bc.relatedFeature.get(0).type)
					if (usedSubtypes.length == 0)
						error(INVALID_BINDINGCONNECTOR_BINDINGTYPE, bc, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDINGCONNECTOR_BINDINGTYPE)	
				}
			}
		}
	}
	
	//return related subtypes
	protected def Set<Type> conformsFrom(Type supertype, EList<Type> subtypes) 
	{
		var relatedSubtypes = newHashSet
		for (subtype: subtypes){
			if (subtype.conformsTo(supertype))
				relatedSubtypes.add(subtype)
		}
		relatedSubtypes
	}
	//return related supertypes
    protected def Set<Type> conformsTo(Type subtype, EList<Type> supertypes) 
	{
		var relatedSupertypes = newHashSet
		for (supertype: supertypes){
			if (subtype.conformsTo(supertype)){
				relatedSupertypes.add(supertype)
			}
		}
		relatedSupertypes
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
