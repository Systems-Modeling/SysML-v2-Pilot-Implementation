/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Return
 * Parameter Membership</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ReturnParameterMembershipImpl extends ParameterMembershipImpl implements ReturnParameterMembership {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ReturnParameterMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.RETURN_PARAMETER_MEMBERSHIP;
	}

	@Override
	public FeatureDirectionKind getDirection() {
		if (direction == null) {
			direction = FeatureDirectionKind.OUT;
		}
		return direction;
	}

} // ReturnParameterMembershipImpl
