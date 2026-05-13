/*****************************************************************************
 * SysML 2 Pilot Implementation
 *  Copyright (c) 2022 Model Driven Solutions, Inc.
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
 * Contributors:
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.xtext.naming

import org.omg.kerml.xtext.naming.KerMLQualifiedNameConverter

class SysMLQualifiedNameConverter extends KerMLQualifiedNameConverter {
	
	override toQualifiedName(String qualifiedNameText) {
		var unconjugatedQualifiedNameText = qualifiedNameText
		
		val isConjugated = qualifiedNameText !== null && qualifiedNameText.startsWith("~");
		if (isConjugated) {
			unconjugatedQualifiedNameText = unconjugatedQualifiedNameText.substring(1).trim()
		}
		
		var qualifiedName = super.toQualifiedName(unconjugatedQualifiedNameText)
		
		if (isConjugated) {
			qualifiedName = qualifiedName.append("~" + qualifiedName.lastSegment)
		}
		
		qualifiedName
	}
}