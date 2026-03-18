package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.ExpressionValidationChecker;

public class CalculationUsageValidationChecker extends ExpressionValidationChecker {
	
	ActionUsageValidationChecker actionusage = new ActionUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		actionusage.validate(element, messageAccepter);
	}
						
}
