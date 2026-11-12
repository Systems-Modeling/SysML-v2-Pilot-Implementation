package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.RequirementVerificationMembership;
import org.omg.sysml.util.UsageUtil;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class RequirementVerificationMembershipValidationChecker extends RequirementConstraintMembershipValidationChecker {
	
	public RequirementVerificationMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateRequirementVerificationMembershipKind(element, messageAccepter);
		validateRequirementVerificationMembershipOwningType(element, messageAccepter);
	}
						
	public void validateRequirementVerificationMembershipKind(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof RequirementVerificationMembership mem) {
			if (mem.getKind() != RequirementConstraintKind.REQUIREMENT) {
				messageAccepter.error(mem, null, "validateRequirementVerificationMembershipKind");
			}
		}
	}
	
	public void validateRequirementVerificationMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof RequirementVerificationMembership mem) {
			if (!UsageUtil.isLegalVerification(mem)) {
				messageAccepter.error(mem, null, "validateRequirementVerificationMembershipOwningType");
			}
		}
	}	
}