package org.omg.kerml.validation.checker;

import java.util.List;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Metaclass;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.EvaluationUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;


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
			List<Feature> annotatedElementFeatures = FeatureUtil.getAllSubsettingFeaturesIn(mf, EvaluationUtil.getAnnotatedElementFeature(mf));

			if (annotatedElementFeatures.stream().anyMatch(f -> !f.isAbstract())) {
			    annotatedElementFeatures = annotatedElementFeatures.stream()
			            .filter(f -> !f.isAbstract()).toList();
			}
			if (!annotatedElementFeatures.isEmpty()) {
			    for (var ae : mf.getAnnotatedElement()) {
			        var metaclass = ElementUtil.getMetaclassOf(ae);
			        
			        if (metaclass != null) {
			            boolean matchesAnyFeature = annotatedElementFeatures.stream().anyMatch(f -> 
			                f.getType().stream().allMatch(t -> TypeUtil.specializes(metaclass, t)));
			            
			            if (!matchesAnyFeature) {
			            	messageAccepter.error(mf, null, "validateMetadataFeatureAnnotatedElement", metaclass.getDeclaredName());
			            }
			        }
			    }
			}
		}
	}
	
	public void validateMetadataFeatureBody(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof MetadataFeature mf) {
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
	    FeatureValue fv = FeatureUtil.getValuationFor(f);
	    Expression value = fv != null ? fv.getValue() : null;
    
	    if (value != null && !value.isModelLevelEvaluable()) {
	        messageAccepter.error(fv, SysMLPackage.eINSTANCE.getFeatureValue_Value(), "validateMetadataFeatureBody");
	    }
	    
	    //Must have a valid metadata body.
		checkMetadataBody(f, messageAccepter); 
	} 
	
	// TODO: Submit new issue to revise this to actually fix the problem KERML-90 was trying to address.
	public void validateMetadataFeatureMetaclass(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof MetadataFeature mf) {
			if (mf.getType().stream().filter(Metaclass.class::isInstance).count() != 1) {
				messageAccepter.error(mf, null, "validateMetadataFeatureMetaclass");
			}
		}
	}
	
	public void validateMetadataFeatureMetaclassNotAbstract(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof MetadataFeature mf) {
			if (mf.getType().stream().anyMatch(Type::isAbstract)) {
				messageAccepter.error(mf, null, "validateMetadataFeatureMetaclass");
			}
		}
	}
	
}
