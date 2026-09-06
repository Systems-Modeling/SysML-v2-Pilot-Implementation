package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.InvocationExpressionValidationChecker;

public class TriggerInvocationExpressionValidationChecker extends InvocationExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateTriggerInvocationExpressionAfterArgument(element, messageAccepter);
		validateTriggerInvocationExpressionAtArgument(element, messageAccepter);
		validateTriggerInvocationExpressionWhenArgument(element, messageAccepter);
	}
						
	public void validateTriggerInvocationExpressionAfterArgument(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTriggerInvocationExpressionAtArgument(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTriggerInvocationExpressionWhenArgument(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
