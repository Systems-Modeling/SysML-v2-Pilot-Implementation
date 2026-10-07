package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class PerformActionUsageValidationChecker extends ActionUsageValidationChecker {
	
	private final ValidationChecker eventOccurrenceUsage;
	
	public PerformActionUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		eventOccurrenceUsage = factory.getValidationChecker(SysMLPackage.eINSTANCE.getEventOccurrenceUsage());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		eventOccurrenceUsage.validate(element, messageAccepter, visited);
		validatePerformActionUsageReference(element, messageAccepter);
	}
						
	public void validatePerformActionUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
