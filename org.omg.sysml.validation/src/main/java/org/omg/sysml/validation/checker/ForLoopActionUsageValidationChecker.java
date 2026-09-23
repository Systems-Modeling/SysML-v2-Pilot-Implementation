package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ForLoopActionUsageValidationChecker extends LoopActionUsageValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateForLoopActionUsageLoopVariable(element, messageAccepter);
		validateForLoopActionUsageParameters(element, messageAccepter);
	}
						
	public void validateForLoopActionUsageLoopVariable(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateForLoopActionUsageParameters(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
