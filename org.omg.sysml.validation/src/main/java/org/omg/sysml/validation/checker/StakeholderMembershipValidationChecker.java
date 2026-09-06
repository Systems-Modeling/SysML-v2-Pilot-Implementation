package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ParameterMembershipValidationChecker;

public class StakeholderMembershipValidationChecker extends ParameterMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateStakeholderMembershipOwningType(element, messageAccepter);
	}
						
	public void validateStakeholderMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
