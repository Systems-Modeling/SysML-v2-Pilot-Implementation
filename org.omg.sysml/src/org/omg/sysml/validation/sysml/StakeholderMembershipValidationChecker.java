package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.ParameterMembershipValidationChecker;

public class StakeholderMembershipValidationChecker extends ParameterMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateStakeholderMembershipOwningType(element, messageAccepter);
	}
						
	public void validateStakeholderMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
