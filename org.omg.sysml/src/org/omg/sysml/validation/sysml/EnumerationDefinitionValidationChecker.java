package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class EnumerationDefinitionValidationChecker extends AttributeDefinitionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateEnumerationDefinitionIsVariation(element, messageAccepter);
	}
						
	public void validateEnumerationDefinitionIsVariation(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
