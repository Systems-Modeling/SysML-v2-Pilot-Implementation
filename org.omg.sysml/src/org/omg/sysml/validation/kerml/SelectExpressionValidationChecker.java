package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class SelectExpressionValidationChecker extends OperatorExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateSelectExpressionOperator(element, messageAccepter);
	}
						
	public void validateSelectExpressionOperator(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
