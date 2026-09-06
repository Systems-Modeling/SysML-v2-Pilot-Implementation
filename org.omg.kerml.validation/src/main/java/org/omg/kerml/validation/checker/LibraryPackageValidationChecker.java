package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;

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
