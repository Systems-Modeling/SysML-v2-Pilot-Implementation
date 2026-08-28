package org.omg.sysml.validation.kerml;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;

public class SubsettingValidationChecker extends SpecializationValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateSubsettingConstantConformance(element, messageAccepter);
		validateSubsettingFeaturingTypes(element, messageAccepter);
		validateSubsettingUniquenessConformance(element, messageAccepter);
	}
						
	public void validateSubsettingConstantConformance(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Subsetting sub) {
			var subsettingFeature = sub.getSubsettingFeature();
			var subsettedFeature = sub.getSubsettedFeature();
		
			if (subsettedFeature.isConstant() && subsettingFeature.isVariable() && !subsettingFeature.isConstant()) {
			    messageAccepter.error(sub, SysMLPackage.eINSTANCE.getSubsetting_SubsettedFeature(), "validateSubsettingConstantConformance");
			}
		}
	}
	
	public void validateSubsettingFeaturingTypes(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Subsetting sub) {
			var subsettingFeature = sub.getSubsettingFeature();
			var subsettedFeature = sub.getSubsettedFeature();
			
			
			if (subsettingFeature != null && subsettedFeature != null) {
			    EList<Type> subsettedFeaturingTypes = subsettedFeature.getFeaturingType();
			                
			    if (!subsettedFeaturingTypes.isEmpty() && !FeatureUtil.canAccess(subsettingFeature, subsettedFeature)) {
			    	messageAccepter.error(sub, SysMLPackage.eINSTANCE.getSubsetting_SubsettedFeature(), "validateSubsettingFeaturingTypes");
			    }
			}
		}
	}
	
	public void validateSubsettingUniquenessConformance(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Subsetting sub) {
			var subsettingFeature = sub.getSubsettingFeature();
			var subsettedFeature = sub.getSubsettedFeature();
			
			if (subsettedFeature != null && subsettedFeature.isUnique() && subsettingFeature != null && !subsettingFeature.isUnique()) {
			    messageAccepter.error(sub, SysMLPackage.eINSTANCE.getSubsetting_SubsettingFeature(), "validateSubsettingUniquenessConformance");
			}	
		}
	}
}
