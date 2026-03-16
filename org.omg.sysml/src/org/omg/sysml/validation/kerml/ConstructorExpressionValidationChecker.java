package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ConstructorExpressionValidationChecker extends InstantiationExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateConstructorExpressionNoDuplicateFeatureRedefinition(element, messageAccepter);
		validateConstructorExpressionOwnedFeatures(element, messageAccepter);
	}
						
	public void validateConstructorExpressionNoDuplicateFeatureRedefinition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateConstructorExpressionOwnedFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
