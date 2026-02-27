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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.omg.sysml.model.sysml.Annotation;
import org.omg.sysml.model.sysml.Documentation;
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Namespace;
import org.omg.sysml.model.sysml.OwningMembership;
import org.omg.sysml.model.sysml.Relationship;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.TextualRepresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getAliasIds <em>Alias Ids</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getDeclaredName <em>Declared Name</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getDeclaredShortName <em>Declared Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getElementId <em>Element Id</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#isIsImpliedIncluded <em>Is Implied Included</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#isIsLibraryElement <em>Is Library Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getOwnedAnnotation <em>Owned Annotation</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getOwningMembership <em>Owning Membership</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getOwningNamespace <em>Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getOwningRelationship <em>Owning Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ElementImpl#getTextualRepresentation <em>Textual Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getAliasIds() {
		return (EList<String>)eGet(SysMLPackage.Literals.ELEMENT__ALIAS_IDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclaredName() {
		return (String)eGet(SysMLPackage.Literals.ELEMENT__DECLARED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaredName(String newDeclaredName) {
		eSet(SysMLPackage.Literals.ELEMENT__DECLARED_NAME, newDeclaredName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclaredShortName() {
		return (String)eGet(SysMLPackage.Literals.ELEMENT__DECLARED_SHORT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaredShortName(String newDeclaredShortName) {
		eSet(SysMLPackage.Literals.ELEMENT__DECLARED_SHORT_NAME, newDeclaredShortName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementId() {
		return (String)eGet(SysMLPackage.Literals.ELEMENT__ELEMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementId(String newElementId) {
		eSet(SysMLPackage.Literals.ELEMENT__ELEMENT_ID, newElementId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsImpliedIncluded() {
		return (Boolean)eGet(SysMLPackage.Literals.ELEMENT__IS_IMPLIED_INCLUDED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsImpliedIncluded(boolean newIsImpliedIncluded) {
		eSet(SysMLPackage.Literals.ELEMENT__IS_IMPLIED_INCLUDED, newIsImpliedIncluded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsLibraryElement() {
		return (Boolean)eGet(SysMLPackage.Literals.ELEMENT__IS_LIBRARY_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLibraryElement(boolean newIsLibraryElement) {
		eSet(SysMLPackage.Literals.ELEMENT__IS_LIBRARY_ELEMENT, newIsLibraryElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eGet(SysMLPackage.Literals.ELEMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eSet(SysMLPackage.Literals.ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifiedName() {
		return (String)eGet(SysMLPackage.Literals.ELEMENT__QUALIFIED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifiedName(String newQualifiedName) {
		eSet(SysMLPackage.Literals.ELEMENT__QUALIFIED_NAME, newQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortName() {
		return (String)eGet(SysMLPackage.Literals.ELEMENT__SHORT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortName(String newShortName) {
		eSet(SysMLPackage.Literals.ELEMENT__SHORT_NAME, newShortName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Documentation> getDocumentation() {
		return (EList<Documentation>)eGet(SysMLPackage.Literals.ELEMENT__DOCUMENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Annotation> getOwnedAnnotation() {
		return (EList<Annotation>)eGet(SysMLPackage.Literals.ELEMENT__OWNED_ANNOTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getOwnedElement() {
		return (EList<Element>)eGet(SysMLPackage.Literals.ELEMENT__OWNED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Relationship> getOwnedRelationship() {
		return (EList<Relationship>)eGet(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		return (Element)eGet(SysMLPackage.Literals.ELEMENT__OWNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Element newOwner) {
		eSet(SysMLPackage.Literals.ELEMENT__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OwningMembership getOwningMembership() {
		return (OwningMembership)eGet(SysMLPackage.Literals.ELEMENT__OWNING_MEMBERSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningMembership(OwningMembership newOwningMembership) {
		eSet(SysMLPackage.Literals.ELEMENT__OWNING_MEMBERSHIP, newOwningMembership);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getOwningNamespace() {
		return (Namespace)eGet(SysMLPackage.Literals.ELEMENT__OWNING_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningNamespace(Namespace newOwningNamespace) {
		eSet(SysMLPackage.Literals.ELEMENT__OWNING_NAMESPACE, newOwningNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship getOwningRelationship() {
		return (Relationship)eGet(SysMLPackage.Literals.ELEMENT__OWNING_RELATIONSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelationship(Relationship newOwningRelationship) {
		eSet(SysMLPackage.Literals.ELEMENT__OWNING_RELATIONSHIP, newOwningRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TextualRepresentation> getTextualRepresentation() {
		return (EList<TextualRepresentation>)eGet(SysMLPackage.Literals.ELEMENT__TEXTUAL_REPRESENTATION, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #effectiveName() <em>Effective Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #effectiveName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EFFECTIVE_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ELEMENT___EFFECTIVE_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String effectiveName() {
		try {
			return (String)EFFECTIVE_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #effectiveShortName() <em>Effective Short Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #effectiveShortName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EFFECTIVE_SHORT_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ELEMENT___EFFECTIVE_SHORT_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String effectiveShortName() {
		try {
			return (String)EFFECTIVE_SHORT_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #escapedName() <em>Escaped Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #escapedName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ESCAPED_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ELEMENT___ESCAPED_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String escapedName() {
		try {
			return (String)ESCAPED_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #libraryNamespace() <em>Library Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #libraryNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate LIBRARY_NAMESPACE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ELEMENT___LIBRARY_NAMESPACE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace libraryNamespace() {
		try {
			return (Namespace)LIBRARY_NAMESPACE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #path() <em>Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #path()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PATH__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ELEMENT___PATH).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String path() {
		try {
			return (String)PATH__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.ELEMENT___EFFECTIVE_NAME:
				return effectiveName();
			case SysMLPackage.ELEMENT___EFFECTIVE_SHORT_NAME:
				return effectiveShortName();
			case SysMLPackage.ELEMENT___ESCAPED_NAME:
				return escapedName();
			case SysMLPackage.ELEMENT___LIBRARY_NAMESPACE:
				return libraryNamespace();
			case SysMLPackage.ELEMENT___PATH:
				return path();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ElementImpl
