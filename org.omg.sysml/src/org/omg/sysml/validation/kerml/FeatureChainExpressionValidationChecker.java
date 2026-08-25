package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class FeatureChainExpressionValidationChecker extends OperatorExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFeatureChainExpressionConformance(element, messageAccepter);
		validateFeatureChainExpressionOperator(element, messageAccepter);
	}
						
	public void validateFeatureChainExpressionConformance(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof FeatureChainExpression fce) {
			Element feature = ExpressionUtil.getTargetFeatureFor(fce);
			Namespace rel = NamespaceUtil.getRelativeNamespaceFor(fce);
			
			if (feature != null && (!(feature instanceof Feature) || (rel instanceof Type && !((Feature) feature).isFeaturedWithin((Type) rel)))) {
				messageAccepter.error(fce, SysMLPackage.eINSTANCE.getMembership_MemberElement() , "validateFeatureChainExpressionFeatureConformance");
			}
		}
		
	}
	
	public void validateFeatureChainExpressionOperator(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof FeatureChainExpression fce) {
			if (fce.getOperator() != "." ) {
				messageAccepter.error(fce, null, "validateFeatureChainExpressionOperator");
			}
		}
	}
}
