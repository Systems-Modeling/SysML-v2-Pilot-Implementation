package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ParameterMembershipValidationChecker;

public class SubjectMembershipValidationChecker extends ParameterMembershipValidationChecker {
	
	public SubjectMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateSubjectMembershipOwningType(element, messageAccepter);
	}
						
	public void validateSubjectMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof SubjectMembership mem) {
			var owningType = mem.getOwningType(); 
			if (!(owningType instanceof RequirementDefinition || owningType instanceof RequirementUsage || owningType instanceof CaseDefinition || owningType instanceof CaseUsage)) {
				messageAccepter.error(mem, null, "validateSubjectMembershipOwningType");
			}
		}
	}	
}
