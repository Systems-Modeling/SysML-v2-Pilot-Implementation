package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class DecisionNodeValidationChecker extends ControlNodeValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateDecisionNodeIncomingSuccessions(element, messageAccepter);
		validateDecisionNodeOutgoingSuccessions(element, messageAccepter);
	}
						
	public void validateDecisionNodeIncomingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateDecisionNodeOutgoingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
