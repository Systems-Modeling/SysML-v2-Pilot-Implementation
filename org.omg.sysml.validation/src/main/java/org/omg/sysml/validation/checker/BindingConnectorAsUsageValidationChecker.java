package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.BindingConnectorValidationChecker;

public class BindingConnectorAsUsageValidationChecker extends BindingConnectorValidationChecker {
	
	ConnectorAsUsageValidationChecker connectorasusage = new ConnectorAsUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		connectorasusage.validate(element, messageAccepter);
	}
						
}
