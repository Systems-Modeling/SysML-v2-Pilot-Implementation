package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.PredicateValidationChecker;

public class ConstraintDefinitionValidationChecker extends OccurrenceDefinitionValidationChecker {
	
	PredicateValidationChecker predicate = new PredicateValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		predicate.validate(element, messageAccepter);
	}
						
}
