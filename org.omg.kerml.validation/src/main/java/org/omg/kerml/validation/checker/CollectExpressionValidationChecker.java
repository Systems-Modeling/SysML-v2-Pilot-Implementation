package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.CollectExpression;
import org.omg.sysml.lang.sysml.Element;

public class CollectExpressionValidationChecker extends OperatorExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateCollectExpressionOperator(element, messageAccepter);
	}
						
	public void validateCollectExpressionOperator(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof CollectExpression ce) {
			if (!"collect".equals(ce.getOperator())) {
				messageAccepter.error(ce, null, "validateCollectExpressionOperator");
			}
		}
		
	}
	
}
