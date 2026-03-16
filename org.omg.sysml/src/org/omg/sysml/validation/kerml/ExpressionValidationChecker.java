package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ExpressionValidationChecker extends StepValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateExpressionResultExpressionMembership(element, messageAccepter);
		validateExpressionResultParameterMembership(element, messageAccepter);
	}
						
	public void validateExpressionResultExpressionMembership(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateExpressionResultParameterMembership(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
