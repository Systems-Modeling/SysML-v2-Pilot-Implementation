/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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

package org.omg.sysml.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
 * BasicValidationMessageMap is an implementation of ValidationMessageMap using a map
 * to related string message codes to integer diagnostic codes. The diagnostic codes
 * then index into a list of full messages.
 */
public class BasicValidationMessageMap implements ValidationMessageMap {
	
	private List<String> messages = new ArrayList<>();
	private Map<String, Integer> messageMap = new HashMap<>();

	public BasicValidationMessageMap() {
		// TODO: Initialize message map using a configuration file.
		
		// Root
		
		put("validateElementIsImpliedIncluded", "Element cannot have implied relationships included");

		put("validateAnnotationAnnotatingElement", "Must either own or be owned by its annotating element");
		put("validateAnnotationAnnotatedElementOwnership_1", "Must own its annotating element");
		put("validateAnnotationAnnotatedElementOwnership_2", "Must be owned by its annotated element");

		put("validateNamespaceDistinguishablity_1", "Duplicate of other owned member name$0");
		put("validateNamespaceDistinguishablity_2", "Duplicate of owned member name$0");
		put("validateNamespaceDistinguishablity_3", "Duplicate of other alias name$0");
		put("validateNamespaceDistinguishablity_4", "Duplicate of inherited member name$0");
		
		put("validateImportTopLevelVisibility", "Top level import must be private");
	}
	
	protected void put(String messageCode, String message) {
		messages.add(message);
		messageMap.put(messageCode, messages.size());
	}
	
	@Override
	public String getMessage(String messageCode) {
		return getMessage(getDiagnosticCode(messageCode));
	}
	
	@Override
	public String getMessage(int diagnosticCode) {
		return messages.get(diagnosticCode);
	}
	
	@Override
	public int getDiagnosticCode(String messageCode) {
		return messageMap.get(messageCode);
	}

}
