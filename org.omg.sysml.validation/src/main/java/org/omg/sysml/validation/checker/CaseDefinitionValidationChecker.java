package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.util.SysmlValidationUtil;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class CaseDefinitionValidationChecker extends CalculationDefinitionValidationChecker {
	
	public CaseDefinitionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateCaseDefinitionOnlyOneObjective(element, messageAccepter);
		validateCaseDefinitionOnlyOneSubject(element, messageAccepter);
		validateCaseDefinitionSubjectParameterPosition(element, messageAccepter);
	}				
	public void validateCaseDefinitionOnlyOneObjective(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof CaseDefinition defn) {
			
			SysmlValidationUtil.checkAtMostOneFeature(defn.getObjectiveRequirement(), null, messageAccepter, "validateCaseDefinitionOnlyOneObjective");
		}
	}
	public void validateCaseDefinitionOnlyOneSubject(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof CaseDefinition defn) {
			SysmlValidationUtil.checkAtMostOneFeature(defn.getSubjectParameter(), null, messageAccepter, "validateCaseDefinitionOnlyOneSubject");
		}
	}
	public void validateCaseDefinitionSubjectParameterPosition(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof CaseDefinition defn) {
			SysmlValidationUtil.checkSubjectParameter(defn.getSubjectParameter(), messageAccepter, "validateCaseDefinitionSubjectParameterPosition");
		}
	}	
}
 