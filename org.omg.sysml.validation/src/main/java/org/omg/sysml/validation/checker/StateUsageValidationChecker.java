package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class StateUsageValidationChecker extends ActionUsageValidationChecker {
	
	public StateUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateStateUsageParallelSubactions(element, messageAccepter);
		validateStateUsageStateSubactionKind(element, messageAccepter);
	}
						
	public void validateStateUsageParallelSubactions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateStateUsageStateSubactionKind(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
