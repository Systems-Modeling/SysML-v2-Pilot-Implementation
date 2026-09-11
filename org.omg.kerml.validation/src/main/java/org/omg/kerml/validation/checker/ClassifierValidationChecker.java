package org.omg.kerml.validation.checker;


import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.TypeUtil;

public class ClassifierValidationChecker extends TypeValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateClassifierMultiplicityDomain(element, messageAccepter);
	}
	
	public void validateClassifierDefaultSupertype_(Element element, ValidationMessageAccepter messageAccepter) {
		// Check default supertype (semantic constraint)
		// Note: This check is not in the spec as a single constraint.
		if (element instanceof Classifier c) {
			String defaultSupertype = ImplicitGeneralizationMap.getDefaultSupertypeFor(c.getClass());
			if (!TypeUtil.specializes(c, SysMLLibraryUtil.getLibraryType(c, defaultSupertype)))
				messageAccepter.error(c, SysMLPackage.eINSTANCE.getClassifier_OwnedSubclassification(), "validateClassifierDefaultSupertype_", defaultSupertype);
		}
	}
						
	public void validateClassifierMultiplicityDomain(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Classifier c) {
			Multiplicity m = c.getMultiplicity();
			if (m != null && m.getFeaturingType() != null && !m.getFeaturingType().isEmpty()) {
				messageAccepter.error(c, SysMLPackage.eINSTANCE.getType_Multiplicity(), "validateClassifierMultiplicityDomain");
			}
		}	
	}
}
