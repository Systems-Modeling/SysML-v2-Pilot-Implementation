/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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

class KerMLMOF2KerMLText extends MOF2KerMLText {
	
	override generate(org.eclipse.uml2.uml.Package model) {
		'''
		standard library package KerML {
			doc 
			/*
			 * This package contains a reflective KerML model of the KerML abstract syntax.
			 */
			 
			private import ScalarValues::*;
			public import Kernel::*;
			
			package Root {
				«model.getPackage("Root").toPackageBody»
			}
			
			package Core {
				public import Root::*;
				
				«model.getPackage("Core").toPackageBody»
			}
			
			package Kernel {
				public import Core::*;
				
				«model.getPackage("Kernel").toPackageBody»
			}
		}
		'''
	}
	
	override toRedefines(org.eclipse.uml2.uml.Property property) {
		var redefinedProperties = property.redefinedProperties.toPropertyList
		if ("annotatedElement".equals(property.name)) {
			redefinedProperties = 
				if (redefinedProperties.empty) "annotatedElement"
				else redefinedProperties + ", annotatedElement"
		}
		toRedefines(redefinedProperties)
	}
	
	static def void main(String[] args) {
		if (args.length >= 2) {
			new KerMLMOF2KerMLText().generate(args.get(0), args.get(1))
		}
	}
	
}