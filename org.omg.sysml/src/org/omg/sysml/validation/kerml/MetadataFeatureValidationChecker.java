package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class MetadataFeatureValidationChecker extends AnnotatingElementValidationChecker {
	
	FeatureValidationChecker feature = new FeatureValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		feature.validate(element, messageAccepter);
		validateMetadataFeatureAnnotatedElement(element, messageAccepter);
		validateMetadataFeatureBody(element, messageAccepter);
		validateMetadataFeatureMetaclass(element, messageAccepter);
		validateMetadataFeatureMetaclassNotAbstract(element, messageAccepter);
	}
						
	public void validateMetadataFeatureAnnotatedElement(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateMetadataFeatureBody(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateMetadataFeatureMetaclass(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateMetadataFeatureMetaclassNotAbstract(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
