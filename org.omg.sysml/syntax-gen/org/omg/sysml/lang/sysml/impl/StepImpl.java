/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.Class;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StepImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends FeatureImpl implements Step {
	
	public static final String STEP_SUBSETTING_BASE_DEFAULT = "Base::performances";
	public static final String STEP_SUBSETTING_PERFORMANCE_DEFAULT = "Base::Performance::subperformances";
	public static final String STEP_SUBSETTING_OBJECT_DEFAULT = "Base::Object::enactedPerformances";
	public static final String STEP_SUBSETTING_TRANSFER_DEFAULT = "Base::Occurrence::incomingTransfers";
	
	protected boolean isCheckSubsetting = true;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.STEP;
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
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> behavior = (EList<Type>)((EList<?>)getBehavior());
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}
	
	@Override
	protected String getDefaultSupertype() {
		return 
			isSubperformance()? 
				STEP_SUBSETTING_PERFORMANCE_DEFAULT:
			isEnactedPerformance()?
				STEP_SUBSETTING_OBJECT_DEFAULT:
			isIncomingTransfer()?
				STEP_SUBSETTING_TRANSFER_DEFAULT:
				STEP_SUBSETTING_BASE_DEFAULT;
	}
	
	@Override
	public List<? extends Feature> getRelevantFeatures() {
		return getRelevantFeaturesOf(this);
	}	
	
	public static List<? extends Feature> getRelevantFeaturesOf(Step step) {
		return step.getOwnedFeature().stream().
				filter(f->f instanceof ItemFeature).
				collect(Collectors.toList());
	}
	
	// Utility methods
	
	public boolean isSubperformance() {
		return isCompositePerformanceFeature(this);
	}
	
	public boolean isEnactedPerformance() {
		return isEnactedPerformance(this);
	}
	
	public boolean isIncomingTransfer() {
		return isIncomingTransfer(this);
	}
	
	public static boolean isEnactedPerformance(Feature step) {
		Type owningType = step.getOwningType();
		return owningType instanceof Class ||
				owningType instanceof Feature && 
					((FeatureImpl)owningType).isObjectFeature();
	}
	
	public static boolean isIncomingTransfer(Feature step) {
		return step.getOwnedFeature().stream().anyMatch(f->f instanceof ItemFeature);
	}
	
	public static boolean isCompositePerformanceFeature(Feature step) {
		return step.isComposite() && isPerformanceFeature(step);
	}
	
	public static boolean isPerformanceFeature(Feature step) {
		Type owningType = step.getOwningType();
		return owningType instanceof Behavior || owningType instanceof Step;
	}	
	
	public List<Step> getSubsteps() {
		return getOwnedFeature().stream().filter(f->f instanceof Step).
				map(f->(Step)f).collect(Collectors.toList());
	}
	
	//
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.STEP__BEHAVIOR:
				return getBehavior();
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
			case SysMLPackage.STEP__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
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
			case SysMLPackage.STEP__BEHAVIOR:
				getBehavior().clear();
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
			case SysMLPackage.STEP__TYPE:
				return isSetType();
			case SysMLPackage.STEP__BEHAVIOR:
				return isSetBehavior();
		}
		return super.eIsSet(featureID);
	}

} //StepImpl
