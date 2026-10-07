package org.omg.kerml.validation.checker;

import java.util.List;
import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class BehaviorValidationChecker extends ClassValidationChecker {
	
	public BehaviorValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.doValidate(element, messageAccepter, visited);
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
