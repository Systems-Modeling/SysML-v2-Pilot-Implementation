package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureMembershipValidationChecker;

public class TransitionFeatureMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
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
