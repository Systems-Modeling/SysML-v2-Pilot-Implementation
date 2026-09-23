package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class AssertConstraintUsageValidationChecker extends ConstraintUsageValidationChecker {
	
	private final ValidationChecker invariant = factory.getValidationChecker(SysMLPackage.eINSTANCE.getInvariant());;
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		invariant.validate(element, messageAccepter, visited);
		validateAssertConstraintUsageReference(element, messageAccepter);
	}
						
	public void validateAssertConstraintUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
