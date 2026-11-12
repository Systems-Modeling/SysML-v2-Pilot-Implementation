package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.ActorMembership;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ParameterMembershipValidationChecker;


public class ActorMembershipValidationChecker extends ParameterMembershipValidationChecker {
	
	public ActorMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateActorMembershipOwningType(element, messageAccepter);
	}
						
	public void validateActorMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ActorMembership mem) {
			Type owningType = mem.getOwningType();
			if (!(owningType instanceof RequirementDefinition || 
					owningType instanceof RequirementUsage || 
					owningType instanceof CaseDefinition || 
					owningType instanceof CaseUsage)) {
				messageAccepter.error(mem, null, "validateActorMembershipOwningType");
			}
		}
	}
}
