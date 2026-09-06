package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.StructureValidationChecker;

public class PortDefinitionValidationChecker extends OccurrenceDefinitionValidationChecker {
	
	StructureValidationChecker structure = new StructureValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		structure.validate(element, messageAccepter);
		validatePortDefinitionConjugatedPortDefinition(element, messageAccepter);
		validatePortDefinitionOwnedUsagesNotComposite(element, messageAccepter);
	}
						
	public void validatePortDefinitionConjugatedPortDefinition(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validatePortDefinitionOwnedUsagesNotComposite(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
