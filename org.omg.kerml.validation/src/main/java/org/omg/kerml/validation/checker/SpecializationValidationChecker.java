package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class SpecializationValidationChecker extends RelationshipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateSpecificationSpecificNotConjugated(element, messageAccepter);
	}
						
	public void validateSpecificationSpecificNotConjugated(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Specialization s) {
		    if (s.getSpecific().isConjugated()) {
		    	messageAccepter.error(s, SysMLPackage.eINSTANCE.getSpecialization_Specific(), "validateSpecializationSpecificNotConjugated");
		    }
		}
	}
}
