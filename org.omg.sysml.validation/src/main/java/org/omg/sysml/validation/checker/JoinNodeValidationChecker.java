package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.JoinNode;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class JoinNodeValidationChecker extends ControlNodeValidationChecker {
	
	public JoinNodeValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateJoinNodeOutgoingSuccessions(element, messageAccepter);
	}
						
	public void validateJoinNodeOutgoingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		// no xtend code
		if (element instanceof JoinNode node) {
			if ((node.getNestedConnection().size() > 1)) {
				messageAccepter.error(node, null, "validateJoinNodeOutgoingSuccessions");
			}
		}
	}
}
