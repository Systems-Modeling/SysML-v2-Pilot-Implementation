/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getTargetInputFeature <em>Target Input Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemFlowImpl extends ConnectorImpl implements ItemFlow {
	
	public static final String ITEM_FLOW_SUBSETTING_BASE_DEFAULT = "Transfers::transfers";
	public static final String ITEM_FLOW_SUBSETTING_PERFORMANCE_DEFAULT = "Base::Performance::subtransfers";

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.lang.sysml.Class> itemType;

	/**
	 * The cached value of the '{@link #getTargetInputFeature() <em>Target Input Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInputFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> targetInputFeature;

	/**
	 * The cached value of the '{@link #getSourceOutputFeature() <em>Source Output Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOutputFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> sourceOutputFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ITEM_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<org.omg.sysml.lang.sysml.Class> getItemType() {
		if (itemType == null) {
			itemType = new EObjectResolvingEList<org.omg.sysml.lang.sysml.Class>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.ITEM_FLOW__ITEM_TYPE);
		}
		if (itemType.isEmpty()) {
			Feature feature = getItemFeature();
			if (feature != null) {
				itemType.addAll(feature.getType().stream().
						filter(t->t instanceof org.omg.sysml.lang.sysml.Class).
						map(t->(org.omg.sysml.lang.sysml.Class)t).
						collect(Collectors.toList()));
			}
		}
		return itemType;
	}
	
	public Feature getItemFeature() {
		EList<Feature> ends = getConnectorEnd();
		return getFeature().stream().filter(f->!(ends.contains(f))).findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getTargetInputFeature() {
		if (targetInputFeature == null) {
			targetInputFeature = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE);
		}
		if (targetInputFeature.isEmpty()) {
			Feature feature = getInputOutputFeature(0);
			if (feature != null) {
				targetInputFeature.add(feature);
			}
		}
		return targetInputFeature;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getSourceOutputFeature() {
		if (sourceOutputFeature == null) {
			sourceOutputFeature = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE);
		}
		if (sourceOutputFeature.isEmpty()) {
			Feature feature = getInputOutputFeature(1);
			if (feature != null) {
				sourceOutputFeature.add(feature);
			}
		}
		return sourceOutputFeature;
	}
	
	public Feature getInputOutputFeature(int i) {
		EList<Feature> ends = getConnectorEnd();
		if (ends.size() > i) {
			Feature end = ends.get(i);
			EList<Feature> features = end.getOwnedFeature();
			if (!features.isEmpty()) {
				EList<Redefinition> redefinitions = features.get(0).getOwnedRedefinition();
				if (!redefinitions.isEmpty()) {
					return redefinitions.get(0).getRedefinedFeature();
				}
			}
		}
		return null;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithDefault(
				isSubtransfer()? 
					ITEM_FLOW_SUBSETTING_PERFORMANCE_DEFAULT:
					ITEM_FLOW_SUBSETTING_BASE_DEFAULT);
	}
	
	public boolean isSubtransfer() {
		return StepImpl.isPerformanceFeature(this);
	}
	
	@Override
	public List<Feature> getRelevantFeatures() {
		return Collections.singletonList(getItemFeature());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ITEM_FLOW__ITEM_TYPE:
				return getItemType();
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				return getTargetInputFeature();
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				return getSourceOutputFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.ITEM_FLOW__ITEM_TYPE:
				getItemType().clear();
				getItemType().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				getTargetInputFeature().clear();
				getTargetInputFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				getSourceOutputFeature().clear();
				getSourceOutputFeature().addAll((Collection<? extends Feature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.ITEM_FLOW__ITEM_TYPE:
				getItemType().clear();
				return;
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				getTargetInputFeature().clear();
				return;
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				getSourceOutputFeature().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.ITEM_FLOW__ITEM_TYPE:
				return itemType != null && !itemType.isEmpty();
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				return targetInputFeature != null && !targetInputFeature.isEmpty();
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				return sourceOutputFeature != null && !sourceOutputFeature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ItemFlowImpl
