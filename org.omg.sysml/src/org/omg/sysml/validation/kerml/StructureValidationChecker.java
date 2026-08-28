package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class StructureValidationChecker extends ClassValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateStructureSpecialization(element, messageAccepter);
	}
						
	public void validateStructureSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Structure c) {
		   
		    for (Specialization s : c.getOwnedSpecialization()) {
		        if (s.getGeneral() instanceof Behavior) {
		            messageAccepter.error(s, SysMLPackage.eINSTANCE.getSpecialization_General(), "validateStructureSpecialization");
		        }
		    }
		}
	}
}
