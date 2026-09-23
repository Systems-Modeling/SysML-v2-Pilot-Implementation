package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ConstraintDefinitionValidationChecker extends OccurrenceDefinitionValidationChecker {
	
	private final ValidationChecker predicate = factory.getValidationChecker(SysMLPackage.eINSTANCE.getPredicate());
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		predicate.validate(element, messageAccepter, visited);
	}
						
}
