package org.omg.sysml.validation.kerml;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.CrossSubsetting;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.ValidationUtil; 

public class FeatureValidationChecker extends TypeValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateFeatureHasType_(element, messageAccepter);
		
		validateFeatureChainingFeatureConformance(element, messageAccepter);
		validateFeatureChainingFeatureNotOne(element, messageAccepter);
		validateFeatureChainingFeaturesNotSelf(element, messageAccepter);
		validateFeatureConstantIsVariable(element, messageAccepter);
		validateFeatureCrossFeatureSpecialization(element, messageAccepter);
		validateFeatureCrossFeatureType(element, messageAccepter);
		checkFeatureCrossingSpecialization(element, messageAccepter);
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
	
	public void validateFeatureHasType_(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			// Note: Use utility method to ensure types are not filtered out by redefinitions of getType.
			List<Type> types = FeatureUtil.getAllTypesOf(f);
			if (types != null && types.isEmpty())
				messageAccepter.error(f, SysMLPackage.eINSTANCE.getFeature_Type(), "validateFeatureHasType_");
		}
	}
	
	public void validateFeatureChainingFeatureConformance(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			EList<Feature> chainingFeatures = f.getChainingFeature();
			int n = chainingFeatures.size();
			if (n > 0) {
				Feature prev = chainingFeatures.get(0);				
				for (int i = 1; i < n; i++) {
					Feature cf = chainingFeatures.get(i);
					if (cf.isFeaturedWithin(prev)) {
						messageAccepter.error(f.getOwnedFeatureChaining().get(i), SysMLPackage.eINSTANCE.getFeatureChaining_ChainingFeature(), "validateFeatureChainingFeatureConformance");
					}
					prev = cf;
				}
			}
		}
	}
	
	public void validateFeatureChainingFeatureNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			ValidationUtil.checkNotOne(f.getOwnedFeatureChaining(), messageAccepter, "validateFeatureChainingFeatureNotOne");
		}
	}
	
	public void validateFeatureChainingFeaturesNotSelf(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			ValidationUtil.checkTargetNotObject(f, null, messageAccepter, "validateFeatureChainingFeatureNotSelf");
		}
	}
	
	public void validateFeatureConstantIsVariable(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isConstant() && !f.isVariable()) {
				messageAccepter.error(element, null, "validationFeatureConstantIsVariable");
			}
		}
	}

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
	
	/**
	 * Validates that it is possible to satisfy the checkFeatureCrossingSpecialization semantic constraint.
	 */
	public void checkFeatureCrossingSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			Feature crossFeature = FeatureUtil.getCrossFeatureOf(f);
			Feature ownedCrossFeature = f.ownedCrossFeature(); 
			if (ownedCrossFeature != null && ownedCrossFeature != crossFeature) {
				messageAccepter.error(ownedCrossFeature, null, "checkFeatureCrossingSpecialization");
			}
		}
	}
						
	public void validateFeatureEndIsConstant(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isEnd() && f.isVariable() && !f.isConstant()) {
				messageAccepter.error(element, null, "validateFeatureEndIsConstant");
			}
		}
		
	}

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

	public void validateFeatureEndNoDirection(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isEnd() && f.getDirection() != null) {
				messageAccepter.error(element, null, "validateFeatureEndNoDirection");
			}
		}
		
	}
	
	public void validateFeatureEndNotDerivedAbstractCompositeOrPortion(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isEnd() && (f.isDerived() || f.isAbstract() || f.isComposite() || f.isPortion())) {
				messageAccepter.error(f, null, "validateFeatureEndNotDerivedAbstractCompositeOrPortion" );
			}
		}
	}
	
	public void validateFeatureIsVariable(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isVariable() && (f.getOwningType() == null) || !TypeUtil.specializes(f.getOwningType(), SysMLLibraryUtil.getLibraryType(f, "Occurrences::Occurrence"))) {
				messageAccepter.error(f, null, "validateFeatureIsVariable");
			}
		}
	}
	
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
	 
	public void validateFeaturePortionNotVariable(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Feature f) {
			if (f.isPortion() && f.isVariable()) {
				messageAccepter.error(f, null, "validateFeaturePortionNotVariable");
			}
		}
	}
}
