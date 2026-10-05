package org.omg.kerml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;

import java.util.List;
import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.BindingConnector;

public class BindingConnectorValidationChecker extends ConnectorValidationChecker {
	
	public BindingConnectorValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
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
