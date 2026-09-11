package org.omg.kerml.validation.checker;

import java.util.List;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FlowEnd;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.lang.sysml.Flow;

public class FlowEndValidationChecker extends FeatureValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFlowEndIsEnd(element, messageAccepter);
		validateFlowEndNestedFeature(element, messageAccepter);
		validateFlowEndOwningType(element, messageAccepter);
		
		validateFlowEndSubsetting_(element, messageAccepter);
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
	
	// TODO: Add validateFlowEndSubsetting? validateFlowEndImplicitSubsetting?
	public void validateFlowEndSubsetting_(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof FlowEnd flowEnd) {
			if (FeatureUtil.getSubsettedNotRedefinedFeaturesOf(flowEnd).isEmpty()) {
				messageAccepter.error(flowEnd, null,"validateFlowEndSubsetting_");
			} else if (flowEnd.getOwnedSubsetting().isEmpty()) {
				List<Feature> features = flowEnd.getOwnedFeature();
				if (!features.isEmpty() && !features.get(0).getOwnedRedefinition().isEmpty()) {
					messageAccepter.warning(flowEnd, null, "validateFlowEndImplicitSubsetting_");
				}
			}
		}
		
	}
}
