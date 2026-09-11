package org.omg.kerml.validation.checker;

import java.util.List;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class InvocationExpressionValidationChecker extends InstantiationExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateInvocationExpressionInstantiatedType(element, messageAccepter);
		validateInvocationExpressionNoDuplicateAndParameterRedefinition(element, messageAccepter);
		validateInvocationExpressionOwnedFeatures(element, messageAccepter);
	}
						
	public void validateInvocationExpressionInstantiatedType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof InvocationExpression e) {
			if (!instantiatedTypeIsValid(e)) {
				messageAccepter.error(e, null, "validateInvocationExpressionInstantiatedType");
			}
		}	
	}
	
	public void validateInvocationExpressionNoDuplicateAndParameterRedefinition(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof InvocationExpression e) {
			// Don't check the if the instantiated type is invalid, 
			// to avoid unnecessary multiple error messages.
			if (instantiatedTypeIsValid(e)) {
				var type = e.getInstantiatedType(); 
				List<Feature> typeParams = type.getInput(); 
				List<Feature> exprParams = e.getOwnedFeature().stream().filter(FeatureUtil::isInputDirected).toList();
				checkInstantiationExpressionFeatures(e, typeParams, exprParams, 
						"validateInvocationExpressionParameterRedefinition", 
						"validateInvocationExpressionNoDuplicateParameterRedefinition", 
						messageAccepter);
			}
		}
	}
	
	public void validateInvocationExpressionOwnedFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof InvocationExpression e) {
			// Don't check the if the instantiated type is invalid, 
			// to avoid unnecessary multiple error messages.
			if (instantiatedTypeIsValid(e)) {
				Feature result = TypeUtil.getOwnedResultParameterOf(e);
	
				for (Feature f : e.getOwnedFeature()) {
				    if (f != result && f.getDirection() != FeatureDirectionKind.IN) {
				        messageAccepter.error(f, null, "validateInvocationExpressionOwnedFeatures");
				    }
				}
			}
		}
	}
	
	protected static boolean instantiatedTypeIsValid(InvocationExpression e) {
		Type type = e.getInstantiatedType();
		return type instanceof Behavior || 
				type instanceof Feature && 
				((Feature) type).getType().size() == 1 && 
				((Feature) type).getType().get(0) instanceof Behavior;
	}

}
