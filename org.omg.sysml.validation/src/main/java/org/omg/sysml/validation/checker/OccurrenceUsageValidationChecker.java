package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class OccurrenceUsageValidationChecker extends UsageValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateOccurrenceUsageIndividualDefinition(element, messageAccepter);
		validateOccurrenceUsageIndividualUsage(element, messageAccepter);
		validateOccurrenceUsageIsPortion(element, messageAccepter);
		validateOccurrenceUsagePortionKind(element, messageAccepter);
	}
						
	public void validateOccurrenceUsageIndividualDefinition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateOccurrenceUsageIndividualUsage(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateOccurrenceUsageIsPortion(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateOccurrenceUsagePortionKind(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
