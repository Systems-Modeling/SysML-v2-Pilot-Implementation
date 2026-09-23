package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.InteractionValidationChecker;

public class FlowDefinitionValidationChecker extends InteractionValidationChecker {
	
	private final ValidationChecker actionDefinition = factory.getValidationChecker(SysMLPackage.eINSTANCE.getActionDefinition());
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		actionDefinition.validate(element, messageAccepter, visited);
		validateFlowDefinitionFlowEnds(element, messageAccepter);
	}
						
	public void validateFlowDefinitionFlowEnds(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
