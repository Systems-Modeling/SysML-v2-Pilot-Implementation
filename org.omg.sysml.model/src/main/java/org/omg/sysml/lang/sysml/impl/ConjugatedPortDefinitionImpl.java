/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.PortConjugation;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjugated Port Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugatedPortDefinitionImpl#getOriginalPortDefinition <em>Original Port Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugatedPortDefinitionImpl#getOwnedPortConjugator <em>Owned Port Conjugator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConjugatedPortDefinitionImpl extends PortDefinitionImpl implements ConjugatedPortDefinition {
	/**
	 * The cached setting delegate for the '{@link #getOriginalPortDefinition() <em>Original Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPortDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ORIGINAL_PORT_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwnedPortConjugator() <em>Owned Port Conjugator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPortConjugator()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_PORT_CONJUGATOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjugatedPortDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONJUGATED_PORT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConjugation getOwnedPortConjugator() {
		return (PortConjugation)OWNED_PORT_CONJUGATOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConjugation basicGetOwnedPortConjugator() {
		return (PortConjugation)OWNED_PORT_CONJUGATOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedPortConjugator(PortConjugation newOwnedPortConjugator) {
		OWNED_PORT_CONJUGATOR__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwnedPortConjugator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedPortConjugator() {
		return basicGetOwnedPortConjugator() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortDefinition getOriginalPortDefinition() {
		return (PortDefinition)ORIGINAL_PORT_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDefinition basicGetOriginalPortDefinition() {
		return (PortDefinition)ORIGINAL_PORT_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalPortDefinition(PortDefinition newOriginalPortDefinition) {
		ORIGINAL_PORT_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOriginalPortDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOriginalPortDefinition() {
		return basicGetOriginalPortDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION:
				if (resolve) return getOriginalPortDefinition();
				return basicGetOriginalPortDefinition();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				if (resolve) return getOwnedPortConjugator();
				return basicGetOwnedPortConjugator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION:
				setOriginalPortDefinition((PortDefinition)newValue);
				return;
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				setOwnedPortConjugator((PortConjugation)newValue);
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
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION:
				setOriginalPortDefinition((PortDefinition)null);
				return;
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				setOwnedPortConjugator((PortConjugation)null);
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
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNING_NAMESPACE:
				return isSetOwningNamespace();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_CONJUGATOR:
				return isSetOwnedConjugator();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION:
				return isSetOriginalPortDefinition();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				return isSetOwnedPortConjugator();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conjugation getOwnedConjugator() {
		return getOwnedPortConjugator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conjugation basicGetOwnedConjugator() {
		return basicGetOwnedPortConjugator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedConjugator(Conjugation newOwnedConjugator) {
		if (newOwnedConjugator != null && !(newOwnedConjugator instanceof PortConjugation)) {
			throw new IllegalArgumentException("newOwnedConjugator must be an instance of PortConjugation");
		}
		setOwnedPortConjugator((PortConjugation) newOwnedConjugator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedConjugator() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getOwningNamespace() {
		return getOriginalPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace basicGetOwningNamespace() {
		return basicGetOriginalPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningNamespace(Namespace newOwningNamespace) {
		if (newOwningNamespace != null && !(newOwningNamespace instanceof PortDefinition)) {
			throw new IllegalArgumentException("newOwningNamespace must be an instance of PortDefinition");
		}
		setOriginalPortDefinition((PortDefinition) newOwningNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningNamespace() {
  		return false;
	}

} //ConjugatedPortDefinitionImpl
