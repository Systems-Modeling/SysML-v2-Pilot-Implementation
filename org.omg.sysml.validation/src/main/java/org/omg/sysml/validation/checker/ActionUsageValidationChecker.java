package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.StepValidationChecker;

public class ActionUsageValidationChecker extends StepValidationChecker {
	
	private final ValidationChecker occurrenceUsage;
	
	public ActionUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		occurrenceUsage = factory.getValidationChecker(SysMLPackage.eINSTANCE.getOccurrenceUsage());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		occurrenceUsage.validate(element, messageAccepter, visited);
	}
						
}
