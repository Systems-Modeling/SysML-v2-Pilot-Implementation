package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.MembershipImportValidationChecker;

public class MembershipExposeValidationChecker extends MembershipImportValidationChecker {
	
	ExposeValidationChecker expose = new ExposeValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		expose.validate(element, messageAccepter);
	}
						
}
