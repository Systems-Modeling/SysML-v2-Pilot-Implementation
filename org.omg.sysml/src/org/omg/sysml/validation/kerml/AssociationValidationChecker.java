package org.omg.sysml.validation.kerml;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.ValidationUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;
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
			var ownedEndFeatures = TypeUtil.getOwnedEndFeaturesOf(a);
			if (ownedEndFeatures.size() > 2) {
				Type binaryLinkType = (Type) SysMLLibraryUtil.getLibraryElement(a, "Link::BinaryLink");
				if (ValidationUtil.conformsTo(a, binaryLinkType)) {
					for (int i = 2; i < ownedEndFeatures.size(); i++) {
						messageAccepter.error(a, null, "validateAssociationBinarySpecialization");
					}
				}
			}
		}
	}
	
	public void validateAssociationEndTypes(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			var ownedEndFeatures = f.getOwnedEndFeature();
			for (Feature endF : ownedEndFeatures) {
				if (endF.getType() == null || endF.getType().size() != 1) {
					messageAccepter.error(f,  null, "validateAssociationEndType");
				}
			}
		}
	}
	
	public void validateAssociationRelatedTypes(Element element, ValidationMessageAccepter messageAccepter) {
	    if (element instanceof Association association) {
	        if (!association.isAbstract()) {
	            EList<Type> relatedTypes = association.getRelatedType();

	            if (relatedTypes == null || relatedTypes.size() < 2) {
	                messageAccepter.error(association, null, "validateAssociationRelatedTypes");
	            }
	        }
	    }
	}
	
	public void validateAssociationStructureIntersection(Element element, ValidationMessageAccepter messageAccepter) {
		// This note is in KerMLValidator.xtend - validateAssociationStructureIntersection is automatically satisfied
	}
	
}
