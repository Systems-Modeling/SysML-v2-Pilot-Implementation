package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class FeatureValueValidationChecker extends OwningMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFeatureValueIsInitial(element, messageAccepter);
		validateFeatureValueOverriding(element, messageAccepter);
	}
						
	public void validateFeatureValueIsInitial(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureValueOverriding(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
