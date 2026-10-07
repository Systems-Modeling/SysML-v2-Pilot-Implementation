package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.BooleanExpressionValidationChecker;

public class ConstraintUsageValidationChecker extends BooleanExpressionValidationChecker {
	
	private final ValidationChecker occurrenceusage;
	
	public ConstraintUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		occurrenceusage = factory.getValidationChecker(SysMLPackage.eINSTANCE.getOccurrenceUsage());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		occurrenceusage.validate(element, messageAccepter, visited);
	}
						
}
