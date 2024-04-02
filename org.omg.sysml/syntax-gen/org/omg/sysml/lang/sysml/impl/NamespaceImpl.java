/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2024 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getOwnedImport <em>Owned Import</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getImportedMembership <em>Imported Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getOwnedMembership <em>Owned Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImpl extends ElementImpl implements Namespace {
	/**
	 * The cached setting delegate for the '{@link #getOwnedImport() <em>Owned Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedImport()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_IMPORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.NAMESPACE__OWNED_IMPORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MEMBER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.NAMESPACE__MEMBER).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwnedMember() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_MEMBER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.NAMESPACE__OWNED_MEMBER).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getImportedMembership() <em>Imported Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedMembership()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IMPORTED_MEMBERSHIP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.NAMESPACE__IMPORTED_MEMBERSHIP).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwnedMembership() <em>Owned Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembership()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_MEMBERSHIP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP).getSettingDelegate();

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
		return SysMLPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Membership> getMembership() {
		return new DerivedUnionEObjectEList<Membership>(Membership.class, this, SysMLPackage.NAMESPACE__MEMBERSHIP, MEMBERSHIP_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMembership() <em>Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBERSHIP_ESUBSETS = new int[] {SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP, SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.NAMESPACE__OWNED_RELATIONSHIP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public EList<Element> getMember() {
		return (EList<Element>)MEMBER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Import> getOwnedImport() {
		return (EList<Import>)OWNED_IMPORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getOwnedMember() {
		return (EList<Element>)OWNED_MEMBER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public EList<Membership> getImportedMembership() {
		return (EList<Membership>)IMPORTED_MEMBERSHIP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Membership> getOwnedMembership() {
		return (EList<Membership>)OWNED_MEMBERSHIP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembership() {
		return eIsSet(SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP)
			|| eIsSet(SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedImport() <em>Owned Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedImport()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_IMPORT_ESUPERSETS = new int[] {SysMLPackage.NAMESPACE__OWNED_RELATIONSHIP};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedMembership() <em>Owned Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBERSHIP_ESUPERSETS = new int[] {SysMLPackage.NAMESPACE__OWNED_RELATIONSHIP};

	/**
	 * The cached invocation delegate for the '{@link #namesOf(org.omg.sysml.lang.sysml.Element) <em>Names Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #namesOf(org.omg.sysml.lang.sysml.Element)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate NAMES_OF_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___NAMES_OF__ELEMENT).getInvocationDelegate();

	// Operations

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> namesOf(Element element) {
		try {
			return (EList<String>)NAMES_OF_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{element}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #visibilityOf(org.omg.sysml.lang.sysml.Membership) <em>Visibility Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #visibilityOf(org.omg.sysml.lang.sysml.Membership)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VISIBILITY_OF_MEMBERSHIP__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___VISIBILITY_OF__MEMBERSHIP).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind visibilityOf(Membership mem) {
		try {
			return (VisibilityKind)VISIBILITY_OF_MEMBERSHIP__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{mem}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #visibleMemberships(org.eclipse.emf.common.util.EList, boolean, boolean) <em>Visible Memberships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #visibleMemberships(org.eclipse.emf.common.util.EList, boolean, boolean)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VISIBLE_MEMBERSHIPS_ELIST_BOOLEAN_BOOLEAN__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___VISIBLE_MEMBERSHIPS__ELIST_BOOLEAN_BOOLEAN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Membership> visibleMemberships(EList<Namespace> excluded, boolean isRecursive, boolean includeAll) {
		try {
			return (EList<Membership>)VISIBLE_MEMBERSHIPS_ELIST_BOOLEAN_BOOLEAN__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(3, new Object[]{excluded, isRecursive, includeAll}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}	

	/**
	 * The cached invocation delegate for the '{@link #importedMemberships(org.eclipse.emf.common.util.EList) <em>Imported Memberships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #importedMemberships(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IMPORTED_MEMBERSHIPS_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___IMPORTED_MEMBERSHIPS__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Membership> importedMemberships(EList<Namespace> excluded) {
		try {
			return (EList<Membership>)IMPORTED_MEMBERSHIPS_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{excluded}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #resolve(java.lang.String) <em>Resolve</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #resolve(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate RESOLVE_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___RESOLVE__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Membership resolve(String qualifiedName) {
		try {
			return (Membership)RESOLVE_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{qualifiedName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #resolveGlobal(java.lang.String) <em>Resolve Global</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #resolveGlobal(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate RESOLVE_GLOBAL_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___RESOLVE_GLOBAL__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Membership resolveGlobal(String qualifiedName) {
		try {
			return (Membership)RESOLVE_GLOBAL_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{qualifiedName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #resolveLocal(java.lang.String) <em>Resolve Local</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #resolveLocal(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate RESOLVE_LOCAL_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___RESOLVE_LOCAL__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Membership resolveLocal(String name) {
		try {
			return (Membership)RESOLVE_LOCAL_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{name}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #resolveVisible(java.lang.String) <em>Resolve Visible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #resolveVisible(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate RESOLVE_VISIBLE_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___RESOLVE_VISIBLE__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Membership resolveVisible(String name) {
		try {
			return (Membership)RESOLVE_VISIBLE_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{name}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #qualificationOf(java.lang.String) <em>Qualification Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #qualificationOf(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate QUALIFICATION_OF_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___QUALIFICATION_OF__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String qualificationOf(String qualifiedName) {
		try {
			return (String)QUALIFICATION_OF_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{qualifiedName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #unqualifiedNameOf(java.lang.String) <em>Unqualified Name Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #unqualifiedNameOf(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate UNQUALIFIED_NAME_OF_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___UNQUALIFIED_NAME_OF__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String unqualifiedNameOf(String qualifiedName) {
		try {
			return (String)UNQUALIFIED_NAME_OF_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{qualifiedName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.NAMESPACE__MEMBERSHIP:
				return getMembership();
			case SysMLPackage.NAMESPACE__OWNED_IMPORT:
				return getOwnedImport();
			case SysMLPackage.NAMESPACE__MEMBER:
				return getMember();
			case SysMLPackage.NAMESPACE__OWNED_MEMBER:
				return getOwnedMember();
			case SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP:
				return getImportedMembership();
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP:
				return getOwnedMembership();
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
			case SysMLPackage.NAMESPACE__OWNED_IMPORT:
				getOwnedImport().clear();
				getOwnedImport().addAll((Collection<? extends Import>)newValue);
				return;
			case SysMLPackage.NAMESPACE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.NAMESPACE__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP:
				getImportedMembership().clear();
				getImportedMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP:
				getOwnedMembership().clear();
				getOwnedMembership().addAll((Collection<? extends Membership>)newValue);
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
			case SysMLPackage.NAMESPACE__OWNED_IMPORT:
				getOwnedImport().clear();
				return;
			case SysMLPackage.NAMESPACE__MEMBER:
				getMember().clear();
				return;
			case SysMLPackage.NAMESPACE__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP:
				getImportedMembership().clear();
				return;
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP:
				getOwnedMembership().clear();
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
			case SysMLPackage.NAMESPACE__MEMBERSHIP:
				return isSetMembership();
			case SysMLPackage.NAMESPACE__OWNED_RELATIONSHIP:
				return ownedRelationship != null && !ownedRelationship.isEmpty();
			case SysMLPackage.NAMESPACE__OWNED_IMPORT:
				return OWNED_IMPORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.NAMESPACE__MEMBER:
				return MEMBER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.NAMESPACE__OWNED_MEMBER:
				return OWNED_MEMBER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP:
				return IMPORTED_MEMBERSHIP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP:
				return OWNED_MEMBERSHIP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.NAMESPACE___NAMES_OF__ELEMENT:
				return namesOf((Element)arguments.get(0));
			case SysMLPackage.NAMESPACE___VISIBILITY_OF__MEMBERSHIP:
				return visibilityOf((Membership)arguments.get(0));
			case SysMLPackage.NAMESPACE___VISIBLE_MEMBERSHIPS__ELIST_BOOLEAN_BOOLEAN:
				return visibleMemberships((EList<Namespace>)arguments.get(0), (Boolean)arguments.get(1), (Boolean)arguments.get(2));
			case SysMLPackage.NAMESPACE___IMPORTED_MEMBERSHIPS__ELIST:
				return importedMemberships((EList<Namespace>)arguments.get(0));
			case SysMLPackage.NAMESPACE___RESOLVE__STRING:
				return resolve((String)arguments.get(0));
			case SysMLPackage.NAMESPACE___RESOLVE_GLOBAL__STRING:
				return resolveGlobal((String)arguments.get(0));
			case SysMLPackage.NAMESPACE___RESOLVE_LOCAL__STRING:
				return resolveLocal((String)arguments.get(0));
			case SysMLPackage.NAMESPACE___RESOLVE_VISIBLE__STRING:
				return resolveVisible((String)arguments.get(0));
			case SysMLPackage.NAMESPACE___QUALIFICATION_OF__STRING:
				return qualificationOf((String)arguments.get(0));
			case SysMLPackage.NAMESPACE___UNQUALIFIED_NAME_OF__STRING:
				return unqualifiedNameOf((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
			case SysMLPackage.NAMESPACE__OWNED_RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.NAMESPACE__OWNED_RELATIONSHIP:
				return ((InternalEList<?>)getOwnedRelationship()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

} //NamespaceImpl
