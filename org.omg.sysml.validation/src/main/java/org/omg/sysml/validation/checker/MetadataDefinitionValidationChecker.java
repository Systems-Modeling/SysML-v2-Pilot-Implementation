package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.MetaclassValidationChecker;

public class MetadataDefinitionValidationChecker extends ItemDefinitionValidationChecker {
	
	MetaclassValidationChecker metaclass = new MetaclassValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		metaclass.validate(element, messageAccepter);
	}
						
}
