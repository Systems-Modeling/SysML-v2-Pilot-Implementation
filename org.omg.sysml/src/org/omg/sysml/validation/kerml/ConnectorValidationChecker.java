package org.omg.sysml.validation.kerml;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.ValidationUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class ConnectorValidationChecker extends FeatureValidationChecker {
	
	RelationshipValidationChecker relationship = new RelationshipValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		relationship.validate(element, messageAccepter);
		validateConnectorBinarySpecialization(element, messageAccepter);
		validateConnectorRelatedFeatures(element, messageAccepter);
	}
						
	public void validateConnectorBinarySpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Connector c) {
			EList<Feature> connectorEnds = c.getConnectorEnd();

			if (connectorEnds != null && connectorEnds.size() > 2) {
			    Type binaryLinkType = (Type) SysMLLibraryUtil.getLibraryElement(c, "Links::BinaryLink");
			    
			    if (ValidationUtil.conformsTo(c, binaryLinkType)) {
			        var ownedConnectorEnds = TypeUtil.getOwnedEndFeaturesOf(c);
			        
			        if (ownedConnectorEnds == null || ownedConnectorEnds.size() <= 2) {
			            messageAccepter.error(c, null, "validateConnectorBinarySpecialization");
			        } else {
			            for (int i = 2; i < connectorEnds.size(); i++) {
			            	messageAccepter.error(c, null, "validateConnectorBinarySpecialization");
			            }
			        }
			    }
			}
		}
	}
	
	public void validateConnectorRelatedFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Connector c) {
			if (!c.isAbstract()) {
		        EList<Feature> relatedFeatures = c.getRelatedFeature();
		        
		        if (relatedFeatures != null && relatedFeatures.size() < 2) {
		            messageAccepter.error(c, null, "validateConnectorRelatedFeatures");
		        }
		    }
		}
	}
}
