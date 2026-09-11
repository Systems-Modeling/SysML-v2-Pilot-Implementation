package org.omg.kerml.validation.checker;

import java.util.List;

import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class OperatorExpressionValidationChecker extends InvocationExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateOperatorExpressionCastConformance_(element, messageAccepter);
		validateOperatorExpressionBracketOperator_(element, messageAccepter);
	}

	public void validateOperatorExpressionCastConformance_(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof OperatorExpression e) {
		// TODO: Add validateOperatorExpressionCastConformance?
			if ("as".equals(e.getOperator())) {
				List<Feature> params = TypeUtil.getOwnedParametersOf(e);
				if (params.size() >= 2) {
					Expression arg = FeatureUtil.getValueExpressionFor(params.get(0));
					if (arg != null) {
						List<Type> argTypes = arg.getResult().getType();
						List<Type> targetTypes = params.get(1).getType();
						if (!ValidationUtil.typesConform(argTypes, targetTypes)) {
							messageAccepter.warning(e, null, "validateOperatorExpressionCastConformance_");
						}
					}
				}
			}
		}
	}
	
	public void validateOperatorExpressionBracketOperator_(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof OperatorExpression e) {
			if ("[".equals(e.getOperator())) {
				messageAccepter.warning(e, null, "validateOperatorExpressionBracketOperator_");
			}
		}
	}

}
