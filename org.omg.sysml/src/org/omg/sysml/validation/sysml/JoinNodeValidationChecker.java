package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class JoinNodeValidationChecker extends ControlNodeValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateJoinNodeOutgoingSuccessions(element, messageAccepter);
	}
						
	public void validateJoinNodeOutgoingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
