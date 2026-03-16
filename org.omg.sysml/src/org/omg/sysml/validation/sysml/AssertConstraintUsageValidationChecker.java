package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.InvariantValidationChecker;

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
