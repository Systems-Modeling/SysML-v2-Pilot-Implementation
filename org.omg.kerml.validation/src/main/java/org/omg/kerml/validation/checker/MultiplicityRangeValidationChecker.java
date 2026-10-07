package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.MultiplicityRange; 

public class MultiplicityRangeValidationChecker extends MultiplicityValidationChecker {
	
	public MultiplicityRangeValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.doValidate(element, messageAccepter, visited);
		validateMultiplicityRangeBoundResultTypes(element, messageAccepter);
		validateMultiplicityRangeBounds(element, messageAccepter);
	}
						
	public void validateMultiplicityRangeBoundResultTypes(Element element, ValidationMessageAccepter messageAccepter) {
		// TODO: Correct validateMultiplicityBoundResults OCL from KERML-199.
		if (element instanceof MultiplicityRange mult) {
			for (Expression b : mult.getBound()) {
			    boolean isInvalid = b.isModelLevelEvaluable()?
			    		mult.valueOf(b) == -2:
			    		!ValidationUtil.isInteger(b);
			    if (isInvalid) {
			        messageAccepter.error(b, null, "validationMultiplicityRangeBoundResultTypes");
			    }
			}

		}
		
	}
	
	public void validateMultiplicityRangeBounds(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof MultiplicityRange mult) {
			var ownedMembers = mult.getOwnedMember();
			var lowerBound = mult.getLowerBound();
			var upperBound = mult.getUpperBound();

			if ((lowerBound == null && (ownedMembers.isEmpty() || ownedMembers.get(0) != upperBound)) ||
			    (lowerBound != null && (ownedMembers.size() < 2 || ownedMembers.get(0) != lowerBound || ownedMembers.get(1) != upperBound))) {
				messageAccepter.error(mult, null, "validateMultiplicityRangeBoung");
			}
		}
	}
}
