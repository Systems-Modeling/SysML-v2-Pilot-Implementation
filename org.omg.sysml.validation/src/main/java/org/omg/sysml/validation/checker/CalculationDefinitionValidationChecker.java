package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FunctionValidationChecker;

public class CalculationDefinitionValidationChecker extends FunctionValidationChecker {
	
	private final ValidationChecker actionDefinition;
	
	public CalculationDefinitionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		actionDefinition = factory.getValidationChecker(SysMLPackage.eINSTANCE.getActionDefinition());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		actionDefinition.validate(element, messageAccepter, visited);
	}
						
}
