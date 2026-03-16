package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.ClassValidationChecker;

public class OccurrenceDefinitionValidationChecker extends DefinitionValidationChecker {
	
	ClassValidationChecker class_ = new ClassValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		class_.validate(element, messageAccepter);
	}
						
}
