package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.BehaviorValidationChecker;

public class ActionDefinitionValidationChecker extends BehaviorValidationChecker {
	
	OccurrenceDefinitionValidationChecker occurrencedefinition = new OccurrenceDefinitionValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		occurrencedefinition.validate(element, messageAccepter);
	}
						
}
