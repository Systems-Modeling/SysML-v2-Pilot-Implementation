package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.AssociationStructureValidationChecker;

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
