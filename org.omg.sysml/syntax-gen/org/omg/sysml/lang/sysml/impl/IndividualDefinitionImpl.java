/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.IndividualDefinition;
import org.omg.sysml.lang.sysml.LifeClass;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IndividualDefinitionImpl#getLifeClass <em>Life Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualDefinitionImpl extends BlockImpl implements IndividualDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INDIVIDUAL_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.sysml.lang.sysml.Class getLifeClass() {
		org.omg.sysml.lang.sysml.Class lifeClass = basicGetLifeClass();
		return lifeClass != null && lifeClass.eIsProxy() ? (org.omg.sysml.lang.sysml.Class)eResolveProxy((InternalEObject)lifeClass) : lifeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.omg.sysml.lang.sysml.Class basicGetLifeClass() {
		return (LifeClass) getOwnedMember().stream().filter(mem->mem instanceof LifeClass).findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setLifeClass(org.omg.sysml.lang.sysml.Class newLifeClass) {
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
			case SysMLPackage.INDIVIDUAL_DEFINITION__LIFE_CLASS:
				if (resolve) return getLifeClass();
				return basicGetLifeClass();
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
			case SysMLPackage.INDIVIDUAL_DEFINITION__LIFE_CLASS:
				setLifeClass((org.omg.sysml.lang.sysml.Class)newValue);
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
			case SysMLPackage.INDIVIDUAL_DEFINITION__LIFE_CLASS:
				setLifeClass((org.omg.sysml.lang.sysml.Class)null);
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
			case SysMLPackage.INDIVIDUAL_DEFINITION__LIFE_CLASS:
				return basicGetLifeClass() != null;
		}
		return super.eIsSet(featureID);
	}

} //IndividualDefinitionImpl
