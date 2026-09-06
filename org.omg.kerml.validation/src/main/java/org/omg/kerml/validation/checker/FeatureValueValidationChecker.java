package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;

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
