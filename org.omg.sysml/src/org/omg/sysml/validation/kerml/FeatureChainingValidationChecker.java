package org.omg.sysml.validation.kerml;


import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Feature; 
import org.omg.sysml.util.ValidationUtil;

public class FeatureChainingValidationChecker extends RelationshipValidationChecker {
//validateFeatureChainingFeaturesNotSelf="Feature cannot have itself in a feature chain"
//validateFeatureChainingFeatureNotOne="Cannot have only one chaining feature"
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		
		validateFeatureChainingFeaturesNotSelf(element, messageAccepter);
		valdiateFeatureChainingFeatureNotOne(element, messageAccepter);
		
	}
	public void validateFeatureChainingFeaturesNotSelf (Element element, ValidationMessageAccepter messageAccepter) {
		ValidationUtil valUtil = new ValidationUtil(); 
		if (element instanceof Feature f) {
			valUtil.checkTargetNotObject(f, null, messageAccepter, "validationFeatureChainingFeatureNotSelf");
		}
	}
	public void valdiateFeatureChainingFeatureNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		Iterable<? extends EObject> elements = element.getOwnedElement();
		ValidationUtil valUtil = new ValidationUtil();
		for (EObject e : elements) {
	        if (e instanceof Feature) {
	            valUtil.checkNotOne(elements, messageAccepter, "validateFeatureChainingFeatureNotOne");
	            break;
	        }
	    }
	}					
}
