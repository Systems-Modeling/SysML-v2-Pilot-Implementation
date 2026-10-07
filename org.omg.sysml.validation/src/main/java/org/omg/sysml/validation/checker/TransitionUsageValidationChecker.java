package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class TransitionUsageValidationChecker extends ActionUsageValidationChecker {
	
	public TransitionUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
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
