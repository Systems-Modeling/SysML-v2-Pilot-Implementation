package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.SuccessionFlowValidationChecker;

public class SuccessionFlowUsageValidationChecker extends SuccessionFlowValidationChecker {
	
	FlowUsageValidationChecker flowusage = new FlowUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		flowusage.validate(element, messageAccepter);
	}
						
}
