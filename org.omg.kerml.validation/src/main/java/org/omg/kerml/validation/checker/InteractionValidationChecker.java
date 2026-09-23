package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class InteractionValidationChecker extends AssociationValidationChecker {
	
	private final ValidationChecker behavior = factory.getValidationChecker(SysMLPackage.eINSTANCE.getBehavior());
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		behavior.validate(element, messageAccepter, visited);
	}
						
}
