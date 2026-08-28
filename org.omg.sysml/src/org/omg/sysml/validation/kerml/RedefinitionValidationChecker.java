package org.omg.sysml.validation.kerml;

import java.util.Collections;
import java.util.List;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.validation.ValidationMessageAccepter;
import java.util.HashSet;

public class RedefinitionValidationChecker extends SubsettingValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateRedefinitionDirectionConformance(element, messageAccepter);
		validateRedefinitionEndConformance(element, messageAccepter);
		validateRedefinitionFeaturingTypes(element, messageAccepter);
	}
						
	public void validateRedefinitionDirectionConformance(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Redefinition redef) {
			var redefiningFeature = redef.getRedefiningFeature();
			var redefinedFeature = redef.getRedefinedFeature(); 
			checkRedefinitionDirection(redefiningFeature, redefinedFeature, redef, messageAccepter);
		}
	}
	
	public void validateRedefinitionEndConformance(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Redefinition redef) {
			var redefiningFeature = redef.getRedefiningFeature();
			var redefinedFeature = redef.getRedefinedFeature(); 
			if (redefinedFeature.isEnd() && !redefiningFeature.isEnd()) {
			    messageAccepter.error(redef, SysMLPackage.eINSTANCE.getRedefinition_RedefinedFeature(), "validatRedefinitionEndConformance");
			}
		}
	}
	
	public void validateRedefinitionFeaturingTypes(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Redefinition redef) {
			var redefiningFeature = redef.getRedefiningFeature();
			var redefinedFeature = redef.getRedefinedFeature();
			var redefiningFeaturingTypes = effectiveFeaturingTypes(redefiningFeature);
			var redefinedFeatureTypes = effectiveFeaturingTypes(redefinedFeature);
			
			if (redefinedFeature.getOwningRelationship() != redef &&
				    new HashSet<>(redefinedFeatureTypes).equals(new HashSet<>(redefiningFeaturingTypes))) {
				    
				    if (redefiningFeaturingTypes.isEmpty()) {
				        messageAccepter.error(redef, SysMLPackage.eINSTANCE.getRedefinition_RedefinedFeature(), "validateRedefinitionFeaturingTypes");
				    } else {
				        messageAccepter.error(redef, SysMLPackage.eINSTANCE.getRedefinition_RedefinedFeature(), "validateRedefinitionFeaturingTypes");
				    }
			}
		}
	}
	public static void checkRedefinitionDirection (Feature redefiningFeature, Feature redefinedFeature, Element source, ValidationMessageAccepter messageAccepter) {
		
	    FeatureDirectionKind redefiningDirection = redefiningFeature.getDirection();
	    
	  
	    for (Type featuringType : effectiveFeaturingTypes(redefiningFeature)) {
	        FeatureDirectionKind redefinedDirection = featuringType.directionOf(redefinedFeature);
	        
	        if (((redefinedDirection == FeatureDirectionKind.IN || redefinedDirection == FeatureDirectionKind.OUT) 
	                && redefiningDirection != redefinedDirection) || 
	            (redefinedDirection == FeatureDirectionKind.INOUT && redefiningDirection == null)) {
	                
	            if (source instanceof Redefinition) {
	            	messageAccepter.error(source, SysMLPackage.eINSTANCE.getRedefinition_RedefinedFeature(), "validateRedefinitionDirectionConformance");
	            } else {
	                messageAccepter.error(source, null, "validateRedefinitionDirectionConformance");
	            }
	        }
	    }
	}
	public static List<Type> effectiveFeaturingTypes(Feature feature) {
	    if (feature.isVariable()) {
	        return Collections.singletonList(feature.getOwningType());
	    } else {
	        return feature.getFeaturingType();
	    }
	}
	
}
