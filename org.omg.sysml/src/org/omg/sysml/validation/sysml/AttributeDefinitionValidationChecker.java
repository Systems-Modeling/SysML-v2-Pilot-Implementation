package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.DataTypeValidationChecker;

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
