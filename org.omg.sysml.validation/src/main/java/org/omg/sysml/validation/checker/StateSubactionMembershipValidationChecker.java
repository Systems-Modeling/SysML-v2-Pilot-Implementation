package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureMembershipValidationChecker;

public class StateSubactionMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateStateSubactionMembershipOwningType(element, messageAccepter);
	}
						
	public void validateStateSubactionMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
