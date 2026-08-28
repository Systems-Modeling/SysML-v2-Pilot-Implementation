package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class LibraryPackageValidationChecker extends PackageValidationChecker {

	//validateLibraryPackageNotStandard_="User library packages should not be marked as standard" is the right rule? 
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateLibraryPackageNotStandard(element, messageAccepter);
	}
	
	public void validateLibraryPackageNotStandard(Element element, ValidationMessageAccepter messageAccepter) {
	
	}
						
}
