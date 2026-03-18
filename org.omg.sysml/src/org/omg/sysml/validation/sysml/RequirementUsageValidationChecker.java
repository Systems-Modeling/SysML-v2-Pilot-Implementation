package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class RequirementUsageValidationChecker extends ConstraintUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateRequirementUsageOnlyOneSubject(element, messageAccepter);
		validateRequirementUsageSubjectParameterPosition(element, messageAccepter);
	}
						
	public void validateRequirementUsageOnlyOneSubject(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateRequirementUsageSubjectParameterPosition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
