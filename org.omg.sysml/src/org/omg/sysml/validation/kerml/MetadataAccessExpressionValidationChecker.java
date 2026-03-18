package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class MetadataAccessExpressionValidationChecker extends ExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateMetadataAccessExpressionReferencedElement(element, messageAccepter);
	}
						
	public void validateMetadataAccessExpressionReferencedElement(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
