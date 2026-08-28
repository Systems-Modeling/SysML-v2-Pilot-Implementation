package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.ConstructorExpression;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.util.ValidationUtil;
import org.omg.sysml.lang.sysml.Feature;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorExpressionValidationChecker extends InstantiationExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateConstructorExpressionNoDuplicateFeatureRedefinition(element, messageAccepter);
		validateConstructorExpressionOwnedFeatures(element, messageAccepter);
	}
	//Need review 					
	public void validateConstructorExpressionNoDuplicateFeatureRedefinition(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ConstructorExpression ce) {
			String redefMsg = "checkConstructorExpressionResultFeatureRedefinition";
			String dupMsg = "validateConstructorExpressionNoDuplicateParameterRedefinition";
		    
		    Type type = ce.instantiatedType();
		    Feature result = TypeUtil.getOwnedResultParameterOf(ce);
		    
		    if (type != null && result != null) {
		        // Filter public type features
		        List<Feature> typeFeatures = type.getFeature().stream().filter(f -> f.getOwningMembership() != null && f.getOwningMembership().getVisibility() == VisibilityKind.PUBLIC).collect(Collectors.toList());
		            
		        // Filter input-directed result features
		        List<Feature> resultFeatures = result.getOwnedFeature().stream().filter(p -> FeatureUtil.isInputDirected(p)).collect(Collectors.toList());
		            //need help here. 
		        ValidationUtil.checkInstantiationExpressionFeatures(ce, typeFeatures, resultFeatures,redefMsg, dupMsg, messageAccepter );
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
