package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.FeatureMembershipValidationChecker;

public class ViewRenderingMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateViewRenderingMembershipOwningType(element, messageAccepter);
	}
						
	public void validateViewRenderingMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
