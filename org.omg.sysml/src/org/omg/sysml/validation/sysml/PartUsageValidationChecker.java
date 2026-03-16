package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class PartUsageValidationChecker extends ItemUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validatePartUsagePartDefinition(element, messageAccepter);
	}
						
	public void validatePartUsagePartDefinition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
