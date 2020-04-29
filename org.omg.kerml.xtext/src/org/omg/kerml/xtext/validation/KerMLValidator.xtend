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

	public static val INVALID_CONNECTOR_END = 'Invalid connector ends - Type of connector and its relatedFeatures do not match'
	public static val INVALID_BINDINGCONNECTOR_ARGUMENT = 'Invalid BindingConnector - Argument type Conformance'
	public static val INVALID_BINDINGCONNECTOR_BINDINGTYPE = 'Invalid BindingConnector - Binding type Conformance'
	
	 
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
	
	
	//return related subtypes
	protected def Set<Type> conformsFrom(Type supertype, EList<Type> subtypes) 
	{
		var relatedSubtypes = newHashSet
		for (subtype: subtypes){
			if (subtype.conformsTo(supertype)){
				relatedSubtypes.add(subtype)
			}
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
