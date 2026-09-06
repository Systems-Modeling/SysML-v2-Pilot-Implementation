package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class ResultExpressionMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateResultExpressionMembershipOwningType(element, messageAccepter);
	}
						
	public void validateResultExpressionMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ResultExpressionMembership m) {
			
		    // validateResultExpressionMembershipOwningType
		    Object owningType = m.getOwningType();
		    if (!(owningType instanceof Function || owningType instanceof Expression)) {
		        messageAccepter.error(m, SysMLPackage.eINSTANCE.getParameterMembership_OwnedMemberParameter(), "validateResultExpressionMembershipOwningType");
		    }
		}
	}
}
