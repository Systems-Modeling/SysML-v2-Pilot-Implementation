package org.omg.sysml.validation.kerml;

import java.util.List;
import java.util.Set;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.util.ValidationUtil; 

public class ExpressionValidationChecker extends StepValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateExpressionResultExpressionMembership(element, messageAccepter);
		validateExpressionResultParameterMembership(element, messageAccepter);
	}
						
	public void validateExpressionResultExpressionMembership(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Expression exp) {
			Set<ResultExpressionMembership>reMems = TypeUtil.getResultExpressionMembershipsOf(exp);
			if (reMems.size() > 1) {
			    List<ResultExpressionMembership> ownedMem = reMems.stream().filter(m -> m.getMembershipOwningNamespace() == exp).toList();

			    if (!ownedMem.isEmpty()) {
			        messageAccepter.error(ownedMem.get(0),SysMLPackage.eINSTANCE.getResultExpressionMembership_OwnedResultExpression(), "validateExpressionResultExpressionMembership");
			    } else {
			        messageAccepter.error(exp, null, "validateExpressionResultExpressionMembership");              
			    }
			}	
		}
	}
	
	public void validateExpressionResultParameterMembership(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Expression exp) {
			List<ReturnParameterMembership> mems = exp.getOwnedFeatureMembership().stream().filter(ReturnParameterMembership.class::isInstance).map(ReturnParameterMembership.class::cast).toList();
			ValidationUtil.checkAtMostOne(mems,messageAccepter, SysMLPackage.eINSTANCE.getParameterMembership_OwnedMemberParameter(), "validateExpressionResultParameterMembership");
		}
	}
}
