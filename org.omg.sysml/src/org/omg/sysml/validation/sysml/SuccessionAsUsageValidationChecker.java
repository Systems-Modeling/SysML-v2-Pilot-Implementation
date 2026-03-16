package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.SuccessionValidationChecker;

public class SuccessionAsUsageValidationChecker extends ConnectorAsUsageValidationChecker {
	
	SuccessionValidationChecker succession = new SuccessionValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		succession.validate(element, messageAccepter);
	}
						
}
