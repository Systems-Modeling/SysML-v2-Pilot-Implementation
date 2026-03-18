package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class AssociationValidationChecker extends ClassifierValidationChecker {
	
	RelationshipValidationChecker relationship = new RelationshipValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		relationship.validate(element, messageAccepter);
		validateAssociationBinarySpecialization(element, messageAccepter);
		validateAssociationEndTypes(element, messageAccepter);
		validateAssociationRelatedTypes(element, messageAccepter);
		validateAssociationStructureIntersection(element, messageAccepter);
	}
						
	public void validateAssociationBinarySpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateAssociationEndTypes(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateAssociationRelatedTypes(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
	public void validateAssociationStructureIntersection(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
