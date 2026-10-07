package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class SuccessionAsUsageValidationChecker extends ConnectorAsUsageValidationChecker {

	private final ValidationChecker succession;
	
	public SuccessionAsUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		succession = factory.getValidationChecker(SysMLPackage.eINSTANCE.getSuccession());		
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		succession.validate(element, messageAccepter, visited);
	}
						
}
