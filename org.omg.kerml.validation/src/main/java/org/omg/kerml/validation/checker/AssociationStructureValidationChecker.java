package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;

public class AssociationStructureValidationChecker extends AssociationValidationChecker {
	
	StructureValidationChecker structure = new StructureValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		structure.validate(element, messageAccepter);
	}
						
}
