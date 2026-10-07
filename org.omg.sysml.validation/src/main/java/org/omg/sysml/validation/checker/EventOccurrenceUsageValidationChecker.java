package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class EventOccurrenceUsageValidationChecker extends OccurrenceUsageValidationChecker {
	
	public EventOccurrenceUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateEventOccurrenceUsageIsReference(element, messageAccepter);
		validateEventOccurrenceUsageReference(element, messageAccepter);
	}
						
	public void validateEventOccurrenceUsageIsReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateEventOccurrenceUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
