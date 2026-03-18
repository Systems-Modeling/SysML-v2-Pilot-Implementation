package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.FeatureMembershipValidationChecker;

public class StateSubactionMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateStateSubactionMembershipOwningType(element, messageAccepter);
	}
						
	public void validateStateSubactionMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
