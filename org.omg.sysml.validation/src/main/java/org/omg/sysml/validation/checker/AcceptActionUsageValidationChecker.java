package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class AcceptActionUsageValidationChecker extends ActionUsageValidationChecker {
	
	public AcceptActionUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateAcceptActionUsageParameters(element, messageAccepter);
	}
						
	public void validateAcceptActionUsageParameters(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
