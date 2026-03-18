package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class FunctionValidationChecker extends BehaviorValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFunctionResultExpressionMembership(element, messageAccepter);
		validateFunctionResultParameterMembership(element, messageAccepter);
	}
						
	public void validateFunctionResultExpressionMembership(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFunctionResultParameterMembership(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
