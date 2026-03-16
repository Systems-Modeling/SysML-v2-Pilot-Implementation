package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class FlowEndValidationChecker extends FeatureValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFlowEndIsEnd(element, messageAccepter);
		validateFlowEndNestedFeature(element, messageAccepter);
		validateFlowEndOwningType(element, messageAccepter);
	}
						
	public void validateFlowEndIsEnd(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFlowEndNestedFeature(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFlowEndOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
