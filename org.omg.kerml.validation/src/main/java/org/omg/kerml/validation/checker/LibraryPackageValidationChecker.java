package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.LibraryPackage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.SysMLLibraryUtil;

public class LibraryPackageValidationChecker extends PackageValidationChecker {

;	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
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
