/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.EndFeatureMembershipImpl#getOwningAssociation <em>Owning Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndFeatureMembershipImpl extends FeatureMembershipImpl implements EndFeatureMembership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndFeatureMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.END_FEATURE_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getOwningAssociation() {
		Association owningAssociation = basicGetOwningAssociation();
		return owningAssociation != null && owningAssociation.eIsProxy() ? (Association)eResolveProxy((InternalEObject)owningAssociation) : owningAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Association basicGetOwningAssociation() {
		Category category = super.basicGetOwningCategory();
		return category instanceof Association? (Association)category: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOwningAssociation(Association newOwningAssociation) {
		super.setOwningCategory(newOwningAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningAssociation() {
		return basicGetOwningAssociation() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION:
				if (resolve) return getOwningAssociation();
				return basicGetOwningAssociation();
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
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION:
				setOwningAssociation((Association)newValue);
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
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION:
				setOwningAssociation((Association)null);
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
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_CATEGORY:
				return isSetOwningCategory();
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION:
				return isSetOwningAssociation();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Category getOwningCategory() {
		return getOwningAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category basicGetOwningCategory() {
		return basicGetOwningAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningCategory(Category newOwningCategory) {
		if (newOwningCategory != null && !(newOwningCategory instanceof Association)) {
			throw new IllegalArgumentException("newOwningCategory must be an instance of Association");
		}
		setOwningAssociation((Association) newOwningCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningCategory() {
  		return false;
	}

} //EndFeatureMembershipImpl
