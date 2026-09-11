package org.omg.kerml.validation.checker;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.InstantiationExpression;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class InstantiationExpressionValidationChecker extends ExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateInstantiationExpressionInstantiatedType(element, messageAccepter);
		validateInstantiationExpressionResult(element, messageAccepter);
	}
						
	public void validateInstantiationExpressionInstantiatedType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof InstantiationExpression e) {
			if (e.getInstantiatedType() == null) {
				messageAccepter.error(e, null, "validateInstantiationExpressionInstantiatedType");
			}
		}
	}
	
	public void validateInstantiationExpressionResult(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof InstantiationExpression e) {
			if (TypeUtil.getOwnedResultParameterOf(e) == null) {
				messageAccepter.error(e, null, "validateInstantiationExpressionResult");
			}
		}	
	}

	/**
	 * Used in subclasses ConstructorExpressionValidationChecker and InvocationExpressionValidationChecker.
	 */
	protected static void checkInstantiationExpressionFeatures(InstantiationExpression e, 
		    List<Feature> typeFeatures, List<Feature> exprFeatures, 
		    String redefMsg, String dupMsg, 
		    ValidationMessageAccepter messageAccepter) {
		    
			Set<Feature> usedFeatures = new HashSet<>();

		    for (Feature p : exprFeatures) {
		        List<Feature> redefFeatures = FeatureUtil.getRedefinedFeaturesOf(p).stream()
		            .filter(typeFeatures::contains).toList();

		        if (redefFeatures.size() != 1) {
		            // Expression feature must redefine exactly one feature of the instantiated type
		            messageAccepter.error(p, null, redefMsg);
		        } else if (redefFeatures.stream().anyMatch(usedFeatures::contains)) {
		            // Two expression features cannot redefine the same type feature 
		            messageAccepter.error(p, null, dupMsg);
		        }
		        
		        usedFeatures.addAll(redefFeatures);
		    }
		}

}
