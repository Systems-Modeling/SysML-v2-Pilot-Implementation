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

package org.omg.sysml.validation.check;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ImportValidationChecker extends RelationshipValidationChecker {

	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateImportTopLevelVisibility(element, messageAccepter);
	}
	
	public void validateImportTopLevelVisibility(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Import import_) {
			var owningNamespace = import_.getImportOwningNamespace();
			if (owningNamespace != null && owningNamespace.getOwner() == null && 
				import_.getVisibility() != VisibilityKind.PRIVATE) {
				messageAccepter.error(import_, null, "validateImportTopLevelVisibility");			
			}
		}
	}

}
