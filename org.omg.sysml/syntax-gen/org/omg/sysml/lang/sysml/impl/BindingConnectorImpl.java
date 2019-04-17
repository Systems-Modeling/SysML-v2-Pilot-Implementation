/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BindingConnectorImpl extends ConnectorImpl implements BindingConnector {

	public static final String BINDING_CONNECTOR_SUBSETTING_DEFAULT = "Base::selfLinks";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.BINDING_CONNECTOR;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithDefault(BINDING_CONNECTOR_SUBSETTING_DEFAULT);
	}

} //BindingConnectorImpl
