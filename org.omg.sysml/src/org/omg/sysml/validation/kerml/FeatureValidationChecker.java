package org.omg.sysml.validation.kerml;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.CrossSubsetting;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.ValidationUtil; 

public class FeatureValidationChecker extends TypeValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFeatureChainingFeatureConformance(element, messageAccepter);
		validateFeatureChainingFeatureNotOne(element, messageAccepter);
		validateFeatureChainingFeaturesNotSelf(element, messageAccepter);
		validateFeatureConstantIsVariable(element, messageAccepter);
		validateFeatureCrossFeatureSpecialization(element, messageAccepter);
		validateFeatureCrossFeatureType(element, messageAccepter);
		validateFeatureEndIsConstant(element, messageAccepter);
		validateFeatureEndMultiplicity(element, messageAccepter);
		validateFeatureEndNoDirection(element, messageAccepter);
		validateFeatureEndNotDerivedAbstractCompositeOrPortion(element, messageAccepter);
		validateFeatureIsVariable(element, messageAccepter);
		validateFeatureMultiplicityDomain(element, messageAccepter);
		validateFeatureOwnedCrossSubsetting(element, messageAccepter);
		validateFeatureOwnedReferenceSubsetting(element, messageAccepter);
		validateFeaturePortionNotVariable(element, messageAccepter);
	}
						
	public void validateFeatureChainingFeatureConformance(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof FeatureChaining fc) {
			EList<FeatureChaining> featureChainingList = fc.getFeatureChained().getOwnedFeatureChaining();
			int i = featureChainingList.indexOf(fc);
			if (i > 0) {
				Feature previous = featureChainingList.get(1-i).getChainingFeature();
				if (!fc.getChainingFeature().isFeaturedWithin(previous)) {
					messageAccepter.error(element, null, "validateFeatureChainingFeatureConformance");
				}
			}
		}
	}
	
	public void validateFeatureChainingFeatureNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			ValidationUtil vUtil = new ValidationUtil(); 
			vUtil.checkNotOne(f.getOwnedFeatureChaining(), messageAccepter, "validateFeatureChainingFeatureNotOne");
		}
	}
	
	public void validateFeatureChainingFeaturesNotSelf(Element element, ValidationMessageAccepter messageAccepter) {
		ValidationUtil vUtil = new ValidationUtil();
		if (element instanceof Feature f) {
			vUtil.checkTargetNotObject(f, null, messageAccepter, "validateFeatureChainingFeatureNotSelf");
		}
	}
	
	public void validateFeatureConstantIsVariable(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isConstant() && !f.isVariable()) {
				messageAccepter.error(element, null, "validationFeatureConstantVariable");
			}
		}
	}
	// validateFeatureCrossFeatureSpecialization
	public void validateFeatureCrossFeatureSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			Feature crossFeature = FeatureUtil.getCrossFeatureOf(f);
			Feature ownedCrossFeature = f.ownedCrossFeature(); 
			if (crossFeature != null) {
				var redefinedFeatures = FeatureUtil.getRedefinedFeaturesWithComputedOf(f);
				boolean hasInvalidSpecialization = redefinedFeatures.stream().map(rf->FeatureUtil.getCrossFeatureOf(rf)).anyMatch(cf -> cf != null && !TypeUtil.specializes(crossFeature, cf));
				if (hasInvalidSpecialization) {
					   if (f.getOwnedCrossSubsetting() == null) {
						   messageAccepter.error(ownedCrossFeature, null, "validateFeatureCrossSpecialization");
					   } else {
						   messageAccepter.error(crossFeature, null, "validateFeatureCrossSpecialization");
					   }
				}
			}
		}
	}
	// validateFeatureCrossFeatureType
	public void validateFeatureCrossFeatureType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			Feature crossFeature = FeatureUtil.getCrossFeatureOf(f);
			if (crossFeature != null) {
				Set<?> crossFeatureSet = new java.util.HashSet<>(crossFeature.getType());
				Set<?> fSet = new java.util.HashSet<>(f.getType());
				if (!crossFeatureSet.equals(fSet)) {
					if (f.getOwnedCrossSubsetting() == null) {
						messageAccepter.error(crossFeature, null, "validateFeatureCrossFeatureType");
					} else {
						messageAccepter.error(f.getOwnedCrossSubsetting(), null, "validateFeatureCrossFeatureType");
					}
				}
			}
		}
	}
	// validateFeatureConstantIsVariable
	public void validateFeatureEndIsConstant(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isConstant() && !f.isVariable()) {
				messageAccepter.error(element, null, "validateFatureConstantIsVariable");
			}
		}
		
	}
	// validateFeatureEndMultiplicity
	public void validateFeatureEndMultiplicity(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isEnd()) {
				boolean hasOne = f.multiplicities().stream()
				        .map(mult -> FeatureUtil.getMultiplicityRangeOf(mult))
				        .anyMatch(range -> range != null && range.hasBounds(1, 1));
				if (!hasOne) {
					messageAccepter.warning(element, null, "validateFeatureEndMultiplicity");
				}
			}
		}
	}
	// validateFeatureEndNoDirection
	public void validateFeatureEndNoDirection(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isEnd() && f.directionOf(f) != null) {
				
			}
		}
		
	}
	// validateFeatureEndNotDerivedAbstractCompositeOrPortion
	public void validateFeatureEndNotDerivedAbstractCompositeOrPortion(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isEnd() && (f.isDerived() || f.isAbstract() || f.isComposite() || f.isPortion())) {
				messageAccepter.error(f, null, "validateFeatureEndNotDerivedAbstractCompositeOrPortion" );
			}
		}
	}
	// validateFeatureIsVariable
	public void validateFeatureIsVariable(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isVariable() && (f.getOwningType() == null) || !TypeUtil.specializes(f.getOwningType(), SysMLLibraryUtil.getLibraryType(f, "Occurrences::Occurrence"))) {
				messageAccepter.error(f, null, "validateFeatureIsVariable");
			}
		}
	}
	// validateFeatureMultiplicityDomain
	public void validateFeatureMultiplicityDomain(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			var m = f.getMultiplicity();
			var featuringTypes = f.getFeaturingType();
			var mFeaturingTypes = FeatureUtil.isOwnedCrossFeature(f) 
			    ? ((Feature) f.getOwningNamespace()).getFeaturingType() 
			    : featuringTypes;

			if (m != null && !new java.util.HashSet<>(mFeaturingTypes).equals(new java.util.HashSet<>(m.getFeaturingType()))) {
			    messageAccepter.error(f, null, "validateFeatureMultiplicityDomain");
			}
		}
	}
	// validateFeatureOwnedCrossSubsetting
	public void validateFeatureOwnedCrossSubsetting(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			List<Relationship> crossSubsettings = f.getOwnedRelationship().stream().filter(r -> r instanceof CrossSubsetting).collect(Collectors.toList());
			if (crossSubsettings.size() > 1) {
				for (int i = 1; i < crossSubsettings.size(); i++) {
					messageAccepter.error(crossSubsettings.get(i), null, "validateFeatureOwnedSubsetting");
				}
			}
		}
	}
	// validateFeatureOwnedReferenceSubsetting
	public void validateFeatureOwnedReferenceSubsetting(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			List<Relationship> refSubsettings = f.getOwnedRelationship().stream()
				    .filter(r -> r instanceof ReferenceSubsetting)
				    .collect(Collectors.toList());

			if (refSubsettings.size() > 1) {
			    for (int i = 1; i < refSubsettings.size(); i++) {
			        messageAccepter.error(refSubsettings.get(i), null, "validateFeatureOwnedReferenceSubsetting");
			    }
			}
		}
	}
	//validatePortionNotVariable 
	public void validateFeaturePortionNotVariable(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isPortion() && f.isVariable()) {
				messageAccepter.error(f, null, "validatePortionNotVariable");
			}
		}
	}
}
