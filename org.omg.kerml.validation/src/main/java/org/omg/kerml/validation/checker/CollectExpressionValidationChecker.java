package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.CollectExpression;
import org.omg.sysml.lang.sysml.Element;

public class CollectExpressionValidationChecker extends OperatorExpressionValidationChecker {
	
	public CollectExpressionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.doValidate(element, messageAccepter, visited);
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
