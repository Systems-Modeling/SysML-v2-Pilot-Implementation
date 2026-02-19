/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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

import java.util.HashMap;
import java.util.Map;

public class PropertyFileValidationMessageMap implements ValidationMessageMap {
	
	private Map<String, String> messageMap = new HashMap<>();
	// TODO: Create two message property files - SysML and KerML (do KerML first)
//	Path kermlFilePath = Paths.get("KerMLValidationMessages.properties");
//	Path sysmlFilePath = Paths.get("SysMLValidationMessages.properties");
//	List<String> kermlMessages = Files.readAllLines(kermlFilePath);
//	List<String> sysmlMessages = Files.readAllLines(sysmlFilePath);
	
	public PropertyFileValidationMessageMap(String propertyFileName) {
		// TODO: Load messageMap from property file
	}

	@Override
	public String getMessage(String messageCode) {
		return messageMap.get(messageCode);
	}

	@Override
	public String getMessage(int diagnosticCode) {
		return null;
	}

	@Override
	public int getDiagnosticCode(String messageCode) {
		return getMessage(messageCode).hashCode();
	}

}
