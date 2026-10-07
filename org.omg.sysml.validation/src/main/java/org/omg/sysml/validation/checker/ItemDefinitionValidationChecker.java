package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.StructureValidationChecker;

public class ItemDefinitionValidationChecker extends StructureValidationChecker {
	
	private final ValidationChecker occurrencedefinition;
	
	public ItemDefinitionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		occurrencedefinition = factory.getValidationChecker(SysMLPackage.eINSTANCE.getOccurrenceDefinition());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		occurrencedefinition.validate(element, messageAccepter, visited);
	}
						
}
