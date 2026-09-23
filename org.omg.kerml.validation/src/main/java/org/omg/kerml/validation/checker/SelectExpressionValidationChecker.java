package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SelectExpression;

public class SelectExpressionValidationChecker extends OperatorExpressionValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateSelectExpressionOperator(element, messageAccepter);
	}
						
	public void validateSelectExpressionOperator(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof SelectExpression e) {
			if (!"select".equals(e.getOperator())) {
				messageAccepter.error(e, null, "validateSelectExpressionOperator");
			}
		}
	}
}
