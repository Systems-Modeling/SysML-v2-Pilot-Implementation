package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.NamespaceImportValidationChecker;

public class NamespaceExposeValidationChecker extends ExposeValidationChecker {
	
	NamespaceImportValidationChecker namespaceimport = new NamespaceImportValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		namespaceimport.validate(element, messageAccepter);
	}
						
}
