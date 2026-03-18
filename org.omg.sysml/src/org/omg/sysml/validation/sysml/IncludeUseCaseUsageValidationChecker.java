package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class IncludeUseCaseUsageValidationChecker extends UseCaseUsageValidationChecker {
	
	PerformActionUsageValidationChecker performactionusage = new PerformActionUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		performactionusage.validate(element, messageAccepter);
		validateIncludeUseCaseUsageReference(element, messageAccepter);
	}
						
	public void validateIncludeUseCaseUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
