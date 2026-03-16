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

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Element;

/**
 * The abstract base for factory classes that create the appropriate ValidationChecker instance for 
 * a specific abstract syntax element. ValidationCheckers are actually created and cached per EClass,
 * and the same (stateless) ValidationChecker is used for all elements of the same EClass.
 */
public abstract class ValidationCheckerFactory {
	
	public static final String VALIDATION_CHECKER_PACKAGE = ValidationCheckerFactory.class.getPackageName();

	private Map<EClass, ValidationChecker> validationCheckerCache = new HashMap<>();
	
	public ValidationChecker getValidationChecker(Element element) {
		EClass eClass = element.eClass();
		ValidationChecker checker = validationCheckerCache.get(eClass);
		if (checker == null) {
			checker = createValidationChecker(element);
			if (checker != null) {
				validationCheckerCache.put(eClass, checker);
			}
		}
		return checker;
	}
	
	public abstract ValidationChecker createValidationChecker(Element element);
	
	protected ValidationChecker createValidationChecker(Element element, String packageSuffix) {
		EClass eClass = element.eClass();
		try {
			Class<?> validationChecker = Class.forName(VALIDATION_CHECKER_PACKAGE +"." + packageSuffix + "." + eClass.getName());
			Constructor<?> constructor = validationChecker.getConstructor();
			return (ValidationChecker)constructor.newInstance();
		} catch (ClassNotFoundException e) {
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
