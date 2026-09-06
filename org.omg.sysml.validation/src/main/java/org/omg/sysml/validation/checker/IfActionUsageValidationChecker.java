package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class IfActionUsageValidationChecker extends ActionUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateIfActionUsageParameters(element, messageAccepter);
	}
						
	public void validateIfActionUsageParameters(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
