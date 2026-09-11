package org.omg.kerml.validation.checker;

import org.eclipse.emf.common.util.EList;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.LiteralInfinity;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;

public class SubsettingValidationChecker extends SpecializationValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateSubsettingConstantConformance(element, messageAccepter);
		validateSubsettingFeaturingTypes(element, messageAccepter);
		validateSubsettingUniquenessConformance(element, messageAccepter);
		
		validateSubsettingMultiplicityConformance_(element, messageAccepter);
	}
						
	public void validateSubsettingConstantConformance(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Subsetting sub) {
			Feature subsettingFeature = sub.getSubsettingFeature();
			Feature subsettedFeature = sub.getSubsettedFeature();
		
			if (subsettedFeature.isConstant() && subsettingFeature.isVariable() && !subsettingFeature.isConstant()) {
			    messageAccepter.error(sub, SysMLPackage.eINSTANCE.getSubsetting_SubsettedFeature(), "validateSubsettingConstantConformance");
			}
		}
	}
	
	public void validateSubsettingFeaturingTypes(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Subsetting sub) {
			Feature subsettingFeature = sub.getSubsettingFeature();
			Feature subsettedFeature = sub.getSubsettedFeature();		
			
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
			Feature subsettingFeature = sub.getSubsettingFeature();
			Feature subsettedFeature = sub.getSubsettedFeature();
			
			if (subsettedFeature != null && subsettedFeature.isUnique() && subsettingFeature != null && !subsettingFeature.isUnique()) {
			    messageAccepter.error(sub, SysMLPackage.eINSTANCE.getSubsetting_SubsettingFeature(), "validateSubsettingUniquenessConformance");
			}	
		}
	}
	
	public void validateSubsettingMultiplicityConformance_(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Subsetting sub) {
			Feature subsettingFeature = sub.getSubsettingFeature();
			Feature subsettedFeature = sub.getSubsettedFeature();
			
			if (subsettedFeature != null && subsettingFeature != null) {
				var setted_m = FeatureUtil.getMultiplicityRangeOf(subsettedFeature.getMultiplicity());
				var setting_m = FeatureUtil.getMultiplicityRangeOf(subsettingFeature.getMultiplicity());
				
				// Only check multiplicity conformance if the subsettedFeature and subsettingFeature multiplicity elements are not the same, 
				// and the subsettingFeature and subsettedFeature either both are, or both are not, end Features.
				if (setted_m != null && setting_m != null && setted_m != setting_m &&
					subsettingFeature.isEnd() == subsettedFeature.isEnd()) {
					Expression setted_m_l = setted_m.getLowerBound();
					Expression setted_m_u = setted_m.getUpperBound();
					
					if (setted_m_l == null) {
						setted_m_l = setted_m_u;
					}
					
					Expression setting_m_l = setting_m.getLowerBound();
					Expression setting_m_u = setting_m.getUpperBound();
					
					if (setting_m_l == null) {
						setting_m_l = setting_m_u;
					}
					
					// TODO: Add validateRedefinitionMultiplicityConformance
				
					// Lower bound (only check if the Subsetting is a Redefinition): setting must be >= setted
					if (sub instanceof Redefinition) {
						if (setting_m_l instanceof LiteralInteger && setted_m_l instanceof LiteralInteger && ((LiteralInteger)setting_m_l).getValue() < ((LiteralInteger)setted_m_l).getValue() ||
							setting_m_l instanceof LiteralInfinity && setted_m_l instanceof LiteralInteger && 0 < ((LiteralInteger)setted_m_l).getValue()) {
							messageAccepter.warning(sub, SysMLPackage.eINSTANCE.getRedefinition_RedefiningFeature(), "validateRedefinitionMultiplicityConformance_");
						}
					}
					
					// TODO: Add validateSubsettingMultiplicityConformance
				
					// Upper bound: setting must be <= setted
					if (setting_m_u instanceof LiteralInfinity && !(setted_m_u instanceof LiteralInfinity) ||
						setting_m_u instanceof LiteralInteger && setted_m_u instanceof LiteralInteger && ((LiteralInteger)setting_m_u).getValue() > ((LiteralInteger)setted_m_u).getValue()) {
						messageAccepter.warning(sub, SysMLPackage.eINSTANCE.getSubsetting_SubsettingFeature(), "validateSubsettingMultiplicityConformance_");
					}
			}
			}
		}
		
	}
}
