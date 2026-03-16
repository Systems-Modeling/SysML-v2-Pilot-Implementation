package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class EndFeatureMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateEndFeatureMembershipIsEnd(element, messageAccepter);
	}
						
	public void validateEndFeatureMembershipIsEnd(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
