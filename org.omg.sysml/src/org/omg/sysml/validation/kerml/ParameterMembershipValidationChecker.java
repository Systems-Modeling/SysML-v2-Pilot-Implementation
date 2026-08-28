package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ParameterMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateParameterMembershipOwningType(element, messageAccepter);
		validateParameterMembershipParameterDirection(element, messageAccepter);
	}
						
	public void validateParameterMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		// validateParameterMembershipOwningType
		if (element instanceof ParameterMembership m) {
			if (!(m instanceof ReturnParameterMembership)) {
			    var owningType = m.getOwningType();
			    if (!(owningType instanceof Behavior || owningType instanceof Step ||
			          ExpressionUtil.isConstructorResult(owningType))) {
			        
			        messageAccepter.error(m, SysMLPackage.eINSTANCE.getParameterMembership_OwnedMemberParameter(), "validateParameterMembershipOwningType");
			    }
			}
		}
	}
	
	public void validateParameterMembershipParameterDirection(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ParameterMembership m) {
			var ownedMemberParameter = m.getOwnedMemberParameter();

			if (ownedMemberParameter != null && ownedMemberParameter.getDirection() != m.parameterDirection()) {
			    messageAccepter.error(m, null, "validateParameterMembershipParameterDirection"); //probably wrong 
			}
		}
	}
}
