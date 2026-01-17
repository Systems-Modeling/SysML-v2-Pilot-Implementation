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

import org.omg.sysml.lang.sysml.util.SysMLSwitch;
import org.omg.sysml.validation.check.*;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.*;

/**
 * A factory class for creating the appropriate ValidationChecker instance for a specific
 * abstract syntax element. ValidationCheckers are actually created and cached per EClass,
 * and the same (stateless) ValidationChecker is used for all elements of the same
 * EClass.
 */
public class ValidationCheckerFactory extends SysMLSwitch<ValidationChecker> {
	
	private Map<EClass, ValidationChecker> validationCheckerCache = new HashMap<>();
	
	public ValidationChecker getValidationChecker(Element element) {
		EClass eClass = element.eClass();
		ValidationChecker checker = validationCheckerCache.get(eClass);
		if (checker == null) {
			checker = doSwitch(eClass, element);
			if (checker != null) {
				validationCheckerCache.put(eClass, checker);
			}
		}
		return checker;
	}
	
	public ValidationChecker createValidationChecker(Element element) {
		return doSwitch(element);
	}
	
	// Root
	
	@Override
	public ValidationChecker caseElement(Element element) {
		return new ElementValidationChecker();
	}

	@Override
	public ValidationChecker caseRelationship(Relationship element) {
		return new RelationshipValidationChecker();
	}

	@Override
	public ValidationChecker caseAnnotation(Annotation element) {
		return new AnnotationValidationChecker();
	}

	@Override
	public ValidationChecker caseNamespace(Namespace element) {
		return new NamespaceValidationChecker();
	}

	@Override
	public ValidationChecker caseImport(Import element) {
		return new ImportValidationChecker();
	}

}
