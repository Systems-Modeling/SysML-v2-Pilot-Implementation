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
 *  Zoltan Kiss, Incquery
 *  Balazs Grill, Incquery
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.ui.contentassist;
import java.util.List;

import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;


public class KerMLPrefixMatcher extends PrefixMatcher {

	@Inject
	private PrefixMatcher.IgnoreCase delegate;
	
	protected String delimiter = ".";
	
	public String getLastSegment(String fqn) {
		if (fqn == null || fqn.length() == 0)
			return null;
		boolean lookForUppercase = true;
		for(int i = 0; i <= fqn.length() - delimiter.length(); i++) {
			if (lookForUppercase) {
				if (Character.isUpperCase(fqn.charAt(i))) {
					return fqn.substring(i);
				}
			} 
			lookForUppercase = delimiter.equals(fqn.substring(i, i + delimiter.length()));
			if (lookForUppercase)
				i++;
		}
		return null;
	}
	
	@Override
	public boolean isCandidateMatchingPrefix(String name, String prefix) {
		if (delegate.isCandidateMatchingPrefix(name, prefix))
			return true;
		
		// this block use the prefix for both :: and .
		String otherDelimiter = "::";
		name=name.replaceAll(otherDelimiter, delimiter);
		prefix=prefix.replaceAll(otherDelimiter, delimiter);
		//this is the end of the block
		
		if (name.indexOf(delimiter) >= 0) { // assume a fqn if delimiter is present
			if (prefix.indexOf(delimiter) < 0) { 
				// prefix is without a dot - either namespace or last segment
				// namespace was checked prior by delegate
				String lastSegment = getLastSegment(name);
				if (lastSegment != null && delegate.isCandidateMatchingPrefix(lastSegment, prefix))
					return true;
			} else {
				List<String> splitPrefix = Strings.split(prefix, delimiter);
				if (splitPrefix.isEmpty())
					return false;
				List<String> splitName = Strings.split(name, delimiter);
				if (splitName.size() < splitPrefix.size()) {
					return false;
				}
				for(int i = 0; i < splitPrefix.size(); i++) {
					if (!delegate.isCandidateMatchingPrefix(splitName.get(i), splitPrefix.get(i)))
						return false;
				}
				return true;
			}
		}
		return false;
	}

}
