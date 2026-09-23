package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ExhibitStateUsageValidationChecker extends StateUsageValidationChecker {
	
	private final ValidationChecker performActionUsage = factory.getValidationChecker(SysMLPackage.eINSTANCE.getPerformActionUsage());
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		performActionUsage.validate(element, messageAccepter, visited);
		validateExhibitStateUsageReference(element, messageAccepter);
	}
						
	public void validateExhibitStateUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
