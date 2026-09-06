package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.AssociationStructureValidationChecker;

public class ConnectionDefinitionValidationChecker extends AssociationStructureValidationChecker {
	
	PartDefinitionValidationChecker partdefinition = new PartDefinitionValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		partdefinition.validate(element, messageAccepter);
		validateConnectionDefinitionIsSufficient(element, messageAccepter);
	}
						
	public void validateConnectionDefinitionIsSufficient(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
