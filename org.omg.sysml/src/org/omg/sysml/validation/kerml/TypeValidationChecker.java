package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class TypeValidationChecker extends NamespaceValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateTypeAtMostOneConjugator(element, messageAccepter);
		validateTypeDifferencingTypesNotSelf(element, messageAccepter);
		validateTypeIntersectingTypesNotSelf(element, messageAccepter);
		validateTypeOwnedDifferencingNotOne(element, messageAccepter);
		validateTypeOwnedIntersectingNotOne(element, messageAccepter);
		validateTypeOwnedMultiplicity(element, messageAccepter);
		validateTypeOwnedUnioningNotOne(element, messageAccepter);
		validateTypeUnioningTypesNotSelf(element, messageAccepter);
	}
						
	public void validateTypeAtMostOneConjugator(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTypeDifferencingTypesNotSelf(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTypeIntersectingTypesNotSelf(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTypeOwnedDifferencingNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTypeOwnedIntersectingNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTypeOwnedMultiplicity(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTypeOwnedUnioningNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateTypeUnioningTypesNotSelf(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
