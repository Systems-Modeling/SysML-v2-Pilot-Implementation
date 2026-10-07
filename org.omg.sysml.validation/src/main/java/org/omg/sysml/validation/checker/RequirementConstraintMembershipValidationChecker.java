package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureMembershipValidationChecker;

public class RequirementConstraintMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	public RequirementConstraintMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateRequirementConstraintMembershipIsComposite(element, messageAccepter);
		validateRequirementConstraintMembershipOwningType(element, messageAccepter);
	}
						
	public void validateRequirementConstraintMembershipIsComposite(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateRequirementConstraintMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
