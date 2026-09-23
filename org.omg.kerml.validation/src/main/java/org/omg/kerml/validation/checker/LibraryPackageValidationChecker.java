package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.LibraryPackage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.SysMLLibraryUtil;

public class LibraryPackageValidationChecker extends PackageValidationChecker {

;	@Override
protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateLibraryPackageNotStandard_(element, messageAccepter);
	}
	
	public void validateLibraryPackageNotStandard_(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof LibraryPackage pkg) {
			if (pkg.isStandard() && !SysMLLibraryUtil.isLibraryResource(pkg.eResource())) {
				messageAccepter.warning(pkg, SysMLPackage.eINSTANCE.getLibraryPackage_IsStandard(), "validateLibraryPackageNotStandard_");
			}
		}
	}
						
}
