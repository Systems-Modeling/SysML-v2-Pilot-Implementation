package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class WhileLoopActionUsageValidationChecker extends LoopActionUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateWhileLoopActionUsage(element, messageAccepter);
	}
						
	public void validateWhileLoopActionUsage(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
