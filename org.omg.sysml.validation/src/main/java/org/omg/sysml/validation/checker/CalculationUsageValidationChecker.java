package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ExpressionValidationChecker;

public class CalculationUsageValidationChecker extends ExpressionValidationChecker {
	
	private final ValidationChecker actionUsage;
	
	public CalculationUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		actionUsage = factory.getValidationChecker(SysMLPackage.eINSTANCE.getActionUsage());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		actionUsage.validate(element, messageAccepter, visited);
	}
						
}
