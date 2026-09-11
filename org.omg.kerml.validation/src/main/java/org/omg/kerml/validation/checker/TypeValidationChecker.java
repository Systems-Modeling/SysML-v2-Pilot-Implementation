package org.omg.kerml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.TypeUtil;

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
		
		validateTypeImplicitBindingConnectors_(element, messageAccepter);
	}
						
	public void validateTypeAtMostOneConjugator(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Type) {
			long conjCount = element.getOwnedRelationship().stream().filter(Conjugation.class::isInstance).count();
			if (conjCount > 1) {
				messageAccepter.error(element, null, "validateTypeMostOneConjugator");
			}
		}
	}
	
	public void validateTypeDifferencingTypesNotSelf(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Type t) {
			ValidationUtil.checkTargetNotObject(t, t.getOwnedDifferencing(), messageAccepter, "validateTypeDifferencingTypesNotSelf");
		}
	}
	
	public void validateTypeIntersectingTypesNotSelf(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Type t) {
			ValidationUtil.checkTargetNotObject(t, t.getOwnedIntersecting(), messageAccepter, "validateTypeIntersectingTypesNotSelf");
		}
	}
	
	public void validateTypeOwnedDifferencingNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Type t) {
			ValidationUtil.checkNotOne(t.getOwnedDifferencing(), messageAccepter, "validateTypeOwnedDifferencingNotOne");
		}
	}
	 
	public void validateTypeOwnedIntersectingNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Type t) {
			ValidationUtil.checkNotOne(t.getOwnedIntersecting(), messageAccepter, "validateTypeOwnedIntersectingNotOne");
		}
	}
	
	public void validateTypeOwnedMultiplicity(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Type t) {
			List<Membership> multiplicityMemberships = t.getOwnedMembership().stream().filter(Multiplicity.class::isInstance).toList();
			ValidationUtil.checkAtMostOne(multiplicityMemberships, messageAccepter, SysMLPackage.eINSTANCE.getMembership_MemberElement(), "validateTypeOwnedMultiplicity");
		}
	}
	
	public void validateTypeOwnedUnioningNotOne(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Type t) {
			ValidationUtil.checkNotOne(t.getOwnedUnioning(), messageAccepter, "validateTypeOwnedUnioningNotOne");
		}
	}
	
	public void validateTypeUnioningTypesNotSelf(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Type t) {
			ValidationUtil.checkTargetNotObject(t, t.getOwnedUnioning(), messageAccepter, "validateTypeUnioningTypesNotSelf");
		}
	}
	
	public void validateTypeImplicitBindingConnectors_(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Type type) {
			TypeUtil.forEachImplicitBindingConnectorOf(type, (connector, kind) -> {
      			if (type instanceof FeatureReferenceExpression) {
      				doCheckConnector(connector, type, kind, messageAccepter); 
      			}
      			// Ignore ill-formed implicit binding connectors.
      			if (connector.getRelatedFeature().size() >= 2) {
      				doCheckBindingConnector(connector, type, messageAccepter);
      			}
			});
		}
	}
	
	protected static void doCheckConnector(Connector c, Type location, EClass kind, ValidationMessageAccepter messageAccepter) {
		ElementUtil.transform(c);
		List<Type> cFeaturingTypes = c.getFeaturingType();
		
		if (kind == SysMLPackage.Literals.FEATURE_MEMBERSHIP) {
			cFeaturingTypes.add(location);
		}

		// checkConnectorTypeFeaturing
		List<Feature> relatedFeatures = c.getRelatedFeature();			
		List<Feature> connectorEnds = TypeUtil.getOwnedEndFeaturesOf(c);
		for (var i = 0; i < relatedFeatures.size(); i++) {
			Feature relatedFeature = relatedFeatures.get(i);
			if (!((cFeaturingTypes.isEmpty()? relatedFeature.isFeaturedWithin(null):
				  cFeaturingTypes.stream().allMatch(relatedFeature::isFeaturedWithin) ||
				  
				// TODO: Be able to remove these special cases
				(location instanceof FeatureReferenceExpression || location instanceof FeatureChainExpression) && 
					relatedFeature.getOwningType() == location))) {
				
				Feature connectorEnd = connectorEnds.get(i);
				// Do not repeat error message if error will already be caught by validateSubsettingFeaturingTypes.
				if (location != c || FeatureUtil.canAccess(connectorEnd, relatedFeature)) {
					messageAccepter.error( 
						location == c && i < connectorEnds.size()? connectorEnd: location, 
						null, "checkConnectorTypeFeaturing");
				}
			}
		}
	}

	protected static void doCheckBindingConnector(BindingConnector bc, Element location, ValidationMessageAccepter messageAccepter) {
		List<Feature> rf = bc.getRelatedFeature();
		
		// TODO: Add validateBindingConnectorTypeConformance
		List<Type> f1types = rf.get(0).getType();
		List<Type> f2types = rf.get(1).getType();
		Type boolType = SysMLLibraryUtil.getLibraryType(location, "Performances::BooleanEvaluation");
					 
		if (!(ValidationUtil.typesConform(f1types, f2types) ||
			  // Consider the result of an expression returning a Boolean-valued Expression to conform to BooleanEvaluation.
			  ValidationUtil.isBooleanExpression(rf.get(0).getFeatureTarget().getOwningType()) && !ValidationUtil.conformsFrom(boolType, f2types).isEmpty() ||
			  ValidationUtil.isBooleanExpression(rf.get(1).getFeatureTarget().getOwningType()) && !ValidationUtil.conformsFrom(boolType, f1types).isEmpty())
		) {				
			messageAccepter.warning(location, SysMLPackage.eINSTANCE.getType_EndFeature(), "validateBindingConnectorTypeConformance_");
		}
	}

}
