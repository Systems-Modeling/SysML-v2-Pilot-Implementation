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
import org.omg.sysml.lang.sysml.InterfaceDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
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
public class InterfaceUsageImpl extends ConnectionUsageImpl implements InterfaceUsage {
	
	public static final String INTERFACE_CONNECTOR_SUBSETTING_DEFAULT = "Blocks::interfaces";

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

	@Override
	protected String getDefaultSupertype() {
		return getConnectorEnd().size() > 2? 
				ConnectorImpl.CONNECTOR_SUBSETTING_DEFAULT:
					INTERFACE_CONNECTOR_SUBSETTING_DEFAULT;
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
				setInterfaceDefinition((InterfaceDefinition)newValue);
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
				setInterfaceDefinition((InterfaceDefinition)null);
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
			case SysMLPackage.INTERFACE_USAGE__ASSOCIATION:
				return isSetAssociation();
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
	public InterfaceDefinition getInterfaceDefinition() {
		InterfaceDefinition interfaceDefinition = basicGetInterfaceDefinition();
		return interfaceDefinition != null && interfaceDefinition.eIsProxy() ? (InterfaceDefinition)eResolveProxy((InternalEObject)interfaceDefinition) : interfaceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InterfaceDefinition basicGetInterfaceDefinition() {
		EList<Association> associations = super.getAssociation();
		if (associations.isEmpty()) {
			return null;
		} else {
			Association association = associations.get(0);
			return association instanceof InterfaceDefinition? (InterfaceDefinition)association: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setInterfaceDefinition(InterfaceDefinition newInterfaceDefinition) {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getAssociation() {
		EList<Association> association = new UniqueEList<Association>();
		InterfaceDefinition interfaceDefinition = getInterfaceDefinition();
		if (interfaceDefinition != null) {
			association.add(interfaceDefinition);
		}
		return new UnionEObjectEList<Association>(this, SysMLPackage.Literals.CONNECTOR__ASSOCIATION, association.size(), association.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssociation() {
  		return false;
	}

} //ConnectionImpl
