package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.FunctionValidationChecker;

public class CalculationDefinitionValidationChecker extends FunctionValidationChecker {
	
	ActionDefinitionValidationChecker actiondefinition = new ActionDefinitionValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		actiondefinition.validate(element, messageAccepter);
	}
						
}
