package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class StructureValidationChecker extends ClassValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
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
