package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class SpecializationValidationChecker extends RelationshipValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
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
