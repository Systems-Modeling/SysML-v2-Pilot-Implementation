/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
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
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.TypeUtil;

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
	 * @generated NOT
	 */
	@Override
	public EList<Behavior> getBehavior() {
		EList<Behavior> behaviors = new NonNotifyingEObjectEList<>(Behavior.class, this, SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR);
		super.getType().stream().
			filter(type->type instanceof Behavior).
			map(type->(Behavior)type).
			forEachOrdered(behaviors::add);
		return behaviors;
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
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getParameter() {
		EList<Feature> parameters = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER);
		parameters.addAll(TypeUtil.getAllParametersOf(this));
		return parameters;
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
	 * @generated NOT
	 */
	@Override
	public EList<Classifier> getItemType() {
		EList<Classifier> itemType = new NonNotifyingEObjectEList<>(Classifier.class, this, SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE);
		getItemFeature().stream().
			flatMap(f->f.getType().stream()).
			filter(t->t instanceof Classifier).
			map(t->(Classifier)t).
			forEachOrdered(itemType::add);
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getTargetInputFeature() {
		EList<Feature> targetInputFeature = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE);
		getInputOutputFeature(1).ifPresent(targetInputFeature::add);
		return targetInputFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getSourceOutputFeature() {
		EList<Feature> sourceOutputFeature = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE);
		getInputOutputFeature(0).ifPresent(sourceOutputFeature::add);
		return sourceOutputFeature;
	}

	public Optional<Feature> getInputOutputFeature(int i) {
		EList<ItemFlowFeature> features = getItemFlowFeature();
		return features.size() <= i? Optional.empty(): Optional.of(features.get(i));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemFlowEnd> getItemFlowEnd() {
		EList<ItemFlowEnd> itemFlows = 
				new NonNotifyingEObjectEList<>(ItemFlowEnd.class, this, SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END);
		getConnectorEnd().stream().
			filter(end->end instanceof ItemFlowEnd).
			map(end->(ItemFlowEnd)end).
			forEachOrdered(itemFlows::add);
		return itemFlows;
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
	 * @generated NOT
	 */
	@Override
	public EList<ItemFeature> getItemFeature() {
		return new DerivedEObjectEList<ItemFeature>(
				ItemFeature.class, this, SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE, 
				new int[]{SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ItemFlowFeature> getItemFlowFeature() {
		EList<ItemFlowFeature> itemFlowFeatures = 
				new EObjectResolvingEList<ItemFlowFeature>(ItemFlowFeature.class, this, SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_FEATURE);
		getItemFlowEnd().stream().
			map(end->(ItemFlowFeature)end.getOwnedFeature().get(0)).
			forEachOrdered(itemFlowFeatures::add);
		return itemFlowFeatures;
	}
	
	// Additional overrides
	
	@Override
	public boolean isAbstract() {
		if (getRelatedFeature().size() < 2) {
			isAbstract = true;
		}
		return super.isAbstract();
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
	 * @generated NOT
	 */
	public EList<Feature> getConnectorEnd() {
		return super.getConnectorEnd();
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
