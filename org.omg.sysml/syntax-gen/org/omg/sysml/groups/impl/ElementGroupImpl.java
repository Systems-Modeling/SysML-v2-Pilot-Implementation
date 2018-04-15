/**
 */
package org.omg.sysml.groups.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.core.Element;

import org.omg.sysml.core.impl.ElementImpl;

import org.omg.sysml.groups.ElementGroup;
import org.omg.sysml.groups.GroupImport;
import org.omg.sysml.groups.GroupsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.groups.impl.ElementGroupImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.groups.impl.ElementGroupImpl#getGroupImport <em>Group Import</em>}</li>
 *   <li>{@link org.omg.sysml.groups.impl.ElementGroupImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link org.omg.sysml.groups.impl.ElementGroupImpl#getOwnedMember <em>Owned Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementGroupImpl extends ElementImpl implements ElementGroup {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> member;

	/**
	 * The cached value of the '{@link #getGroupImport() <em>Group Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupImport()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupImport> groupImport;

	/**
	 * The cached value of the '{@link #getImportedMember() <em>Imported Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> importedMember;

	/**
	 * The cached value of the '{@link #getOwnedMember() <em>Owned Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> ownedMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupsPackage.Literals.ELEMENT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getMember() {
		if (member == null) {
			member = new EObjectResolvingEList<Element>(Element.class, this, GroupsPackage.ELEMENT_GROUP__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupImport> getGroupImport() {
		if (groupImport == null) {
			groupImport = new EObjectContainmentWithInverseEList<GroupImport>(GroupImport.class, this, GroupsPackage.ELEMENT_GROUP__GROUP_IMPORT, GroupsPackage.GROUP_IMPORT__IMPORTING_GROUP);
		}
		return groupImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getImportedMember() {
		if (importedMember == null) {
			importedMember = new EObjectResolvingEList<Element>(Element.class, this, GroupsPackage.ELEMENT_GROUP__IMPORTED_MEMBER);
		}
		return importedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getOwnedMember() {
		if (ownedMember == null) {
			ownedMember = new EObjectContainmentEList<Element>(Element.class, this, GroupsPackage.ELEMENT_GROUP__OWNED_MEMBER);
		}
		return ownedMember;
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
			case GroupsPackage.ELEMENT_GROUP__GROUP_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroupImport()).basicAdd(otherEnd, msgs);
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
			case GroupsPackage.ELEMENT_GROUP__GROUP_IMPORT:
				return ((InternalEList<?>)getGroupImport()).basicRemove(otherEnd, msgs);
			case GroupsPackage.ELEMENT_GROUP__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
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
			case GroupsPackage.ELEMENT_GROUP__MEMBER:
				return getMember();
			case GroupsPackage.ELEMENT_GROUP__GROUP_IMPORT:
				return getGroupImport();
			case GroupsPackage.ELEMENT_GROUP__IMPORTED_MEMBER:
				return getImportedMember();
			case GroupsPackage.ELEMENT_GROUP__OWNED_MEMBER:
				return getOwnedMember();
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
			case GroupsPackage.ELEMENT_GROUP__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Element>)newValue);
				return;
			case GroupsPackage.ELEMENT_GROUP__GROUP_IMPORT:
				getGroupImport().clear();
				getGroupImport().addAll((Collection<? extends GroupImport>)newValue);
				return;
			case GroupsPackage.ELEMENT_GROUP__IMPORTED_MEMBER:
				getImportedMember().clear();
				getImportedMember().addAll((Collection<? extends Element>)newValue);
				return;
			case GroupsPackage.ELEMENT_GROUP__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends Element>)newValue);
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
			case GroupsPackage.ELEMENT_GROUP__MEMBER:
				getMember().clear();
				return;
			case GroupsPackage.ELEMENT_GROUP__GROUP_IMPORT:
				getGroupImport().clear();
				return;
			case GroupsPackage.ELEMENT_GROUP__IMPORTED_MEMBER:
				getImportedMember().clear();
				return;
			case GroupsPackage.ELEMENT_GROUP__OWNED_MEMBER:
				getOwnedMember().clear();
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
			case GroupsPackage.ELEMENT_GROUP__MEMBER:
				return member != null && !member.isEmpty();
			case GroupsPackage.ELEMENT_GROUP__GROUP_IMPORT:
				return groupImport != null && !groupImport.isEmpty();
			case GroupsPackage.ELEMENT_GROUP__IMPORTED_MEMBER:
				return importedMember != null && !importedMember.isEmpty();
			case GroupsPackage.ELEMENT_GROUP__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementGroupImpl
