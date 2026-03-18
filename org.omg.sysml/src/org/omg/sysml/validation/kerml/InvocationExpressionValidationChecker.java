package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class InvocationExpressionValidationChecker extends InstantiationExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateInvocationExpressionInstantiatedType(element, messageAccepter);
		validateInvocationExpressionNoDuplicateParameterRedefinition(element, messageAccepter);
		validateInvocationExpressionOwnedFeatures(element, messageAccepter);
		validateInvocationExpressionParameterRedefinition(element, messageAccepter);
	}
						
	public void validateInvocationExpressionInstantiatedType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateInvocationExpressionNoDuplicateParameterRedefinition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateInvocationExpressionOwnedFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateInvocationExpressionParameterRedefinition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
