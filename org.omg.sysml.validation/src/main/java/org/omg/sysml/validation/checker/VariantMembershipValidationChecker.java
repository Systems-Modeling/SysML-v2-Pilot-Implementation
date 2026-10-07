package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.OwningMembershipValidationChecker;

public class VariantMembershipValidationChecker extends OwningMembershipValidationChecker {
	
	public VariantMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateVariantMembershipOwningNamespace(element, messageAccepter);
	}
						
	public void validateVariantMembershipOwningNamespace(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
