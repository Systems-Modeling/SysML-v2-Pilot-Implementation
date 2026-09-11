package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.TypeUtil;

public class FeatureReferenceExpressionValidationChecker extends ExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFeatureReferenceExpressionReferentIsFeature(element, messageAccepter);
		validateFeatureReferenceExpressionResult(element, messageAccepter);
	}
						
	public void validateFeatureReferenceExpressionReferentIsFeature(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof FeatureReferenceExpression fre) {
			Element feature = ExpressionUtil.getReferentFor(fre);
			if (feature != null && !(feature instanceof Feature)) {
				messageAccepter.error(fre, null, "validateFeatureReferenceExpressionReferentIsFeature");
			}
			
		}
	}
	
	public void validateFeatureReferenceExpressionResult(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof FeatureReferenceExpression fre) {
			if (TypeUtil.getOwnedResultParameterOf(fre) == null) {
				messageAccepter.error(fre, null, "validateFeatureReferenceExpressionResult");
			}
		}
	}
	
}
