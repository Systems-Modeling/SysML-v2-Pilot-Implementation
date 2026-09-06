package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ReferenceUsageValidationChecker extends UsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateReferenceUsageIsReference(element, messageAccepter);
	}
						
	public void validateReferenceUsageIsReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
