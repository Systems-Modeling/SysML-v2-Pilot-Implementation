/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2025 Model Driven Solutions, Inc.
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
 *   Laszlo Gati, MDS
 *   Ed Seidewitz MDS
 */
package org.omg.kerml.xtext.naming;

import java.util.List;

import org.eclipse.xtext.naming.QualifiedName;
import org.omg.sysml.util.ElementUtil;

public class QualifiedNameUtil {
	
	/**
	 * If the first segment in the given list is null, then create a GlobalScopeQualifiedName from the remaining segments.
	 * Otherwise, create a regular QualifiedName from all the segments.
	 */
	public static QualifiedName createQualifiedName(List<String> segments) {
		return !segments.isEmpty() && segments.get(0) == null? createGlobalScopeQualifiedName(segments.subList(1, segments.size())):
			   QualifiedName.create(segments);
	}
	
	/**
	 * Create a GlobalScopeQualifiedName from the given list of segments. Note that all segments must be non-null.
	 */
	public static QualifiedName createGlobalScopeQualifiedName(List<String> segments) {
		return new GlobalScopeQualifiedName(segments);
	}
	
	/**
	 * Create a GlobalScopeQualifiedName the wraps the given qualifiedName.
	 */
	public static QualifiedName createGlobalScopeQualifiedName(QualifiedName qualifiedName) {
		return new GlobalScopeQualifiedName(qualifiedName);
	}
	
	/**
	 * Check whether the given qualifiedName is a GlobalScopeQualifiedName.
	 */
	public static boolean isGlobalScopeQualification(QualifiedName qualifiedName) {
		return qualifiedName instanceof GlobalScopeQualifiedName; 
	}
	
	/**
	 * If the given qualifiedName is a GlobalScopeQualifiedName, then return its wrapped QualifiedName.
	 * Otherwise, return the given qualifiedName.
	 */
	public static QualifiedName getNonGlobalQualifiedName(QualifiedName qualifiedName) {
		return isGlobalScopeQualification(qualifiedName)? ((GlobalScopeQualifiedName)qualifiedName).getUnscopedQualifiedName():
			   qualifiedName;
	}
	
	/**
	 * If the given qualifiedName is a GlobalScopeQualifiedName, then prepend the GLOBAL_SCOPE_SYMBOL to its String representation.
	 * Otherwise just return the usual String representation.
	 */
	public static String toQualifiedNameString(QualifiedName qualifiedName) {
		String nameString = ElementUtil.toQualifiedNameString(qualifiedName.getSegments());
		return isGlobalScopeQualification(qualifiedName)? ElementUtil.GLOBAL_SCOPE_SYMBOL + "::" + nameString: nameString;
	}
}
