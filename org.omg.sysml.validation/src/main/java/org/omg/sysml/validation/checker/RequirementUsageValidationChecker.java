package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.validation.util.SysmlValidationUtil;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class RequirementUsageValidationChecker extends ConstraintUsageValidationChecker {
	
	public RequirementUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateRequirementUsageOnlyOneSubject(element, messageAccepter);
		validateRequirementUsageSubjectParameterPosition(element, messageAccepter);
	}
						
	public void validateRequirementUsageOnlyOneSubject(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof RequirementUsage usg) {
			SysmlValidationUtil.checkAtMostOneFeature(usg, SubjectMembership.class, messageAccepter, "validateRequirementUsageOnlyOneSubject");
		}
	}
	
	public void validateRequirementUsageSubjectParameterPosition(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof RequirementUsage usg) {
			SysmlValidationUtil.checkSubjectParameter(usg, messageAccepter, "validateRequirementUsageSubjectParameterPosition");
		}
	}
}