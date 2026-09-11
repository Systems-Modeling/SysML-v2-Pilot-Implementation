package org.omg.kerml.validation.checker;

import java.util.List;

import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.lang.sysml.Type;

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
		if (element instanceof Association a) {
			// NOTE: It is sufficient to check owned ends, since they will redefine ends from any supertypes.
			var ownedEndFeatures = TypeUtil.getOwnedEndFeaturesOf(a);
			if (ownedEndFeatures.size() > 2) {
				Type binaryLinkType = (Type) SysMLLibraryUtil.getLibraryElement(a, "Link::BinaryLink");
				if (ValidationUtil.conformsTo(a, binaryLinkType)) {
					for (int i = 2; i < ownedEndFeatures.size(); i++) {
						messageAccepter.error(ownedEndFeatures.get(i), null, "validateAssociationBinarySpecialization");
					}
				}
			}
		}
	}
	
	public void validateAssociationEndTypes(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			var ownedEndFeatures = f.getOwnedEndFeature();
			for (Feature end : ownedEndFeatures) {
				List<Type> types = end.getType();
				if (types == null || types.size() != 1) {
					messageAccepter.error(end,  null, "validateAssociationEndType");
				}
			}
		}
	}
	
	public void validateAssociationRelatedTypes(Element element, ValidationMessageAccepter messageAccepter) {
	    if (element instanceof Association association) {
	        if (!association.isAbstract()) {
	            List<Type> relatedTypes = association.getRelatedType();
	            if (relatedTypes == null || relatedTypes.size() < 2) {
	                messageAccepter.error(association, SysMLPackage.eINSTANCE.getRelationship_RelatedElement(), "validateAssociationRelatedTypes");
	            }
	        }
	    }
	}
	
	public void validateAssociationStructureIntersection(Element element, ValidationMessageAccepter messageAccepter) {
		// validateAssociationStructureIntersection is automatically satisfied
	}
	
}
