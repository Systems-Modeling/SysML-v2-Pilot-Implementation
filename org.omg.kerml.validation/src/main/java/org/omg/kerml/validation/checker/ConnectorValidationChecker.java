package org.omg.kerml.validation.checker;

import java.util.List;

import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.TypeUtil;

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
			List<Feature> connectorEnds = c.getConnectorEnd();

			if (connectorEnds != null && connectorEnds.size() > 2) {
			    Type binaryLinkType = (Type) SysMLLibraryUtil.getLibraryElement(c, "Links::BinaryLink");
			    
			    if (ValidationUtil.conformsTo(c, binaryLinkType)) {
			        List<Feature> ownedConnectorEnds = TypeUtil.getOwnedEndFeaturesOf(c);
			        
			        if (ownedConnectorEnds == null || ownedConnectorEnds.size() <= 2) {
			            messageAccepter.error(c, null, "validateConnectorBinarySpecialization");
			        } else {
			            for (int i = 2; i < connectorEnds.size(); i++) {
			            	messageAccepter.error(connectorEnds.get(i), null, "validateConnectorBinarySpecialization");
			            }
			        }
			    }
			}
			
			doCheckConnector(c, c, null, messageAccepter);
		}		
	}
	
	public void validateConnectorRelatedFeatures(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Connector c) {
			if (!c.isAbstract()) {
		        List<Feature> relatedFeatures = c.getRelatedFeature();		        
		        if (relatedFeatures != null && relatedFeatures.size() < 2) {
		            messageAccepter.error(c, SysMLPackage.eINSTANCE.getConnector_RelatedFeature(), "validateConnectorRelatedFeatures");
		        }
		    }
		}
	}
}
