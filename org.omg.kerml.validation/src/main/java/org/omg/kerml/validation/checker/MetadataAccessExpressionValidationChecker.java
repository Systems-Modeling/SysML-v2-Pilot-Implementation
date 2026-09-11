package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.MetadataAccessExpression;

public class MetadataAccessExpressionValidationChecker extends ExpressionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
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
