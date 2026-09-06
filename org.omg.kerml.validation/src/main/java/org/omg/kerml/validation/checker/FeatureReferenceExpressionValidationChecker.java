package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;

public class FeatureReferenceExpressionValidationChecker extends ExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFeatureReferenceExpressionReferentIsFeature(element, messageAccepter);
		validateFeatureReferenceExpressionResult(element, messageAccepter);
	}
						
	public void validateFeatureReferenceExpressionReferentIsFeature(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureReferenceExpressionResult(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
