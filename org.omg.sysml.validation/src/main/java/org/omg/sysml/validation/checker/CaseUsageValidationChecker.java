package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class CaseUsageValidationChecker extends CalculationUsageValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
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
