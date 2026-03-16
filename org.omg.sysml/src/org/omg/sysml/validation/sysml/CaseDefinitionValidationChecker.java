package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class CaseDefinitionValidationChecker extends CalculationDefinitionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
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
