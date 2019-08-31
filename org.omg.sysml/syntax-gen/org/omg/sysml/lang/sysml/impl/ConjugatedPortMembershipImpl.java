/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.ConjugatedPortMembership;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjugated Port Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConjugatedPortMembershipImpl extends FeatureMembershipImpl implements ConjugatedPortMembership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjugatedPortMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONJUGATED_PORT_MEMBERSHIP;
	}

	@Override
	public FeatureDirectionKind getDirection() {
		if (direction == null) {
			direction = FeatureDirectionKind.OUT;
		}
		return direction;
	}
	
} //ConjugatedPortMembershipImpl
