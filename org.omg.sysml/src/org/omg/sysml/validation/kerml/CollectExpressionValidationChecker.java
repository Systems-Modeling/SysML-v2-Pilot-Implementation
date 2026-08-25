package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.CollectExpression;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

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
