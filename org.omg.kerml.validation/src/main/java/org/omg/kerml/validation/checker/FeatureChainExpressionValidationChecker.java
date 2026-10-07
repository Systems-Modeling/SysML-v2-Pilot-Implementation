package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.NamespaceUtil;

public class FeatureChainExpressionValidationChecker extends OperatorExpressionValidationChecker {
	
	public FeatureChainExpressionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.doValidate(element, messageAccepter, visited);
		validateFeatureChainExpressionConformance(element, messageAccepter);
		validateFeatureChainExpressionOperator(element, messageAccepter);
	}
						
	public void validateFeatureChainExpressionConformance(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof FeatureChainExpression fce) {
			Element feature = ExpressionUtil.getTargetFeatureFor(fce);
			Namespace rel = NamespaceUtil.getRelativeNamespaceFor(fce);
			
			if (feature != null && (!(feature instanceof Feature) || rel instanceof Type && !((Feature) feature).isFeaturedWithin((Type) rel))) {
				messageAccepter.error(fce.getOwnedMembership().get(1), SysMLPackage.eINSTANCE.getMembership_MemberElement() , "validateFeatureChainExpressionFeatureConformance");
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
