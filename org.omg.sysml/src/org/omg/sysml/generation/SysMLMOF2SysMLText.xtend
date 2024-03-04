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

class SysMLMOF2SysMLText extends MOF2SysMLText {
	
	override generate(org.eclipse.uml2.uml.Package model) {
		'''
		standard library package SysML {
			doc 
			/*
			 * This package contains a reflective KerML model of the KerML abstract syntax.
			 */
			 
			private import ScalarValues::*;
			import Systems::*;
			
			package Systems {
				import KerML::Kernel::*;
				
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