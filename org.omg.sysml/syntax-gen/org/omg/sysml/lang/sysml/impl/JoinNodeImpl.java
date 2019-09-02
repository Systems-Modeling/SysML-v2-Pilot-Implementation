/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.JoinNode;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JoinNodeImpl extends ControlNodeImpl implements JoinNode {

	public static final String JOIN_NODE_SUBSETTING_BASE_DEFAULT = "Activities::Action::joins";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.JOIN_NODE;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithComputedRedefinitions(JOIN_NODE_SUBSETTING_BASE_DEFAULT);
	}
	
} //JoinNodeImpl
