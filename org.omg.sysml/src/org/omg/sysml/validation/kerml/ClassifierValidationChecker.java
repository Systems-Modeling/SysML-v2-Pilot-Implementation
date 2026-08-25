package org.omg.sysml.validation.kerml;


import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ClassifierValidationChecker extends TypeValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateClassifierMultiplicityDomain(element, messageAccepter);
	}
						
	public void validateClassifierMultiplicityDomain(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Classifier c) {
			Multiplicity m = c.getMultiplicity();
			if (m != null && m.getFeaturingType() != null && !m.getFeaturingType().isEmpty() ) {
				messageAccepter.error(c,null, "validateClassifierMultiplicityDomain");
			}
		}	
	}
}
