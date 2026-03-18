package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.FlowValidationChecker;

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
