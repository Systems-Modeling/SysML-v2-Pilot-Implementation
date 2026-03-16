package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.ParameterMembershipValidationChecker;

public class ActorMembershipValidationChecker extends ParameterMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateActorMembershipOwningType(element, messageAccepter);
	}
						
	public void validateActorMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
