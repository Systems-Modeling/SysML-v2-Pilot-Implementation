package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SelectExpression;

public class SelectExpressionValidationChecker extends OperatorExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateSelectExpressionOperator(element, messageAccepter);
	}
						
	public void validateSelectExpressionOperator(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof SelectExpression e) {
			if (e.getOperator() != "select") {
				messageAccepter.error(e, null, "validateSelectExpressionOperator");
			}
		}
	}
}
