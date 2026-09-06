package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class AcceptActionUsageValidationChecker extends ActionUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateAcceptActionUsageParameters(element, messageAccepter);
	}
						
	public void validateAcceptActionUsageParameters(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
