package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.ConnectorValidationChecker;

public class ConnectorAsUsageValidationChecker extends UsageValidationChecker {
	
	ConnectorValidationChecker connector = new ConnectorValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		connector.validate(element, messageAccepter);
	}
						
}
