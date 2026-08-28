package org.omg.sysml.validation.kerml;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.InstantiationExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.util.ValidationUtil;
public class InvocationExpressionValidationChecker extends InstantiationExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateInvocationExpressionInstantiatedType(element, messageAccepter);
		validateInvocationExpressionNoDuplicateParameterRedefinition(element, messageAccepter);
		validateInvocationExpressionOwnedFeatures(element, messageAccepter);
		validateInvocationExpressionParameterRedefinition(element, messageAccepter);
	}
						
	public void validateInvocationExpressionInstantiatedType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof InvocationExpression e) {
			var type = e.getInstantiatedType(); 
			if (!(type instanceof Behavior || (type instanceof Feature && ((Feature) type).getType().size() == 1 && ((Feature) type).getType().get(0) instanceof Behavior))) {
				messageAccepter.error(e, null, "validateInvocationExpressionInstantiatedType");
			}
		}	
	}
	
	public void validateInvocationExpressionNoDuplicateParameterRedefinition(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof InvocationExpression e) {
			var type = e.getInstantiatedType(); 
			List<Feature> typeParams = type.getInput(); 
			String redefMsg = "validateInvocationExpressionParameterRedefinition";
			String dupMsg = "validateInvocationExpressionNoDuplicateParameterRedefinition";
			List<Feature> exprParams = e.getOwnedFeature().stream().filter(p -> FeatureUtil.isInputDirected(p)).collect(Collectors.toList());
			ValidationUtil.checkInstantiationExpressionFeatures(e, typeParams, exprParams, redefMsg, dupMsg, messageAccepter);
		}
	}
	
	public void validateInvocationExpressionOwnedFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof InvocationExpression e) {
			// validateInvocationExpressionOwnedFeatures
			Feature result = TypeUtil.getOwnedResultParameterOf(e);

			for (Feature f : e.getOwnedFeature()) {
			    if (f != result && f.getDirection() != FeatureDirectionKind.IN) {
			        messageAccepter.error(f, null, "validateInvocationExpressionOwnedFeatures");
			    }
			}
		}
	}
	//????
	public void validateInvocationExpressionParameterRedefinition(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof InvocationExpression e) {
				var type = e.getInstantiatedType(); 
				List<Feature> typeParams = type.getInput(); 
				String redefMsg = "validateInvocationExpressionParameterRedefinition";
				String dupMsg = "validateInvocationExpressionNoDuplicateParameterRedefinition";
				List<Feature> exprParams = e.getOwnedFeature().stream().filter(p -> FeatureUtil.isInputDirected(p)).collect(Collectors.toList());
				ValidationUtil.checkInstantiationExpressionFeatures(e, typeParams, exprParams, redefMsg, dupMsg, messageAccepter);
		}
	}
}
