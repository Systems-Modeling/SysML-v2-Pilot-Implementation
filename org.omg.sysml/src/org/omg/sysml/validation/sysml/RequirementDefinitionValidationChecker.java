package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class RequirementDefinitionValidationChecker extends ConstraintDefinitionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateRequirementDefinitionOnlyOneSubject(element, messageAccepter);
		validateRequirementDefinitionSubjectParameterPosition(element, messageAccepter);
	}
						
	public void validateRequirementDefinitionOnlyOneSubject(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateRequirementDefinitionSubjectParameterPosition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
