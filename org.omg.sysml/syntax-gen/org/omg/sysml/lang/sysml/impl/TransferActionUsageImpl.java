/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransferActionUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransferActionUsageImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransferActionUsageImpl extends ActionUsageImpl implements TransferActionUsage {
	
	public static final String TRANSFER_ACTION_SUBSETTING_TRANSFER_DEFAULT = "Activities::transferActions";
	
	/**
	 * The cached value of the BindingConnector from the appropriate context Feature to the context 
	 * parameter of this TransferAction.
	 */
	protected BindingConnector contextConnector = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TRANSFER_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getContext() {
		Feature context = basicGetContext();
		return context != null && context.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)context) : context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetContext() {
		List<Parameter> parameters = getOwnedParameters();
		return parameters.isEmpty()? null: parameters.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setContext(Feature newContext) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected String getDefaultSupertype() {
		return TRANSFER_ACTION_SUBSETTING_TRANSFER_DEFAULT;
	}
	
	// Additional redefinitions and subsets

	public BindingConnector getContextConnector() {
		contextConnector = makeBinding(contextConnector, getContextFeature(), getContext());
		return contextConnector;
	}
	
	protected abstract Feature getContextFeature();
	
	public void transform() {
		super.transform();
		getContextConnector();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.TRANSFER_ACTION_USAGE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case SysMLPackage.TRANSFER_ACTION_USAGE__CONTEXT:
				setContext((Feature)newValue);
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
			case SysMLPackage.TRANSFER_ACTION_USAGE__CONTEXT:
				setContext((Feature)null);
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
			case SysMLPackage.TRANSFER_ACTION_USAGE__CONTEXT:
				return basicGetContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //TransferActionUsageImpl
