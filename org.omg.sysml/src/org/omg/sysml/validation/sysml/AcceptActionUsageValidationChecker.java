package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class AcceptActionUsageValidationChecker extends ActionUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateAcceptActionUsageParameters(element, messageAccepter);
	}
						
	public void validateAcceptActionUsageParameters(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
