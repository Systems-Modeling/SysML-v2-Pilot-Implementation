package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class PartUsageValidationChecker extends ItemUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validatePartUsagePartDefinition(element, messageAccepter);
	}
						
	public void validatePartUsagePartDefinition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
