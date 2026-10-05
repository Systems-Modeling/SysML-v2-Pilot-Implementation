package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class ResultExpressionMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	public ResultExpressionMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateResultExpressionMembershipOwningType(element, messageAccepter);
	}
						
	public void validateResultExpressionMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ResultExpressionMembership m) {
		    Object owningType = m.getOwningType();
		    if (!(owningType instanceof Function || owningType instanceof Expression)) {
		        messageAccepter.error(m, SysMLPackage.eINSTANCE.getParameterMembership_OwnedMemberParameter(), "validateResultExpressionMembershipOwningType");
		    }
		}
	}
}
