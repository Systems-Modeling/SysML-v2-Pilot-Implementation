package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ImportValidationChecker;

public class ExposeValidationChecker extends ImportValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
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
