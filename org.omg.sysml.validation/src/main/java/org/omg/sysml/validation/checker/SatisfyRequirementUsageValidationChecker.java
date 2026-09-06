package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class SatisfyRequirementUsageValidationChecker extends RequirementUsageValidationChecker {
	
	AssertConstraintUsageValidationChecker assertconstraintusage = new AssertConstraintUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		assertconstraintusage.validate(element, messageAccepter);
		validateSatisfyRequirementUsageReference(element, messageAccepter);
	}
						
	public void validateSatisfyRequirementUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
