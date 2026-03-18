package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.ClassifierValidationChecker;

public class DefinitionValidationChecker extends ClassifierValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateDefinitionVariationIsAbstract(element, messageAccepter);
		validateDefinitionVariationOwnedFeatureMembership(element, messageAccepter);
		validateDefinitionVariationSpecialization(element, messageAccepter);
	}
						
	public void validateDefinitionVariationIsAbstract(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateDefinitionVariationOwnedFeatureMembership(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateDefinitionVariationSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
