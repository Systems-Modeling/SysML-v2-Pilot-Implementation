package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class AttributeUsageValidationChecker extends UsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateAttributeUsageFeatures(element, messageAccepter);
		validateAttributeUsageIsReference(element, messageAccepter);
	}
						
	public void validateAttributeUsageFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateAttributeUsageIsReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
