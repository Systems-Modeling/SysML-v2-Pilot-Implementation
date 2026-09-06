package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureMembershipValidationChecker;

public class ViewRenderingMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateViewRenderingMembershipOwningType(element, messageAccepter);
	}
						
	public void validateViewRenderingMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
