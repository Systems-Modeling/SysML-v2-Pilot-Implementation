package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class StateDefinitionValidationChecker extends ActionDefinitionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateStateDefinitionParallelSubactions(element, messageAccepter);
		validateStateDefinitionStateSubactionKind(element, messageAccepter);
	}
						
	public void validateStateDefinitionParallelSubactions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateStateDefinitionStateSubactionKind(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
