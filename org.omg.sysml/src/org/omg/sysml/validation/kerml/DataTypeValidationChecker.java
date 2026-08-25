package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class DataTypeValidationChecker extends ClassifierValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateDataTypeSpecialization(element, messageAccepter);
	}
						
	public void validateDataTypeSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		
		if (element instanceof DataType d) {
			if (d.getOwnedSpecialization() != null) {
		        for (Specialization s : d.getOwnedSpecialization()) {
		            Type general = s.getGeneral();

		            if (general instanceof org.omg.sysml.lang.sysml.Class || general instanceof Association) {
		                messageAccepter.error(s, null, "validateDataTypeSpecialization");
		            }
		        }
			}
		}
	}
}
