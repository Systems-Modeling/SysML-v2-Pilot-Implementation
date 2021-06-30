/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FlowConnectionUsage;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Connection Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getTargetInputFeature <em>Target Input Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getItemFlowEnd <em>Item Flow End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getItemFeature <em>Item Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getItemFlowFeature <em>Item Flow Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowConnectionUsageImpl extends ConnectionUsageImpl implements FlowConnectionUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowConnectionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FLOW_CONNECTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Behavior> getBehavior() {
		// TODO: implement this method to return the 'Behavior' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBehavior() {
		return !getBehavior().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getParameter() {
		// TODO: implement this method to return the 'Parameter' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameter() {
		return !getParameter().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getItemType() {
		// TODO: implement this method to return the 'Item Type' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getTargetInputFeature() {
		// TODO: implement this method to return the 'Target Input Feature' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getSourceOutputFeature() {
		// TODO: implement this method to return the 'Source Output Feature' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemFlowEnd> getItemFlowEnd() {
		// TODO: implement this method to return the 'Item Flow End' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemFlowEnd() {
		return !getItemFlowEnd().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemFeature> getItemFeature() {
		// TODO: implement this method to return the 'Item Feature' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemFlowFeature> getItemFlowFeature() {
		// TODO: implement this method to return the 'Item Flow Feature' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER:
				return getParameter();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE:
				return getItemType();
			case SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE:
				return getTargetInputFeature();
			case SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE:
				return getSourceOutputFeature();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END:
				return getItemFlowEnd();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE:
				return getItemFeature();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_FEATURE:
				return getItemFlowFeature();
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
			case SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE:
				getItemType().clear();
				getItemType().addAll((Collection<? extends Classifier>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE:
				getTargetInputFeature().clear();
				getTargetInputFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE:
				getSourceOutputFeature().clear();
				getSourceOutputFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END:
				getItemFlowEnd().clear();
				getItemFlowEnd().addAll((Collection<? extends ItemFlowEnd>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE:
				getItemFeature().clear();
				getItemFeature().addAll((Collection<? extends ItemFeature>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_FEATURE:
				getItemFlowFeature().clear();
				getItemFlowFeature().addAll((Collection<? extends ItemFlowFeature>)newValue);
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
			case SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE:
				getItemType().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE:
				getTargetInputFeature().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE:
				getSourceOutputFeature().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END:
				getItemFlowEnd().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE:
				getItemFeature().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_FEATURE:
				getItemFlowFeature().clear();
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
			case SysMLPackage.FLOW_CONNECTION_USAGE__TYPE:
				return isSetType();
			case SysMLPackage.FLOW_CONNECTION_USAGE__DIRECTED_FEATURE:
				return isSetDirectedFeature();
			case SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER:
				return isSetParameter();
			case SysMLPackage.FLOW_CONNECTION_USAGE__CONNECTOR_END:
				return isSetConnectorEnd();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE:
				return !getItemType().isEmpty();
			case SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE:
				return !getTargetInputFeature().isEmpty();
			case SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE:
				return !getSourceOutputFeature().isEmpty();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END:
				return isSetItemFlowEnd();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE:
				return !getItemFeature().isEmpty();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_FEATURE:
				return !getItemFlowFeature().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Step.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
				case SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER: return SysMLPackage.STEP__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ItemFlow.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE: return SysMLPackage.ITEM_FLOW__ITEM_TYPE;
				case SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE: return SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE;
				case SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE: return SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE;
				case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END: return SysMLPackage.ITEM_FLOW__ITEM_FLOW_END;
				case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE: return SysMLPackage.ITEM_FLOW__ITEM_FEATURE;
				case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_FEATURE: return SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Step.class) {
			switch (baseFeatureID) {
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR;
				case SysMLPackage.STEP__PARAMETER: return SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ItemFlow.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ITEM_FLOW__ITEM_TYPE: return SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE;
				case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE: return SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE;
				case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE: return SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE;
				case SysMLPackage.ITEM_FLOW__ITEM_FLOW_END: return SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END;
				case SysMLPackage.ITEM_FLOW__ITEM_FEATURE: return SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE;
				case SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE: return SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_FEATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> definition = (EList<Type>)((EList<?>)getDefinition());
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getDirectedFeature() {
		return getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectedFeature() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getConnectorEnd() {
		@SuppressWarnings("unchecked")
		EList<Feature> itemFlowEnd = (EList<Feature>)((EList<?>)getItemFlowEnd());
		return itemFlowEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectorEnd() {
  		return false;
	}

} //FlowConnectionUsageImpl
