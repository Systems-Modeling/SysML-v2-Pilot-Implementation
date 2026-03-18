package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class InteractionValidationChecker extends AssociationValidationChecker {
	
	BehaviorValidationChecker behavior = new BehaviorValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		behavior.validate(element, messageAccepter);
	}
						
}
