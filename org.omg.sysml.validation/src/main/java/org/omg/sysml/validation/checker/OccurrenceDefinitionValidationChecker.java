package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ClassValidationChecker;

public class OccurrenceDefinitionValidationChecker extends DefinitionValidationChecker {
	
	ClassValidationChecker class_ = new ClassValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		class_.validate(element, messageAccepter);
	}
						
}
