/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SuccessionItemFlow;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Succession Item Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SuccessionItemFlowImpl extends ItemFlowImpl implements SuccessionItemFlow {
	
	public static final String SUCCESSION_ITEM_FLOW_SUBSETTING_BASE_DEFAULT = "Transfers::flows";
	public static final String SUCCESSION_ITEM_FLOW_SUBSETTING_PERFORMANCE_DEFAULT = "Base::Performance::subflows";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccessionItemFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SUCCESSION_ITEM_FLOW;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithDefault(
				isSubtransfer()?
						SUCCESSION_ITEM_FLOW_SUBSETTING_PERFORMANCE_DEFAULT:
						SUCCESSION_ITEM_FLOW_SUBSETTING_BASE_DEFAULT);
	}
	
} //SuccessionItemFlowImpl
