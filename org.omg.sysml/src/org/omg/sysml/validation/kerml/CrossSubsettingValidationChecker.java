package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class CrossSubsettingValidationChecker extends SubsettingValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateCrossSubsettingCrossedFeature(element, messageAccepter);
		validateCrossSubsettingCrossingFeature(element, messageAccepter);
	}
						
	public void validateCrossSubsettingCrossedFeature(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateCrossSubsettingCrossingFeature(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
