package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ParameterMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateParameterMembershipOwningType(element, messageAccepter);
		validateParameterMembershipParameterDirection(element, messageAccepter);
	}
						
	public void validateParameterMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateParameterMembershipParameterDirection(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
