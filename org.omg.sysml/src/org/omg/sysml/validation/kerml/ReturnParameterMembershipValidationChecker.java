package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ReturnParameterMembershipValidationChecker extends ParameterMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateReturnParameterMembershipOwningType(element, messageAccepter);
	}
						
	public void validateReturnParameterMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
