package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;

public class InteractionValidationChecker extends AssociationValidationChecker {
	
	BehaviorValidationChecker behavior = new BehaviorValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		behavior.validate(element, messageAccepter);
	}
						
}
