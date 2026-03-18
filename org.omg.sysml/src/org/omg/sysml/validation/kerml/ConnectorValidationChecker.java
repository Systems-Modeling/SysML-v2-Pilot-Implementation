package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ConnectorValidationChecker extends FeatureValidationChecker {
	
	RelationshipValidationChecker relationship = new RelationshipValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		relationship.validate(element, messageAccepter);
		validateConnectorBinarySpecialization(element, messageAccepter);
		validateConnectorRelatedFeatures(element, messageAccepter);
	}
						
	public void validateConnectorBinarySpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateConnectorRelatedFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
