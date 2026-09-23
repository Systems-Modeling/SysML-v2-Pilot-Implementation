package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class IncludeUseCaseUsageValidationChecker extends UseCaseUsageValidationChecker {
	
	ValidationChecker performActionUsage = factory.getValidationChecker(SysMLPackage.eINSTANCE.getPerformActionUsage());
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		performActionUsage.validate(element, messageAccepter, visited);
		validateIncludeUseCaseUsageReference(element, messageAccepter);
	}
						
	public void validateIncludeUseCaseUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
