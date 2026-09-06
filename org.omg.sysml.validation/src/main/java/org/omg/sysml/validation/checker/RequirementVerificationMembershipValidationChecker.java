package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

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
