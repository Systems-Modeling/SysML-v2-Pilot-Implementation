package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.DataTypeValidationChecker;

public class AttributeDefinitionValidationChecker extends DataTypeValidationChecker {
	
	private final ValidationChecker definition;
	
	public AttributeDefinitionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		definition = factory.getValidationChecker(SysMLPackage.eINSTANCE.getDefinition());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		definition.validate(element, messageAccepter, visited);
		validateAttributeDefinitionFeatures(element, messageAccepter);
	}
						
	public void validateAttributeDefinitionFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
