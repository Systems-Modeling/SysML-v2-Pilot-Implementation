package org.omg.sysml.validation.kerml;

import org.omg.sysml.adapter.FeatureAdapter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature; 
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.util.FeatureUtil;

 public class FeatureTypingValidationChecker extends SpecializationValidationChecker {
	//validateFeatureHasType_="Features must have at least one type"	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		
		validateFeatureHasType(element, messageAccepter);
	}
	public void validateFeatureHasType(Element element, ValidationMessageAccepter messageAccepter) {
		//get all types and check for null list
		if (element instanceof Feature f) {
			FeatureAdapter featureAdpater = FeatureUtil.getFeatureAdapter(f);
			if (featureAdpater.getAllTypes() == null) {
				messageAccepter.error(element, null, "validateFeatureHasType");
			}	
		}	
	}
						
}
