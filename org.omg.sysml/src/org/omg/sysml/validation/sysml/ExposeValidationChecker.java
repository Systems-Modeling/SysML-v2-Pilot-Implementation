package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.ImportValidationChecker;

public class ExposeValidationChecker extends ImportValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateExposeIsImportAll(element, messageAccepter);
		validateExposeOwningNamespace(element, messageAccepter);
		validateExposeVisibility(element, messageAccepter);
	}
						
	public void validateExposeIsImportAll(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateExposeOwningNamespace(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateExposeVisibility(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
