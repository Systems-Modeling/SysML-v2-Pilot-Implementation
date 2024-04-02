/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.NamespaceImport;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImportImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImportImpl extends ImportImpl implements NamespaceImport {
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
		return SysMLPackage.Literals.NAMESPACE_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Namespace getImportedNamespace() {
		return importedNamespace == null? basicGetImportedNamespace(): getImportedNamespaceGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getImportedNamespaceGen() {
		if (importedNamespace != null && importedNamespace.eIsProxy()) {
			InternalEObject oldImportedNamespace = (InternalEObject)importedNamespace;
			importedNamespace = (Namespace)eResolveProxy(oldImportedNamespace);
			if (importedNamespace != oldImportedNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.NAMESPACE_IMPORT__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
			}
		}
		return importedNamespace;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Xtext workaround:
	 * If importedNamespace is empty, then set it to the first ownedRelatedElement, if this is a namespace
	 * (filling in the implicit import for a filter package). Otherwise, set it to the importOwningNamspace.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Namespace basicGetImportedNamespace() {
		if (importedNamespace == null) {
			EList<Element> ownedRelatedElement = getOwnedRelatedElement();
			if (!ownedRelatedElement.isEmpty() && ownedRelatedElement.get(0) instanceof Namespace) {
				// Fill in the implicit import for a filter package.
				importedNamespace = (Namespace)ownedRelatedElement.get(0);
			} else {
				importedNamespace = getImportOwningNamespace();
			}
		}
		return importedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportedNamespace(Namespace newImportedNamespace) {
		Namespace oldImportedNamespace = importedNamespace;
		importedNamespace = newImportedNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.NAMESPACE_IMPORT__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportedNamespace() {
		return importedNamespace != null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Namespace importedNamespace = getImportedNamespace();
		if (importedNamespace != null) {
			target.add(importedNamespace);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__TARGET, target.size(), target.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTarget() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.NAMESPACE_IMPORT__IMPORTED_NAMESPACE:
				if (resolve) return getImportedNamespace();
				return basicGetImportedNamespace();
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
			case SysMLPackage.NAMESPACE_IMPORT__IMPORTED_NAMESPACE:
				setImportedNamespace((Namespace)newValue);
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
			case SysMLPackage.NAMESPACE_IMPORT__IMPORTED_NAMESPACE:
				setImportedNamespace((Namespace)null);
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
			case SysMLPackage.NAMESPACE_IMPORT__TARGET:
				return isSetTarget();
			case SysMLPackage.NAMESPACE_IMPORT__IMPORTED_NAMESPACE:
				return isSetImportedNamespace();
		}
		return super.eIsSet(featureID);
	}

} //NamespaceImportImpl
