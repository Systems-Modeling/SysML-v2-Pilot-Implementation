package org.omg.sysml.validation.kerml;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.CrossSubsetting;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Feature;

public class CrossSubsettingValidationChecker extends SubsettingValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateCrossSubsettingCrossedFeature(element, messageAccepter);
		validateCrossSubsettingCrossingFeature(element, messageAccepter);
	}
						
	public void validateCrossSubsettingCrossedFeature(Element element, ValidationMessageAccepter messageAccepter) {
		
		if (element instanceof CrossSubsetting sub) {
			Feature crossedFeature = sub.getCrossedFeature();
			Feature crossingFeature = sub.getCrossingFeature();
		    
		    if (crossingFeature != null && crossingFeature.isEnd() && crossingFeature.getOwningType() != null) {
		        EList<Feature> endFeatures = crossingFeature.getOwningType().getEndFeature();
		        EList<Feature> chainingFeatures = crossedFeature.getChainingFeature();
		        
		        if (chainingFeatures != null && endFeatures != null) {
		            Feature firstMismatchedEnd = endFeatures.stream().filter(f -> f != crossingFeature).findFirst().orElse(null);

		            boolean isChainSizeInvalid = chainingFeatures.size() != 2;
		            boolean isMatchInvalid = endFeatures.size() == 2 && (chainingFeatures.isEmpty() || chainingFeatures.get(0) != firstMismatchedEnd);

		            if (isChainSizeInvalid || isMatchInvalid) {
		                messageAccepter.error(sub, null, "validateCrossSubsettingCrossedFeature");
		            }
		        }
		    }
		}    
	}
	
	public void validateCrossSubsettingCrossingFeature(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof CrossSubsetting sub) {
			Feature crossingFeature = sub.getCrossingFeature();
			if (crossingFeature == null 
			        || !crossingFeature.isEnd() 
			        || crossingFeature.getOwningType() == null 
			        || crossingFeature.getOwningType().getEndFeature() == null 
			        || crossingFeature.getOwningType().getEndFeature().size() < 2) {
			        
			    messageAccepter.error(sub, null, "validateCrossSubsettingCrossingFeature");
			}
		}
	}
}
