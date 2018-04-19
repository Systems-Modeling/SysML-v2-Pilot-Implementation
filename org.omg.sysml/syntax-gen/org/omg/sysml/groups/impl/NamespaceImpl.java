/**
 */
package org.omg.sysml.groups.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.core.Element;

import org.omg.sysml.groups.GroupsPackage;
import org.omg.sysml.groups.Namespace;
import org.omg.sysml.groups.NamespaceImport;
import org.omg.sysml.groups.NamespaceMembership;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.groups.impl.NamespaceImpl#getNamespaceMember <em>Namespace Member</em>}</li>
 *   <li>{@link org.omg.sysml.groups.impl.NamespaceImpl#getNamespaceImport <em>Namespace Import</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImpl extends ElementGroupImpl implements Namespace {
	/**
	 * The cached value of the '{@link #getNamespaceMember() <em>Namespace Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceMember()
	 * @generated
	 * @ordered
	 */
	protected EList<NamespaceMembership> namespaceMember;

	/**
	 * The cached value of the '{@link #getNamespaceImport() <em>Namespace Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceImport()
	 * @generated
	 * @ordered
	 */
	protected EList<NamespaceImport> namespaceImport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupsPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamespaceMembership> getNamespaceMember() {
		if (namespaceMember == null) {
			namespaceMember = new EObjectWithInverseResolvingEList<NamespaceMembership>(NamespaceMembership.class, this, GroupsPackage.NAMESPACE__NAMESPACE_MEMBER, GroupsPackage.NAMESPACE_MEMBERSHIP__NAMESPACE);
		}
		return namespaceMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamespaceImport> getNamespaceImport() {
		if (namespaceImport == null) {
			namespaceImport = new EObjectWithInverseResolvingEList<NamespaceImport>(NamespaceImport.class, this, GroupsPackage.NAMESPACE__NAMESPACE_IMPORT, GroupsPackage.NAMESPACE_IMPORT__IMPORTING_NAMESPACE);
		}
		return namespaceImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String nameOf(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case GroupsPackage.NAMESPACE__NAMESPACE_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNamespaceMember()).basicAdd(otherEnd, msgs);
			case GroupsPackage.NAMESPACE__NAMESPACE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNamespaceImport()).basicAdd(otherEnd, msgs);
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
			case GroupsPackage.NAMESPACE__NAMESPACE_MEMBER:
				return ((InternalEList<?>)getNamespaceMember()).basicRemove(otherEnd, msgs);
			case GroupsPackage.NAMESPACE__NAMESPACE_IMPORT:
				return ((InternalEList<?>)getNamespaceImport()).basicRemove(otherEnd, msgs);
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
			case GroupsPackage.NAMESPACE__NAMESPACE_MEMBER:
				return getNamespaceMember();
			case GroupsPackage.NAMESPACE__NAMESPACE_IMPORT:
				return getNamespaceImport();
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
			case GroupsPackage.NAMESPACE__NAMESPACE_MEMBER:
				getNamespaceMember().clear();
				getNamespaceMember().addAll((Collection<? extends NamespaceMembership>)newValue);
				return;
			case GroupsPackage.NAMESPACE__NAMESPACE_IMPORT:
				getNamespaceImport().clear();
				getNamespaceImport().addAll((Collection<? extends NamespaceImport>)newValue);
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
			case GroupsPackage.NAMESPACE__NAMESPACE_MEMBER:
				getNamespaceMember().clear();
				return;
			case GroupsPackage.NAMESPACE__NAMESPACE_IMPORT:
				getNamespaceImport().clear();
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
			case GroupsPackage.NAMESPACE__NAMESPACE_MEMBER:
				return namespaceMember != null && !namespaceMember.isEmpty();
			case GroupsPackage.NAMESPACE__NAMESPACE_IMPORT:
				return namespaceImport != null && !namespaceImport.isEmpty();
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
			case GroupsPackage.NAMESPACE___NAME_OF__ELEMENT:
				return nameOf((Element)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NamespaceImpl
