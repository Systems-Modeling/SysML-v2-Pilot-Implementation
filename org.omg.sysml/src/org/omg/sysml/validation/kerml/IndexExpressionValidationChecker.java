package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class IndexExpressionValidationChecker extends OperatorExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateIndexExpressionOperator(element, messageAccepter);
	}
						
	public void validateIndexExpressionOperator(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
