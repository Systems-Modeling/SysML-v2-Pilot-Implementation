package org.omg.kerml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.BindingConnector;

public class BindingConnectorValidationChecker extends ConnectorValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateBindingConnectorIsBinary(element, messageAccepter);
	}
						
	public void validateBindingConnectorIsBinary(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof BindingConnector bc) {
			if (bc.getRelatedFeature() == null || bc.getRelatedFeature().size() !=2) {
				messageAccepter.error(bc, null, "validateBindingConnectorIsBinary");
			}
		}
	}
}
