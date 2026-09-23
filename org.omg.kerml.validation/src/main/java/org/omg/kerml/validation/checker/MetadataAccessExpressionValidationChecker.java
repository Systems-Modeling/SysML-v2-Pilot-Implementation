package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.MetadataAccessExpression;

public class MetadataAccessExpressionValidationChecker extends ExpressionValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateMetadataAccessExpressionReferencedElement(element, messageAccepter);
	}
						
	public void validateMetadataAccessExpressionReferencedElement(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof MetadataAccessExpression mae) {
			if (mae.getOwnedMembership().stream().allMatch(FeatureMembership.class::isInstance)) {
				messageAccepter.error(mae, null, "validateMetadataAccessExpressionReferencedElement");
			}
		}
	}
	
}
