package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class SpecializationValidationChecker extends RelationshipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateSpecificationSpecificNotConjugated(element, messageAccepter);
	}
						
	public void validateSpecificationSpecificNotConjugated(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
