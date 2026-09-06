package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class EventOccurrenceUsageValidationChecker extends OccurrenceUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateEventOccurrenceUsageIsReference(element, messageAccepter);
		validateEventOccurrenceUsageReference(element, messageAccepter);
	}
						
	public void validateEventOccurrenceUsageIsReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateEventOccurrenceUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
