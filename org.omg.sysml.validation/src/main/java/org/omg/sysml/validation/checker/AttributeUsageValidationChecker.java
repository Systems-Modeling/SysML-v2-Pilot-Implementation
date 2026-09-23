package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class AttributeUsageValidationChecker extends UsageValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateAttributeUsageFeatures(element, messageAccepter);
		validateAttributeUsageIsReference(element, messageAccepter);
	}
						
	public void validateAttributeUsageFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateAttributeUsageIsReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
