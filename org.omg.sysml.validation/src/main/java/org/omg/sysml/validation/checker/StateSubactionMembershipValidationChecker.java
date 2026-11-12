package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.StateUsage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureMembershipValidationChecker;

public class StateSubactionMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	public StateSubactionMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateStateSubactionMembershipOwningType(element, messageAccepter);
	}
						
	public void validateStateSubactionMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof StateSubactionMembership mem) {
			var owningType = mem.getOwningType();
			if (!(owningType instanceof StateUsage || owningType instanceof StateDefinition)) {
				messageAccepter.error(mem, null, "validateStateSubactionMembershipOwningType");
			}
		}
	}
}
