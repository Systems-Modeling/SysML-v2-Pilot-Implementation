package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.StepValidationChecker;

public class ActionUsageValidationChecker extends StepValidationChecker {
	
	OccurrenceUsageValidationChecker occurrenceusage = new OccurrenceUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		occurrenceusage.validate(element, messageAccepter);
	}
						
}
