package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class MultiplicityRangeValidationChecker extends MultiplicityValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateMultiplicityRangeBoundResultTypes(element, messageAccepter);
		validateMultiplicityRangeBounds(element, messageAccepter);
	}
						
	public void validateMultiplicityRangeBoundResultTypes(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateMultiplicityRangeBounds(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
