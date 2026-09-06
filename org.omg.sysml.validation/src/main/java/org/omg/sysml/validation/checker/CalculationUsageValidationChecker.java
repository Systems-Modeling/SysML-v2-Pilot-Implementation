package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ExpressionValidationChecker;

public class CalculationUsageValidationChecker extends ExpressionValidationChecker {
	
	ActionUsageValidationChecker actionusage = new ActionUsageValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		actionusage.validate(element, messageAccepter);
	}
						
}
