package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class CaseDefinitionValidationChecker extends CalculationDefinitionValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateCaseDefinitionOnlyOneObjective(element, messageAccepter);
		validateCaseDefinitionOnlyOneSubject(element, messageAccepter);
		validateCaseDefinitionSubjectParameterPosition(element, messageAccepter);
	}
						
	public void validateCaseDefinitionOnlyOneObjective(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateCaseDefinitionOnlyOneSubject(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateCaseDefinitionSubjectParameterPosition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
