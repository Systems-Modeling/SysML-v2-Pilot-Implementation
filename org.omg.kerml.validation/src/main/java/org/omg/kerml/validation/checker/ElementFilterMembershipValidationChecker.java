package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;

public class ElementFilterMembershipValidationChecker extends OwningMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateElementFilterMembershipConditionIsBoolean(element, messageAccepter);
		validateElementFilterMembershipConditionIsModelLevelEvaluable(element, messageAccepter);
	}
						
	public void validateElementFilterMembershipConditionIsBoolean(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateElementFilterMembershipConditionIsModelLevelEvaluable(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
