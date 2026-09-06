package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureMembershipValidationChecker;

public class ObjectiveMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateObjectiveMembershipIsComposite(element, messageAccepter);
		validateObjectiveMembershipOwningType(element, messageAccepter);
	}
						
	public void validateObjectiveMembershipIsComposite(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateObjectiveMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
