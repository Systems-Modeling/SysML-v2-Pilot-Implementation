/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FlowConnectionDefinition;
import org.omg.sysml.lang.sysml.Interaction;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Connection Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionDefinitionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionDefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionDefinitionImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowConnectionDefinitionImpl extends ConnectionDefinitionImpl implements FlowConnectionDefinition {
	/**
	 * The cached setting delegate for the '{@link #getStep() <em>Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate STEP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.BEHAVIOR__STEP).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getParameter() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PARAMETER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.BEHAVIOR__PARAMETER).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAction() <em>Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ACTION_DEFINITION__ACTION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowConnectionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FLOW_CONNECTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Step> getStep() {
		return (EList<Step>)STEP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getParameter() {
		return (EList<Feature>)PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionUsage> getAction() {
		return (EList<ActionUsage>)ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__STEP:
				return getStep();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__PARAMETER:
				return getParameter();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__ACTION:
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
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ActionUsage>)newValue);
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
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__STEP:
				getStep().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__ACTION:
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
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__DIRECTED_FEATURE:
				return isSetDirectedFeature();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__STEP:
				return STEP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__PARAMETER:
				return isSetParameter();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__ACTION:
				return ACTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__STEP: return SysMLPackage.BEHAVIOR__STEP;
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__PARAMETER: return SysMLPackage.BEHAVIOR__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ActionDefinition.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__ACTION: return SysMLPackage.ACTION_DEFINITION__ACTION;
				default: return -1;
			}
		}
		if (baseClass == Interaction.class) {
			switch (derivedFeatureID) {
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
				case SysMLPackage.BEHAVIOR__STEP: return SysMLPackage.FLOW_CONNECTION_DEFINITION__STEP;
				case SysMLPackage.BEHAVIOR__PARAMETER: return SysMLPackage.FLOW_CONNECTION_DEFINITION__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ActionDefinition.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ACTION_DEFINITION__ACTION: return SysMLPackage.FLOW_CONNECTION_DEFINITION__ACTION;
				default: return -1;
			}
		}
		if (baseClass == Interaction.class) {
			switch (baseFeatureID) {
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

} //FlowConnectionDefinitionImpl
