package org.omg.kerml.validation.checker;

import java.util.List;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.CrossSubsetting;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

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
		        List<Feature> endFeatures = crossingFeature.getOwningType().getEndFeature();
		        List<Feature> chainingFeatures = crossedFeature.getChainingFeature();
		        
		        if (chainingFeatures != null && endFeatures != null) {
		            if (chainingFeatures.size() != 2 || 
		            		endFeatures.size() == 2 && 
		            		chainingFeatures.get(0) != endFeatures.stream().filter(f -> f != crossingFeature).findFirst().orElse(null)) {
		                messageAccepter.error(sub, SysMLPackage.eINSTANCE.getCrossSubsetting_CrossedFeature(), "validateCrossSubsettingCrossedFeature");
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
