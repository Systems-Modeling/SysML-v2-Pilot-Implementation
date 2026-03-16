package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.NamespaceImportValidationChecker;

public class NamespaceExposeValidationChecker extends ExposeValidationChecker {
	
	NamespaceImportValidationChecker namespaceimport = new NamespaceImportValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		namespaceimport.validate(element, messageAccepter);
	}
						
}
