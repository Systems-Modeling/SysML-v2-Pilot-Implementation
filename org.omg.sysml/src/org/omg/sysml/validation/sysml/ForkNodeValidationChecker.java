package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ForkNodeValidationChecker extends ControlNodeValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateForkNodeIncomingSuccessions(element, messageAccepter);
	}
						
	public void validateForkNodeIncomingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
