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
 */
package org.omg.kerml.xtext.naming;

import org.eclipse.xtext.naming.QualifiedName;

public class QualifiedNamesUtil {
	
	public static final String GLOBAL_CLASSIFIER_SYMBOL = "$";
	
	public static boolean isGlobalNameQualification(QualifiedName qualifiedName) {
		return qualifiedName != null &&
				qualifiedName.getSegmentCount() > 0 &&
				GLOBAL_CLASSIFIER_SYMBOL.equals(qualifiedName.getFirstSegment()); 
	}
}
