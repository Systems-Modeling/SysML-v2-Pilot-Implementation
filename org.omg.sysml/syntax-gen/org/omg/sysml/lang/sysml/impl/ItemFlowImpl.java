/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getTargetInputFeature <em>Target Input Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getItemFlowEnd <em>Item Flow End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getItemFlowFeature <em>Item Flow Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getItemFeature <em>Item Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemFlowImpl extends ConnectorImpl implements ItemFlow {
	
	public static final String ITEM_FLOW_SUBSETTING_BASE_DEFAULT = "Transfers::transfers";
	public static final String ITEM_FLOW_SUBSETTING_PERFORMANCE_DEFAULT = "Base::Performance::subtransfers";

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
	public EList<Behavior> getBehavior() {
		EList<Behavior> behaviors = new EObjectEList<Behavior>(Behavior.class, this, SysMLPackage.STEP__BEHAVIOR);
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
	public EList<Classifier> getItemType() {
		EList<Classifier> itemType = new EObjectEList<Classifier>(Classifier.class, this, SysMLPackage.ITEM_FLOW__ITEM_TYPE);
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
	public EList<ItemFeature> getItemFeature() {
		return new DerivedEObjectEList<ItemFeature>(
				ItemFeature.class, this, SysMLPackage.ITEM_FLOW__ITEM_FEATURE, 
				new int[]{SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getSourceOutputFeature() {
		EList<Feature> sourceOutputFeature = new EObjectEList<Feature>(Feature.class, this, SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE);
		getInputOutputFeature(0).ifPresent(sourceOutputFeature::add);
		return sourceOutputFeature;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ItemFlowEnd> getItemFlowEnd() {
		EList<ItemFlowEnd> itemFlows = 
				new EObjectEList<ItemFlowEnd>(ItemFlowEnd.class, this, SysMLPackage.ITEM_FLOW__ITEM_FLOW_END);
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
	public EList<ItemFlowFeature> getItemFlowFeature() {
		EList<ItemFlowFeature> itemFlowFeatures = 
				new EObjectResolvingEList<ItemFlowFeature>(ItemFlowFeature.class, this, SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE);
		getItemFlowEnd().stream().
			map(end->(ItemFlowFeature)end.getOwnedFeature().get(0)).
			forEachOrdered(itemFlowFeatures::add);
		return itemFlowFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getTargetInputFeature() {
		EList<Feature> targetInputFeature = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE);
		getInputOutputFeature(1).ifPresent(targetInputFeature::add);
		return targetInputFeature;
	}
	
	public Optional<Feature> getInputOutputFeature(int i) {
		EList<ItemFlowFeature> features = getItemFlowFeature();
		return features.size() <= i? Optional.empty(): Optional.of(features.get(i));
	}
	
	@Override
	public EList<Feature> getConnectorEnd() {
		EList<Feature> ends = super.getConnectorEnd();
		Type owner = getOwningType();
		if (owner instanceof Step) {
			EList<Feature> features = owner.getOwnedFeature();
			int i = features.indexOf(this);
			if (i > 0) {
				if (ends.size() < 2) {
					ItemFlowFeature targetInput = SysMLFactory.eINSTANCE.createItemFlowFeature();
					Redefinition redefinition = SysMLFactory.eINSTANCE.createRedefinition();
					redefinition.setRedefiningFeature(targetInput);
					redefinition.setRedefinedFeature(features.get(i-1));
					targetInput.getOwnedRelationship_comp().add(redefinition);
					ItemFlowEnd targetEnd = SysMLFactory.eINSTANCE.createItemFlowEnd();
					((FeatureImpl)targetEnd).addOwnedFeature(targetInput);
					EndFeatureMembership membership = SysMLFactory.eINSTANCE.createEndFeatureMembership();
					membership.setOwnedMemberFeature_comp(targetEnd);
					getOwnedFeatureMembership_comp().add(membership);
				} else {
					EList<Feature> endFeatures = ends.get(1).getOwnedFeature();
					if (!features.isEmpty()) {
						EList<Redefinition> redefinitions = endFeatures.get(0).getOwnedRedefinition();
						if (!redefinitions.isEmpty()) {
							Redefinition redefinition = redefinitions.get(0);
							if (((RedefinitionImpl)redefinition).basicGetRedefinedFeature() == null) {
								redefinition.setRedefinedFeature(features.get(i-1));
							}
						}
					}
				}
			}
		}
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectorEnd() {
  		return false;
	}

	@Override
	public boolean basicIsComposite() {
		if (!isComposite && isSubtransfer()) {
			isComposite = true;
		}
		return isComposite;
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
	public List<? extends Feature> getRelevantFeatures() {
		return StepImpl.getRelevantFeaturesOf(this);
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ITEM_FLOW__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.ITEM_FLOW__ITEM_TYPE:
				return getItemType();
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				return getTargetInputFeature();
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				return getSourceOutputFeature();
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_END:
				return getItemFlowEnd();
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE:
				return getItemFlowFeature();
			case SysMLPackage.ITEM_FLOW__ITEM_FEATURE:
				return getItemFeature();
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
			case SysMLPackage.ITEM_FLOW__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_TYPE:
				getItemType().clear();
				getItemType().addAll((Collection<? extends Classifier>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				getTargetInputFeature().clear();
				getTargetInputFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				getSourceOutputFeature().clear();
				getSourceOutputFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_END:
				getItemFlowEnd().clear();
				getItemFlowEnd().addAll((Collection<? extends ItemFlowEnd>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE:
				getItemFlowFeature().clear();
				getItemFlowFeature().addAll((Collection<? extends ItemFlowFeature>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_FEATURE:
				getItemFeature().clear();
				getItemFeature().addAll((Collection<? extends ItemFeature>)newValue);
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
			case SysMLPackage.ITEM_FLOW__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_TYPE:
				getItemType().clear();
				return;
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				getTargetInputFeature().clear();
				return;
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				getSourceOutputFeature().clear();
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_END:
				getItemFlowEnd().clear();
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE:
				getItemFlowFeature().clear();
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_FEATURE:
				getItemFeature().clear();
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
			case SysMLPackage.ITEM_FLOW__TYPE:
				return isSetType();
			case SysMLPackage.ITEM_FLOW__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.ITEM_FLOW__CONNECTOR_END:
				return isSetConnectorEnd();
			case SysMLPackage.ITEM_FLOW__ITEM_TYPE:
				return !getItemType().isEmpty();
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				return !getTargetInputFeature().isEmpty();
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				return !getSourceOutputFeature().isEmpty();
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_END:
				return isSetItemFlowEnd();
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE:
				return !getItemFlowFeature().isEmpty();
			case SysMLPackage.ITEM_FLOW__ITEM_FEATURE:
				return !getItemFeature().isEmpty();
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
				case SysMLPackage.ITEM_FLOW__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
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
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.ITEM_FLOW__BEHAVIOR;
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
	@Override
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> association = (EList<Type>)((EList<?>)getAssociation());
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

} //ItemFlowImpl
