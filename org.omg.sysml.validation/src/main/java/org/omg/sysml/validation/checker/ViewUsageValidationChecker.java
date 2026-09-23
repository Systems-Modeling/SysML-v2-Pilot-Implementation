package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ViewUsageValidationChecker extends PartUsageValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateViewUsageOnlyOneViewRendering(element, messageAccepter);
	}
						
	public void validateViewUsageOnlyOneViewRendering(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
