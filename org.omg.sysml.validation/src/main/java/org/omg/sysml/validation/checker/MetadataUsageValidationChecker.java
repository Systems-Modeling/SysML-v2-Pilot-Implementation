package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.MetadataFeatureValidationChecker;

public class MetadataUsageValidationChecker extends ItemUsageValidationChecker {
	
	MetadataFeatureValidationChecker metadatafeature = new MetadataFeatureValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		metadatafeature.validate(element, messageAccepter);
	}
						
}
