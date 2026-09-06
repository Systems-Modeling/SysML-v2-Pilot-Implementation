package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.SuccessionValidationChecker;

public class SuccessionAsUsageValidationChecker extends ConnectorAsUsageValidationChecker {
	
	SuccessionValidationChecker succession = new SuccessionValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		succession.validate(element, messageAccepter);
	}
						
}
