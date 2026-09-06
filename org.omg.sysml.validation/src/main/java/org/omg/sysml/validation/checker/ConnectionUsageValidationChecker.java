package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ConnectionUsageValidationChecker extends ConnectorAsUsageValidationChecker {
	
	PartUsageValidationChecker partusage = new PartUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		partusage.validate(element, messageAccepter);
	}
						
}
