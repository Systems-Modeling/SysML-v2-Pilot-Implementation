/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022, 2024 Model Driven Solutions, Inc.
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
 *******************************************************************************/

package org.omg.sysml.generation

import org.omg.sysml.generation.MOF2KerMLText
import org.eclipse.uml2.uml.DataType
import org.eclipse.uml2.uml.Enumeration

class MOF2SysMLText extends MOF2KerMLText {
	
	override toEnumeration(Enumeration enumeration) {
		'''
		enum def «nameOf(enumeration)» {
			«FOR literal: enumeration.ownedLiterals»
				enum «nameOf(literal)»;
			«ENDFOR»
		}
		'''
	}
	
	override toMetaclass(org.eclipse.uml2.uml.Class class_) {
		toMetaclass(class_, "metadata def")
	}
		
	override toFeature(org.eclipse.uml2.uml.Property property) {
		if (property.type instanceof DataType) {
			toFeature(property, false, "attribute")
		} else {
			toFeature(property, false, if (property.isComposite) "item" else "ref item")
		}
	}
	
	override String getReservedWords() {
		// Note: Every word must be preceded and followed by a space.
	   " about abstract accept action actor after alias all allocate allocation 
		 analysis and as assign assert assoc assume at attribute bind binding block 
		 by calc case comment concern connect connection constraint decide def 
		 default defined dependency derived do doc else end entry enum event exhibit 
		 exit expose filter first flow for fork frame from hastype if implies import 
		 in include individual inout interface istype item join language loop merge 
		 message metadata nonunique not objective occurrence of or ordered out 
		 package parallel part perform port private protected public readonly 
		 redefines ref references render rendering rep require requirement return 
		 satisfy send snapshot specializes stakeholder state subject subsets 
		 succession then timeslice to transition until use variant variation 
		 verification verify via view viewpoint when while xor "
	}
	
	static def void main(String[] args) {
		if (args.length >= 2) {
			new MOF2SysMLText().generate(args.get(0), args.get(1))
		}
	}
	
}