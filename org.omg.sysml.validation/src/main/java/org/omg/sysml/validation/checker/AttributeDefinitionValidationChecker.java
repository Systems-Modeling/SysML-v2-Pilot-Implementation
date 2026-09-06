package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.DataTypeValidationChecker;

public class AttributeDefinitionValidationChecker extends DataTypeValidationChecker {
	
	DefinitionValidationChecker definition = new DefinitionValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		definition.validate(element, messageAccepter);
		validateAttributeDefinitionFeatures(element, messageAccepter);
	}
						
	public void validateAttributeDefinitionFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
