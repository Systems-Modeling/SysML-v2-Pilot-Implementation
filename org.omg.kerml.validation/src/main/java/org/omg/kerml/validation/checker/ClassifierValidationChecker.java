package org.omg.kerml.validation.checker;


import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.TypeUtil;

public class ClassifierValidationChecker extends TypeValidationChecker {
	
	public ClassifierValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.doValidate(element, messageAccepter, visited);
		validateClassifierDefaultSupertype_(element, messageAccepter);
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
