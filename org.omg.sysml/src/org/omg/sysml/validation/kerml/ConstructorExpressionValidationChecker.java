package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.ConstructorExpression;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;

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
						
	public void validateConstructorExpressionNoDuplicateFeatureRedefinition(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ConstructorExpression ce) {
			// checkConstructorExpressionResultFeatureRedefinition (validation)
		    // validateConstructorExpressionNoDuplicateParameterRedefinition
		    Type type = ce.instantiatedType();
		    Feature result = TypeUtil.getOwnedResultParameterOf(ce);
		    
		    if (type != null && result != null) {
		        // Filter public type features using Java Streams
		        List<Feature> typeFeatures = type.getFeature().stream().filter(f -> f.getOwningMembership() != null && f.getOwningMembership().getVisibility() == VisibilityKind.PUBLIC).collect(Collectors.toList());
		            
		        // Filter input-directed result features using Java Streams
		        List<Feature> resultFeatures = result.getOwnedFeature().stream()
		            .filter(p -> FeatureUtil.isInputDirected(p))
		            .collect(Collectors.toList());
		            //need help here. 
		      //  ce.checkInstantiationExpressionFeatures(typeFeatures, resultFeatures);
		    }
		}    
	}
	
	public void validateConstructorExpressionOwnedFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
