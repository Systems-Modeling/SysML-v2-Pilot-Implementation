package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ConjugatedPortDefinitionValidationChecker extends PortDefinitionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateConjugatedPortDefinitionConjugatedPortDefinitionIsEmpty(element, messageAccepter);
		validateConjugatedPortDefinitionOriginalPortDefinition(element, messageAccepter);
	}
						
	public void validateConjugatedPortDefinitionConjugatedPortDefinitionIsEmpty(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateConjugatedPortDefinitionOriginalPortDefinition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
