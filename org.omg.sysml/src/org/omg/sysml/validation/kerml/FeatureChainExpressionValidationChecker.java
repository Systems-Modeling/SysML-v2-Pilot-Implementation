package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class FeatureChainExpressionValidationChecker extends OperatorExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFeatureChainExpressionConformance(element, messageAccepter);
		validateFeatureChainExpressionOperator(element, messageAccepter);
	}
						
	public void validateFeatureChainExpressionConformance(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureChainExpressionOperator(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
