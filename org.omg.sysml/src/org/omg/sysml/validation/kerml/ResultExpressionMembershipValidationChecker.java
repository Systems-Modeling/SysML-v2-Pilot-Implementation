package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ResultExpressionMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateResultExpressionMembershipOwningType(element, messageAccepter);
	}
						
	public void validateResultExpressionMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
