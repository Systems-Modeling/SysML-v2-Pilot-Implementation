package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ParameterMembershipValidationChecker;

public class StakeholderMembershipValidationChecker extends ParameterMembershipValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateStakeholderMembershipOwningType(element, messageAccepter);
	}
						
	public void validateStakeholderMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
