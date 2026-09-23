package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ControlNodeValidationChecker extends ActionUsageValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateControlNodeIncomingSuccessions(element, messageAccepter);
		validateControlNodeIsComposite(element, messageAccepter);
		validateControlNodeOutgoingSuccessions(element, messageAccepter);
		validateControlNodeOwningType(element, messageAccepter);
	}
						
	public void validateControlNodeIncomingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateControlNodeIsComposite(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateControlNodeOutgoingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateControlNodeOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
