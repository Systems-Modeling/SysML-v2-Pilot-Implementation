package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ConnectionUsageValidationChecker extends ConnectorAsUsageValidationChecker {
	
	PartUsageValidationChecker partusage = new PartUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		partusage.validate(element, messageAccepter);
	}
						
}
