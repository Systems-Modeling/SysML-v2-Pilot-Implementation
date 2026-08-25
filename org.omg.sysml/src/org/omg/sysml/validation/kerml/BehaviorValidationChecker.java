package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class BehaviorValidationChecker extends ClassValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateBehaviorSpecialization(element, messageAccepter);
	}
						
	public void validateBehaviorSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		//didn't see any xtend code for this one. Added rule to kermlValidationMesssages.properties spec section "8.3.4.6.2" 
	    if (element instanceof Behavior behavior) {

	        if (behavior.getOwnedSpecialization() != null) {
	            for (Specialization specialization : behavior.getOwnedSpecialization()) {
	                
	                //Get the general classifier being specialized??
	                Type generalType = specialization.getGeneral();
	                if (generalType instanceof Structure) {
	                    messageAccepter.error(behavior, null, "validateBehaviorSpecialization");
	                }
	            }
	        }
	    }
	}
}
