package org.omg.sysml.validation.kerml;

import java.util.stream.Collectors;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Metaclass;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.EvaluationUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;


public class MetadataFeatureValidationChecker extends AnnotatingElementValidationChecker {
	
	FeatureValidationChecker feature = new FeatureValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		feature.validate(element, messageAccepter);
		validateMetadataFeatureAnnotatedElement(element, messageAccepter);
		validateMetadataFeatureBody(element, messageAccepter);
		validateMetadataFeatureMetaclass(element, messageAccepter);
		validateMetadataFeatureMetaclassNotAbstract(element, messageAccepter);
	}
						
	public void validateMetadataFeatureAnnotatedElement(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof MetadataFeature mf) {
			var annotatedElementFeatures = FeatureUtil.getAllSubsettingFeaturesIn(mf, EvaluationUtil.getAnnotatedElementFeature(mf));

			if (annotatedElementFeatures.stream().anyMatch(f -> !f.isAbstract())) {
			    annotatedElementFeatures = annotatedElementFeatures.stream()
			            .filter(f -> !f.isAbstract())
			            .collect(Collectors.toList());
			}
			if (!annotatedElementFeatures.isEmpty()) {
			    for (var ae : mf.getAnnotatedElement()) {
			        var metaclass = ElementUtil.getMetaclassOf(ae);
			        
			        if (metaclass != null) {
			            boolean matchesAnyFeature = annotatedElementFeatures.stream().anyMatch(f -> 
			                f.getType().stream().allMatch(t -> TypeUtil.specializes(metaclass, t)));
			            
			            if (!matchesAnyFeature) {
			            	messageAccepter.error(mf, null, metaclass.getDeclaredName(), "validateMetadataFeatureAnnotatedElement");
			            }
			        }
			    }
			}
		}
	}
	
	public void validateMetadataFeatureBody(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof MetadataFeature mf) {
			// validateMetadataFeatureBody
		    checkMetadataBody(mf, messageAccepter);
		}
	}
	private void checkMetadataBody(Feature t, ValidationMessageAccepter messageAccepter) {
	    for (Feature f : t.getOwnedFeature()) {
	        checkMetadataBodyFeature(f, messageAccepter);
	    }
	}
	private void checkMetadataBodyFeature(Feature f, ValidationMessageAccepter messageAccepter) {
	    // Must redefine a feature owned by a supertype of its owner.
	    boolean hasValidRedefinition = f.getOwnedRedefinition().stream()
	            .map(redefinition -> redefinition.getRedefinedFeature() != null ? redefinition.getRedefinedFeature().getOwningType() : null)
	            .anyMatch(t -> t != null && TypeUtil.specializes(f.getOwningType(), t));

	    if (!hasValidRedefinition) {
	        messageAccepter.error(f, null, "validateMetadataFeatureBody");
	    }
    
	    // Feature value, if any, must be model-level evaluable.
	    var fv = FeatureUtil.getValuationFor(f);
	    var value = (fv != null) ? fv.getValue() : null;
    
	    if (value != null && !value.isModelLevelEvaluable()) {
	        messageAccepter.error(fv, SysMLPackage.eINSTANCE.getFeatureValue_Value(), "validateMetadataFeatureBody");
	    }
	    //Must have a valid metadata body.
		checkMetadataBody(f, messageAccepter); 
	} 
	
	public void validateMetadataFeatureMetaclass(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof MetadataFeature mf) {
			if (mf.getType().stream().filter(Metaclass.class::isInstance).count() != 1) {
				messageAccepter.error(mf, null, "validateMetadataFeatureMetaclass");
			}
		}
	}
	
	public void validateMetadataFeatureMetaclassNotAbstract(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof MetadataFeature mf) {
			if (mf.getType().stream().anyMatch(type -> type.isAbstract())) {
				messageAccepter.error(mf, null, "validateMetadataFeatureMetaclass");
			}
		}
	}
	
}
