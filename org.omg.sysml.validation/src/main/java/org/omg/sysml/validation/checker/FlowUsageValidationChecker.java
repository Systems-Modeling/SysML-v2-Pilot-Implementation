package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FlowValidationChecker;

public class FlowUsageValidationChecker extends ConnectorAsUsageValidationChecker {
	
	ActionUsageValidationChecker actionusage = new ActionUsageValidationChecker();
	FlowValidationChecker flow = new FlowValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		actionusage.validate(element, messageAccepter);
		flow.validate(element, messageAccepter);
	}
						
}
