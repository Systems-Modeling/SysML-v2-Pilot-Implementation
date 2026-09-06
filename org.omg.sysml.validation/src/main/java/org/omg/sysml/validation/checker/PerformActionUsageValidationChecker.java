package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class PerformActionUsageValidationChecker extends ActionUsageValidationChecker {
	
	EventOccurrenceUsageValidationChecker eventoccurrenceusage = new EventOccurrenceUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		eventoccurrenceusage.validate(element, messageAccepter);
		validatePerformActionUsageReference(element, messageAccepter);
	}
						
	public void validatePerformActionUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
