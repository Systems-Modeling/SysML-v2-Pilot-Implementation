package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class DataTypeValidationChecker extends ClassifierValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateDataTypeSpecialization(element, messageAccepter);
	}
						
	public void validateDataTypeSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
