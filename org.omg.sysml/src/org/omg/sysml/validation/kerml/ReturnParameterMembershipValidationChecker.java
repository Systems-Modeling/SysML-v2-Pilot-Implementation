package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.validation.ValidationMessageAccepter;

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
