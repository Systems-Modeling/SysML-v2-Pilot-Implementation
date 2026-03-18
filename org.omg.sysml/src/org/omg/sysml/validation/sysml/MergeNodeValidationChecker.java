package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class MergeNodeValidationChecker extends ControlNodeValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateMergeNodeIncomingSuccessions(element, messageAccepter);
		validateMergeNodeOutgoingSuccessions(element, messageAccepter);
	}
						
	public void validateMergeNodeIncomingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateMergeNodeOutgoingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
