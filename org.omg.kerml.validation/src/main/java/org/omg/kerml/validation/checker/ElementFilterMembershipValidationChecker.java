package org.omg.kerml.validation.checker;

import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ElementFilterMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class ElementFilterMembershipValidationChecker extends OwningMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateElementFilterMembershipConditionIsBoolean(element, messageAccepter);
		validateElementFilterMembershipConditionIsModelLevelEvaluable(element, messageAccepter);
	}
						
	public void validateElementFilterMembershipConditionIsBoolean(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ElementFilterMembership efm) {
			Expression condition = efm.getCondition();
			if (!ValidationUtil.isBoolean(condition)) {
				messageAccepter.error(efm, SysMLPackage.eINSTANCE.getElementFilterMembership_Condition(), "validateElementFilterMembershipIsBooolean");
			}
		}
	}
	
	public void validateElementFilterMembershipConditionIsModelLevelEvaluable(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ElementFilterMembership efm) {
			Expression condition = efm.getCondition();
			if (!condition.isModelLevelEvaluable()) {
				messageAccepter.error(efm, SysMLPackage.eINSTANCE.getElementFilterMembership_Condition(), "validateElementFilterMembershipIsModelLevelEvaluable");
			}
		}
	}
	
}
