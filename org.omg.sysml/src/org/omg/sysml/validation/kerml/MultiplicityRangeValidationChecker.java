package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.MultiplicityRange;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.util.ValidationUtil; 

public class MultiplicityRangeValidationChecker extends MultiplicityValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateMultiplicityRangeBoundResultTypes(element, messageAccepter);
		validateMultiplicityRangeBounds(element, messageAccepter);
	}
						
	public void validateMultiplicityRangeBoundResultTypes(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof MultiplicityRange mult) {
			for (var b : mult.getBound()) {
			    boolean isInvalid;
				if (b.isModelLevelEvaluable())
					isInvalid = mult.valueOf(b) == -2;
				else
					isInvalid = !ValidationUtil.isInteger(b);

			    if (isInvalid) {
			        messageAccepter.error(b, null, "validationMultiplicityRangeBoundResultTypes");
			    }
			}

		}
		
	}
	
	public void validateMultiplicityRangeBounds(Element element, ValidationMessageAccepter messageAccepter) {
		// validateMultiplicityRangeBounds
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
