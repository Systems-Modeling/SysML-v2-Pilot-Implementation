package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class ReturnParameterMembershipValidationChecker extends ParameterMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateReturnParameterMembershipOwningType(element, messageAccepter);
	}
						
	public void validateReturnParameterMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ReturnParameterMembership m) {
		    // validateReturnParameterMembershipOwningType
		    Object owningType = m.getOwningType();
		    if (!(owningType instanceof Function || owningType instanceof Expression)) {
		        messageAccepter.error(m, SysMLPackage.eINSTANCE.getParameterMembership_OwnedMemberParameter(), "validateReturnParameterMembershipOwningType");
		    }
		}
	}
}
