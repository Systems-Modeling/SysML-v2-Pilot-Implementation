package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.MetaclassValidationChecker;

public class MetadataDefinitionValidationChecker extends ItemDefinitionValidationChecker {
	
	MetaclassValidationChecker metaclass = new MetaclassValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		metaclass.validate(element, messageAccepter);
	}
						
}
