package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class AssignmentActionUsageValidationChecker extends ActionUsageValidationChecker {
	
	public AssignmentActionUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateAssignmentActionUsage(element, messageAccepter);
		validateAssignmentActionUsageReferent(element, messageAccepter);
	}
						
	public void validateAssignmentActionUsage(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateAssignmentActionUsageReferent(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
