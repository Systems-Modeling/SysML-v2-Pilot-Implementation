package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class CaseUsageValidationChecker extends CalculationUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateCaseUsageOnlyOneObjective(element, messageAccepter);
		validateCaseUsageOnlyOneSubject(element, messageAccepter);
		validateCaseUsageSubjectParameterPosition(element, messageAccepter);
	}
						
	public void validateCaseUsageOnlyOneObjective(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateCaseUsageOnlyOneSubject(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateCaseUsageSubjectParameterPosition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
