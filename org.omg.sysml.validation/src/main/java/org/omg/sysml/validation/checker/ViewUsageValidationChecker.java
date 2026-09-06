package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ViewUsageValidationChecker extends PartUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateViewUsageOnlyOneViewRendering(element, messageAccepter);
	}
						
	public void validateViewUsageOnlyOneViewRendering(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
