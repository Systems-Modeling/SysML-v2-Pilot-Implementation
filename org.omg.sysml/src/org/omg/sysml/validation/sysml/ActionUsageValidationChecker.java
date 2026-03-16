package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.StepValidationChecker;

public class ActionUsageValidationChecker extends StepValidationChecker {
	
	OccurrenceUsageValidationChecker occurrenceusage = new OccurrenceUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		occurrenceusage.validate(element, messageAccepter);
	}
						
}
