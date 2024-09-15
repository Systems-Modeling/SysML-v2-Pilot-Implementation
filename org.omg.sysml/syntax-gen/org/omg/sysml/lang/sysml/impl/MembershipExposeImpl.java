/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.MembershipExpose;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Membership Expose</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MembershipExposeImpl extends MembershipImportImpl implements MembershipExpose {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MembershipExposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.MEMBERSHIP_EXPOSE;
	}

	// Additional overrides
	
	@Override
	public boolean isImportAll() {
		return true;
	}

} //MembershipExposeImpl
