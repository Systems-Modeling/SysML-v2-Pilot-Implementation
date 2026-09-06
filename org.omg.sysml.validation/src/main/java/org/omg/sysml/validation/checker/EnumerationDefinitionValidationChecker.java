package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class EnumerationDefinitionValidationChecker extends AttributeDefinitionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateEnumerationDefinitionIsVariation(element, messageAccepter);
	}
						
	public void validateEnumerationDefinitionIsVariation(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
