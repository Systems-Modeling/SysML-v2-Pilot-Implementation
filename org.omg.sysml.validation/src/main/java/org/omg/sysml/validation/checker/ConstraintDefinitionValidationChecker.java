package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.PredicateValidationChecker;

public class ConstraintDefinitionValidationChecker extends OccurrenceDefinitionValidationChecker {
	
	PredicateValidationChecker predicate = new PredicateValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		predicate.validate(element, messageAccepter);
	}
						
}
