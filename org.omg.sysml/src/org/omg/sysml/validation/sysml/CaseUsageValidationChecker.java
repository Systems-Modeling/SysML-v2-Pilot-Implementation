package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

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
