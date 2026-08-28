package org.omg.sysml.validation.kerml;

import java.util.List;
import java.util.Set;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.ValidationUtil; 
public class FunctionValidationChecker extends BehaviorValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFunctionResultExpressionMembership(element, messageAccepter);
		validateFunctionResultParameterMembership(element, messageAccepter);
	}
						
	public void validateFunctionResultExpressionMembership(Element element, ValidationMessageAccepter messageAccepter) {
		// validateFunctionResultExpressionMembership
		if (element instanceof Function f) {
			
			Set<ResultExpressionMembership> reMems = TypeUtil.getResultExpressionMembershipsOf(f);

			if (reMems.size() > 1) {
			    List<ResultExpressionMembership> ownedMem = reMems.stream().filter(m -> m.getMembershipOwningNamespace() == f).toList();

			    if (!ownedMem.isEmpty()) {
			        messageAccepter.error(f, SysMLPackage.eINSTANCE.getResultExpressionMembership_OwnedResultExpression(), "validateFunctionResultExpressionMembership");
			    } else {
			        messageAccepter.error(f, null, "validateFunctionResultExpressionMembership");              
			    }
			}
		}
	}
	
	public void validateFunctionResultParameterMembership(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Function f) {
			// validateFunctionResultParameterMembership
			List<ReturnParameterMembership> mems = f.getOwnedFeatureMembership().stream().filter(ReturnParameterMembership.class::isInstance).map(ReturnParameterMembership.class::cast).toList();

			ValidationUtil.checkAtMostOne(mems, messageAccepter, SysMLPackage.eINSTANCE.getParameterMembership_OwnedMemberParameter(), "validateFunctionResultParameterMembership");

		}
		
	}
	
}
