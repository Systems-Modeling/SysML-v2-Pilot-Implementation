/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.RequirementVerificationMembership;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VerificationCaseDefinition;
import org.omg.sysml.lang.sysml.VerificationCaseUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Verification Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementVerificationMembershipImpl#getOwnedRequirement_comp <em>Owned Requirement comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementVerificationMembershipImpl#getVerifiedRequirement <em>Verified Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementVerificationMembershipImpl#getOwnedRequirement <em>Owned Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementVerificationMembershipImpl extends RequirementConstraintMembershipImpl implements RequirementVerificationMembership {

	private Type subsettingBaseDefault;
	private Type subsettingPartDefault;

	/**
	 * The cached value of the '{@link #getOwnedRequirement_comp() <em>Owned Requirement comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRequirement_comp()
	 * @generated
	 * @ordered
	 */
	protected RequirementUsage ownedRequirement_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementVerificationMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.REQUIREMENT_VERIFICATION_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getOwnedRequirement_comp() {
		return ownedRequirement_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedRequirement_comp(RequirementUsage newOwnedRequirement_comp, NotificationChain msgs) {
		RequirementUsage oldOwnedRequirement_comp = ownedRequirement_comp;
		ownedRequirement_comp = newOwnedRequirement_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT_COMP, oldOwnedRequirement_comp, newOwnedRequirement_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedRequirement_comp(RequirementUsage newOwnedRequirement_comp) {
		if (newOwnedRequirement_comp != ownedRequirement_comp) {
			NotificationChain msgs = null;
			if (ownedRequirement_comp != null)
				msgs = ((InternalEObject)ownedRequirement_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT_COMP, null, msgs);
			if (newOwnedRequirement_comp != null)
				msgs = ((InternalEObject)newOwnedRequirement_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT_COMP, null, msgs);
			msgs = basicSetOwnedRequirement_comp(newOwnedRequirement_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT_COMP, newOwnedRequirement_comp, newOwnedRequirement_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedRequirement_comp() {
		return ownedRequirement_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getVerifiedRequirement() {
		RequirementUsage verifiedRequirement = basicGetVerifiedRequirement();
		return verifiedRequirement != null && verifiedRequirement.eIsProxy() ? (RequirementUsage)eResolveProxy((InternalEObject)verifiedRequirement) : verifiedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RequirementUsage basicGetVerifiedRequirement() {
		RequirementUsage ownedRequirement = getOwnedRequirement();
		Type subsettingBaseDefault = getSubsettingBaseDefault();
		Type subsettingPartDefault = getSubsettingPartDefault();
		List<Subsetting> subsettings = ((RequirementUsageImpl)ownedRequirement).basicGetOwnedSubsetting();		
		if (subsettings.stream().map(sub->sub.getSubsettedFeature()).
				allMatch(feature->feature == subsettingBaseDefault || 
				         feature == subsettingPartDefault)) {
			return ownedRequirement;
		} else {
			Feature subsettedFeature = subsettings.get(0).getSubsettedFeature(); 
			return subsettedFeature instanceof RequirementUsage? (RequirementUsage)subsettedFeature: ownedRequirement;
		}
	}

	protected Type getSubsettingBaseDefault() {
		if (subsettingBaseDefault == null) {
			subsettingBaseDefault = TypeImpl.getLibraryType(this, RequirementUsageImpl.REQUIREMENT_SUBSETTING_BASE_DEFAULT);
		}
		return subsettingBaseDefault;
	}

	protected Type getSubsettingPartDefault() {
		if (subsettingPartDefault == null) {
			subsettingPartDefault = TypeImpl.getLibraryType(this, AssertConstraintUsageImpl.ASSERT_CONSTRAINT_SUBSETTING_PART_DEFAULT);
		}
		return subsettingPartDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setVerifiedRequirement(RequirementUsage newVerifiedRequirement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getOwnedRequirement() {
		RequirementUsage ownedRequirement = basicGetOwnedRequirement();
		return ownedRequirement != null && ownedRequirement.eIsProxy() ? (RequirementUsage)eResolveProxy((InternalEObject)ownedRequirement) : ownedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RequirementUsage basicGetOwnedRequirement() {
		ConstraintUsage constraint = super.getConstraint();
		return constraint instanceof RequirementUsage? (RequirementUsage)constraint: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedRequirement(RequirementUsage newOwnedRequirement) {
	}
	
	// Utility methods
	
	public boolean isLegalVerification() {
		Type owningType = getOwningType();
		if (owningType instanceof RequirementUsage && ((RequirementUsageImpl)owningType).isObjective()) {
			owningType = ((RequirementUsage)owningType).getOwningType();
			return owningType instanceof VerificationCaseDefinition || 
				   owningType instanceof VerificationCaseUsage;
		} else {
			return false;
		}
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT_COMP:
				return basicSetOwnedRequirement_comp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT_COMP:
				return getOwnedRequirement_comp();
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__VERIFIED_REQUIREMENT:
				if (resolve) return getVerifiedRequirement();
				return basicGetVerifiedRequirement();
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT:
				if (resolve) return getOwnedRequirement();
				return basicGetOwnedRequirement();
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
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT_COMP:
				setOwnedRequirement_comp((RequirementUsage)newValue);
				return;
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__VERIFIED_REQUIREMENT:
				setVerifiedRequirement((RequirementUsage)newValue);
				return;
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT:
				setOwnedRequirement((RequirementUsage)newValue);
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
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT_COMP:
				setOwnedRequirement_comp((RequirementUsage)null);
				return;
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__VERIFIED_REQUIREMENT:
				setVerifiedRequirement((RequirementUsage)null);
				return;
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT:
				setOwnedRequirement((RequirementUsage)null);
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
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__CONSTRAINT_COMP:
				return isSetConstraint_comp();
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT_COMP:
				return isSetOwnedRequirement_comp();
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__VERIFIED_REQUIREMENT:
				return basicGetVerifiedRequirement() != null;
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT:
				return basicGetOwnedRequirement() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getConstraint_comp() {
		return getOwnedRequirement_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint_comp(ConstraintUsage newConstraint_comp, NotificationChain msgs) {
		if (newConstraint_comp != null && !(newConstraint_comp instanceof RequirementUsage)) {
			throw new IllegalArgumentException("newConstraint_comp must be an instance of RequirementUsage");
		}
		return basicSetOwnedRequirement_comp((RequirementUsage) newConstraint_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint_comp(ConstraintUsage newConstraint_comp) {
		if (newConstraint_comp != null && !(newConstraint_comp instanceof RequirementUsage)) {
			throw new IllegalArgumentException("newConstraint_comp must be an instance of RequirementUsage");
		}
		setOwnedRequirement_comp((RequirementUsage) newConstraint_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraint_comp() {
  		return false;
	}

} //RequirementVerificationMembershipImpl
