package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.SuccessionFlowValidationChecker;

public class SuccessionFlowUsageValidationChecker extends SuccessionFlowValidationChecker {
	
	private final ValidationChecker flowUsage;

	public SuccessionFlowUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		flowUsage = factory.getValidationChecker(SysMLPackage.eINSTANCE.getFlowUsage());
	}
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		flowUsage.validate(element, messageAccepter, visited);
	}
						
}
