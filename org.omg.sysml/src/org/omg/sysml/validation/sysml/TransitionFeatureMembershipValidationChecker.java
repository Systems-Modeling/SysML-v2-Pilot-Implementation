package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.FeatureMembershipValidationChecker;

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
