package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.StakeholderMembership;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ParameterMembershipValidationChecker;

public class StakeholderMembershipValidationChecker extends ParameterMembershipValidationChecker {
	
	public StakeholderMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateStakeholderMembershipOwningType(element, messageAccepter);
	}
						
	public void validateStakeholderMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof StakeholderMembership mem) {
			var owningType = mem.getOwningType(); 
			if (!(owningType instanceof RequirementDefinition || owningType instanceof RequirementUsage)) {
				messageAccepter.error(mem, null, "validateStakeholderMembershipOwningType");
			}
		}
	}	
}
