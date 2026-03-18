package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.StructureValidationChecker;

public class ItemDefinitionValidationChecker extends StructureValidationChecker {
	
	OccurrenceDefinitionValidationChecker occurrencedefinition = new OccurrenceDefinitionValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		occurrencedefinition.validate(element, messageAccepter);
	}
						
}
