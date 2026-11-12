package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ForLoopActionUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ForLoopActionUsageValidationChecker extends LoopActionUsageValidationChecker {
	
	public ForLoopActionUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateForLoopActionUsageLoopVariable(element, messageAccepter);
		validateForLoopActionUsageParameters(element, messageAccepter);
	}
						
	public void validateForLoopActionUsageLoopVariable(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ForLoopActionUsage usg) {
			var ownedFeatures = usg.getOwnedFeature(); 
				if (ownedFeatures.isEmpty() || !(ownedFeatures.get(0) instanceof ReferenceUsage)) {
					messageAccepter.error(usg, null, "validateForLoopActionUsageLoopVariable");
				}
		}
	}
	
	public void validateForLoopActionUsageParameters(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ForLoopActionUsage usg) {
			if (usg.inputParameters().size() != 2) {
				messageAccepter.error(usg, null, "validateForLoopActionUsageParameters" );
			}
		}
	}
}
