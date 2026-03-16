package org.omg.sysml.validation.sysml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.validation.kerml.MetadataFeatureValidationChecker;

public class MetadataUsageValidationChecker extends ItemUsageValidationChecker {
	
	MetadataFeatureValidationChecker metadatafeature = new MetadataFeatureValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		metadatafeature.validate(element, messageAccepter);
	}
						
}
