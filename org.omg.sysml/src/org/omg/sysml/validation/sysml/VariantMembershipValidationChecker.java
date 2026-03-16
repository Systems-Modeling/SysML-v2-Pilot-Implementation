package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.OwningMembershipValidationChecker;

public class VariantMembershipValidationChecker extends OwningMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateVariantMembershipOwningNamespace(element, messageAccepter);
	}
						
	public void validateVariantMembershipOwningNamespace(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
