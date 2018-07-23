/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
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
 *  Zoltan Kiss
 *  Balazs Grill
 * 
 *****************************************************************************/
package org.omg.sysml.scoping

import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import com.google.common.base.Preconditions
import org.eclipse.xtext.util.Strings

class AlfQualifiedNameConverter implements IQualifiedNameConverter {
	
	override toQualifiedName(String qualifiedNameAsText) {
		Preconditions.checkArgument(qualifiedNameAsText !== null, "Qualified name cannot be null")
		Preconditions.checkArgument(!qualifiedNameAsText.empty, "Qualified name cannot be empty")
		val delimeter =  this.toString
		if(delimeter.empty)
			return QualifiedName.create(qualifiedNameAsText)
		val char c= '.'
		val PartsAfterDotSplit= Strings.split(qualifiedNameAsText,c)
		val ret= newArrayList
		
		PartsAfterDotSplit.forEach[e| ret.addAll(Strings.split(e,'::'))]  
		
		QualifiedName.create(ret)		
		
	}
	
	override toString(QualifiedName name) {
		if (name === null)
				throw new IllegalArgumentException("Qualified name cannot be null")
			return name.toString('::')
	}
	
}