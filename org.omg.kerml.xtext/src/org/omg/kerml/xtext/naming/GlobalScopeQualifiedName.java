/*****************************************************************************
 * SysML 2 Pilot Implementation
  * Copyright (c) 2025 Model Driven Solutions, Inc.
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
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.naming;

import java.util.List;

import org.eclipse.xtext.naming.QualifiedName;

/**
 * This class wraps a QualifiedName that is to be resolved starting with the global scope,
 * rather than starting from the local scope in which the QualifiedName was parsed. It is
 * used to represent qualified names starting with the global scope qualification "$" in
 * KerML notation. Operations are mostly just delegated to the wrapped QualifiedName.
 */
public class GlobalScopeQualifiedName extends QualifiedName {
	
	protected QualifiedName qualifiedName;

	public GlobalScopeQualifiedName(QualifiedName qualifiedName) {
		this.qualifiedName = qualifiedName;
	}
	
	public GlobalScopeQualifiedName(List<String> segments) {
		this(QualifiedName.create(segments));
	}

	public GlobalScopeQualifiedName(String... segments) {
		this(QualifiedName.create(segments));
	}
	
	public QualifiedName getUnscopedQualifiedName() {
		return qualifiedName;
	}

	public List<String> getSegments() {
		return qualifiedName.getSegments();
	}

	public int getSegmentCount() {
		return qualifiedName.getSegmentCount();
	}

	public String getSegment(int index) {
		return qualifiedName.getSegment(index);
	}

	public String getLastSegment() {
		return qualifiedName.getLastSegment();
	}

	public String getFirstSegment() {
		return qualifiedName.getFirstSegment();
	}

	public QualifiedName append(String segment) {
		return new GlobalScopeQualifiedName(qualifiedName.append(segment));
	}

	public QualifiedName append(QualifiedName relativeQualifiedName) {
		return new GlobalScopeQualifiedName(qualifiedName.append(relativeQualifiedName));
	}

	public QualifiedName skipFirst(int skipCount) {
		return new GlobalScopeQualifiedName(qualifiedName.skipFirst(skipCount));
	}

	public QualifiedName skipLast(int skipCount) {
		return new GlobalScopeQualifiedName(qualifiedName.skipLast(skipCount));
	}

	public QualifiedName toLowerCase() {
		return new GlobalScopeQualifiedName(qualifiedName.toLowerCase());
	}

	public QualifiedName toUpperCase() {
		return new GlobalScopeQualifiedName(qualifiedName.toUpperCase());
	}

	@Override
	public int hashCode() {
		return qualifiedName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj==this)
			return true;
		return obj instanceof GlobalScopeQualifiedName && 
				qualifiedName.equals(((GlobalScopeQualifiedName)obj).qualifiedName);
	}

	public boolean equalsIgnoreCase(Object obj) {
		if (obj == this)
			return true;
		return obj instanceof GlobalScopeQualifiedName && 
				qualifiedName.equalsIgnoreCase(((GlobalScopeQualifiedName)obj).qualifiedName);
	}

	public boolean startsWith(QualifiedName prefix) {
		return prefix instanceof GlobalScopeQualifiedName && startsWith(prefix, false);
	}

	public boolean startsWithIgnoreCase(QualifiedName prefix) {
		return prefix instanceof GlobalScopeQualifiedName && startsWith(prefix, true);
	}

	public String toString(String delimiter) {
		return delimiter + qualifiedName.toString();
	}
}
