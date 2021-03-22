package org.omg.sysml.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.PartUsage;
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

	public Collection<Definition> getAllDefinitions(Namespace namespace) {
		List<Definition> res = new ArrayList<>();
		for (EObject eo1 : namespace.eContents()) {
			for (EObject eo2 : eo1.eContents()) {
				if (eo2 instanceof Definition) {
					res.add((Definition) eo2);
					res.addAll(getAllDefinitions((Definition) eo2));
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

	public String getClassLabel(Type self) {
		return '«' + TYPE_LABELS.get(self.eClass()) + '»' + '\n' + getLabel(self);
	}

	private String getValue(Usage au) {
		if (!au.getOwnedRedefinition().isEmpty()) {
			Feature feature= au.getOwnedRedefinition().get(0).getRedefinedFeature();
			return ">>" + ((Element) feature.eContainer().eContainer()).getName() + "::" + feature.getName();
		}
		if (!au.getOwnedTyping().isEmpty()) {
			return au.getOwnedTyping().get(0).getType().getName();
		}
		return null;
	}
	
}
