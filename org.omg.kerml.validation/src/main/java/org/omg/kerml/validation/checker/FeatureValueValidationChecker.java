package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.util.FeatureUtil;

public class FeatureValueValidationChecker extends OwningMembershipValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateFeatureValueIsInitial(element, messageAccepter);
		validateFeatureValueOverriding(element, messageAccepter);
	}
						
	public void validateFeatureValueIsInitial(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof FeatureValue fv) {
			Feature f = fv.getFeatureWithValue();
			if (fv.isInitial() && !f.isVariable()) {
				messageAccepter.error(fv, null, "validateFeatureValueIsInitial");
			}
		}
	}
	
	public void validateFeatureValueOverriding(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof FeatureValue fv) {
			Feature f = fv.getFeatureWithValue();
			if (f != null) {
				Set<Feature> redefs = FeatureUtil.getAllRedefinedFeaturesOf(f);
				if (redefs.stream().map(FeatureUtil::getValuationFor).anyMatch(v -> v != null && v != fv && !v.isDefault())) {
					messageAccepter.error(fv, null, "validateFeatureValueOverriding");
				}
			}
		}
	}
	
}
