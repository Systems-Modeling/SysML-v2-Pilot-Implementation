package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.AssociationStructureValidationChecker;

public class ConnectionDefinitionValidationChecker extends AssociationStructureValidationChecker {
	
	private final ValidationChecker partdefinition = factory.getValidationChecker(SysMLPackage.eINSTANCE.getPartDefinition());
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		partdefinition.validate(element, messageAccepter, visited);
		validateConnectionDefinitionIsSufficient(element, messageAccepter);
	}
						
	public void validateConnectionDefinitionIsSufficient(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
