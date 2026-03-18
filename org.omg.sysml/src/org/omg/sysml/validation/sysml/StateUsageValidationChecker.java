package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class StateUsageValidationChecker extends ActionUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateStateUsageParallelSubactions(element, messageAccepter);
		validateStateUsageStateSubactionKind(element, messageAccepter);
	}
						
	public void validateStateUsageParallelSubactions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateStateUsageStateSubactionKind(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
