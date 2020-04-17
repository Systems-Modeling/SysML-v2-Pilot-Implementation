/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.ValueProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ValuePropertyImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuePropertyImpl extends PropertyImpl implements ValueProperty {
	
	public static final String VALUE_PROPERTY_SUBSETTING_DEFAULT = "Blocks::values";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.VALUE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<DataType> getValueType() {
		EList<DataType> dataTypes = new EObjectEList<DataType>(DataType.class, this, SysMLPackage.VALUE_PROPERTY__VALUE_TYPE);
		super.getType().stream().
			filter(type->type instanceof DataType).
			map(type->(DataType)type).
			forEachOrdered(dataTypes::add);
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValueType() {
		return !getValueType().isEmpty();
	}

	@Override
	protected String getDefaultSupertype() {
		return VALUE_PROPERTY_SUBSETTING_DEFAULT;
	}
	
//	public EList<Subsetting> getOwnedSubsetting() {
//		return getOwnedSubsettingWithComputedRedefinitions(VALUE_PROPERTY_SUBSETTING_DEFAULT);
//	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.VALUE_PROPERTY__VALUE_TYPE:
				return getValueType();
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
			case SysMLPackage.VALUE_PROPERTY__VALUE_TYPE:
				getValueType().clear();
				getValueType().addAll((Collection<? extends DataType>)newValue);
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
			case SysMLPackage.VALUE_PROPERTY__VALUE_TYPE:
				getValueType().clear();
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
			case SysMLPackage.VALUE_PROPERTY__TYPE:
				return isSetType();
			case SysMLPackage.VALUE_PROPERTY__VALUE_TYPE:
				return isSetValueType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> valueType = (EList<Type>)((EList<?>)getValueType());
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

} //ValuePropertyImpl
