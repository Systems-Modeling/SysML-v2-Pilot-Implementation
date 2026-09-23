package org.omg.kerml.validation.checker;

import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.List;
import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Type;

public class ClassValidationChecker extends ClassifierValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateClassSpecialization(element, messageAccepter);
	}
						
	public void validateClassSpecialization(Element element, ValidationMessageAccepter messageAccepter) {		
		if (element instanceof org.omg.sysml.lang.sysml.Class c) {
			List<Specialization> ownedSpecializations = c.getOwnedSpecialization();
		    if (ownedSpecializations != null) {
		        for (Specialization s : ownedSpecializations) {
		            Type general = s.getGeneral();
		            if (general instanceof DataType || (general instanceof Association && !(c instanceof Association))) {
		                messageAccepter.error(s, SysMLPackage.eINSTANCE.getSpecialization_General(), "validateClassSpecialization");
		            }
		        }
		    }	
		}
	}
}
