package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class RequirementVerificationMembershipValidationChecker extends RequirementConstraintMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateRequirementVerificationMembershipKind(element, messageAccepter);
		validateRequirementVerificationMembershipOwningType(element, messageAccepter);
	}
						
	public void validateRequirementVerificationMembershipKind(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateRequirementVerificationMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
