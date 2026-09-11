package org.omg.kerml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;

import java.util.List;

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
			List<Feature> relatedFeatures = bc.getRelatedFeature();
			if (relatedFeatures == null || relatedFeatures.size() != 2) {
				messageAccepter.error(bc, null, "validateBindingConnectorIsBinary");
			} else {
				doCheckBindingConnector(bc, bc, messageAccepter);
			}
		}
	}
}
