package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.BindingConnectorValidationChecker;

public class BindingConnectorAsUsageValidationChecker extends BindingConnectorValidationChecker {
	
	ConnectorAsUsageValidationChecker connectorasusage = new ConnectorAsUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		connectorasusage.validate(element, messageAccepter);
	}
						
}
