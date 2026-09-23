package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.BindingConnectorValidationChecker;

public class BindingConnectorAsUsageValidationChecker extends BindingConnectorValidationChecker {
	
	private final ValidationChecker connectorAsUsage = factory.getValidationChecker(SysMLPackage.eINSTANCE.getConnectorAsUsage());
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		connectorAsUsage.validate(element, messageAccepter, visited);
	}
						
}
