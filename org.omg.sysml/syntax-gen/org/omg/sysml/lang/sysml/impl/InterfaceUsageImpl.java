/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.InterfaceUsage;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.InterfaceUsageImpl#getInterfaceDefinition <em>Interface Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceUsageImpl extends UsageImpl implements InterfaceUsage {
	
	public static final String INTERFACE_USAGE_SUBSETTING_DEFAULT = "Bocks::interfaces";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INTERFACE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association getInterfaceDefinition() {
		Association interfaceDefinition = basicGetInterfaceDefinition();
		return interfaceDefinition != null && interfaceDefinition.eIsProxy() ? (Association)eResolveProxy((InternalEObject)interfaceDefinition) : interfaceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Association basicGetInterfaceDefinition() {
		EList<Type> types = super.getType();
		if (types.isEmpty()) {
			return null;
		} else {
			Type type = types.get(0);
			return type instanceof Association? (Association)type: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setInterfaceDefinition(Association newInterfaceDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterfaceDefinition() {
		return basicGetInterfaceDefinition() != null;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithDefault(INTERFACE_USAGE_SUBSETTING_DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.INTERFACE_USAGE__INTERFACE_DEFINITION:
				if (resolve) return getInterfaceDefinition();
				return basicGetInterfaceDefinition();
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
			case SysMLPackage.INTERFACE_USAGE__INTERFACE_DEFINITION:
				setInterfaceDefinition((Association)newValue);
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
			case SysMLPackage.INTERFACE_USAGE__INTERFACE_DEFINITION:
				setInterfaceDefinition((Association)null);
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
			case SysMLPackage.INTERFACE_USAGE__TYPE:
				return isSetType();
			case SysMLPackage.INTERFACE_USAGE__INTERFACE_DEFINITION:
				return isSetInterfaceDefinition();
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
		EList<Type> type = new UniqueEList<Type>();
		Association interfaceDefinition = getInterfaceDefinition();
		if (interfaceDefinition != null) {
			type.add(interfaceDefinition);
		}
		return new UnionEObjectEList<Type>(this, SysMLPackage.Literals.FEATURE__TYPE, type.size(), type.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

} //InterfaceUsageImpl
