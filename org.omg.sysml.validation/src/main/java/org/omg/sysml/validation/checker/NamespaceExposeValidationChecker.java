package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class NamespaceExposeValidationChecker extends ExposeValidationChecker {
	
	private final ValidationChecker namespaceImport = factory.getValidationChecker(SysMLPackage.eINSTANCE.getNamespaceImport());
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		namespaceImport.validate(element, messageAccepter, visited);
	}
						
}
