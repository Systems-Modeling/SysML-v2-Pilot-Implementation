package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class FlowUsageValidationChecker extends ConnectorAsUsageValidationChecker {
	
	private final ValidationChecker actionUsage;
	private final ValidationChecker flow;
	
	public FlowUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		actionUsage = factory.getValidationChecker(SysMLPackage.eINSTANCE.getActionUsage());
		flow = factory.getValidationChecker(SysMLPackage.eINSTANCE.getFlow());
		
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		actionUsage.validate(element, messageAccepter, visited);
		flow.validate(element, messageAccepter, visited);
	}
						
}
