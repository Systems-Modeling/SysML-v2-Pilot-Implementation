package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class TerminateActionUsageValidationChecker extends ActionUsageValidationChecker {
	
	public TerminateActionUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
	}
						
}
