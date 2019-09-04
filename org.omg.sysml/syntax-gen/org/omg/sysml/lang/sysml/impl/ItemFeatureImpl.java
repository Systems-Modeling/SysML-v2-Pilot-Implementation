/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ItemFeatureImpl extends FeatureImpl implements ItemFeature {
	
	public static final String ITEM_FLOW_ITEM_FEATURE_NAME = "item";
	
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
		return type instanceof Step? ((TypeImpl)type).getRelevantFeatures():
			   type.getFeature().stream().
					filter(feature->ITEM_FLOW_ITEM_FEATURE_NAME.equals(feature.getName())).
					collect(Collectors.toList());
	}
	
} //ItemFeatureImpl
