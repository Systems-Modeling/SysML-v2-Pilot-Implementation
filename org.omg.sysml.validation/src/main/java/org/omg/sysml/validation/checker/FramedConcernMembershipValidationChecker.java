package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class FramedConcernMembershipValidationChecker extends RequirementConstraintMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFramedConcernMembershipConstraintKind(element, messageAccepter);
	}
						
	public void validateFramedConcernMembershipConstraintKind(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
