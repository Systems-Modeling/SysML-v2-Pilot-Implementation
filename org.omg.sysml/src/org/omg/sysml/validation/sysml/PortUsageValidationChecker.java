package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class PortUsageValidationChecker extends OccurrenceUsageValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validatePortUsageIsReference(element, messageAccepter);
		validatePortUsageNestedUsagesNotComposite(element, messageAccepter);
	}
						
	public void validatePortUsageIsReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validatePortUsageNestedUsagesNotComposite(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
