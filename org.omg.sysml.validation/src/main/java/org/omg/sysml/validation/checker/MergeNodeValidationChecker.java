package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class MergeNodeValidationChecker extends ControlNodeValidationChecker {
	
	public MergeNodeValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateMergeNodeIncomingSuccessions(element, messageAccepter);
		validateMergeNodeOutgoingSuccessions(element, messageAccepter);
	}
						
	public void validateMergeNodeIncomingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateMergeNodeOutgoingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
