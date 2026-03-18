package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class TransitionUsageValidationChecker extends ActionUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateTransitionUsageParameters(element, messageAccepter);
		validateTransitionUsageSuccession(element, messageAccepter);
		validateTransitionUsageTriggerActions(element, messageAccepter);
	}
						
	public void validateTransitionUsageParameters(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTransitionUsageSuccession(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTransitionUsageTriggerActions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
