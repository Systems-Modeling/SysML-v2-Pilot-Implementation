package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureMembershipValidationChecker;

public class ObjectiveMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateObjectiveMembershipIsComposite(element, messageAccepter);
		validateObjectiveMembershipOwningType(element, messageAccepter);
	}
						
	public void validateObjectiveMembershipIsComposite(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateObjectiveMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
