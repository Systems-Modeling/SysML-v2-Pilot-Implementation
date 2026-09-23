package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class MetadataDefinitionValidationChecker extends ItemDefinitionValidationChecker {
	
	private final ValidationChecker metaclass = factory.getValidationChecker(SysMLPackage.eINSTANCE.getMetaclass());
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		metaclass.validate(element, messageAccepter, visited);
	}
						
}
