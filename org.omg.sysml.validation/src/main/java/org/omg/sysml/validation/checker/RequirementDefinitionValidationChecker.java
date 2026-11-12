package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.validation.util.SysmlValidationUtil;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class RequirementDefinitionValidationChecker extends ConstraintDefinitionValidationChecker {
	
	public RequirementDefinitionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateRequirementDefinitionOnlyOneSubject(element, messageAccepter);
		validateRequirementDefinitionSubjectParameterPosition(element, messageAccepter);
	}
						
	public void validateRequirementDefinitionOnlyOneSubject(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof RequirementDefinition defn) {
			SysmlValidationUtil.checkAtMostOneFeature(defn, SubjectMembership.class, messageAccepter, "validateRequirementDefinitionOnlyOneSubject");
		}
	}
	
	public void validateRequirementDefinitionSubjectParameterPosition(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof RequirementDefinition defn) {
			SysmlValidationUtil.checkSubjectParameter(defn, messageAccepter, "validateRequirementDefinitionSubjectParameterPosition");
		}
	}	
}