/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransferActionUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TransferActionUsageImpl extends ActionUsageImpl implements TransferActionUsage {
	
	public static final String TRANSFER_ACTION_SUBSETTING_TRANSFER_DEFAULT = "Activities::Action::incomingTransfers";
	
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

	@Override
	protected void checkSubsetting() {
		addSubsetting(TRANSFER_ACTION_SUBSETTING_TRANSFER_DEFAULT);
	}
	
	@Override
	protected String getActionSubsettingDefault() {
		return TRANSFER_ACTION_SUBSETTING_TRANSFER_DEFAULT;
	}
	
} //TransferActionUsageImpl
