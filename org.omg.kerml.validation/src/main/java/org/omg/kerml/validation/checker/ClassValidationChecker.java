package org.omg.kerml.validation.checker;

import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Type;

public class ClassValidationChecker extends ClassifierValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateClassSpecialization(element, messageAccepter);
	}
						
	public void validateClassSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		
		if (element instanceof org.omg.sysml.lang.sysml.Class c) {
			
		    if (c.getOwnedSpecialization() != null) {
		        for (Specialization s : c.getOwnedSpecialization()) {
		            Type general = s.getGeneral();

		            if (general instanceof DataType || (general instanceof Association && !(c instanceof Association))) {
		                messageAccepter.error(s, null, "validateClassSpecialization");
		            }
		        }
		    }	
		}
	}
}
