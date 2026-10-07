package org.omg.kerml.validation.checker;

import java.util.List;
import java.util.Set;

import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.TypeUtil; 
public class FunctionValidationChecker extends BehaviorValidationChecker {
	
	public FunctionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.doValidate(element, messageAccepter, visited);
		validateFunctionResultExpressionMembership(element, messageAccepter);
		validateFunctionResultParameterMembership(element, messageAccepter);
	}
						
	public void validateFunctionResultExpressionMembership(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Function f) {			
			Set<ResultExpressionMembership> reMems = TypeUtil.getResultExpressionMembershipsOf(f);

			if (reMems.size() > 1) {
			    List<ResultExpressionMembership> ownedMem = reMems.stream().filter(m -> m.getMembershipOwningNamespace() == f).toList();

			    if (!ownedMem.isEmpty()) {
			        messageAccepter.error(ownedMem.get(0), SysMLPackage.eINSTANCE.getResultExpressionMembership_OwnedResultExpression(), "validateFunctionResultExpressionMembership");
			    } else {
			        messageAccepter.error(f, null, "validateFunctionResultExpressionMembership");              
			    }
			}
		}
	}
	
	public void validateFunctionResultParameterMembership(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Function f) {
			List<ReturnParameterMembership> mems = f.getOwnedFeatureMembership().stream().filter(ReturnParameterMembership.class::isInstance).map(ReturnParameterMembership.class::cast).toList();

			ValidationUtil.checkAtMostOne(mems, messageAccepter, SysMLPackage.eINSTANCE.getParameterMembership_OwnedMemberParameter(), "validateFunctionResultParameterMembership");

		}
		
	}
	
}
