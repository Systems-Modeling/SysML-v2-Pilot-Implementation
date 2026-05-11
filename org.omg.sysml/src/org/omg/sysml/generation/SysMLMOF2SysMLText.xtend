/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.generation

class SysMLMOF2SysMLText extends MOF2SysMLText {
	
	override generate(org.eclipse.uml2.uml.Package model) {
		'''
		standard library package SysML {
			doc 
			/*
			 * This package contains a reflective KerML model of the KerML abstract syntax.
			 */
			 
			private import ScalarValues::*;
			public import Systems::*;
			
			package Systems {
				public import KerML::Kernel::*;
				
				«model.getPackage("Systems").toPackageBody»
			}
			
		}
		'''
	}
	
	static def void main(String[] args) {
		if (args.length >= 2) {
			new SysMLMOF2SysMLText().generate(args.get(0), args.get(1))
		}
	}
	
}