package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.MembershipImportValidationChecker;

public class MembershipExposeValidationChecker extends MembershipImportValidationChecker {
	
	ExposeValidationChecker expose = new ExposeValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		expose.validate(element, messageAccepter);
	}
						
}
