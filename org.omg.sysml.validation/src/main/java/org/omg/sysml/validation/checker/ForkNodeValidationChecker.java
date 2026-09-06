package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ForkNodeValidationChecker extends ControlNodeValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateForkNodeIncomingSuccessions(element, messageAccepter);
	}
						
	public void validateForkNodeIncomingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
