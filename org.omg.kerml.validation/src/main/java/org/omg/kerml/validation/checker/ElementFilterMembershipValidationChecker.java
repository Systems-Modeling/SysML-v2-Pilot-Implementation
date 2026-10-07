package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ElementFilterMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class ElementFilterMembershipValidationChecker extends OwningMembershipValidationChecker {
	
	public ElementFilterMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.doValidate(element, messageAccepter, visited);
		if (validateElementFilterMembershipConditionIsModelLevelEvaluable(element, messageAccepter)) {
			validateElementFilterMembershipConditionIsBoolean(element, messageAccepter);
		}
	}
						
	public void validateElementFilterMembershipConditionIsBoolean(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ElementFilterMembership efm) {
			Expression condition = efm.getCondition();
			if (!ValidationUtil.isBoolean(condition)) {
				messageAccepter.error(efm, SysMLPackage.eINSTANCE.getElementFilterMembership_Condition(), "validateElementFilterMembershipConditionIsBoolean");
			}
		}
	}
	
	public boolean validateElementFilterMembershipConditionIsModelLevelEvaluable(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ElementFilterMembership efm) {
			Expression condition = efm.getCondition();
			if (!condition.isModelLevelEvaluable()) {
				messageAccepter.error(efm, SysMLPackage.eINSTANCE.getElementFilterMembership_Condition(), "validateElementFilterMembershipConditionIsModelLevelEvaluable");
				return false;
			}
		}
		return true;
	}
	
}
