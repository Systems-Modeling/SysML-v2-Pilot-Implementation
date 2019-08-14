/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.Action;
import org.omg.sysml.lang.sysml.Activity;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActivityImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActivityImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActivityImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends DefinitionImpl implements Activity {

	public String ACTIVITY_SUPERCLASS_DEFAULT = "Activities::Execution";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Step> getStep() {
		return new DerivedEObjectEList<Step>(Step.class, this, 
				SysMLPackage.ACTIVITY__STEP, 
				new int[] {SysMLPackage.TYPE__FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Parameter> getParameter() {
		return new DerivedEObjectEList<Parameter>(Parameter.class, this, 
				SysMLPackage.ACTIVITY__PARAMETER, 
				new int[] {SysMLPackage.TYPE__FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Action> getAction() {
		return new DerivedEObjectEList<Action>(Action.class, this, 
				SysMLPackage.ACTIVITY__ACTION, 
				new int[] {SysMLPackage.TYPE__FEATURE});
	}

	/**
	 * If the Activity has no Superclassings, then create one whose superclass is the appropriate default library class.
	 */
	@Override
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(ACTIVITY_SUPERCLASS_DEFAULT);
	}
	
	/**
	 * Return the non-parameter abstract features of the Activity.
	 */
	@Override
	public List<Feature> getRelevantFeatures() {
		return getFeature().stream().
				filter(feature->!(feature instanceof Parameter) && feature.isAbstract()).
				collect(Collectors.toList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ACTIVITY__STEP:
				return getStep();
			case SysMLPackage.ACTIVITY__PARAMETER:
				return getParameter();
			case SysMLPackage.ACTIVITY__ACTION:
				return getAction();
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
			case SysMLPackage.ACTIVITY__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.ACTIVITY__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case SysMLPackage.ACTIVITY__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
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
			case SysMLPackage.ACTIVITY__STEP:
				getStep().clear();
				return;
			case SysMLPackage.ACTIVITY__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.ACTIVITY__ACTION:
				getAction().clear();
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
			case SysMLPackage.ACTIVITY__STEP:
				return !getStep().isEmpty();
			case SysMLPackage.ACTIVITY__PARAMETER:
				return !getParameter().isEmpty();
			case SysMLPackage.ACTIVITY__ACTION:
				return !getAction().isEmpty();
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
		if (baseClass == Behavior.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.ACTIVITY__STEP: return SysMLPackage.BEHAVIOR__STEP;
				case SysMLPackage.ACTIVITY__PARAMETER: return SysMLPackage.BEHAVIOR__PARAMETER;
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
		if (baseClass == Behavior.class) {
			switch (baseFeatureID) {
				case SysMLPackage.BEHAVIOR__STEP: return SysMLPackage.ACTIVITY__STEP;
				case SysMLPackage.BEHAVIOR__PARAMETER: return SysMLPackage.ACTIVITY__PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActivityImpl
