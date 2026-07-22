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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;

import java.util.Properties;

public class PropertyFileValidationMessageMap implements ValidationMessageMap {
		
	private final Properties messageMap;
	
	protected static String getPathOnPlatform(String platformPath) {
		return URI.createPlatformResourceURI(platformPath, false).toPlatformString(false);
	}

	public PropertyFileValidationMessageMap(String propertyFilePath) throws FileNotFoundException, IOException {
		this(propertyFilePath, null);
	}
	
	public PropertyFileValidationMessageMap(String propertyFilePath, PropertyFileValidationMessageMap defaults) throws FileNotFoundException, IOException {
		messageMap = defaults == null? new Properties(): new Properties(defaults.getMessageMap());
		loadPropertyFile(messageMap, propertyFilePath);
	}
	
	protected Properties getMessageMap() {
		return messageMap;
	}
	
	protected void loadPropertyFile(Properties properties, String propertyFilePath) throws FileNotFoundException, IOException {
		if (propertyFilePath != null) {
			try (InputStream input = new FileInputStream(propertyFilePath)) {
				properties.load(input);
			} catch (Exception e) {
				System.err.println("Cannot load validation message file " + propertyFilePath);
				throw e;
			}
		}		
	}

	@Override
	public String getMessage(String messageCode) {
		return messageMap.getProperty(messageCode);
	}

	@Override
	public String getMessage(int diagnosticCode) {
		for (Entry<Object, Object> entry: messageMap.entrySet()) {
			if (getDiagnosticCode((String)entry.getValue()) == diagnosticCode) {
				return (String)entry.getValue();
			}
		}
		return null;
	}

	@Override
	public int getDiagnosticCode(String messageCode) {
		return messageCode.hashCode();
	}

}
