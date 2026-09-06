package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureMembershipValidationChecker;

public class RequirementConstraintMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateRequirementConstraintMembershipIsComposite(element, messageAccepter);
		validateRequirementConstraintMembershipOwningType(element, messageAccepter);
	}
						
	public void validateRequirementConstraintMembershipIsComposite(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateRequirementConstraintMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
