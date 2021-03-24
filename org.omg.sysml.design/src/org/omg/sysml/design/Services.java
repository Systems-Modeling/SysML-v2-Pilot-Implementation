package org.omg.sysml.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;

/**
 * The services class used by VSM.
 */
public class Services {

	private static final Map<EClass, String> TYPE_LABELS = new HashMap<>();
	static {
		TYPE_LABELS.put(SysMLPackage.eINSTANCE.getPortDefinition(), "port def");
		TYPE_LABELS.put(SysMLPackage.eINSTANCE.getPartDefinition(), "part def");
		TYPE_LABELS.put(SysMLPackage.eINSTANCE.getPartUsage(), "part");
	}

	public Collection<PartDefinition> getAllPartDefinitions(Namespace namespace) {
		List<PartDefinition> res = new ArrayList<>();
		for (EObject eo1 : namespace.eContents()) {
			for (EObject eo2 : eo1.eContents()) {
				if (eo2 instanceof PartDefinition) {
					res.add((PartDefinition) eo2);
					res.addAll(getAllPartDefinitions((PartDefinition) eo2));
				}
			}
		}
		return res;
	}

	public Collection<PortDefinition> getAllPortDefinitions(Namespace namespace) {
		List<PortDefinition> res = new ArrayList<>();
		for (EObject eo1 : namespace.eContents()) {
			for (EObject eo2 : eo1.eContents()) {
				if (eo2 instanceof PortDefinition) {
					res.add((PortDefinition) eo2);
					res.addAll(getAllPortDefinitions((PortDefinition) eo2));
				}
			}
		}
		return res;
	}

	public Collection<PartUsage> getAllPartUsages(Namespace namespace) {
		List<PartUsage> res = new ArrayList<>();
		for (EObject eo1 : namespace.eContents()) {
			for (EObject eo2 : eo1.eContents()) {
				if (eo2 instanceof PartUsage) {
					res.add((PartUsage) eo2);
					res.addAll(getAllPartUsages((PartUsage) eo2));
				}
			}
		}
		return res;
	}

	public String getLabel(Element self) {
		String label = null;
		if (self instanceof FeatureImpl) {
			label = ((FeatureImpl) self).getEffectiveName();
		} else {
			label = self.getName();
		}
		if (self instanceof Usage) {
			String value = getValue((Usage) self);
			if (value != null) {
				label += ": " + value;
			}
		}
		return label;
	}

	private String getValue(Usage au) {
		if (!au.getOwnedRedefinition().isEmpty()) {
			Feature feature = au.getOwnedRedefinition().get(0).getRedefinedFeature();
			return ">>" + ((Element) feature.eContainer().eContainer()).getName() + "::" + feature.getName();
		}
		if (!au.getOwnedTyping().isEmpty()) {
			return au.getOwnedTyping().get(0).getType().getName();
		}
		return null;
	}

	public String getClassLabel(Type self) {
		return '«' + TYPE_LABELS.get(self.eClass()) + '»' + '\n' + getLabel(self);
	}

	public void delete(Element element) {
		try {
			if (element instanceof FeatureMembership) {
				// prevent deletion of feature membership, as deleting the element as the same
				// effect
				return;
			}
			Membership owningMembership = element.getOwningMembership();
			if (owningMembership != null) {
				EcoreUtil.delete(owningMembership);
			} else {
				EcoreUtil.delete(element);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createPackage(Namespace namespace) {
		createMembership(namespace, SysMLFactory.eINSTANCE.createPackage());
	}

	public void createPartDefinition(Namespace namespace) {
		createMembership(namespace, SysMLFactory.eINSTANCE.createPartDefinition());
	}

	public void createPortDefinition(Namespace namespace) {
		createMembership(namespace, SysMLFactory.eINSTANCE.createPortDefinition());
	}

	public void createPartUsage(Namespace namespace) {
		createMembership(namespace, SysMLFactory.eINSTANCE.createPartUsage());
	}

	private void createMembership(Namespace namespace, Element member) {
		Membership membership = SysMLFactory.eINSTANCE.createMembership();
		namespace.getOwnedMembership_comp().add(membership);
		membership.setOwnedMemberElement_comp(member);
	}

	public void createFeatureTyping(Usage usage, Definition definition) {
		FeatureTyping featureTyping = SysMLFactory.eINSTANCE.createFeatureTyping();
		featureTyping.setType(definition);
		usage.getOwnedRelationship_comp().add(featureTyping);
	}

	public void createReferenceUsage(Definition source, Definition target) {
		FeatureMembership featureMembership = SysMLFactory.eINSTANCE.createFeatureMembership();
		ReferenceUsage referenceUsage = SysMLFactory.eINSTANCE.createReferenceUsage();
		featureMembership.setOwnedMemberFeature_comp(referenceUsage);
		FeatureTyping featureTyping = SysMLFactory.eINSTANCE.createFeatureTyping();
		referenceUsage.getOwnedRelationship_comp().add(featureTyping);
		featureTyping.setType(target);
		source.getOwnedFeatureMembership_comp().add(featureMembership);
	}

	public void moveInto(Usage usage, Usage targetUsage) {
		try {
			Membership originMembership = usage.getOwningMembership();
			originMembership.eUnset(SysMLPackage.eINSTANCE.getMembership_OwnedMemberElement_comp());

			FeatureMembership featureMembership = SysMLFactory.eINSTANCE.createFeatureMembership();
			targetUsage.getOwnedFeatureMembership_comp().add(featureMembership);
			featureMembership.setOwnedMemberFeature_comp(usage);
			EcoreUtil.delete(originMembership);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
