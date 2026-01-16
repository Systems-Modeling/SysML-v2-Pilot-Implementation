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

import org.omg.sysml.lang.sysml.Element;

/**
 * Base class for checking validation constraints on a specific abstract syntax element.
 * Each subclass of this base class checks the validation constraints for a specific abstract syntax metaclass,
 * including those specified for all direct and indirect superclasses. Validation checking is initiated by
 * calling the validate method, and specific informational, warning or error messages are recorded
 * using a given ValidationMessageAccepter.
 */
public abstract class ValidationChecker {
	
	public abstract void validate(Element element, ValidationMessageAccepter messageAccepter);

}
