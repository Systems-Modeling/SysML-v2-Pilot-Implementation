package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ImportValidationChecker;

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
