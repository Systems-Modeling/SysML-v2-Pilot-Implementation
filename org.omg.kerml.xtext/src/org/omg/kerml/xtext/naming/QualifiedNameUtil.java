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
 *   Ed Seidewitz. MDS
 */
package org.omg.kerml.xtext.naming;

import java.util.List;

import org.eclipse.xtext.naming.QualifiedName;
import org.omg.sysml.util.ElementUtil;

/**
 * This class provides utility methods for qualified names that abstracts the representation of
 * globally scoped qualified names. The current implementation presumes that globally scoped
 * qualified names are represented as Xtext QualifiedNames whose first symbol is specific
 * String identified by ElementUtil.isGlobalScopeSymbol.
 */
public class QualifiedNameUtil {
	
	public static QualifiedName createQualifiedName(List<String> segments) {
		return QualifiedName.create(segments);
	}
	
	public static boolean isGlobalScopeQualification(QualifiedName qualifiedName) {
		return qualifiedName != null &&
				qualifiedName.getSegmentCount() > 0 &&
				ElementUtil.isGlobalScopeSymbol(qualifiedName.getFirstSegment()); 
	}

	public static QualifiedName getNonGlobalQualifiedName(QualifiedName qualifiedName) {
		return isGlobalScopeQualification(qualifiedName)? qualifiedName.skipFirst(1): qualifiedName;
	}
	
	public static String toQualifiedNameString(QualifiedName qualifiedName) {
		return ElementUtil.toQualifiedNameString(qualifiedName.getSegments());
	}
}
