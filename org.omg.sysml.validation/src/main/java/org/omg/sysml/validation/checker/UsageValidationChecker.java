package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureValidationChecker;

public class UsageValidationChecker extends FeatureValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
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
