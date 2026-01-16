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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * The interface for classes that record messages created during validation checking.
 * A ValidationMessageAccepter is associated with a ValidationMessageMap, which is used
 * to look up messages using the messageCode and substitute data for template parameters.
 */
public interface ValidationMessageAccepter {
	
	ValidationMessageMap getMessageMap();
	
	default void info(EObject source, EStructuralFeature feature, String messageCode, String... data) {
		acceptInfo(getMessageMap().getMessage(messageCode, data), source, feature, messageCode, data);
	}
	default void warning(EObject source, EStructuralFeature feature, String messageCode, String... data) {
		acceptWarning(getMessageMap().getMessage(messageCode, data), source, feature, messageCode, data);
	}
	default void error(EObject source, EStructuralFeature feature, String messageCode, String... data) {
		acceptError(getMessageMap().getMessage(messageCode, data), source, feature, messageCode, data);
	}

	void acceptInfo(String message, EObject source, EStructuralFeature feature, String messageCode, String... data);
	void acceptWarning(String message, EObject source, EStructuralFeature feature, String issueode, String... data);
	void acceptError(String message, EObject source, EStructuralFeature feature, String messageCode, String... data);
	
}
