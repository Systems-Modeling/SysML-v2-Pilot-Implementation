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
	 * @generated
	 */
	protected ItemFlowEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ITEM_FLOW_END;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		addItemFlowEndSubsetting();
		return super.getOwnedSubsetting();
	}
	
	@Override
	public void computeImplicitGeneralization() {
		// Note: Do not add item flow end subsetting here, to avoid circularity due to name resolution.
	}

	protected void addItemFlowEndSubsetting() {
		EList<Feature> features = getOwnedFeature();
		if (!features.isEmpty()) {
			EList<Redefinition> redefinitions = ((FeatureImpl) features.get(0)).getOwnedRedefinition();
			if (!redefinitions.isEmpty()) {
				Feature feature = redefinitions.get(0).getRedefinedFeature();
				if (feature != null) {
					Type owner = feature.getOwningType();
					if (owner instanceof Feature) {
						Subsetting subsetting = super.getOwnedSubsetting().stream()
								.filter(sub -> !(sub instanceof Redefinition)).findFirst().orElse(null);
						if (subsetting == null) {
							subsetting = SysMLFactory.eINSTANCE.createSubsetting();
							subsetting.setSubsettingFeature(this);
							getOwnedRelationship_comp().add(subsetting);
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
	
	@Override
	public void transform() {
		addItemFlowEndSubsetting();
		super.transform();
	}
	
} // ItemFlowEndImpl
