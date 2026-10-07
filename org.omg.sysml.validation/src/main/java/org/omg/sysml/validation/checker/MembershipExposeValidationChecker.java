package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.MembershipImportValidationChecker;

public class MembershipExposeValidationChecker extends MembershipImportValidationChecker {
	
	private final ValidationChecker expose;
	
	public MembershipExposeValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		expose = factory.getValidationChecker(SysMLPackage.eINSTANCE.getExpose());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		expose.validate(element, messageAccepter, visited);
	}
						
}
