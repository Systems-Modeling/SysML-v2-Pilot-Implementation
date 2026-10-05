package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;

public class ParameterMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	public ParameterMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateParameterMembershipOwningType(element, messageAccepter);
		validateParameterMembershipParameterDirection(element, messageAccepter);
	}
						
	public void validateParameterMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ParameterMembership m) {
			if (!(m instanceof ReturnParameterMembership)) {
			    Type owningType = m.getOwningType();
			    if (!(owningType instanceof Behavior || owningType instanceof Step ||
			          ExpressionUtil.isConstructorResult(owningType))) {			        
			        messageAccepter.error(m, SysMLPackage.eINSTANCE.getParameterMembership_OwnedMemberParameter(), "validateParameterMembershipOwningType");
			    }
			}
		}
	}
	
	public void validateParameterMembershipParameterDirection(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ParameterMembership m) {
			Feature ownedMemberParameter = m.getOwnedMemberParameter();

			if (ownedMemberParameter != null && ownedMemberParameter.getDirection() != m.parameterDirection()) {
			    messageAccepter.error(m, null, "validateParameterMembershipParameterDirection", m.parameterDirection().toString().toLowerCase());
			}
		}
	}
}
