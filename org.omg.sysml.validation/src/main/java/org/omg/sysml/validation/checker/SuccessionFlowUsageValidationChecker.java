package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.SuccessionFlowValidationChecker;

public class SuccessionFlowUsageValidationChecker extends SuccessionFlowValidationChecker {
	
	FlowUsageValidationChecker flowusage = new FlowUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		flowusage.validate(element, messageAccepter);
	}
						
}
