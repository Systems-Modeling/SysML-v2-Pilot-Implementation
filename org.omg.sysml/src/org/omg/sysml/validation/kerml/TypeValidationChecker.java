package org.omg.sysml.validation.kerml;

import org.omg.sysml.lang.sysml.Element;
//import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Differencing;
import org.omg.sysml.lang.sysml.Intersecting;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.Unioning;

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
			
		//get the number of conjugate relationships
		long conjCount = element.getOwnedRelationship().stream().filter(Conjugation.class::isInstance).count();
		if (conjCount > 1) {
			messageAccepter.error(element, null, "validateTypeMostOneConjugator");
		}	
	}
	
	public void validateTypeDifferencingTypesNotSelf(Element element, ValidationMessageAccepter messageAccepter) {
		
	 //get a list of Differencing objects and check if target is itself  
		boolean hasSelf = element.getOwnedRelationship().stream().filter(Differencing.class::isInstance).anyMatch(rel -> rel.getTarget().contains(element));
		if (hasSelf) {
			messageAccepter.error(element, null,  "validateTypeDifferencingTypesNotSelf");
		}
	}
	
	public void validateTypeIntersectingTypesNotSelf(Element element, ValidationMessageAccepter messageAccepter) {
		
		boolean intersectSelf = element.getOwnedRelationship().stream().filter(Intersecting.class::isInstance).anyMatch(rel -> rel.getTarget().contains(element));
		if (intersectSelf) {
			messageAccepter.error(element, null,  "validateTypeIntersectingTypesNotSelf");
		}
	}
	//cannot have only one 
	public void validateTypeOwnedDifferencingNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		
		long diffCount = element.getOwnedRelationship().stream().filter(Differencing.class::isInstance).count();
		if (diffCount == 1) {
			messageAccepter.error(element, null, "validateOwnedDifferencingNotOne");
		}	
	}
	//cannot have only one 
	public void validateTypeOwnedIntersectingNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		
		long intersectCount = element.getOwnedRelationship().stream().filter(Intersecting.class::isInstance).count(); 
		if (intersectCount ==1) {
			messageAccepter.error(element, null, "validateOwnedIntersectingNotOne");
		}	
	}
	
	public void validateTypeOwnedMultiplicity(Element element, ValidationMessageAccepter messageAccepter) {
		
		long multiCount = element.getOwnedRelationship().stream().filter(Multiplicity.class::isInstance).count(); 
		if (multiCount > 1) {
			messageAccepter.error(element, null, "validateTypeOwnedMultiplicity");
		}
	}
	
	public void validateTypeOwnedUnioningNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		
		long unionCount = element.getOwnedRelationship().stream().filter(Unioning.class::isInstance).count(); 
		if (unionCount > 1) {
			messageAccepter.error(element, null, "validateOwnedUnioningNotOne");
		}
	}
	
	public void validateTypeUnioningTypesNotSelf(Element element, ValidationMessageAccepter messageAccepter) {
		
		boolean unionSelf = element.getOwnedRelationship().stream().filter(Unioning.class::isInstance).anyMatch(rel -> rel.getTarget().contains(element));
		if (unionSelf) {
			messageAccepter.error(element, null,  "validateTypeUnioningTypesNotSelf");
		}
	}
	
}
