/**
 */
package org.omg.sysml.groups.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.groups.GroupsPackage;
import org.omg.sysml.groups.Namespace;
import org.omg.sysml.groups.NamespaceImport;
import org.omg.sysml.groups.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.groups.impl.NamespaceImportImpl#getImportingNamespace <em>Importing Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.groups.impl.NamespaceImportImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.groups.impl.NamespaceImportImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImportImpl extends GroupImportImpl implements NamespaceImport {
	/**
	 * The cached value of the '{@link #getImportingNamespace() <em>Importing Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportingNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace importingNamespace;

	/**
	 * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace importedNamespace;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupsPackage.Literals.NAMESPACE_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getImportingNamespace() {
		if (importingNamespace != null && importingNamespace.eIsProxy()) {
			InternalEObject oldImportingNamespace = (InternalEObject)importingNamespace;
			importingNamespace = (Namespace)eResolveProxy(oldImportingNamespace);
			if (importingNamespace != oldImportingNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupsPackage.NAMESPACE_IMPORT__IMPORTING_NAMESPACE, oldImportingNamespace, importingNamespace));
			}
		}
		return importingNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetImportingNamespace() {
		return importingNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportingNamespace(Namespace newImportingNamespace, NotificationChain msgs) {
		Namespace oldImportingNamespace = importingNamespace;
		importingNamespace = newImportingNamespace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroupsPackage.NAMESPACE_IMPORT__IMPORTING_NAMESPACE, oldImportingNamespace, newImportingNamespace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingNamespace(Namespace newImportingNamespace) {
		if (newImportingNamespace != importingNamespace) {
			NotificationChain msgs = null;
			if (importingNamespace != null)
				msgs = ((InternalEObject)importingNamespace).eInverseRemove(this, GroupsPackage.NAMESPACE__NAMESPACE_IMPORT, Namespace.class, msgs);
			if (newImportingNamespace != null)
				msgs = ((InternalEObject)newImportingNamespace).eInverseAdd(this, GroupsPackage.NAMESPACE__NAMESPACE_IMPORT, Namespace.class, msgs);
			msgs = basicSetImportingNamespace(newImportingNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupsPackage.NAMESPACE_IMPORT__IMPORTING_NAMESPACE, newImportingNamespace, newImportingNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getImportedNamespace() {
		if (importedNamespace != null && importedNamespace.eIsProxy()) {
			InternalEObject oldImportedNamespace = (InternalEObject)importedNamespace;
			importedNamespace = (Namespace)eResolveProxy(oldImportedNamespace);
			if (importedNamespace != oldImportedNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GroupsPackage.NAMESPACE_IMPORT__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
			}
		}
		return importedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetImportedNamespace() {
		return importedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedNamespace(Namespace newImportedNamespace) {
		Namespace oldImportedNamespace = importedNamespace;
		importedNamespace = newImportedNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupsPackage.NAMESPACE_IMPORT__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupsPackage.NAMESPACE_IMPORT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroupsPackage.NAMESPACE_IMPORT__IMPORTING_NAMESPACE:
				if (importingNamespace != null)
					msgs = ((InternalEObject)importingNamespace).eInverseRemove(this, GroupsPackage.NAMESPACE__NAMESPACE_IMPORT, Namespace.class, msgs);
				return basicSetImportingNamespace((Namespace)otherEnd, msgs);
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
			case GroupsPackage.NAMESPACE_IMPORT__IMPORTING_NAMESPACE:
				return basicSetImportingNamespace(null, msgs);
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
			case GroupsPackage.NAMESPACE_IMPORT__IMPORTING_NAMESPACE:
				if (resolve) return getImportingNamespace();
				return basicGetImportingNamespace();
			case GroupsPackage.NAMESPACE_IMPORT__IMPORTED_NAMESPACE:
				if (resolve) return getImportedNamespace();
				return basicGetImportedNamespace();
			case GroupsPackage.NAMESPACE_IMPORT__VISIBILITY:
				return getVisibility();
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
			case GroupsPackage.NAMESPACE_IMPORT__IMPORTING_NAMESPACE:
				setImportingNamespace((Namespace)newValue);
				return;
			case GroupsPackage.NAMESPACE_IMPORT__IMPORTED_NAMESPACE:
				setImportedNamespace((Namespace)newValue);
				return;
			case GroupsPackage.NAMESPACE_IMPORT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
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
			case GroupsPackage.NAMESPACE_IMPORT__IMPORTING_NAMESPACE:
				setImportingNamespace((Namespace)null);
				return;
			case GroupsPackage.NAMESPACE_IMPORT__IMPORTED_NAMESPACE:
				setImportedNamespace((Namespace)null);
				return;
			case GroupsPackage.NAMESPACE_IMPORT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
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
			case GroupsPackage.NAMESPACE_IMPORT__IMPORTING_NAMESPACE:
				return importingNamespace != null;
			case GroupsPackage.NAMESPACE_IMPORT__IMPORTED_NAMESPACE:
				return importedNamespace != null;
			case GroupsPackage.NAMESPACE_IMPORT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //NamespaceImportImpl
