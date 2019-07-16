/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2019 Model Driven Solutions, Inc.
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
package org.omg.sysml.naming

import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import com.google.common.base.Preconditions
import org.omg.sysml.lang.sysml.impl.ElementImpl

class AlfQualifiedNameConverter implements IQualifiedNameConverter {
	
	override toQualifiedName(String qualifiedNameAsText) {
		Preconditions.checkArgument(qualifiedNameAsText !== null, "Qualified name cannot be null")
		Preconditions.checkArgument(!qualifiedNameAsText.empty, "Qualified name cannot be empty")

		val segments = newArrayList		
		var i = 0
		var j = 0;
		var n = qualifiedNameAsText.length()
		var isDelimitable = true
		
		while (j < n) {
			val c = qualifiedNameAsText.charAt(j)
			val delim = ".:".indexOf(c)
			if (isDelimitable && delim >= 0) {
				segments.add(ElementImpl.unescapeString(qualifiedNameAsText.substring(i, j)));
				i = j + delim + 1;
				j = i;
			} else if (c == '\'') {
				isDelimitable = !isDelimitable
			} else if (c == '\\') {
				j++
			}
			j++;
		}
		if (i < n && j <= n) {
			segments.add(ElementImpl.unescapeString(qualifiedNameAsText.substring(i, j)));
		}
		
		QualifiedName.create(segments)
	}

	override toString(QualifiedName name) {
		if (name === null)
			throw new IllegalArgumentException("Qualified name cannot be null")
		val segmentCount = name.getSegmentCount
		switch (segmentCount) {
			case 0: return ""
			case 1: return escapeName(name.getFirstSegment)
			default: {
				val builder = new StringBuilder;
				builder.append(escapeName(name.getFirstSegment))
				for (var i = 1; i < segmentCount; i++) {
					builder.append("::")
					builder.append(escapeName(name.getSegment(i)))
				}
				return builder.toString()
			}
		}
	}
	
	def escapeName(String name) {
		if (name === null || name.isEmpty || name.isIdentifier)
			name
		else
			"'" + ElementImpl.escapeString(name) + "'"	
	}
	
	def isIdentifier(String name) {
		name.matches("[a-zA-Z_] \\w*")
	}

}
