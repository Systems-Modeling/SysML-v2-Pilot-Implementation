package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class FramedConcernMembershipValidationChecker extends RequirementConstraintMembershipValidationChecker {
	
	public FramedConcernMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateFramedConcernMembershipConstraintKind(element, messageAccepter);
	}
						
	public void validateFramedConcernMembershipConstraintKind(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
