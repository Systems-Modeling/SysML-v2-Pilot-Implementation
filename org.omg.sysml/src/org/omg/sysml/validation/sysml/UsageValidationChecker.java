package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.FeatureValidationChecker;

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
