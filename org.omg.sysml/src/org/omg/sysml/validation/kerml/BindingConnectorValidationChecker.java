package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class BindingConnectorValidationChecker extends ConnectorValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateBindingConnectorIsBinary(element, messageAccepter);
	}
						
	public void validateBindingConnectorIsBinary(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
