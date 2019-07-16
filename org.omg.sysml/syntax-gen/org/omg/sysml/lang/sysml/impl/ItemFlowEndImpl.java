/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Flow End</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ItemFlowEndImpl extends FeatureImpl implements ItemFlowEnd {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemFlowEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ITEM_FLOW_END;
	}
	
	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		if (getOwnedSubsettingWithoutDefault().stream().allMatch(sub->sub instanceof Redefinition)) {
			addItemFlowEndSubsetting();
		}
		EList<Subsetting> subsettings = super.getOwnedSubsetting();
		for (Feature feature: getOwnedFeature()) {
			feature.getOwnedSubsetting();
		}
		return subsettings;
	}

	public void addItemFlowEndSubsetting() {
		EList<Feature> features = getOwnedFeature();
		if (!features.isEmpty()) {
			EList<Redefinition> redefinitions = 
					((FeatureImpl)features.get(0)).getOwnedRedefinitionsWithoutDefault();
			if (!redefinitions.isEmpty()) {
				Feature feature = redefinitions.get(0).getRedefinedFeature();
				if (feature != null) {
					Category owner = feature.getOwningCategory();
					if (owner instanceof Feature) {
						Subsetting subsetting = SysMLFactory.eINSTANCE.createSubsetting();
						subsetting.setSubsettedFeature((Feature)owner);
						subsetting.setSubsettingFeature(this);
						getOwnedRelationship().add(subsetting);
					}
				}
			}
		}
	}
	
	@Override
	protected Set<Category> getGeneralCategories(Category category) {		
		return category instanceof ItemFlow? new HashSet<>(((ItemFlow)category).getType()):
			super.getGeneralCategories(category);
	}
	
	@Override
	public List<Feature> getRelevantFeatures() {
		return getOwnedFeature();
	}
	
} //ItemFlowEndImpl
