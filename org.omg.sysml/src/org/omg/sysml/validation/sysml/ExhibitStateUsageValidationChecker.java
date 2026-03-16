package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ExhibitStateUsageValidationChecker extends StateUsageValidationChecker {
	
	PerformActionUsageValidationChecker performactionusage = new PerformActionUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		performactionusage.validate(element, messageAccepter);
		validateExhibitStateUsageReference(element, messageAccepter);
	}
						
	public void validateExhibitStateUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
