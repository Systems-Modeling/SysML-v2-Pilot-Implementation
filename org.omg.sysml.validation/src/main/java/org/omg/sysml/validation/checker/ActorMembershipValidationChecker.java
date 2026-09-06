package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ParameterMembershipValidationChecker;

public class ActorMembershipValidationChecker extends ParameterMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateActorMembershipOwningType(element, messageAccepter);
	}
						
	public void validateActorMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
