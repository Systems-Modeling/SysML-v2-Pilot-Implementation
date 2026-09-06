package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.InvariantValidationChecker;

public class AssertConstraintUsageValidationChecker extends ConstraintUsageValidationChecker {
	
	InvariantValidationChecker invariant = new InvariantValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		invariant.validate(element, messageAccepter);
		validateAssertConstraintUsageReference(element, messageAccepter);
	}
						
	public void validateAssertConstraintUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
