package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ViewDefinitionValidationChecker extends PartDefinitionValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateViewDefinitionOnlyOneViewRendering(element, messageAccepter);
	}
						
	public void validateViewDefinitionOnlyOneViewRendering(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
