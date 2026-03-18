package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.InvocationExpressionValidationChecker;

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
