package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class ReturnParameterMembershipValidationChecker extends ParameterMembershipValidationChecker {
	
	public ReturnParameterMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateReturnParameterMembershipOwningType(element, messageAccepter);
	}
						
	public void validateReturnParameterMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ReturnParameterMembership m) {
		    Object owningType = m.getOwningType();
		    if (!(owningType instanceof Function || owningType instanceof Expression)) {
		        messageAccepter.error(m, SysMLPackage.eINSTANCE.getParameterMembership_OwnedMemberParameter(), "validateReturnParameterMembershipOwningType");
		    }
		}
	}
}
