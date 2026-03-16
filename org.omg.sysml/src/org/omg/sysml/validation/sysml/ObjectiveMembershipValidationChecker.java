package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.FeatureMembershipValidationChecker;

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
