package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class FlowValidationChecker extends ConnectorValidationChecker {
	
	StepValidationChecker step = new StepValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		step.validate(element, messageAccepter);
		validateFlowPayloadFeature(element, messageAccepter);
	}
						
	public void validateFlowPayloadFeature(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
