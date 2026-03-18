package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class BehaviorValidationChecker extends ClassValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateBehaviorSpecialization(element, messageAccepter);
	}
						
	public void validateBehaviorSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
