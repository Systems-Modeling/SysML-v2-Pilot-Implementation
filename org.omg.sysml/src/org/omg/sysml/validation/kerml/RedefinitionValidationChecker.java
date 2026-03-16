package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class RedefinitionValidationChecker extends SubsettingValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateRedefinitionDirectionConformance(element, messageAccepter);
		validateRedefinitionEndConformance(element, messageAccepter);
		validateRedefinitionFeaturingTypes(element, messageAccepter);
	}
						
	public void validateRedefinitionDirectionConformance(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateRedefinitionEndConformance(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateRedefinitionFeaturingTypes(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
