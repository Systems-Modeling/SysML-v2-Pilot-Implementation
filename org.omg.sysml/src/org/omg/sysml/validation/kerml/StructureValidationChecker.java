package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class StructureValidationChecker extends ClassValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateStructureSpecialization(element, messageAccepter);
	}
						
	public void validateStructureSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
