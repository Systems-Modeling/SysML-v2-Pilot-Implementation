package org.omg.kerml.validation.checker;

import java.util.List;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.ConstructorExpression;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class ConstructorExpressionValidationChecker extends InstantiationExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateConstructorExpressionNoDuplicateFeatureRedefinition(element, messageAccepter);
		validateConstructorExpressionOwnedFeatures(element, messageAccepter);
	}
						
	public void validateConstructorExpressionNoDuplicateFeatureRedefinition(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ConstructorExpression ce) {
		    Type type = ce.instantiatedType();
		    Feature result = TypeUtil.getOwnedResultParameterOf(ce);
		    
		    if (type != null && result != null) {
		        List<Feature> typeFeatures = type.getFeature().stream().filter(f -> f.getOwningMembership() != null && f.getOwningMembership().getVisibility() == VisibilityKind.PUBLIC).toList();
		        List<Feature> resultFeatures = result.getOwnedFeature().stream().filter(p -> FeatureUtil.isInputDirected(p)).toList();
		        checkInstantiationExpressionFeatures(ce, typeFeatures, resultFeatures, 
		        		"checkConstructorExpressionResultFeatureRedefinition", 
		        		"validateConstructorExpressionNoDuplicateParameterRedefinition", 
		        		messageAccepter);
		    }
		}    
	}
	
	public void validateConstructorExpressionOwnedFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ConstructorExpression ce) {
		
		    Feature result = TypeUtil.getOwnedResultParameterOf(ce);
		    
			for (Feature f : ce.getOwnedFeature()) {
			    if (f != result) {
			    	messageAccepter.error(ce, null, "validateConstructorExpressionOwnedFeatures");
			    }
			}			
		}
	}
}
