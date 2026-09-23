package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class EnumerationDefinitionValidationChecker extends AttributeDefinitionValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateEnumerationDefinitionIsVariation(element, messageAccepter);
	}
						
	public void validateEnumerationDefinitionIsVariation(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
