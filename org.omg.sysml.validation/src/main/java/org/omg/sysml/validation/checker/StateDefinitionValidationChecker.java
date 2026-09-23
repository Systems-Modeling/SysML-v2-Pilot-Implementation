package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class StateDefinitionValidationChecker extends ActionDefinitionValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateStateDefinitionParallelSubactions(element, messageAccepter);
		validateStateDefinitionStateSubactionKind(element, messageAccepter);
	}
						
	public void validateStateDefinitionParallelSubactions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateStateDefinitionStateSubactionKind(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
