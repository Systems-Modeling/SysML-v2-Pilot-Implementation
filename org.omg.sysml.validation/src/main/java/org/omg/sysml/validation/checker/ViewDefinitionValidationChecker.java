package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ViewDefinition;
import org.omg.sysml.lang.sysml.ViewRenderingMembership;
import org.omg.sysml.validation.util.SysmlValidationUtil;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ViewDefinitionValidationChecker extends PartDefinitionValidationChecker {
	
	public ViewDefinitionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);

	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateViewDefinitionOnlyOneViewRendering(element, messageAccepter);
	}
						
	public void validateViewDefinitionOnlyOneViewRendering(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ViewDefinition viewDef) {
			SysmlValidationUtil.checkAtMostOneFeature(viewDef, ViewRenderingMembership.class, messageAccepter, "validateViewDefinitionOnlyOneViewRendering");
		}
	}	
}
