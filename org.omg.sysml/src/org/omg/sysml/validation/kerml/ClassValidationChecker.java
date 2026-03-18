package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ClassValidationChecker extends ClassifierValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateClassSpecialization(element, messageAccepter);
	}
						
	public void validateClassSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
