/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Item
 * Flow End</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ItemFlowEndImpl extends FeatureImpl implements ItemFlowEnd {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ItemFlowEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ITEM_FLOW_END;
	}

	@Override
	public EList<Generalization> getOwnedGeneralization() {
		// Note: Do not add flow end subsettings here, to avoid possible cyclic resolution error
		// during traversal of the inheritance hierarchy.
		super.getOwnedSubsettingWithComputedRedefinitions();
		return super.basicGetOwnedGeneralization();
	}
	
	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		addItemFlowEndSubsetting();
		EList<Subsetting> subsettings = super.getOwnedSubsettingWithComputedRedefinitions();
		for (Feature feature : getOwnedFeature()) {
			feature.getOwnedSubsetting();
		}
		return subsettings;
	}

	protected void addItemFlowEndSubsetting() {
		EList<Feature> features = getOwnedFeature();
		if (!features.isEmpty()) {
			EList<Redefinition> redefinitions = ((FeatureImpl) features.get(0)).getOwnedRedefinitionsWithoutDefault();
			if (!redefinitions.isEmpty()) {
				Feature feature = redefinitions.get(0).getRedefinedFeature();
				if (feature != null) {
					Type owner = feature.getOwningType();
					if (owner instanceof Feature) {
						Subsetting subsetting = getOwnedSubsettingWithoutDefault().stream()
								.filter(sub -> !(sub instanceof Redefinition)).findFirst().orElse(null);
						if (subsetting == null) {
							subsetting = SysMLFactory.eINSTANCE.createSubsetting();
							subsetting.setSubsettingFeature(this);
							getOwnedRelationship().add(subsetting);
						}
						subsetting.setSubsettedFeature((Feature) owner);
					}
				}
			}
		}
	}

	@Override
	protected Set<Type> getGeneralTypes(Type type) {
		return type instanceof ItemFlow ? new HashSet<>(((ItemFlow) type).getType()) : super.getGeneralTypes(type);
	}

	@Override
	public List<Feature> getRelevantFeatures() {
		return getOwnedFeature();
	}

} // ItemFlowEndImpl
