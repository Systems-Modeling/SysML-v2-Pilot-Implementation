package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ViewRenderingMembership;
import org.omg.sysml.lang.sysml.ViewUsage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ViewUsageValidationChecker extends PartUsageValidationChecker {
	
	public ViewUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateViewUsageOnlyOneViewRendering(element, messageAccepter);
	}
						
	public void validateViewUsageOnlyOneViewRendering(Element element, ValidationMessageAccepter messageAccepter) {
		// no xtend code and no rule - added rule to properties file. 
		if (element instanceof ViewUsage usg) {
			var viewRender = usg.getFeatureMembership().stream().filter(ViewRenderingMembership.class::isInstance).count(); 
			if (viewRender > 1) {
				messageAccepter.error(usg, null, "validateViewUsageOnlyOneViewRendering");
			}
		}
	}
}
