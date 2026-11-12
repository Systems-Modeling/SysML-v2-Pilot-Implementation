package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ForkNode;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ForkNodeValidationChecker extends ControlNodeValidationChecker {
	
	public ForkNodeValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateForkNodeIncomingSuccessions(element, messageAccepter);
	}
						
	public void validateForkNodeIncomingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		/* * no xtend code */
		if (element instanceof ForkNode fn) {
			if (!( fn.getNestedConnection().size() <= 1 ) ) {
				messageAccepter.error(fn, null, "validateForkNodeIncomingSuccessions");
			}
		}
	}
}
