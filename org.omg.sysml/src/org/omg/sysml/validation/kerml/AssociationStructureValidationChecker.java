package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class AssociationStructureValidationChecker extends AssociationValidationChecker {
	
	StructureValidationChecker structure = new StructureValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		structure.validate(element, messageAccepter);
	}
						
}
