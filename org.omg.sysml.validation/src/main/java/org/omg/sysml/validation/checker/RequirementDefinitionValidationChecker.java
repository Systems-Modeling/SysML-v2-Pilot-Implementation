package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class RequirementDefinitionValidationChecker extends ConstraintDefinitionValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateRequirementDefinitionOnlyOneSubject(element, messageAccepter);
		validateRequirementDefinitionSubjectParameterPosition(element, messageAccepter);
	}
						
	public void validateRequirementDefinitionOnlyOneSubject(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateRequirementDefinitionSubjectParameterPosition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
