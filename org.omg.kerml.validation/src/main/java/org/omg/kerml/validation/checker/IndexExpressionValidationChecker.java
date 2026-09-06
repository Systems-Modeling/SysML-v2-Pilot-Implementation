package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.IndexExpression;

public class IndexExpressionValidationChecker extends OperatorExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateIndexExpressionOperator(element, messageAccepter);
	}
						
	public void validateIndexExpressionOperator(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof IndexExpression e) {
			if (e.getOperator() != "#") {
				messageAccepter.error(e, null, "validateIndexExpressionOperator");
			}
		}
		
	}
	
}
