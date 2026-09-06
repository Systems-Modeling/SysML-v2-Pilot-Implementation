package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;

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
