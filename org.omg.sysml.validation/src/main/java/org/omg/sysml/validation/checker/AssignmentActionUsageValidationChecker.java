package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class AssignmentActionUsageValidationChecker extends ActionUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateAssignmentActionUsage(element, messageAccepter);
		validateAssignmentActionUsageReferent(element, messageAccepter);
	}
						
	public void validateAssignmentActionUsage(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateAssignmentActionUsageReferent(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
