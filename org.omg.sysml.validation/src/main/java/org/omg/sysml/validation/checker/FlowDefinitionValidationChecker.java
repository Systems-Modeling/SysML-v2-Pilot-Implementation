package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.InteractionValidationChecker;

public class FlowDefinitionValidationChecker extends InteractionValidationChecker {
	
	ActionDefinitionValidationChecker actiondefinition = new ActionDefinitionValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		actiondefinition.validate(element, messageAccepter);
		validateFlowDefinitionFlowEnds(element, messageAccepter);
	}
						
	public void validateFlowDefinitionFlowEnds(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
