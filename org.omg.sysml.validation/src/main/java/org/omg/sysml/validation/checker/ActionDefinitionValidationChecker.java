package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.BehaviorValidationChecker;

public class ActionDefinitionValidationChecker extends BehaviorValidationChecker {
	
	private final ValidationChecker occurrenceDefinition = factory.getValidationChecker(SysMLPackage.eINSTANCE.getOccurrenceDefinition());;
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		occurrenceDefinition.validate(element, messageAccepter, visited);
	}
						
}
