package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.PartUsage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class PartUsageValidationChecker extends ItemUsageValidationChecker {
	
	public PartUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validatePartUsagePartDefinition(element, messageAccepter);
	}
						
	public void validatePartUsagePartDefinition(Element element, ValidationMessageAccepter messageAccepter) {
		// no xtend code - rule only. 
		if (element instanceof PartUsage usg) {
			if (usg.getPartDefinition().isEmpty()) {
				messageAccepter.error(usg, null, "validatePartUsagePartDefinition");
			}
		}	
	}
}
