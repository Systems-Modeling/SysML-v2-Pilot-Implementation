package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.InvocationExpressionValidationChecker;

public class TriggerInvocationExpressionValidationChecker extends InvocationExpressionValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
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
