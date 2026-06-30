package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.FlowEnd;
import org.omg.sysml.lang.sysml.Flow;

public class FlowEndValidationChecker extends FeatureValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFlowEndIsEnd(element, messageAccepter);
		validateFlowEndNestedFeature(element, messageAccepter);
		validateFlowEndOwningType(element, messageAccepter);
	}
						
	public void validateFlowEndIsEnd(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof FlowEnd flowEnd) {
			if (!flowEnd.isEnd())
				messageAccepter.error(flowEnd, null, "validateFlowEndIsEnd");
		}
		
	}
	
	public void validateFlowEndNestedFeature(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof FlowEnd flowEnd) {
			if (flowEnd.getOwnedFeature().size() != 1) {
				messageAccepter.error(flowEnd, null, "validateFlowEndNestedFeature");
			}
		}	
	}
	
	public void validateFlowEndOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof FlowEnd flowEnd) {
			if (!(flowEnd.getOwningType() instanceof Flow)) {
				messageAccepter.error(flowEnd, null,"validateFlowEndOwningType");
			}
		}
		
	}
}
