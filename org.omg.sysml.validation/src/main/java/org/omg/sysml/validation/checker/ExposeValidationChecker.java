package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expose;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.VisibilityKind;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ImportValidationChecker;

public class ExposeValidationChecker extends ImportValidationChecker {
	
	public ExposeValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateExposeIsImportAll(element, messageAccepter);
		validateExposeOwningNamespace(element, messageAccepter);
		validateExposeVisibility(element, messageAccepter);
	}
						
	public void validateExposeIsImportAll(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Expose exp) {
			if (!exp.isImportAll()) {
				messageAccepter.error(exp, null, "validateExposeIsImportAll");
			}
		}
	}
	
	public void validateExposeOwningNamespace(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Expose exp) {
			if (!(exp.getOwningNamespace() instanceof ViewUsage)) {
				messageAccepter.error(exp.getOwningNamespace(), null, "validateExposeOwningNamespace");
			}
		}
	}
	
	public void validateExposeVisibility(Element element, ValidationMessageAccepter messageAccepter) {
	// no xtend or rule in properties files - added new rule from specification document 8.3.26.2 
		if (element instanceof Expose exp) {
			if (exp.getVisibility() != VisibilityKind.PROTECTED) {
				messageAccepter.error(exp, SysMLPackage.eINSTANCE.getImport_Visibility(), "validateExposeVisibility");	
			}
		}
	}
}
