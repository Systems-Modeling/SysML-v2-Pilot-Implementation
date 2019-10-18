/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Property;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PropertyImpl#getPropertyOwningDefinition <em>Property Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PropertyImpl#getPropertyOwningUsage <em>Property Owning Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PropertyImpl extends UsageImpl implements Property {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getPropertyOwningDefinition() {
		Definition propertyOwningDefinition = basicGetPropertyOwningDefinition();
		return propertyOwningDefinition != null && propertyOwningDefinition.eIsProxy() ? (Definition)eResolveProxy((InternalEObject)propertyOwningDefinition) : propertyOwningDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Definition basicGetPropertyOwningDefinition() {
		Type owningType = getOwningType();
		return owningType instanceof Definition? (Definition)owningType: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setPropertyOwningDefinition(Definition newPropertyOwningDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getPropertyOwningUsage() {
		Usage propertyOwningUsage = basicGetPropertyOwningUsage();
		return propertyOwningUsage != null && propertyOwningUsage.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)propertyOwningUsage) : propertyOwningUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetPropertyOwningUsage() {
		Type owningType = getOwningType();
		return owningType instanceof Usage? (Usage)owningType: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setPropertyOwningUsage(Usage newPropertyOwningUsage) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropertyOwningUsage() {
		return basicGetPropertyOwningUsage() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PROPERTY__PROPERTY_OWNING_DEFINITION:
				if (resolve) return getPropertyOwningDefinition();
				return basicGetPropertyOwningDefinition();
			case SysMLPackage.PROPERTY__PROPERTY_OWNING_USAGE:
				if (resolve) return getPropertyOwningUsage();
				return basicGetPropertyOwningUsage();
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
			case SysMLPackage.PROPERTY__PROPERTY_OWNING_DEFINITION:
				setPropertyOwningDefinition((Definition)newValue);
				return;
			case SysMLPackage.PROPERTY__PROPERTY_OWNING_USAGE:
				setPropertyOwningUsage((Usage)newValue);
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
			case SysMLPackage.PROPERTY__PROPERTY_OWNING_DEFINITION:
				setPropertyOwningDefinition((Definition)null);
				return;
			case SysMLPackage.PROPERTY__PROPERTY_OWNING_USAGE:
				setPropertyOwningUsage((Usage)null);
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
			case SysMLPackage.PROPERTY__OWNING_USAGE:
				return isSetOwningUsage();
			case SysMLPackage.PROPERTY__PROPERTY_OWNING_DEFINITION:
				return basicGetPropertyOwningDefinition() != null;
			case SysMLPackage.PROPERTY__PROPERTY_OWNING_USAGE:
				return isSetPropertyOwningUsage();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwningUsage() {
		return getPropertyOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage basicGetOwningUsage() {
		return basicGetPropertyOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningUsage(Usage newOwningUsage) {
		setPropertyOwningUsage(newOwningUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningUsage() {
  		return false;
	}

} //PropertyImpl
