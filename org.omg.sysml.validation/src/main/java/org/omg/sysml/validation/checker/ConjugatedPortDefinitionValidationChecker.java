package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ConjugatedPortDefinitionValidationChecker extends PortDefinitionValidationChecker {
	
	public ConjugatedPortDefinitionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateConjugatedPortDefinitionConjugatedPortDefinitionIsEmpty(element, messageAccepter);
		validateConjugatedPortDefinitionOriginalPortDefinition(element, messageAccepter);
	}
						
	public void validateConjugatedPortDefinitionConjugatedPortDefinitionIsEmpty(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateConjugatedPortDefinitionOriginalPortDefinition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
