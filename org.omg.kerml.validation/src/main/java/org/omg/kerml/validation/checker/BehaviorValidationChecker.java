package org.omg.kerml.validation.checker;

import java.util.List;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class BehaviorValidationChecker extends ClassValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateBehaviorSpecialization(element, messageAccepter);
	}
						
	public void validateBehaviorSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
	    if (element instanceof Behavior behavior) {
	    	List<Specialization> ownedSpecializations = behavior.getOwnedSpecialization();
	        if (ownedSpecializations != null) {
	            for (Specialization specialization : ownedSpecializations) {	                
	                if (specialization.getGeneral() instanceof Structure) {
	                    messageAccepter.error(specialization, SysMLPackage.eINSTANCE.getSpecialization_General(), "validateBehaviorSpecialization");
	                }
	            }
	        }
	    }
	}
}
