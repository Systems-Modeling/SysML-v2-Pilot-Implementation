package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ForLoopActionUsageValidationChecker extends LoopActionUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateForLoopActionUsageLoopVariable(element, messageAccepter);
		validateForLoopActionUsageParameters(element, messageAccepter);
	}
						
	public void validateForLoopActionUsageLoopVariable(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateForLoopActionUsageParameters(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
