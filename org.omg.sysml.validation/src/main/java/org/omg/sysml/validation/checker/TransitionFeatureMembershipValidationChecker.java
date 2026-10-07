package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureMembershipValidationChecker;

public class TransitionFeatureMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	public TransitionFeatureMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateTransitionFeatureMembershipEffectAction(element, messageAccepter);
		validateTransitionFeatureMembershipGuardExpression(element, messageAccepter);
		validateTransitionFeatureMembershipOwningType(element, messageAccepter);
		validateTransitionFeatureMembershipTriggerAction(element, messageAccepter);
	}
						
	public void validateTransitionFeatureMembershipEffectAction(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTransitionFeatureMembershipGuardExpression(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTransitionFeatureMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTransitionFeatureMembershipTriggerAction(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
