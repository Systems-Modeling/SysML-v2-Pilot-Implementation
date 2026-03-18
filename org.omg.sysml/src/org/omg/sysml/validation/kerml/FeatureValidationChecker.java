package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class FeatureValidationChecker extends TypeValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFeatureChainingFeatureConformance(element, messageAccepter);
		validateFeatureChainingFeatureNotOne(element, messageAccepter);
		validateFeatureChainingFeaturesNotSelf(element, messageAccepter);
		validateFeatureConstantIsVariable(element, messageAccepter);
		validateFeatureCrossFeatureSpecialization(element, messageAccepter);
		validateFeatureCrossFeatureType(element, messageAccepter);
		validateFeatureEndIsConstant(element, messageAccepter);
		validateFeatureEndMultiplicity(element, messageAccepter);
		validateFeatureEndNoDirection(element, messageAccepter);
		validateFeatureEndNotDerivedAbstractCompositeOrPortion(element, messageAccepter);
		validateFeatureIsVariable(element, messageAccepter);
		validateFeatureMultiplicityDomain(element, messageAccepter);
		validateFeatureOwnedCrossSubsetting(element, messageAccepter);
		validateFeatureOwnedReferenceSubsetting(element, messageAccepter);
		validateFeaturePortionNotVariable(element, messageAccepter);
	}
						
	public void validateFeatureChainingFeatureConformance(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureChainingFeatureNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureChainingFeaturesNotSelf(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureConstantIsVariable(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureCrossFeatureSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureCrossFeatureType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureEndIsConstant(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureEndMultiplicity(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureEndNoDirection(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureEndNotDerivedAbstractCompositeOrPortion(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureIsVariable(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureMultiplicityDomain(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureOwnedCrossSubsetting(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeatureOwnedReferenceSubsetting(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateFeaturePortionNotVariable(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
