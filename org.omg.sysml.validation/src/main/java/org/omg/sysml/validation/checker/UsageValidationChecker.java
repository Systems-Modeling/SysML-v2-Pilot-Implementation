package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureValidationChecker;

public class UsageValidationChecker extends FeatureValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateUsageIsReferential(element, messageAccepter);
		validateUsageVariationIsAbstract(element, messageAccepter);
		validateUsageVariationOwnedFeatureMembership(element, messageAccepter);
		validateUsageVariationSpecialization(element, messageAccepter);
	}
						
	public void validateUsageIsReferential(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateUsageVariationIsAbstract(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateUsageVariationOwnedFeatureMembership(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateUsageVariationSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
