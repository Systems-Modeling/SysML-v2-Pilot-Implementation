/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.FramedConcernMembership;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.FeatureUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addressed Concern Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FramedConcernMembershipImpl#getOwnedConcern <em>Owned Concern</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FramedConcernMembershipImpl#getReferencedConcern <em>Referenced Concern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FramedConcernMembershipImpl extends RequirementConstraintMembershipImpl implements FramedConcernMembership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FramedConcernMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FRAMED_CONCERN_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernUsage getOwnedConcern() {
		ConcernUsage ownedConcern = basicGetOwnedConcern();
		return ownedConcern != null && ownedConcern.eIsProxy() ? (ConcernUsage)eResolveProxy((InternalEObject)ownedConcern) : ownedConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConcernUsage basicGetOwnedConcern() {
		Feature ownedConstraint = super.basicGetOwnedConstraint();
		return ownedConstraint instanceof ConcernUsage? (ConcernUsage)ownedConstraint: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedConcern(ConcernUsage newOwnedConcern) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedConcern() {
		return basicGetOwnedConcern() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernUsage getReferencedConcern() {
		ConcernUsage referencedConcern = basicGetReferencedConcern();
		return referencedConcern != null && referencedConcern.eIsProxy() ? (ConcernUsage)eResolveProxy((InternalEObject)referencedConcern) : referencedConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConcernUsage basicGetReferencedConcern() {
		return FeatureUtil.getReferencedFeatureOf(getOwnedConcern(), ConcernUsage.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setReferencedConcern(ConcernUsage newReferencedConcern) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencedConcern() {
		return basicGetReferencedConcern() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONCERN:
				if (resolve) return getOwnedConcern();
				return basicGetOwnedConcern();
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONCERN:
				if (resolve) return getReferencedConcern();
				return basicGetReferencedConcern();
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
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONCERN:
				setOwnedConcern((ConcernUsage)newValue);
				return;
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONCERN:
				setReferencedConcern((ConcernUsage)newValue);
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
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONCERN:
				setOwnedConcern((ConcernUsage)null);
				return;
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONCERN:
				setReferencedConcern((ConcernUsage)null);
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
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONSTRAINT:
				return isSetOwnedConstraint();
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONSTRAINT:
				return isSetReferencedConstraint();
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONCERN:
				return isSetOwnedConcern();
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONCERN:
				return isSetReferencedConcern();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getOwnedConstraint() {
		return getOwnedConcern();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage basicGetOwnedConstraint() {
		return basicGetOwnedConcern();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedConstraint(ConstraintUsage newOwnedConstraint) {
		if (newOwnedConstraint != null && !(newOwnedConstraint instanceof ConcernUsage)) {
			throw new IllegalArgumentException("newOwnedConstraint must be an instance of ConcernUsage");
		}
		setOwnedConcern((ConcernUsage) newOwnedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedConstraint() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getReferencedConstraint() {
		return getReferencedConcern();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage basicGetReferencedConstraint() {
		return basicGetReferencedConcern();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedConstraint(ConstraintUsage newReferencedConstraint) {
		if (newReferencedConstraint != null && !(newReferencedConstraint instanceof ConcernUsage)) {
			throw new IllegalArgumentException("newReferencedConstraint must be an instance of ConcernUsage");
		}
		setReferencedConcern((ConcernUsage) newReferencedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencedConstraint() {
  		return false;
	}

} //AddressedConcernMembershipImpl
