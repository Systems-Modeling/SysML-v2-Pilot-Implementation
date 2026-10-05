package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

public class DataTypeValidationChecker extends ClassifierValidationChecker {
	
	public DataTypeValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateDataTypeSpecialization(element, messageAccepter);
	}
						
	public void validateDataTypeSpecialization(Element element, ValidationMessageAccepter messageAccepter) {		
		if (element instanceof DataType d) {
			if (d.getOwnedSpecialization() != null) {
		        for (Specialization s : d.getOwnedSpecialization()) {
		            Type general = s.getGeneral();

		            if (general instanceof org.omg.sysml.lang.sysml.Class || general instanceof Association) {
		                messageAccepter.error(s, SysMLPackage.eINSTANCE.getSpecialization_General(), "validateDataTypeSpecialization");
		            }
		        }
			}
		}
	}
}
