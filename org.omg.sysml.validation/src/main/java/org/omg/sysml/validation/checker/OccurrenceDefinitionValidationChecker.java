package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class OccurrenceDefinitionValidationChecker extends DefinitionValidationChecker {
	
	private final ValidationChecker class_;
	
	public OccurrenceDefinitionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		class_ = factory.getValidationChecker(SysMLPackage.eINSTANCE.getClass_());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		class_.validate(element, messageAccepter, visited);
	}
						
}
