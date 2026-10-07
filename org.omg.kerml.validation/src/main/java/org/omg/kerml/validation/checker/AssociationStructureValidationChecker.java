package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class AssociationStructureValidationChecker extends AssociationValidationChecker {
	
	private final ValidationChecker structure;
	
	public AssociationStructureValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		structure = factory.getValidationChecker(SysMLPackage.eINSTANCE.getStructure());
	}
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.doValidate(element, messageAccepter, visited);
		structure.validate(element, messageAccepter, visited);
	}
						
}
