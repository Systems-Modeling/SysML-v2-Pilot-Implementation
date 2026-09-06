package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ConnectorValidationChecker;

public class ConnectorAsUsageValidationChecker extends UsageValidationChecker {
	
	ConnectorValidationChecker connector = new ConnectorValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		connector.validate(element, messageAccepter);
	}
						
}
