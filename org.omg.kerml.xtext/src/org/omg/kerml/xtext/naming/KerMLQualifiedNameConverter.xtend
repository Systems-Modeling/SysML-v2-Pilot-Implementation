/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2019, 2021 Model Driven Solutions, Inc.
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
package org.omg.kerml.xtext.naming

import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import com.google.common.base.Preconditions
import org.omg.sysml.util.ElementUtil

class KerMLQualifiedNameConverter implements IQualifiedNameConverter {
	
	override toQualifiedName(String qualifiedNameText) {
		Preconditions.checkArgument(qualifiedNameText !== null, "Qualified name cannot be null")

		val qualifiedNameAsText =
			if (qualifiedNameText.endsWith("::")) qualifiedNameText.substring(0, qualifiedNameText.length - 2)
			else qualifiedNameText
			
		Preconditions.checkArgument(!qualifiedNameAsText.empty, "Qualified name cannot be empty")

		val segments = ElementUtil.parseQualifiedName(qualifiedNameAsText)		
		QualifiedName.create(segments)
	}

	override toString(QualifiedName name) {
		Preconditions.checkArgument(name !== null, "Qualified name cannot be null")
			
		ElementUtil.toQualifiedNameString(name.segments)
	}
	
}
