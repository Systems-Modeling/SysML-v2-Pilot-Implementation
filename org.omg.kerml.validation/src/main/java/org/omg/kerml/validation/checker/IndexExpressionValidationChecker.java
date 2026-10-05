package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.IndexExpression;

public class IndexExpressionValidationChecker extends OperatorExpressionValidationChecker {
	
	public IndexExpressionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateIndexExpressionOperator(element, messageAccepter);
	}
						
	public void validateIndexExpressionOperator(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof IndexExpression e) {
			if (!"#".equals(e.getOperator())) {
				messageAccepter.error(e, null, "validateIndexExpressionOperator");
			}
		}
		
	}
	
}
