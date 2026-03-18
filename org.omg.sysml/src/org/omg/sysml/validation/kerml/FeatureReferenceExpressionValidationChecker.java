package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

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
