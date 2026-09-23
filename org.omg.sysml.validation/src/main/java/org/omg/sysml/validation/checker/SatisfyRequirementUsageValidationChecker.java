package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class SatisfyRequirementUsageValidationChecker extends RequirementUsageValidationChecker {
	
	private final ValidationChecker assertConstraintUsage = factory.getValidationChecker(SysMLPackage.eINSTANCE.getAssertConstraintUsage());
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		assertConstraintUsage.validate(element, messageAccepter, visited);
		validateSatisfyRequirementUsageReference(element, messageAccepter);
	}
						
	public void validateSatisfyRequirementUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
