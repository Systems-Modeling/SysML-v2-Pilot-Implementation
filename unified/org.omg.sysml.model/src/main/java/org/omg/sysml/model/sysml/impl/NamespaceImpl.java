/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */
package org.omg.sysml.model.sysml.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Import;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.Namespace;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.NamespaceImpl#getImportedMembership <em>Imported Membership</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.NamespaceImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.NamespaceImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.NamespaceImpl#getOwnedImport <em>Owned Import</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.NamespaceImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.NamespaceImpl#getOwnedMembership <em>Owned Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImpl extends ElementImpl implements Namespace {
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Membership> getImportedMembership() {
		return (EList<Membership>)eGet(SysMLPackage.Literals.NAMESPACE__IMPORTED_MEMBERSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getMember() {
		return (EList<Element>)eGet(SysMLPackage.Literals.NAMESPACE__MEMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Membership> getMembership() {
		return (EList<Membership>)eGet(SysMLPackage.Literals.NAMESPACE__MEMBERSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Import> getOwnedImport() {
		return (EList<Import>)eGet(SysMLPackage.Literals.NAMESPACE__OWNED_IMPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getOwnedMember() {
		return (EList<Element>)eGet(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Membership> getOwnedMembership() {
		return (EList<Membership>)eGet(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP, true);
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
	@Override
	public EList<Membership> importedMemberships(EList<Namespace> excluded) {
		try {
			return (EList<Membership>)IMPORTED_MEMBERSHIPS_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{excluded}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #membershipsOfVisibility(org.omg.sysml.model.sysml.VisibilityKind, org.eclipse.emf.common.util.EList) <em>Memberships Of Visibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #membershipsOfVisibility(org.omg.sysml.model.sysml.VisibilityKind, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MEMBERSHIPS_OF_VISIBILITY_VISIBILITY_KIND_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___MEMBERSHIPS_OF_VISIBILITY__VISIBILITYKIND_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Membership> membershipsOfVisibility(VisibilityKind visibility, EList<Namespace> excluded) {
		try {
			return (EList<Membership>)MEMBERSHIPS_OF_VISIBILITY_VISIBILITY_KIND_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{visibility, excluded}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #namesOf(org.omg.sysml.model.sysml.Element) <em>Names Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #namesOf(org.omg.sysml.model.sysml.Element)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate NAMES_OF_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___NAMES_OF__ELEMENT).getInvocationDelegate();

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
	@Override
	public String qualificationOf(String qualifiedName) {
		try {
			return (String)QUALIFICATION_OF_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{qualifiedName}));
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
	@Override
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
	@Override
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
	@Override
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
	@Override
	public Membership resolveVisible(String name) {
		try {
			return (Membership)RESOLVE_VISIBLE_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{name}));
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
	@Override
	public String unqualifiedNameOf(String qualifiedName) {
		try {
			return (String)UNQUALIFIED_NAME_OF_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{qualifiedName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #visibilityOf(org.omg.sysml.model.sysml.Membership) <em>Visibility Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #visibilityOf(org.omg.sysml.model.sysml.Membership)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VISIBILITY_OF_MEMBERSHIP__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.NAMESPACE___VISIBILITY_OF__MEMBERSHIP).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.NAMESPACE___IMPORTED_MEMBERSHIPS__ELIST:
				return importedMemberships((EList<Namespace>)arguments.get(0));
			case SysMLPackage.NAMESPACE___MEMBERSHIPS_OF_VISIBILITY__VISIBILITYKIND_ELIST:
				return membershipsOfVisibility((VisibilityKind)arguments.get(0), (EList<Namespace>)arguments.get(1));
			case SysMLPackage.NAMESPACE___NAMES_OF__ELEMENT:
				return namesOf((Element)arguments.get(0));
			case SysMLPackage.NAMESPACE___QUALIFICATION_OF__STRING:
				return qualificationOf((String)arguments.get(0));
			case SysMLPackage.NAMESPACE___RESOLVE__STRING:
				return resolve((String)arguments.get(0));
			case SysMLPackage.NAMESPACE___RESOLVE_GLOBAL__STRING:
				return resolveGlobal((String)arguments.get(0));
			case SysMLPackage.NAMESPACE___RESOLVE_LOCAL__STRING:
				return resolveLocal((String)arguments.get(0));
			case SysMLPackage.NAMESPACE___RESOLVE_VISIBLE__STRING:
				return resolveVisible((String)arguments.get(0));
			case SysMLPackage.NAMESPACE___UNQUALIFIED_NAME_OF__STRING:
				return unqualifiedNameOf((String)arguments.get(0));
			case SysMLPackage.NAMESPACE___VISIBILITY_OF__MEMBERSHIP:
				return visibilityOf((Membership)arguments.get(0));
			case SysMLPackage.NAMESPACE___VISIBLE_MEMBERSHIPS__ELIST_BOOLEAN_BOOLEAN:
				return visibleMemberships((EList<Namespace>)arguments.get(0), (Boolean)arguments.get(1), (Boolean)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NamespaceImpl
