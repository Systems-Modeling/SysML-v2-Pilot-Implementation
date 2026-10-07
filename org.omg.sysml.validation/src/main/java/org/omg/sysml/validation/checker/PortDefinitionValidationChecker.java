package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class PortDefinitionValidationChecker extends OccurrenceDefinitionValidationChecker {
	
	private final ValidationChecker structure;
	
	public PortDefinitionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		structure = factory.getValidationChecker(SysMLPackage.eINSTANCE.getStructure());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		structure.validate(element, messageAccepter, visited);
		validatePortDefinitionConjugatedPortDefinition(element, messageAccepter);
		validatePortDefinitionOwnedUsagesNotComposite(element, messageAccepter);
	}
						
	public void validatePortDefinitionConjugatedPortDefinition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validatePortDefinitionOwnedUsagesNotComposite(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
