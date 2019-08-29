/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>End
 * Feature Membership</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class EndFeatureMembershipImpl extends FeatureMembershipImpl implements EndFeatureMembership {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EndFeatureMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.END_FEATURE_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not found in model
	 */
	public Association getOwningAssociation() {
		Type type = super.getOwningType();
		return type instanceof Association ? (Association) type : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not found in model
	 */
	public Association basicGetOwningAssociation() {
		Type type = super.basicGetOwningType();
		return type instanceof Association ? (Association) type : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived, inherited from FeatureMembership
	 */
	@Override
	public Type getOwningType() {
		return super.getOwningType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived, inherited from FeatureMembership
	 */
	@Override
	public Type basicGetOwningType() {
		return super.basicGetOwningType();
	}

} // EndFeatureMembershipImpl
