package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class SendActionUsageValidationChecker extends ActionUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateSendActionParameters(element, messageAccepter);
	}
						
	public void validateSendActionParameters(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
