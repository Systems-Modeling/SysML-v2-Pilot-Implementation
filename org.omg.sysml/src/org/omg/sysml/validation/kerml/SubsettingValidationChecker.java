package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class SubsettingValidationChecker extends SpecializationValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateSubsettingConstantConformance(element, messageAccepter);
		validateSubsettingFeaturingTypes(element, messageAccepter);
		validateSubsettingUniquenessConformance(element, messageAccepter);
	}
						
	public void validateSubsettingConstantConformance(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateSubsettingFeaturingTypes(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateSubsettingUniquenessConformance(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
