/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.xtext.util.Arrays;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Flow Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ItemFlowFeatureImpl extends FeatureImpl implements ItemFlowFeature {
	
	public static final String[] ITEM_FLOW_INPUT_OUTPUT_FEATURE_NAMES = {"sourceOutput", "targetInput"};
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemFlowFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ITEM_FLOW_FEATURE;
	}
	
	@Override
	protected EList<Subsetting> getComputedRedefinitions() {
		EList<Subsetting> redefinitions = new EObjectEList<Subsetting>(Subsetting.class, this, SysMLPackage.FEATURE__OWNED_SUBSETTING);
		EList<Redefinition> ownedRedefinitions = getOwnedRedefinitionsWithoutDefault();
		if (ownedRedefinitions.size() < 2) {
			addRedefinitions(redefinitions, null);
		}
		return redefinitions;
	}
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Category category) {
		return category instanceof ItemFlowEnd? category.getOwnedFeature():
			   category.getFeature().stream().
					filter(feature->Arrays.contains(ITEM_FLOW_INPUT_OUTPUT_FEATURE_NAMES, feature.getName())).
					collect(Collectors.toList());
	}
	
} //ItemFlowFeatureImpl
