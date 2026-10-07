package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class DecisionNodeValidationChecker extends ControlNodeValidationChecker {
	
	public DecisionNodeValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateDecisionNodeIncomingSuccessions(element, messageAccepter);
		validateDecisionNodeOutgoingSuccessions(element, messageAccepter);
	}
						
	public void validateDecisionNodeIncomingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateDecisionNodeOutgoingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
