package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ObjectiveMembership;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureMembershipValidationChecker;

public class ObjectiveMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	public ObjectiveMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateObjectiveMembershipIsComposite(element, messageAccepter);
		validateObjectiveMembershipOwningType(element, messageAccepter);
	}
						
	public void validateObjectiveMembershipIsComposite(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ObjectiveMembership mem) {
			var ownedObjectiveRequirement = mem.getOwnedObjectiveRequirement(); 
			if (ownedObjectiveRequirement != null && !ownedObjectiveRequirement.isComposite()) {
				messageAccepter.error(mem, null, "validateObjectiveMembershipIsComposite");
			}
		}
	}
	
	public void validateObjectiveMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ObjectiveMembership mem) {
			var owningType = mem.getOwningType(); 
			if (!(owningType instanceof CaseDefinition || owningType instanceof CaseUsage)) {
				messageAccepter.error(mem, null, "validateObjectiveMembershipOwningType");
			}
		}
	}
}
