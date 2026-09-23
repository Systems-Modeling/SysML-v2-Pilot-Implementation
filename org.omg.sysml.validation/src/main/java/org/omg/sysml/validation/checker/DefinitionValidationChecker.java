package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ClassifierValidationChecker;

public class DefinitionValidationChecker extends ClassifierValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
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
