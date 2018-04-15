/**
 */
package org.omg.sysml.groups.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.omg.sysml.behaviors.Predicate;

import org.omg.sysml.core.Element;

import org.omg.sysml.core.impl.ElementImpl;

import org.omg.sysml.groups.ElementGroup;
import org.omg.sysml.groups.GroupImport;
import org.omg.sysml.groups.GroupsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.groups.impl.GroupImportImpl#getImportedGroup <em>Imported Group</em>}</li>
 *   <li>{@link org.omg.sysml.groups.impl.GroupImportImpl#getImportingGroup <em>Importing Group</em>}</li>
 *   <li>{@link org.omg.sysml.groups.impl.GroupImportImpl#getSelecter <em>Selecter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImportImpl extends ElementImpl implements GroupImport {
	/**
	 * The cached value of the '{@link #getImportedGroup() <em>Imported Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedGroup()
	 * @generated
	 * @ordered
	 */
	protected ElementGroup importedGroup;

	/**
	 * The cached value of the '{@link #getSelecter() <em>Selecter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelecter()
	 * @generated
	 * @ordered
	 */
	protected Predicate selecter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupsPackage.Literals.GROUP_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroup getImportedGroup() {
		if (importedGroup != null && importedGroup.eIsProxy()) {
			InternalEObject oldImportedGroup = (InternalEObject)importedGroup;
			importedGroup = (ElementGroup)eResolveProxy(oldImportedGroup);
			if (importedGroup != oldImportedGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupsPackage.GROUP_IMPORT__IMPORTED_GROUP, oldImportedGroup, importedGroup));
			}
		}
		return importedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroup basicGetImportedGroup() {
		return importedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedGroup(ElementGroup newImportedGroup) {
		ElementGroup oldImportedGroup = importedGroup;
		importedGroup = newImportedGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupsPackage.GROUP_IMPORT__IMPORTED_GROUP, oldImportedGroup, importedGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroup getImportingGroup() {
		if (eContainerFeatureID() != GroupsPackage.GROUP_IMPORT__IMPORTING_GROUP) return null;
		return (ElementGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportingGroup(ElementGroup newImportingGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImportingGroup, GroupsPackage.GROUP_IMPORT__IMPORTING_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingGroup(ElementGroup newImportingGroup) {
		if (newImportingGroup != eInternalContainer() || (eContainerFeatureID() != GroupsPackage.GROUP_IMPORT__IMPORTING_GROUP && newImportingGroup != null)) {
			if (EcoreUtil.isAncestor(this, newImportingGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportingGroup != null)
				msgs = ((InternalEObject)newImportingGroup).eInverseAdd(this, GroupsPackage.ELEMENT_GROUP__GROUP_IMPORT, ElementGroup.class, msgs);
			msgs = basicSetImportingGroup(newImportingGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupsPackage.GROUP_IMPORT__IMPORTING_GROUP, newImportingGroup, newImportingGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getSelecter() {
		if (selecter != null && selecter.eIsProxy()) {
			InternalEObject oldSelecter = (InternalEObject)selecter;
			selecter = (Predicate)eResolveProxy(oldSelecter);
			if (selecter != oldSelecter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupsPackage.GROUP_IMPORT__SELECTER, oldSelecter, selecter));
			}
		}
		return selecter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate basicGetSelecter() {
		return selecter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelecter(Predicate newSelecter) {
		Predicate oldSelecter = selecter;
		selecter = newSelecter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupsPackage.GROUP_IMPORT__SELECTER, oldSelecter, selecter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> importedMembers() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroupsPackage.GROUP_IMPORT__IMPORTING_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImportingGroup((ElementGroup)otherEnd, msgs);
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
			case GroupsPackage.GROUP_IMPORT__IMPORTING_GROUP:
				return basicSetImportingGroup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GroupsPackage.GROUP_IMPORT__IMPORTING_GROUP:
				return eInternalContainer().eInverseRemove(this, GroupsPackage.ELEMENT_GROUP__GROUP_IMPORT, ElementGroup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroupsPackage.GROUP_IMPORT__IMPORTED_GROUP:
				if (resolve) return getImportedGroup();
				return basicGetImportedGroup();
			case GroupsPackage.GROUP_IMPORT__IMPORTING_GROUP:
				return getImportingGroup();
			case GroupsPackage.GROUP_IMPORT__SELECTER:
				if (resolve) return getSelecter();
				return basicGetSelecter();
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
			case GroupsPackage.GROUP_IMPORT__IMPORTED_GROUP:
				setImportedGroup((ElementGroup)newValue);
				return;
			case GroupsPackage.GROUP_IMPORT__IMPORTING_GROUP:
				setImportingGroup((ElementGroup)newValue);
				return;
			case GroupsPackage.GROUP_IMPORT__SELECTER:
				setSelecter((Predicate)newValue);
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
			case GroupsPackage.GROUP_IMPORT__IMPORTED_GROUP:
				setImportedGroup((ElementGroup)null);
				return;
			case GroupsPackage.GROUP_IMPORT__IMPORTING_GROUP:
				setImportingGroup((ElementGroup)null);
				return;
			case GroupsPackage.GROUP_IMPORT__SELECTER:
				setSelecter((Predicate)null);
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
			case GroupsPackage.GROUP_IMPORT__IMPORTED_GROUP:
				return importedGroup != null;
			case GroupsPackage.GROUP_IMPORT__IMPORTING_GROUP:
				return getImportingGroup() != null;
			case GroupsPackage.GROUP_IMPORT__SELECTER:
				return selecter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GroupsPackage.GROUP_IMPORT___IMPORTED_MEMBERS:
				return importedMembers();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GroupImportImpl
