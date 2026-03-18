package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class InstantiationExpressionValidationChecker extends ExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateInstantiationExpressionInstantiatedType(element, messageAccepter);
		validateInstantiationExpressionResult(element, messageAccepter);
	}
						
	public void validateInstantiationExpressionInstantiatedType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateInstantiationExpressionResult(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
