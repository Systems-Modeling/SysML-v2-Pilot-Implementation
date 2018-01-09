/**
 */
package org.omg.sysml.kerml.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.kerml.core.CorePackage;
import org.omg.sysml.kerml.core.ElementRecord;
import org.omg.sysml.kerml.core.visibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ContainerImpl#getPackageVisibility <em>Package Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ContainerImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ContainerImpl#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends ElementRecordImpl implements org.omg.sysml.kerml.core.Container {
	/**
	 * The default value of the '{@link #getPackageVisibility() <em>Package Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final visibilityKind PACKAGE_VISIBILITY_EDEFAULT = visibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getPackageVisibility() <em>Package Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageVisibility()
	 * @generated
	 * @ordered
	 */
	protected visibilityKind packageVisibility = PACKAGE_VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedMember() <em>Owned Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementRecord> ownedMember;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementRecord> member;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public visibilityKind getPackageVisibility() {
		return packageVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageVisibility(visibilityKind newPackageVisibility) {
		visibilityKind oldPackageVisibility = packageVisibility;
		packageVisibility = newPackageVisibility == null ? PACKAGE_VISIBILITY_EDEFAULT : newPackageVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONTAINER__PACKAGE_VISIBILITY, oldPackageVisibility, packageVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementRecord> getOwnedMember() {
		if (ownedMember == null) {
			ownedMember = new EObjectContainmentWithInverseEList<ElementRecord>(ElementRecord.class, this, CorePackage.CONTAINER__OWNED_MEMBER, CorePackage.ELEMENT_RECORD__NAMESPACE);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementRecord> getMember() {
		if (member == null) {
			member = new EObjectWithInverseResolvingEList.ManyInverse<ElementRecord>(ElementRecord.class, this, CorePackage.CONTAINER__MEMBER, CorePackage.ELEMENT_RECORD__MEMBER_OF_NAMESPACE);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONTAINER__OWNED_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMember()).basicAdd(otherEnd, msgs);
			case CorePackage.CONTAINER__MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMember()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONTAINER__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case CorePackage.CONTAINER__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CONTAINER__PACKAGE_VISIBILITY:
				return getPackageVisibility();
			case CorePackage.CONTAINER__OWNED_MEMBER:
				return getOwnedMember();
			case CorePackage.CONTAINER__MEMBER:
				return getMember();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.CONTAINER__PACKAGE_VISIBILITY:
				setPackageVisibility((visibilityKind)newValue);
				return;
			case CorePackage.CONTAINER__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends ElementRecord>)newValue);
				return;
			case CorePackage.CONTAINER__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends ElementRecord>)newValue);
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
			case CorePackage.CONTAINER__PACKAGE_VISIBILITY:
				setPackageVisibility(PACKAGE_VISIBILITY_EDEFAULT);
				return;
			case CorePackage.CONTAINER__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case CorePackage.CONTAINER__MEMBER:
				getMember().clear();
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
			case CorePackage.CONTAINER__PACKAGE_VISIBILITY:
				return packageVisibility != PACKAGE_VISIBILITY_EDEFAULT;
			case CorePackage.CONTAINER__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case CorePackage.CONTAINER__MEMBER:
				return member != null && !member.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (packageVisibility: ");
		result.append(packageVisibility);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
