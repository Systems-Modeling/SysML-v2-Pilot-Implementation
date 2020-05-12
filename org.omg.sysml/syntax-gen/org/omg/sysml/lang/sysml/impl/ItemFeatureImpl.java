/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ItemFeatureImpl extends FeatureImpl implements ItemFeature {
	
	public static final String ITEM_FLOW_ITEM_FEATURE = "Transfers::Transfer::item";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ITEM_FEATURE;
	}

	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return type == getOwner()? ((TypeImpl)type).getRelevantFeatures():
				Collections.singletonList((Feature)getDefaultType(ITEM_FLOW_ITEM_FEATURE));
	}
	
} //ItemFeatureImpl
